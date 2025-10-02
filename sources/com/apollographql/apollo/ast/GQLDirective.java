package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLDirective;", "Lcom/apollographql/apollo/ast/GQLNode;", "Lcom/apollographql/apollo/ast/GQLNamed;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GQLDirective implements GQLNode, GQLNamed {

    /* renamed from: a, reason: collision with root package name */
    public final String f13539a;
    public final Object b;
    public final Object c;

    public GQLDirective(String name, List list) {
        Intrinsics.h(name, "name");
        this.f13539a = name;
        this.b = list;
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.c;
    }
}
