var webpack = require('webpack');
var UglifyjsWebpackPlugin = require('uglifyjs-webpack-plugin')

var useplugins = [];

if (process.env.NODE_ENV === 'production') {
    useplugins = [
	    new webpack.IgnorePlugin(/^\.\/locale$/, [/moment$/]),
    ];
}

module.exports = {
     module: {
         rules : [
             {
                 exclude: /node_modules/,
                 loader: 'babel-loader'
             },
             {
                 test: /\.css$/,
                 use: [ 'style-loader', 'css-loader' ]
             }
         ]
    },
    
    plugins: useplugins,

    optimization: {
        minimizer: [
            new UglifyjsWebpackPlugin({
                cache: true,
                parallel: true,
                sourceMap: true,
                extractComments: true,
                //exclude: [/\.min\.js$/gi] // skip pre-minified libs
            })
        ]
    },

    resolve: {
         modules: ["node_modules"],
        extensions: ['.js', '.jsx']
    }
};
