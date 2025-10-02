package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* renamed from: com.scandit.datacapture.core.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1099q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18819a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.TOP_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Anchor.BOTTOM_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Anchor.TOP_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Anchor.TOP_RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f18819a = iArr;
    }
}
