package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLNonNullType;", "Lcom/apollographql/apollo/ast/GQLType;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLNonNullType extends GQLType {

    /* renamed from: a, reason: collision with root package name */
    public final GQLType f13558a;
    public final List b;

    public GQLNonNullType(GQLType gQLType) {
        this.f13558a = gQLType;
        this.b = CollectionsKt.Q(gQLType);
    }

    /* renamed from: a, reason: from getter */
    public final GQLType getF13558a() {
        return this.f13558a;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren, reason: from getter */
    public final List getB() {
        return this.b;
    }
}
