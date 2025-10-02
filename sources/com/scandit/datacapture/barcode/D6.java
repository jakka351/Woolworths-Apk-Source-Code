package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D6 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f17134a;

    public D6(Function1 function1) {
        this.f17134a = function1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.h(view, "view");
        if (Intrinsics.c(ObjectOverlayUtilsKt.getSize(view), Size2UtilsKt.getSIZE_2_ZERO())) {
            return;
        }
        this.f17134a.invoke(view);
        view.removeOnLayoutChangeListener(this);
    }
}
