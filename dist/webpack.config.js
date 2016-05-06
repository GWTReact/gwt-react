var webpack = require('webpack');

var useplugins = [];

if (process.env.NODE_ENV === 'production') {
    useplugins = [
        new webpack.DefinePlugin({
            'process.env':{
                'NODE_ENV': JSON.stringify('production')
            }
        }),
        new webpack.optimize.UglifyJsPlugin({
            compress:{
                warnings: true
            }
        })
    ];
}

module.exports = {
    entry: [
        './src/index.js'
    ],
    
    module: {
        loaders: [{
            exclude: /node_modules/,
            loader: 'babel-loader'
        }]
    },
    
    plugins: useplugins,
    
    resolve: {
        extensions: ['', '.js', '.jsx']
    }
};
