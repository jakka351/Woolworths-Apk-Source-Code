package au.com.woolworths.base.wallet.digipay.framesview;

import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ FramesWebView e;
    public final /* synthetic */ String f;

    public /* synthetic */ e(FramesWebView framesWebView, String str, int i) {
        this.d = i;
        this.e = framesWebView;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        String errorMessage = this.f;
        FramesWebView framesWebView = this.e;
        switch (i) {
            case 0:
                int i2 = FramesWebView.i;
                if (!Intrinsics.c(errorMessage, "One or more frames failed validation")) {
                    framesWebView.e();
                    framesWebView.h(new FatalError(errorMessage));
                    break;
                } else {
                    FramesWebView.Callback callback = framesWebView.d;
                    if (callback != null) {
                        Intrinsics.h(errorMessage, "errorMessage");
                        callback.e(new ValidationError(ErrorCode.h, errorMessage));
                        break;
                    }
                }
                break;
            case 1:
                FramesWebView.Callback callback2 = framesWebView.d;
                if (callback2 != null) {
                    callback2.e(new FormError(ErrorCode.g, errorMessage));
                    break;
                }
                break;
            default:
                FramesWebView.Callback callback3 = framesWebView.d;
                if (callback3 != null) {
                    callback3.d(errorMessage == null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(String str, FramesWebView framesWebView) {
        this.d = 0;
        this.f = str;
        this.e = framesWebView;
    }
}
