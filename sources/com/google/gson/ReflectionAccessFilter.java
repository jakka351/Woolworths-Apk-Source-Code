package com.google.gson;

/* loaded from: classes6.dex */
public interface ReflectionAccessFilter {

    /* renamed from: com.google.gson.ReflectionAccessFilter$1, reason: invalid class name */
    public class AnonymousClass1 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.f : FilterResult.e;
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$2, reason: invalid class name */
    public class AnonymousClass2 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.g : FilterResult.e;
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$3, reason: invalid class name */
    public class AnonymousClass3 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.")) ? FilterResult.g : FilterResult.e;
        }
    }

    /* renamed from: com.google.gson.ReflectionAccessFilter$4, reason: invalid class name */
    public class AnonymousClass4 implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public final FilterResult a(Class cls) {
            String name = cls.getName();
            return (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) ? FilterResult.g : FilterResult.e;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class FilterResult {
        public static final FilterResult d;
        public static final FilterResult e;
        public static final FilterResult f;
        public static final FilterResult g;
        public static final /* synthetic */ FilterResult[] h;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            d = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            e = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            f = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            g = filterResult4;
            h = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) h.clone();
        }
    }

    FilterResult a(Class cls);
}
