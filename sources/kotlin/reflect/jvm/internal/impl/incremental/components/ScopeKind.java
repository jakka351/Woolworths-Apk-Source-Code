package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ScopeKind {
    public static final /* synthetic */ ScopeKind[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ScopeKind[] scopeKindArr = {new ScopeKind("PACKAGE", 0), new ScopeKind("CLASSIFIER", 1)};
        d = scopeKindArr;
        e = EnumEntriesKt.a(scopeKindArr);
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) d.clone();
    }
}
