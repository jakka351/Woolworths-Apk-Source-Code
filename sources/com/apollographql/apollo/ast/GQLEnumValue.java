package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLEnumValue;", "Lcom/apollographql/apollo/ast/GQLValue;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GQLEnumValue extends GQLValue {

    /* renamed from: a, reason: collision with root package name */
    public final String f13543a;

    public GQLEnumValue(String str) {
        this.f13543a = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getF13543a() {
        return this.f13543a;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return EmptyList.d;
    }
}
