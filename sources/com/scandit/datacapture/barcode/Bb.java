package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraPosition;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Bb {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17109a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraPosition.WORLD_FACING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17109a = iArr;
    }
}
