package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;

/* renamed from: com.scandit.datacapture.barcode.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0912x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18258a;

    static {
        int[] iArr = new int[BarcodePickState.values().length];
        try {
            iArr[BarcodePickState.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodePickState.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodePickState.TO_PICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BarcodePickState.PICKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f18258a = iArr;
    }
}
