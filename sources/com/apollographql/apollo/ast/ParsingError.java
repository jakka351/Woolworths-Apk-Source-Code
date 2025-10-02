package com.apollographql.apollo.ast;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/ParsingError;", "Lcom/apollographql/apollo/ast/GraphQLIssue;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParsingError implements GraphQLIssue {

    /* renamed from: a, reason: collision with root package name */
    public final String f13573a;
    public final SourceLocation b;

    public ParsingError(String message, SourceLocation sourceLocation) {
        Intrinsics.h(message, "message");
        this.f13573a = message;
        this.b = sourceLocation;
    }

    @Override // com.apollographql.apollo.ast.Issue
    /* renamed from: a, reason: from getter */
    public final SourceLocation getB() {
        return this.b;
    }

    @Override // com.apollographql.apollo.ast.Issue
    /* renamed from: getMessage, reason: from getter */
    public final String getF13573a() {
        return this.f13573a;
    }
}
