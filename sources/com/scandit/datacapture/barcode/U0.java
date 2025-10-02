package com.scandit.datacapture.barcode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class U0 implements Ge {
    @Override // com.scandit.datacapture.barcode.Ge
    public final void a(View view, ViewGroup viewGroup) {
        E9 view2 = (E9) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(view2, "view");
        Intrinsics.h(parent, "parent");
        Size2 size = ObjectOverlayUtilsKt.getSize(parent);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (size.getHeight() >= size.getWidth()) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, 0, 0, W0.a());
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, W0.a(), 0);
        }
        view2.setLayoutParams(layoutParams);
    }
}
