package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* renamed from: com.scandit.datacapture.barcode.ae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0526ae {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17380a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f17380a = iArr;
    }
}
