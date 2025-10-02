package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;

/* renamed from: com.scandit.datacapture.barcode.ab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0523ab {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17377a;

    static {
        int[] iArr = new int[DeviceOrientation.values().length];
        try {
            iArr[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17377a = iArr;
    }
}
