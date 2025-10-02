package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.core.internal.sdk.ui.interpolators.EaseInOutSineInterpolator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ke extends View {
    private NativeBarcodeCountBasicOverlayColorScheme b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ke(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.b = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        setBackgroundResource(b());
    }

    public final void a(NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme) {
        Intrinsics.h(nativeBarcodeCountBasicOverlayColorScheme, "<set-?>");
        this.b = nativeBarcodeCountBasicOverlayColorScheme;
    }

    public final void c() {
        onAttachedToWindow();
        if (this.c) {
            return;
        }
        this.c = true;
        setScaleX(0.667f);
        setScaleY(0.667f);
        a();
    }

    public final void d() {
        onDetachedFromWindow();
        clearAnimation();
        this.c = false;
    }

    private final void a() {
        animate().setInterpolator(new EaseInOutSineInterpolator()).setDuration(1000L).scaleX(1.0f).scaleY(1.0f).withEndAction(new kf(this, 1)).start();
    }

    private final int b() {
        int i = Je.f17211a[this.b.ordinal()];
        if (i == 1) {
            return R.drawable.sc_ic_barcode_unscanned_background;
        }
        if (i == 2) {
            return R.drawable.sc_ic_barcode_unscanned_background_alt;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ke this$0) {
        Intrinsics.h(this$0, "this$0");
        if (this$0.c) {
            this$0.c = true;
            this$0.setScaleX(0.667f);
            this$0.setScaleY(0.667f);
            this$0.a();
        }
    }
}
