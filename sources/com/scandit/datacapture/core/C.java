package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.FrameSourceState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class C {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18300a;

    static {
        int[] iArr = new int[FrameSourceState.values().length];
        try {
            iArr[FrameSourceState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameSourceState.STANDBY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18300a = iArr;
    }
}
