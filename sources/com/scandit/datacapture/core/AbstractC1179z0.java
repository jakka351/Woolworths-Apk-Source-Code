package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;

/* renamed from: com.scandit.datacapture.core.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1179z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18997a;

    static {
        int[] iArr = new int[NativeCameraApi.values().length];
        try {
            iArr[NativeCameraApi.CAMERA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeCameraApi.CAMERA2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18997a = iArr;
    }
}
