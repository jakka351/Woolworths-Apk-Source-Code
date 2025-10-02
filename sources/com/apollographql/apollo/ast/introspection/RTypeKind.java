package com.apollographql.apollo.ast.introspection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RTypeKind;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RTypeKind {
    public static final /* synthetic */ RTypeKind[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        RTypeKind[] rTypeKindArr = {new RTypeKind("SCALAR", 0), new RTypeKind("OBJECT", 1), new RTypeKind("INTERFACE", 2), new RTypeKind("UNION", 3), new RTypeKind("ENUM", 4), new RTypeKind("INPUT_OBJECT", 5), new RTypeKind("LIST", 6), new RTypeKind("NON_NULL", 7)};
        d = rTypeKindArr;
        e = EnumEntriesKt.a(rTypeKindArr);
    }

    public static RTypeKind valueOf(String str) {
        return (RTypeKind) Enum.valueOf(RTypeKind.class, str);
    }

    public static RTypeKind[] values() {
        return (RTypeKind[]) d.clone();
    }
}
