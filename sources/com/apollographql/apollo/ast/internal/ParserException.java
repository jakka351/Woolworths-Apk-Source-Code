package com.apollographql.apollo.ast.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/internal/ParserException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParserException extends Exception {
    public final String d;
    public final Token e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParserException(String message, Token token) {
        super(message);
        Intrinsics.h(message, "message");
        Intrinsics.h(token, "token");
        this.d = message;
        this.e = token;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }
}
