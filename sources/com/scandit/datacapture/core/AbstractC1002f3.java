package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeHintAlignment;
import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;

/* renamed from: com.scandit.datacapture.core.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1002f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18496a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[NativeHintAlignment.values().length];
        try {
            iArr[NativeHintAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHintAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeHintAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18496a = iArr;
        int[] iArr2 = new int[NativeHintIcon.values().length];
        try {
            iArr2[NativeHintIcon.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
