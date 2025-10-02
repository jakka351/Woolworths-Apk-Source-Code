package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Hd {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17186a;

    static {
        int[] iArr = new int[BarcodeCountStatus.values().length];
        try {
            iArr[BarcodeCountStatus.NOT_AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeCountStatus.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodeCountStatus.FRAGILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BarcodeCountStatus.QUALITY_CHECK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BarcodeCountStatus.LOW_STOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BarcodeCountStatus.WRONG.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BarcodeCountStatus.NONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f17186a = iArr;
    }
}
