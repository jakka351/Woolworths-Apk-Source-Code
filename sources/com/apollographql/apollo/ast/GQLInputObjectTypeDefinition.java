package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLInputObjectTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLTypeDefinition;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLInputObjectTypeDefinition extends GQLTypeDefinition {
    public final Object b;
    public final ArrayList c;

    public GQLInputObjectTypeDefinition(String name, ArrayList arrayList, List list) {
        Intrinsics.h(name, "name");
        this.b = list;
        this.c = CollectionsKt.c0(list, arrayList);
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getB() {
        return this.c;
    }
}
