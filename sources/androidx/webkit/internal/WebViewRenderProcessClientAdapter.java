package androidx.webkit.internal;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {
    public static final String[] d = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return d;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.b;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.b;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        throw null;
    }
}
