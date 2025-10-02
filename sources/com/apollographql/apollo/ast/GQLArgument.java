package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLArgument;", "Lcom/apollographql/apollo/ast/GQLNode;", "Lcom/apollographql/apollo/ast/GQLNamed;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLArgument implements GQLNode, GQLNamed {

    /* renamed from: a, reason: collision with root package name */
    public final String f13537a;
    public final GQLValue b;
    public final List c;

    public GQLArgument(String name, GQLValue gQLValue) {
        Intrinsics.h(name, "name");
        this.f13537a = name;
        this.b = gQLValue;
        this.c = CollectionsKt.Q(gQLValue);
    }

    /* renamed from: a, reason: from getter */
    public final String getF13537a() {
        return this.f13537a;
    }

    /* renamed from: b, reason: from getter */
    public final GQLValue getB() {
        return this.b;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren, reason: from getter */
    public final List getC() {
        return this.c;
    }
}
