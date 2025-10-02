package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NullabilityQualifier {
    public static final NullabilityQualifier d;
    public static final NullabilityQualifier e;
    public static final NullabilityQualifier f;
    public static final /* synthetic */ NullabilityQualifier[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        d = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        e = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        f = nullabilityQualifier3;
        NullabilityQualifier[] nullabilityQualifierArr = {nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
        g = nullabilityQualifierArr;
        h = EnumEntriesKt.a(nullabilityQualifierArr);
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) g.clone();
    }
}
