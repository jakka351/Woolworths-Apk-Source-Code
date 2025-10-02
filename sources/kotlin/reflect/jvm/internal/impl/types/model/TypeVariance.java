package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TypeVariance {
    public static final TypeVariance e;
    public static final TypeVariance f;
    public static final TypeVariance g;
    public static final /* synthetic */ TypeVariance[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    static {
        TypeVariance typeVariance = new TypeVariance("IN", 0, "in");
        e = typeVariance;
        TypeVariance typeVariance2 = new TypeVariance("OUT", 1, "out");
        f = typeVariance2;
        TypeVariance typeVariance3 = new TypeVariance("INV", 2, "");
        g = typeVariance3;
        TypeVariance[] typeVarianceArr = {typeVariance, typeVariance2, typeVariance3};
        h = typeVarianceArr;
        i = EnumEntriesKt.a(typeVarianceArr);
    }

    public TypeVariance(String str, int i2, String str2) {
        this.d = str2;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
