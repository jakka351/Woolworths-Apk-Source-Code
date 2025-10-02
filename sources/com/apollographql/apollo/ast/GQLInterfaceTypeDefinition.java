package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLInterfaceTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLTypeDefinition;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLInterfaceTypeDefinition extends GQLTypeDefinition {
    public final Object b;
    public final Object c;
    public final ArrayList d;

    public GQLInterfaceTypeDefinition(String name, List list, ArrayList arrayList, List list2) {
        Intrinsics.h(name, "name");
        this.b = list;
        this.c = list2;
        this.d = CollectionsKt.c0(list2, arrayList);
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getB() {
        return this.d;
    }
}
