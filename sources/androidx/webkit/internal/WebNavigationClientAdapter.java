package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebNavigationClientAdapter implements WebViewNavigationClientBoundaryInterface {
    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onFirstContentfulPaint(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewPageBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationCompleted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewNavigationBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationRedirected(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewNavigationBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationStarted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewNavigationBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewPageBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDeleted(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewPageBoundaryInterface.class, invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageLoadEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewPageBoundaryInterface.class, invocationHandler);
        throw null;
    }
}
