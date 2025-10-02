package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* renamed from: com.scandit.datacapture.barcode.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0695k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17829a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17829a = iArr;
    }
}
