package com.google.firebase.firestore.core;

/* loaded from: classes6.dex */
public class UserData {

    /* renamed from: com.google.firebase.firestore.core.UserData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15468a;

        static {
            int[] iArr = new int[Source.values().length];
            f15468a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15468a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15468a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15468a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15468a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class ParseAccumulator {
    }

    public static class ParseContext {
    }

    public static class ParsedSetData {
    }

    public static class ParsedUpdateData {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {
        public static final /* synthetic */ Source[] d = {new Source("Set", 0), new Source("MergeSet", 1), new Source("Update", 2), new Source("Argument", 3), new Source("ArrayArgument", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Source EF5;

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) d.clone();
        }
    }
}
