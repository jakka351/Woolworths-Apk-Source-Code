package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountScreenRatioForUi;

/* renamed from: com.scandit.datacapture.barcode.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0676j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17818a;

    static {
        int[] iArr = new int[BarcodeCountScreenRatioForUi.values().length];
        try {
            iArr[BarcodeCountScreenRatioForUi.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeCountScreenRatioForUi.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodeCountScreenRatioForUi.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17818a = iArr;
    }
}
