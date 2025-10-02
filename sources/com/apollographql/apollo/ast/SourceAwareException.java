package com.apollographql.apollo.ast;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/SourceAwareException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Companion", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SourceAwareException extends RuntimeException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/SourceAwareException$Companion;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SourceAwareException(String error, SourceLocation sourceLocation) {
        String strA;
        Intrinsics.h(error, "error");
        super(a.p(new StringBuilder("e: "), (sourceLocation == null || (strA = sourceLocation.a()) == null) ? "(unknown location)" : strA, ": ", error + ""));
    }
}
