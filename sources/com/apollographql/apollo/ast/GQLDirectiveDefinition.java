package com.apollographql.apollo.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/ast/GQLDirectiveDefinition;", "Lcom/apollographql/apollo/ast/GQLDefinition;", "Lcom/apollographql/apollo/ast/GQLDescribed;", "Lcom/apollographql/apollo/ast/GQLNamed;", "Companion", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GQLDirectiveDefinition implements GQLDefinition, GQLDescribed, GQLNamed {
    public static final Set c = ArraysKt.r0(new String[]{"include", "skip", "deprecated", "specifiedBy"});

    /* renamed from: a, reason: collision with root package name */
    public final Object f13540a;
    public final Object b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/GQLDirectiveDefinition$Companion;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GQLDirectiveDefinition(String name, ArrayList arrayList, List list) {
        Intrinsics.h(name, "name");
        this.f13540a = list;
        this.b = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.apollographql.apollo.ast.GQLNode
    /* renamed from: getChildren */
    public final List getC() {
        return this.b;
    }
}
