package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;

/* renamed from: com.scandit.datacapture.core.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1045k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18789a;

    static {
        int[] iArr = new int[NativeHttpsMethod.values().length];
        try {
            iArr[NativeHttpsMethod.GET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHttpsMethod.POST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18789a = iArr;
    }
}
