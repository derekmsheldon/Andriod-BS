package com.app.berksstorage;

public class Config {
    /**
     * Main Configuration of WebView
     */

    // Domain host without http:// (e.g. "www.example.org")
    public static final String HOST = "berksstorage.com";

    // Your URL including http:// and www.
    public static String HOME_URL = "https://berksstorage.com/iosapp/index.html";
    public static String PAY_URL = "https://sitelink.berksstorage.com/tenant_login";
    public static String RENT_URL = "https://sitelink.berksstorage.com/";
    public static String INFO_URL = "https://berksstorage.com/iosapp/ioscontact.html";

    // Customized UserAgent for WebView URL requests (leave it empty to use the default Android UserAgent)
    public static final String USER_AGENT = "";

    // Set to true to open external links in another browser
    public static final boolean OPEN_EXTERNAL_URLS_IN_ANOTHER_BROWSER = false;

    // Set to true to clear the WebView cache on startup
    public static final boolean CLEAR_CACHE_ON_STARTUP = false;

    //Set to "true" to use local "assets/index.html" file instead of URL
    public static final boolean USE_LOCAL_HTML_FOLDER = false;

    //Set to "true" id deeplinking is enabled
    public static final boolean IS_DEEP_LINKING_ENABLED = true;

    //Set SplashScreen Timeout in millis
    public static final int SPLASH_TIMEOUT = 1000;
}
