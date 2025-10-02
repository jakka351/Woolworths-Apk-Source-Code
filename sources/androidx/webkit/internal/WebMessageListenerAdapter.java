package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {
    public final WebViewCompat.WebMessageListener d;

    public WebMessageListenerAdapter(WebViewCompat.WebMessageListener webMessageListener) {
        this.d = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatA = WebMessageAdapter.a((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatA != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            this.d.onPostMessage(webView, webMessageCompatA, uri, z, (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface, 0)));
        }
    }
}
