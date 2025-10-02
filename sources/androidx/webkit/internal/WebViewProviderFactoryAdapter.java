package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewStartUpConfig;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f3862a;

    public WebViewProviderFactoryAdapter(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f3862a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final String[] a() {
        return this.f3862a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final void b(WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.a aVar) {
        this.f3862a.startUpWebView(BoundaryInterfaceReflectionUtil.b(new WebViewStartUpConfigAdapter(webViewStartUpConfig)), BoundaryInterfaceReflectionUtil.b(new WebViewStartUpCallbackAdapter(aVar)));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewProviderBoundaryInterface.class, this.f3862a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.a(DropDataContentProviderBoundaryInterface.class, this.f3862a.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileStoreBoundaryInterface.class, this.f3862a.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.a(StaticsBoundaryInterface.class, this.f3862a.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebkitToCompatConverterBoundaryInterface.class, this.f3862a.getWebkitToCompatConverter());
    }
}
