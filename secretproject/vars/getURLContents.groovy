def call(String url) {
    if(env.http_proxy) {
        echo httpRequest(url: url, httpProxy: env.http_proxy).content
    } else {
        echo httpRequest(url).content
    }
}
