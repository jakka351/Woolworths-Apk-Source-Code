package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LightClassOriginKind {
    public static final /* synthetic */ LightClassOriginKind[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        LightClassOriginKind[] lightClassOriginKindArr = {new LightClassOriginKind("SOURCE", 0), new LightClassOriginKind("BINARY", 1)};
        d = lightClassOriginKindArr;
        e = EnumEntriesKt.a(lightClassOriginKindArr);
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) d.clone();
    }
}
