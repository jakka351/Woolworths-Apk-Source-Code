package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLObjectField;", "Lcom/apollographql/apollo/ast/GQLNode;", "Lcom/apollographql/apollo/ast/GQLNamed;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLObjectField implements GQLNode, GQLNamed {

    /* renamed from: a, reason: collision with root package name */
    public final List f13559a;

    public GQLObjectField(String name, GQLValue gQLValue) {
        Intrinsics.h(name, "name");
        this.f13559a = CollectionsKt.Q(gQLValue);
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren, reason: from getter */
    public final List getF13559a() {
        return this.f13559a;
    }
}
