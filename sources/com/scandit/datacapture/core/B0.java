package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.CameraPosition;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18297a;

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
        try {
            iArr[CameraPosition.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18297a = iArr;
    }
}
