package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLInlineFragment;", "Lcom/apollographql/apollo/ast/GQLSelection;", "Lcom/apollographql/apollo/ast/GQLHasDirectives;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GQLInlineFragment extends GQLSelection implements GQLHasDirectives {

    /* renamed from: a, reason: collision with root package name */
    public final GQLNamedType f13550a;
    public final ArrayList b;

    public GQLInlineFragment(GQLNamedType gQLNamedType, ArrayList arrayList, ArrayList arrayList2) {
        this.f13550a = gQLNamedType;
        this.b = CollectionsKt.c0(CollectionsKt.S(gQLNamedType), CollectionsKt.c0(arrayList2, arrayList));
    }

    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getB() {
        return this.b;
    }
}
