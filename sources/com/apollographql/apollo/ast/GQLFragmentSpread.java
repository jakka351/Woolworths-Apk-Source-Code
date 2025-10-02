package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/GQLFragmentSpread;", "Lcom/apollographql/apollo/ast/GQLSelection;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GQLFragmentSpread extends GQLSelection implements GQLNamed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final String f13549a;
    public final ArrayList b;

    public GQLFragmentSpread(String name, ArrayList arrayList) {
        Intrinsics.h(name, "name");
        this.f13549a = name;
        this.b = arrayList;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.b;
    }
}
