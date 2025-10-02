package com.apollographql.apollo.ast;

import YU.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/SourceLocation;", "", "Companion", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SourceLocation {

    /* renamed from: a, reason: collision with root package name */
    public final int f13574a;
    public final int b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/SourceLocation$Companion;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SourceLocation(int i, int i2) {
        this.f13574a = i;
        this.b = i2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("null: (");
        sb.append(this.f13574a);
        sb.append(", ");
        return a.l(sb, this.b, ')');
    }

    public final String toString() {
        return a();
    }
}
