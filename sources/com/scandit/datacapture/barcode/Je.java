package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Je {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17211a;

    static {
        int[] iArr = new int[NativeBarcodeCountBasicOverlayColorScheme.values().length];
        try {
            iArr[NativeBarcodeCountBasicOverlayColorScheme.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17211a = iArr;
    }
}
