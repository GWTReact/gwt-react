var webpack = require('webpack');
var CompressionPlugin = require("compression-webpack-plugin");

var useplugins = [];

if (process.env.NODE_ENV === 'production') {
    useplugins = [
        new webpack.DefinePlugin({
            'process.env':{
                'NODE_ENV': JSON.stringify('production')
            }
        }),
	    new webpack.optimize.AggressiveMergingPlugin(),
	    new webpack.optimize.OccurrenceOrderPlugin(),
	    new webpack.optimize.DedupePlugin(),
        new webpack.optimize.UglifyJsPlugin({
	        mangle: true,
            compress:{
	            unused: true,
	            dead_code: true,
                warnings: false,
	            drop_debugger: true,
	            conditionals: true,
	            evaluate: true,
	            screw_ie8: true
            },
	        output: {
		        comments: false,
	        },
	        exclude: [/\.min\.js$/gi] // skip pre-minified libs
        }),
	    new webpack.IgnorePlugin(/^\.\/locale$/, [/moment$/]),
	    new CompressionPlugin({
		    asset: "[path].gz[query]",
		    algorithm: "gzip",
		    test: /\.js$|\.css$|\.html$/,
		    threshold: 10240,
		    minRatio: 0
	    })
    ];
}

module.exports = {
    module: {
        loaders: [{
            exclude: /node_modules/,
            loader: 'babel-loader'
        }]
    },
    
    plugins: useplugins,
    
    resolve: {
        extensions: ['', '.js', '.jsx'],
	    
	    alias: {
		    "react": "preact-compat",
		    "react-dom": "preact-compat"
	    }
    }
};
