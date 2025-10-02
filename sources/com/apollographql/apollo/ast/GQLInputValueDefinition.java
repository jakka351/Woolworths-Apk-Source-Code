package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/ast/GQLInputValueDefinition;", "Lcom/apollographql/apollo/ast/GQLNode;", "Lcom/apollographql/apollo/ast/GQLDescribed;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLInputValueDefinition implements GQLNode, GQLDescribed, GQLNamed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13552a;
    public final ArrayList b;

    public GQLInputValueDefinition(String name, List list, GQLType gQLType, GQLValue gQLValue) {
        Intrinsics.h(name, "name");
        this.f13552a = list;
        this.b = CollectionsKt.c0(CollectionsKt.S(gQLValue), CollectionsKt.d0(gQLType, list));
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getF13559a() {
        return this.b;
    }
}
