package com.scandit.datacapture.barcode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0514a2 implements Ge {
    private static final Lazy b = LazyKt.b(Y1.f17351a);
    private static final Lazy c = LazyKt.b(Z1.f17363a);
    private static final Lazy d = LazyKt.b(X1.f17340a);

    @Override // com.scandit.datacapture.barcode.Ge
    public final void a(View view, ViewGroup viewGroup) {
        W1 view2 = (W1) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(view2, "view");
        Intrinsics.h(parent, "parent");
        Size2 size = ObjectOverlayUtilsKt.getSize(parent);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (size.getHeight() >= size.getWidth()) {
            layoutParams.addRule(2, B9.a());
            layoutParams.addRule(14);
            layoutParams.setMargins(0, 0, 0, ((Number) d.getD()).intValue());
            Lazy lazy = b;
            int iIntValue = ((Number) lazy.getD()).intValue();
            Lazy lazy2 = c;
            view2.setPadding(iIntValue, ((Number) lazy2.getD()).intValue(), ((Number) lazy.getD()).intValue(), ((Number) lazy2.getD()).intValue());
        } else {
            layoutParams.addRule(0, B9.a());
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, ((Number) d.getD()).intValue(), 0);
            Lazy lazy3 = c;
            int iIntValue2 = ((Number) lazy3.getD()).intValue();
            Lazy lazy4 = b;
            view2.setPadding(iIntValue2, ((Number) lazy4.getD()).intValue(), ((Number) lazy3.getD()).intValue(), ((Number) lazy4.getD()).intValue());
        }
        view2.setLayoutParams(layoutParams);
        view2.setOrientation(size.getHeight() < size.getWidth() ? 1 : 0);
    }
}
