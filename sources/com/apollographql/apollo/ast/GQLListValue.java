package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLListValue;", "Lcom/apollographql/apollo/ast/GQLValue;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLListValue extends GQLValue {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13556a;
    public final ArrayList b;

    public GQLListValue(ArrayList arrayList) {
        this.f13556a = arrayList;
        this.b = arrayList;
    }

    public final List a() {
        return this.f13556a;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.b;
    }
}
