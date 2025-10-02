package au.com.woolworths.base.wallet.digipay.framesview;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/FramesWebView$initialiseWebView$1", "Landroid/webkit/WebChromeClient;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FramesWebView$initialiseWebView$1 extends WebChromeClient {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FramesWebView f4677a;

    public FramesWebView$initialiseWebView$1(FramesWebView framesWebView) {
        this.f4677a = framesWebView;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i) {
        Intrinsics.h(view, "view");
        FramesWebView framesWebView = this.f4677a;
        FramesWebView.Callback callback = framesWebView.d;
        if (callback != null) {
            framesWebView.post(new androidx.camera.camera2.interop.d(callback, i));
        }
    }
}
