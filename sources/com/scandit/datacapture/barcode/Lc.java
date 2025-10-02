package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Lc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17231a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SparkScanViewHandMode.values().length];
        try {
            iArr[SparkScanViewHandMode.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SparkScanViewHandMode.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17231a = iArr;
        int[] iArr2 = new int[NativeSparkScanViewState.values().length];
        try {
            iArr2[NativeSparkScanViewState.ACTIVE_EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NativeSparkScanViewState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NativeSparkScanViewState.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[SparkScanScanningBehavior.values().length];
        try {
            iArr3[SparkScanScanningBehavior.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[SparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
