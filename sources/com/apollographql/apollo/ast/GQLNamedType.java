package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLNamedType;", "Lcom/apollographql/apollo/ast/GQLType;", "Lcom/apollographql/apollo/ast/GQLNamed;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GQLNamedType extends GQLType implements GQLNamed {

    /* renamed from: a, reason: collision with root package name */
    public final String f13557a;
    public final EmptyList b;

    public GQLNamedType(String name) {
        Intrinsics.h(name, "name");
        this.f13557a = name;
        this.b = EmptyList.d;
    }

    /* renamed from: a, reason: from getter */
    public final String getF13557a() {
        return this.f13557a;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.b;
    }
}
