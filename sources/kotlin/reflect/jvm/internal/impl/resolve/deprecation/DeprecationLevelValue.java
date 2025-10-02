package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DeprecationLevelValue {
    public static final DeprecationLevelValue d;
    public static final /* synthetic */ DeprecationLevelValue[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        DeprecationLevelValue deprecationLevelValue = new DeprecationLevelValue("WARNING", 0);
        DeprecationLevelValue deprecationLevelValue2 = new DeprecationLevelValue("ERROR", 1);
        d = deprecationLevelValue2;
        DeprecationLevelValue[] deprecationLevelValueArr = {deprecationLevelValue, deprecationLevelValue2, new DeprecationLevelValue("HIDDEN", 2)};
        e = deprecationLevelValueArr;
        f = EnumEntriesKt.a(deprecationLevelValueArr);
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) e.clone();
    }
}
