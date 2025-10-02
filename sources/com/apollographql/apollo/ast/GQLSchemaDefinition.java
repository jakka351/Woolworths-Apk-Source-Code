package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/GQLSchemaDefinition;", "Lcom/apollographql/apollo/ast/GQLDefinition;", "Lcom/apollographql/apollo/ast/GQLDescribed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLSchemaDefinition implements GQLDefinition, GQLDescribed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13565a;

    public GQLSchemaDefinition(ArrayList arrayList, ArrayList arrayList2) {
        this.f13565a = CollectionsKt.c0(arrayList2, arrayList);
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getB() {
        return this.f13565a;
    }
}
