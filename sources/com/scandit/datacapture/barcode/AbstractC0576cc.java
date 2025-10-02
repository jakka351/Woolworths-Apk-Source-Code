package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.CameraPosition;

/* renamed from: com.scandit.datacapture.barcode.cc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0576cc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17465a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f17465a = iArr;
    }
}
