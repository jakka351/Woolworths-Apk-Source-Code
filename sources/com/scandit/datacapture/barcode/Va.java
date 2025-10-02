package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlayStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Va {
    public static Wa a(SparkScanInternal mode) {
        Intrinsics.h(mode, "mode");
        return new Wa(mode, NativeSparkScanOverlayStyle.FRAME, 0);
    }
}
