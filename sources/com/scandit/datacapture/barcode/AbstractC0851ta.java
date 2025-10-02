package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0851ta {
    public static SparkScanInternal a(SparkScanSettings settings) {
        Intrinsics.h(settings, "settings");
        return new SparkScanInternal(settings, 0);
    }
}
