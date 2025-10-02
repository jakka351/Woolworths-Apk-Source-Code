package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/GQLVariableDefinition;", "Lcom/apollographql/apollo/ast/GQLNode;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLVariableDefinition implements GQLNode, GQLNamed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final String f13570a;
    public final GQLType b;
    public final GQLValue c;
    public final ArrayList d;

    public GQLVariableDefinition(String name, GQLType gQLType, GQLValue gQLValue, ArrayList arrayList) {
        Intrinsics.h(name, "name");
        this.f13570a = name;
        this.b = gQLType;
        this.c = gQLValue;
        this.d = CollectionsKt.c0(arrayList, CollectionsKt.S(gQLValue));
    }

    /* renamed from: a, reason: from getter */
    public final GQLValue getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF13570a() {
        return this.f13570a;
    }

    /* renamed from: c, reason: from getter */
    public final GQLType getB() {
        return this.b;
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getF13559a() {
        return this.d;
    }
}
