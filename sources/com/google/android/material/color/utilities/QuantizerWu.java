package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public final class QuantizerWu implements Quantizer {

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14556a;

        static {
            int[] iArr = new int[Direction.values().length];
            f14556a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14556a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14556a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Box {
    }

    public static final class CreateBoxesResult {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        public static final /* synthetic */ Direction[] d = {new Direction("RED", 0), new Direction("GREEN", 1), new Direction("BLUE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Direction EF5;

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) d.clone();
        }
    }

    public static final class MaximizeResult {
    }
}
