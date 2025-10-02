package com.scandit.datacapture.barcode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.o9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0765o9 implements InterfaceC0717l9 {
    private static final Lazy b = LazyKt.b(C0733m9.f17849a);
    private static final Lazy c = LazyKt.b(C0749n9.f17861a);

    @Override // com.scandit.datacapture.barcode.Ge
    public final void a(View view, ViewGroup viewGroup) {
        J6 view2 = (J6) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(view2, "view");
        Intrinsics.h(parent, "parent");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (parent.getHeight() >= parent.getWidth()) {
            view2.setGravity(16);
            layoutParams.addRule(6, B9.a());
            layoutParams.addRule(8, B9.a());
            layoutParams.addRule(1, B9.a());
            layoutParams.setMargins(((Number) c.getD()).intValue(), 0, 0, 0);
        } else {
            view2.setGravity(1);
            layoutParams.addRule(5, B9.a());
            layoutParams.addRule(7, B9.a());
            layoutParams.addRule(2, B9.a());
            layoutParams.setMargins(0, 0, 0, ((Number) b.getD()).intValue());
        }
        view2.setLayoutParams(layoutParams);
    }
}
