package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Variance {
    public static final Variance f;
    public static final Variance g;
    public static final Variance h;
    public static final /* synthetic */ Variance[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;
    public final boolean e;

    static {
        Variance variance = new Variance("INVARIANT", 0, "", true);
        f = variance;
        Variance variance2 = new Variance("IN_VARIANCE", 1, "in", false);
        g = variance2;
        Variance variance3 = new Variance("OUT_VARIANCE", 2, "out", true);
        h = variance3;
        Variance[] varianceArr = {variance, variance2, variance3};
        i = varianceArr;
        j = EnumEntriesKt.a(varianceArr);
    }

    public Variance(String str, int i2, String str2, boolean z) {
        this.d = str2;
        this.e = z;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
