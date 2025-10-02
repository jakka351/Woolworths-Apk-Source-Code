package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class P1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18356a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public static /* synthetic */ int a(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] b(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f18356a, 0, iArr, 0, i);
        return iArr;
    }
}
