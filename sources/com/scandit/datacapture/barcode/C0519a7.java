package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0519a7 extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519a7(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        setVisibility(8);
        setBackground(new ColorDrawable(0));
    }

    public final void a(int i) {
        setBackground(new ColorDrawable(i));
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setVisibility(0);
        animate().alpha(1.0f).setDuration(200L).withEndAction(new kf(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0519a7 this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.setVisibility(8);
    }
}
