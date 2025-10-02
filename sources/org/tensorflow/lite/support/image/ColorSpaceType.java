package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public abstract class ColorSpaceType {
    public static final /* synthetic */ ColorSpaceType[] d = {new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.1
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.2
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.3
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.4
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.5
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.6
    }, new ColorSpaceType() { // from class: org.tensorflow.lite.support.image.ColorSpaceType.7
    }};

    /* JADX INFO: Fake field, exist only in values array */
    ColorSpaceType EF2;

    /* renamed from: org.tensorflow.lite.support.image.ColorSpaceType$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26922a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f26922a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26922a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ColorSpaceType valueOf(String str) {
        return (ColorSpaceType) Enum.valueOf(ColorSpaceType.class, str);
    }

    public static ColorSpaceType[] values() {
        return (ColorSpaceType[]) d.clone();
    }
}
