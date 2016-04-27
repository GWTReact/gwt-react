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
    resolve: {
        extensions: ['', '.js', '.jsx']
    }
};
