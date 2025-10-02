package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MutabilityQualifier {
    public static final MutabilityQualifier d;
    public static final MutabilityQualifier e;
    public static final /* synthetic */ MutabilityQualifier[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        d = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        e = mutabilityQualifier2;
        MutabilityQualifier[] mutabilityQualifierArr = {mutabilityQualifier, mutabilityQualifier2};
        f = mutabilityQualifierArr;
        g = EnumEntriesKt.a(mutabilityQualifierArr);
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f.clone();
    }
}
