package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.TorchState;

/* renamed from: com.scandit.datacapture.core.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1070n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18808a;

    static {
        int[] iArr = new int[TorchState.values().length];
        try {
            iArr[TorchState.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TorchState.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18808a = iArr;
    }
}
