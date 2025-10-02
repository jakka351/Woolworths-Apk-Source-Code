package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.StartupApiFeature;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class WebViewFeatureInternal {

    /* renamed from: a, reason: collision with root package name */
    public static final ApiFeature.N f3858a;
    public static final ApiFeature.M b;
    public static final ApiFeature.M c;
    public static final ApiFeature.O_MR1 d;
    public static final ApiFeature.NoFramework e;
    public static final ApiFeature.P f;
    public static final ApiFeature.NoFramework g;
    public static final ApiFeature.NoFramework h;
    public static final ApiFeature.NoFramework i;
    public static final ApiFeature.NoFramework j;
    public static final ApiFeature.NoFramework k;
    public static final ApiFeature.NoFramework l;
    public static final ApiFeature.NoFramework m;
    public static final ApiFeature.NoFramework n;

    /* renamed from: androidx.webkit.internal.WebViewFeatureInternal$2, reason: invalid class name */
    public class AnonymousClass2 extends ApiFeature.NoFramework {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean d() {
            if (!super.d() || !WebViewFeature.a("MULTI_PROCESS")) {
                return false;
            }
            boolean z = WebViewCompat.f3842a;
            if (WebViewFeatureInternal.g.d()) {
                return WebViewGlueCommunicator.b().getStatics().isMultiProcessEnabled();
            }
            throw WebViewFeatureInternal.a();
        }
    }

    /* renamed from: androidx.webkit.internal.WebViewFeatureInternal$3, reason: invalid class name */
    public class AnonymousClass3 extends ApiFeature.NoFramework {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean d() {
            if (WebViewFeature.a("MULTI_PROFILE")) {
                return super.d();
            }
            return false;
        }
    }

    static {
        new ApiFeature.M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new ApiFeature.M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new ApiFeature.O("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new ApiFeature.N("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new ApiFeature.O_MR1("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new ApiFeature.O_MR1("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        f3858a = new ApiFeature.N("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new ApiFeature.N("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new ApiFeature.N("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new ApiFeature.N("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new ApiFeature.N("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new ApiFeature.N("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new ApiFeature.M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new ApiFeature.M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new ApiFeature.N("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new ApiFeature.O_MR1("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new ApiFeature.N("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        b = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        c = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        d = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new ApiFeature.M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new ApiFeature.M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        e = new ApiFeature.NoFramework("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new ApiFeature.M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new ApiFeature.M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new ApiFeature.M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new ApiFeature.M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new ApiFeature.O("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new ApiFeature.O("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new ApiFeature.Q("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new ApiFeature.Q("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        f = new ApiFeature.P("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new StartupApiFeature.P();
        new StartupApiFeature.NoFramework();
        new StartupApiFeature.NoFramework();
        new ApiFeature.Q("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new ApiFeature.T() { // from class: androidx.webkit.internal.WebViewFeatureInternal.1
            public final Pattern d = Pattern.compile("\\A\\d+");

            @Override // androidx.webkit.internal.ApiFeature
            public final boolean d() {
                boolean zD = super.d();
                if (!zD || Build.VERSION.SDK_INT >= 29) {
                    return zD;
                }
                boolean z = WebViewCompat.f3842a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    return false;
                }
                Matcher matcher = this.d.matcher(currentWebViewPackage.versionName);
                return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
            }
        };
        new ApiFeature.NoFramework("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        g = new ApiFeature.NoFramework("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        new ApiFeature.Q("FORCE_DARK", "FORCE_DARK");
        new ApiFeature.NoFramework("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        h = new ApiFeature.NoFramework("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        i = new ApiFeature.NoFramework("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new ApiFeature.NoFramework("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        j = new ApiFeature.NoFramework("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new ApiFeature.NoFramework("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new ApiFeature.NoFramework("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new ApiFeature.NoFramework("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new ApiFeature.NoFramework("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        k = new AnonymousClass2("MULTI_PROFILE", "MULTI_PROFILE");
        new ApiFeature.NoFramework("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new ApiFeature.NoFramework("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        l = new ApiFeature.NoFramework("MUTE_AUDIO", "MUTE_AUDIO");
        new ApiFeature.NoFramework("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new ApiFeature.NoFramework("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new ApiFeature.NoFramework("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new ApiFeature.NoFramework("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new AnonymousClass3("PREFETCH_URL_V4", "PREFETCH_URL_V4");
        m = new ApiFeature.NoFramework("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new ApiFeature.NoFramework("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new ApiFeature.NoFramework("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        new ApiFeature.NoFramework("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        new ApiFeature.NoFramework("SAVE_STATE", "SAVE_STATE");
        new ApiFeature.NoFramework("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");
        n = new ApiFeature.NoFramework("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");
        new ApiFeature.NoFramework("PAYMENT_REQUEST", "PAYMENT_REQUEST");
        new ApiFeature.NoFramework("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
