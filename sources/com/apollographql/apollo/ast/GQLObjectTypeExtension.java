package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/GQLObjectTypeExtension;", "Lcom/apollographql/apollo/ast/GQLDefinition;", "Lcom/apollographql/apollo/ast/GQLTypeExtension;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLObjectTypeExtension implements GQLDefinition, GQLTypeExtension, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13560a;
    public final Object b;
    public final ArrayList c;

    public GQLObjectTypeExtension(String name, List list, ArrayList arrayList, List list2) {
        Intrinsics.h(name, "name");
        this.f13560a = list;
        this.b = list2;
        this.c = CollectionsKt.c0(list2, arrayList);
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getF13559a() {
        return this.c;
    }
}
