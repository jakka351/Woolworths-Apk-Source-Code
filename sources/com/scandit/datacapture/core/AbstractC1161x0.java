package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.CameraPosition;

/* renamed from: com.scandit.datacapture.core.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1161x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18986a;

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
        f18986a = iArr;
    }
}
