package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FloatWithUnitExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
final class H4 implements Ge {
    private static final Lazy c = LazyKt.b(E4.f17145a);
    private static final Lazy d = LazyKt.b(G4.f17169a);
    private static final Lazy e = LazyKt.b(F4.f17157a);
    private final FloatWithUnit b;

    public H4(FloatWithUnit offset) {
        Intrinsics.h(offset, "offset");
        this.b = offset;
    }

    @Override // com.scandit.datacapture.barcode.Ge
    public final void a(View view, ViewGroup viewGroup) {
        E9 view2 = (E9) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(view2, "view");
        Intrinsics.h(parent, "parent");
        Context context = view2.getContext();
        Intrinsics.g(context, "view.context");
        Size2 size = ObjectOverlayUtilsKt.getSize(parent);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (size.getHeight() >= size.getWidth()) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, 0, 0, a(context, MathKt.b(Math.max(size.getWidth(), size.getHeight())), true));
        } else {
            layoutParams.addRule(21);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, a(context, MathKt.b(Math.max(size.getWidth(), size.getHeight())), false), 0);
        }
        view2.setLayoutParams(layoutParams);
    }

    private final int a(Context context, int i, boolean z) {
        int i2;
        int iIntValue;
        if (i == 0) {
            return (int) FloatWithUnitExtensionsKt.toPixels((FloatWithUnit) c.getD(), BitmapDescriptorFactory.HUE_RED, ContextExtensionsKt.getDisplayDensity(context));
        }
        int pixels = (int) FloatWithUnitExtensionsKt.toPixels(this.b, i, ContextExtensionsKt.getDisplayDensity(context));
        if (pixels < 0) {
            pixels = 0;
        }
        if (z) {
            i2 = i / 2;
            iIntValue = ((Number) d.getD()).intValue();
        } else {
            i2 = i / 2;
            iIntValue = ((Number) e.getD()).intValue();
        }
        int i3 = i2 - iIntValue;
        return pixels > i3 ? i3 : pixels;
    }
}
