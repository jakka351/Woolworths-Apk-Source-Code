package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AnnotatedCallableKind {
    public static final AnnotatedCallableKind d;
    public static final AnnotatedCallableKind e;
    public static final AnnotatedCallableKind f;
    public static final AnnotatedCallableKind g;
    public static final /* synthetic */ AnnotatedCallableKind[] h;

    static {
        AnnotatedCallableKind annotatedCallableKind = new AnnotatedCallableKind("FUNCTION", 0);
        d = annotatedCallableKind;
        AnnotatedCallableKind annotatedCallableKind2 = new AnnotatedCallableKind("PROPERTY", 1);
        e = annotatedCallableKind2;
        AnnotatedCallableKind annotatedCallableKind3 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        f = annotatedCallableKind3;
        AnnotatedCallableKind annotatedCallableKind4 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        g = annotatedCallableKind4;
        h = new AnnotatedCallableKind[]{annotatedCallableKind, annotatedCallableKind2, annotatedCallableKind3, annotatedCallableKind4};
    }

    public static AnnotatedCallableKind valueOf(String str) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, str);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) h.clone();
    }
}
