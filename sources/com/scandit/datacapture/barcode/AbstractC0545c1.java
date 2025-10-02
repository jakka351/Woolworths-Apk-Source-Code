package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* renamed from: com.scandit.datacapture.barcode.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0545c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17396a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.CENTER_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Anchor.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Anchor.BOTTOM_CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Anchor.TOP_CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f17396a = iArr;
    }
}
