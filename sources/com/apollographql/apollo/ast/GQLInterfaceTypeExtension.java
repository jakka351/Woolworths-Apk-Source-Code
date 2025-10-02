package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/ast/GQLInterfaceTypeExtension;", "Lcom/apollographql/apollo/ast/GQLDefinition;", "Lcom/apollographql/apollo/ast/GQLTypeExtension;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLInterfaceTypeExtension implements GQLDefinition, GQLTypeExtension, GQLNamed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13554a;
    public final Object b;
    public final Object c;

    public GQLInterfaceTypeExtension(String name, List list, ArrayList arrayList, List list2) {
        Intrinsics.h(name, "name");
        this.f13554a = list;
        this.b = list2;
        this.c = list2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.apollographql.apollo.ast.GQLNode
    public final List getChildren() {
        return this.c;
    }
}
