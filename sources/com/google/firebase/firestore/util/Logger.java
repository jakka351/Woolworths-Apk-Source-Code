package com.google.firebase.firestore.util;

import android.util.Log;

/* loaded from: classes6.dex */
public class Logger {

    /* renamed from: com.google.firebase.firestore.util.Logger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15602a;

        static {
            int[] iArr = new int[Level.values().length];
            f15602a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15602a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15602a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {
        public static final Level d;
        public static final Level e;
        public static final /* synthetic */ Level[] f;

        static {
            Level level = new Level("DEBUG", 0);
            d = level;
            Level level2 = new Level("WARN", 1);
            e = level2;
            f = new Level[]{level, level2, new Level("NONE", 2)};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f.clone();
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        b(Level.d, str, str2, objArr);
    }

    public static void b(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= 1) {
            String strConcat = YU.a.h("(26.0.0) [", str, "]: ").concat(String.format(str2, objArr));
            int iOrdinal = level.ordinal();
            if (iOrdinal == 0) {
                Log.i("Firestore", strConcat);
            } else if (iOrdinal == 1) {
                Log.w("Firestore", strConcat);
            } else if (iOrdinal == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        b(Level.e, str, str2, objArr);
    }
}
