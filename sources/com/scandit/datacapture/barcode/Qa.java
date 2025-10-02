package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qa implements InterfaceC0769od {
    private final RelativeLayout b;
    private final C0753nd c;

    public Qa(SparkScanViewMiniPreview container) {
        Intrinsics.h(container, "container");
        this.b = container;
        Context context = container.getContext();
        Intrinsics.g(context, "container.context");
        C0753nd c0753nd = new C0753nd(context);
        this.c = c0753nd;
        container.addView(c0753nd, b());
        c0753nd.setElevation(10.0f);
    }

    private final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (this.b.getWidth() * 0.05f));
        layoutParams.setMarginEnd((int) (this.b.getWidth() * 0.05f));
        layoutParams.topMargin = Gc.n();
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        return layoutParams;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0769od
    public final void a(int i, int i2, String text) {
        Intrinsics.h(text, "text");
        this.c.bringToFront();
        this.c.setLayoutParams(b());
        this.c.a(i, i2, text);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0769od
    public final void a() {
        this.c.a();
    }
}
