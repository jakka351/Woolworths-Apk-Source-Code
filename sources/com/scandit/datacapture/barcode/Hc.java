package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Hc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17185a;

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
        f17185a = iArr;
    }
}
