package com.apollographql.apollo.ast;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLIntValue;", "Lcom/apollographql/apollo/ast/GQLValue;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GQLIntValue extends GQLValue {

    /* renamed from: a, reason: collision with root package name */
    public final String f13553a;

    public GQLIntValue(String value) {
        Intrinsics.h(value, "value");
        this.f13553a = value;
    }

    /* renamed from: a, reason: from getter */
    public final String getF13553a() {
        return this.f13553a;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return EmptyList.d;
    }
}
