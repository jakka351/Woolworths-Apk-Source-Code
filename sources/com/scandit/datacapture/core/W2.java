package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class W2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18389a;

    static {
        int[] iArr = new int[NativeHintIcon.values().length];
        try {
            iArr[NativeHintIcon.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHintIcon.CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeHintIcon.EXCLAMATION_MARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18389a = iArr;
    }
}
