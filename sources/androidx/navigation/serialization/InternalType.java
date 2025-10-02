package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/serialization/InternalType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class InternalType {
    public static final /* synthetic */ EnumEntries A;
    public static final InternalType d;
    public static final InternalType e;
    public static final InternalType f;
    public static final InternalType g;
    public static final InternalType h;
    public static final InternalType i;
    public static final InternalType j;
    public static final InternalType k;
    public static final InternalType l;
    public static final InternalType m;
    public static final InternalType n;
    public static final InternalType o;
    public static final InternalType p;
    public static final InternalType q;
    public static final InternalType r;
    public static final InternalType s;
    public static final InternalType t;
    public static final InternalType u;
    public static final InternalType v;
    public static final InternalType w;
    public static final InternalType x;
    public static final InternalType y;
    public static final /* synthetic */ InternalType[] z;

    static {
        InternalType internalType = new InternalType("INT", 0);
        d = internalType;
        InternalType internalType2 = new InternalType("INT_NULLABLE", 1);
        e = internalType2;
        InternalType internalType3 = new InternalType("BOOL", 2);
        f = internalType3;
        InternalType internalType4 = new InternalType("BOOL_NULLABLE", 3);
        g = internalType4;
        InternalType internalType5 = new InternalType("DOUBLE", 4);
        h = internalType5;
        InternalType internalType6 = new InternalType("DOUBLE_NULLABLE", 5);
        i = internalType6;
        InternalType internalType7 = new InternalType("FLOAT", 6);
        j = internalType7;
        InternalType internalType8 = new InternalType("FLOAT_NULLABLE", 7);
        k = internalType8;
        InternalType internalType9 = new InternalType("LONG", 8);
        l = internalType9;
        InternalType internalType10 = new InternalType("LONG_NULLABLE", 9);
        m = internalType10;
        InternalType internalType11 = new InternalType("STRING", 10);
        n = internalType11;
        InternalType internalType12 = new InternalType("STRING_NULLABLE", 11);
        o = internalType12;
        InternalType internalType13 = new InternalType("INT_ARRAY", 12);
        p = internalType13;
        InternalType internalType14 = new InternalType("BOOL_ARRAY", 13);
        q = internalType14;
        InternalType internalType15 = new InternalType("DOUBLE_ARRAY", 14);
        r = internalType15;
        InternalType internalType16 = new InternalType("FLOAT_ARRAY", 15);
        s = internalType16;
        InternalType internalType17 = new InternalType("LONG_ARRAY", 16);
        t = internalType17;
        InternalType internalType18 = new InternalType("ARRAY", 17);
        u = internalType18;
        InternalType internalType19 = new InternalType("LIST", 18);
        v = internalType19;
        InternalType internalType20 = new InternalType("ENUM", 19);
        w = internalType20;
        InternalType internalType21 = new InternalType("ENUM_NULLABLE", 20);
        x = internalType21;
        InternalType internalType22 = new InternalType("UNKNOWN", 21);
        y = internalType22;
        InternalType[] internalTypeArr = {internalType, internalType2, internalType3, internalType4, internalType5, internalType6, internalType7, internalType8, internalType9, internalType10, internalType11, internalType12, internalType13, internalType14, internalType15, internalType16, internalType17, internalType18, internalType19, internalType20, internalType21, internalType22};
        z = internalTypeArr;
        A = EnumEntriesKt.a(internalTypeArr);
    }

    public static InternalType valueOf(String str) {
        return (InternalType) Enum.valueOf(InternalType.class, str);
    }

    public static InternalType[] values() {
        return (InternalType[]) z.clone();
    }
}
