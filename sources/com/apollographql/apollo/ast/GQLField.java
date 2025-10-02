package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/GQLField;", "Lcom/apollographql/apollo/ast/GQLSelection;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GQLField extends GQLSelection implements GQLNamed, GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final String f13545a;
    public final String b;
    public final Object c;
    public final Object d;
    public final ArrayList e;

    public GQLField(String str, String name, ArrayList arrayList, List list, List list2) {
        Intrinsics.h(name, "name");
        this.f13545a = str;
        this.b = name;
        this.c = list;
        this.d = list2;
        this.e = CollectionsKt.c0(arrayList, CollectionsKt.c0(list, list2));
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getB() {
        return this.e;
    }
}
