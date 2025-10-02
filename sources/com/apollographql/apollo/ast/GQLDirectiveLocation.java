package com.apollographql.apollo.ast;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLDirectiveLocation;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GQLDirectiveLocation {
    public static final /* synthetic */ GQLDirectiveLocation[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        GQLDirectiveLocation[] gQLDirectiveLocationArr = {new GQLDirectiveLocation("QUERY", 0), new GQLDirectiveLocation("MUTATION", 1), new GQLDirectiveLocation("SUBSCRIPTION", 2), new GQLDirectiveLocation("FIELD", 3), new GQLDirectiveLocation("FRAGMENT_DEFINITION", 4), new GQLDirectiveLocation("FRAGMENT_SPREAD", 5), new GQLDirectiveLocation("INLINE_FRAGMENT", 6), new GQLDirectiveLocation("VARIABLE_DEFINITION", 7), new GQLDirectiveLocation("SCHEMA", 8), new GQLDirectiveLocation("SCALAR", 9), new GQLDirectiveLocation("OBJECT", 10), new GQLDirectiveLocation("FIELD_DEFINITION", 11), new GQLDirectiveLocation("ARGUMENT_DEFINITION", 12), new GQLDirectiveLocation("INTERFACE", 13), new GQLDirectiveLocation("UNION", 14), new GQLDirectiveLocation("ENUM", 15), new GQLDirectiveLocation("ENUM_VALUE", 16), new GQLDirectiveLocation("INPUT_OBJECT", 17), new GQLDirectiveLocation("INPUT_FIELD_DEFINITION", 18)};
        d = gQLDirectiveLocationArr;
        e = EnumEntriesKt.a(gQLDirectiveLocationArr);
    }

    public static GQLDirectiveLocation valueOf(String str) {
        return (GQLDirectiveLocation) Enum.valueOf(GQLDirectiveLocation.class, str);
    }

    public static GQLDirectiveLocation[] values() {
        return (GQLDirectiveLocation[]) d.clone();
    }
}
