package coil3.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/size/Precision;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Precision {
    public static final Precision d;
    public static final Precision e;
    public static final /* synthetic */ Precision[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Precision precision = new Precision("EXACT", 0);
        d = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        e = precision2;
        Precision[] precisionArr = {precision, precision2};
        f = precisionArr;
        g = EnumEntriesKt.a(precisionArr);
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f.clone();
    }
}
