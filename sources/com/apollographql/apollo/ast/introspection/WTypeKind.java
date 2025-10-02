package com.apollographql.apollo.ast.introspection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WTypeKind;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WTypeKind {
    public static final /* synthetic */ WTypeKind[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        WTypeKind[] wTypeKindArr = {new WTypeKind("SCALAR", 0), new WTypeKind("OBJECT", 1), new WTypeKind("INTERFACE", 2), new WTypeKind("UNION", 3), new WTypeKind("ENUM", 4), new WTypeKind("INPUT_OBJECT", 5), new WTypeKind("LIST", 6), new WTypeKind("NON_NULL", 7)};
        d = wTypeKindArr;
        e = EnumEntriesKt.a(wTypeKindArr);
    }

    public static WTypeKind valueOf(String str) {
        return (WTypeKind) Enum.valueOf(WTypeKind.class, str);
    }

    public static WTypeKind[] values() {
        return (WTypeKind[]) d.clone();
    }
}
