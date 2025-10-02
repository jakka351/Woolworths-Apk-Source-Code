package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TypeUsage {
    public static final TypeUsage d;
    public static final TypeUsage e;
    public static final /* synthetic */ TypeUsage[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        d = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage(CodePackage.COMMON, 1);
        e = typeUsage2;
        TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        f = typeUsageArr;
        g = EnumEntriesKt.a(typeUsageArr);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f.clone();
    }
}
