package au.com.woolworths.base.wallet.digipay.framesview;

import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ FramesWebView e;

    public /* synthetic */ d(FramesWebView framesWebView, int i) {
        this.d = i;
        this.e = framesWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        FramesWebView framesWebView = this.e;
        switch (i) {
            case 0:
                int i2 = FramesWebView.i;
                framesWebView.h(new FatalError("Error loading FramesSDK."));
                break;
            case 1:
                int i3 = FramesWebView.i;
                framesWebView.f();
                break;
            case 2:
                int i4 = FramesWebView.i;
                framesWebView.c();
                break;
            default:
                int i5 = FramesWebView.i;
                framesWebView.g();
                FramesWebView.Callback callback = framesWebView.d;
                if (callback != null) {
                    callback.b();
                    break;
                }
                break;
        }
    }
}
