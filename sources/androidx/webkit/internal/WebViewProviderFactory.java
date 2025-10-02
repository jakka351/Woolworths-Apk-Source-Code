package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewStartUpConfig;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes2.dex */
public interface WebViewProviderFactory {
    String[] a();

    void b(WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.a aVar);

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    DropDataContentProviderBoundaryInterface getDropDataProvider();

    ProfileStoreBoundaryInterface getProfileStore();

    StaticsBoundaryInterface getStatics();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
