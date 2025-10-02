package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0522aa extends ImageButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0522aa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setBackground(null);
        setImageResource(R.drawable.sc_ic_single_scan);
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getSingleScanButtonContentDescription());
    }
}
