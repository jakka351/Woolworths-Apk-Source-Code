package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;

/* renamed from: com.scandit.datacapture.barcode.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0546c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17397a;

    static {
        int[] iArr = new int[NativeBarcodeCountBasicOverlayStyle.values().length];
        try {
            iArr[NativeBarcodeCountBasicOverlayStyle.DOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeBarcodeCountBasicOverlayStyle.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17397a = iArr;
    }
}
