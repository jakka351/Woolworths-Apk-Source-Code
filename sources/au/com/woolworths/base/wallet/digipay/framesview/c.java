package au.com.woolworths.base.wallet.digipay.framesview;

import au.com.woolworths.foundation.bark.Bark;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FramesWebView e;

    public /* synthetic */ c(FramesWebView framesWebView, int i) {
        this.d = i;
        this.e = framesWebView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        FramesWebView framesWebView = this.e;
        String it = (String) obj;
        switch (i) {
            case 0:
                int i2 = FramesWebView.i;
                Intrinsics.h(it, "it");
                framesWebView.getClass();
                break;
            default:
                int i3 = FramesWebView.i;
                Intrinsics.h(it, "loaded");
                Boolean.parseBoolean(it);
                if (!Boolean.parseBoolean(it)) {
                    framesWebView.post(new d(framesWebView, 0));
                    break;
                } else {
                    Bark.f8483a.a("Frames SDK: loaded successfully");
                    framesWebView.a();
                    break;
                }
        }
        return unit;
    }
}
