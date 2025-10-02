package com.apollographql.apollo.ast;

import com.apollographql.apollo.annotations.ApolloInternal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ApolloInternal
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/CatchTo;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CatchTo {
    public static final /* synthetic */ CatchTo[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        CatchTo[] catchToArr = {new CatchTo("RESULT", 0), new CatchTo("NULL", 1), new CatchTo("THROW", 2)};
        d = catchToArr;
        e = EnumEntriesKt.a(catchToArr);
    }

    public static CatchTo valueOf(String str) {
        return (CatchTo) Enum.valueOf(CatchTo.class, str);
    }

    public static CatchTo[] values() {
        return (CatchTo[]) d.clone();
    }
}
