package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class R7 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18369a;

    static {
        int[] iArr = new int[NativeTonemapCurve.values().length];
        try {
            iArr[NativeTonemapCurve.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeTonemapCurve.GAMMA22.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeTonemapCurve.SRGB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18369a = iArr;
    }
}
