package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLScalarTypeDefinition;", "Lcom/apollographql/apollo/ast/GQLTypeDefinition;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLScalarTypeDefinition extends GQLTypeDefinition {
    public final ArrayList b;

    public GQLScalarTypeDefinition(String name, ArrayList arrayList) {
        Intrinsics.h(name, "name");
        this.b = arrayList;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.b;
    }
}
