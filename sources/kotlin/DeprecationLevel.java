package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/DeprecationLevel;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeprecationLevel {
    public static final DeprecationLevel d;
    public static final DeprecationLevel e;
    public static final /* synthetic */ DeprecationLevel[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        d = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        e = deprecationLevel2;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, new DeprecationLevel("HIDDEN", 2)};
        f = deprecationLevelArr;
        g = EnumEntriesKt.a(deprecationLevelArr);
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f.clone();
    }
}
