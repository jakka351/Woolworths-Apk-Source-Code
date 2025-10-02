package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ClassKind {
    public static final ClassKind d;
    public static final ClassKind e;
    public static final ClassKind f;
    public static final ClassKind g;
    public static final ClassKind h;
    public static final ClassKind i;
    public static final /* synthetic */ ClassKind[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0);
        d = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1);
        e = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2);
        f = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3);
        g = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4);
        h = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5);
        i = classKind6;
        ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
        j = classKindArr;
        k = EnumEntriesKt.a(classKindArr);
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) j.clone();
    }

    public final boolean a() {
        return this == i || this == g;
    }
}
