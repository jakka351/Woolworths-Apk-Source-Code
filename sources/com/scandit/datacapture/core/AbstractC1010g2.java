package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativePreferredFrameRateRange;

/* renamed from: com.scandit.datacapture.core.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1010g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18523a;
    public static final /* synthetic */ int[] b;

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
        f18523a = iArr;
        int[] iArr2 = new int[NativePreferredFrameRateRange.values().length];
        try {
            iArr2[NativePreferredFrameRateRange.HIGHEST_WIDEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NativePreferredFrameRateRange.HIGHEST_NARROWEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
