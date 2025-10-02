package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0670ia {

    /* renamed from: a, reason: collision with root package name */
    private final int f17707a;

    public C0670ia(int i) {
        this.f17707a = i * i;
    }

    public final EnumC0654ha a(D8 start, D8 end) {
        Intrinsics.h(start, "start");
        Intrinsics.h(end, "end");
        float fA = end.a() - start.a();
        float fB = end.b() - start.b();
        if ((fB * fB) + (fA * fA) < this.f17707a) {
            return EnumC0654ha.CLICK;
        }
        float fA2 = end.a() - start.a();
        float fB2 = end.b() - start.b();
        float fAbs = Math.abs(fA2);
        float fAbs2 = Math.abs(fB2);
        return fA2 >= BitmapDescriptorFactory.HUE_RED ? fB2 >= BitmapDescriptorFactory.HUE_RED ? fAbs >= fAbs2 ? EnumC0654ha.DRAG_RIGHT : EnumC0654ha.DRAG_DOWN : fAbs >= fAbs2 ? EnumC0654ha.DRAG_RIGHT : EnumC0654ha.DRAG_UP : fB2 >= BitmapDescriptorFactory.HUE_RED ? fAbs >= fAbs2 ? EnumC0654ha.DRAG_LEFT : EnumC0654ha.DRAG_DOWN : fAbs >= fAbs2 ? EnumC0654ha.DRAG_LEFT : EnumC0654ha.DRAG_UP;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0670ia(Context context) {
        this(ViewConfiguration.get(context).getScaledTouchSlop());
        Intrinsics.h(context, "context");
    }
}
