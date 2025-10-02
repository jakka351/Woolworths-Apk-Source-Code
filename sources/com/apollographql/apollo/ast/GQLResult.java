package com.apollographql.apollo.ast;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/GQLResult;", "", "V", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GQLResult<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13563a;
    public final List b;

    public GQLResult(Object obj, List list) {
        this.f13563a = obj;
        this.b = list;
        if (obj == null && list.isEmpty()) {
            throw new IllegalStateException("Apollo: GQLResult must contain a value or issues");
        }
    }

    public final Object a() {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Issue) next) instanceof GraphQLIssue) {
                break;
            }
        }
        Issue issue = (Issue) next;
        if (issue != null) {
            throw new SourceAwareException(issue.getF13573a(), issue.getB());
        }
        Object obj = this.f13563a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Apollo: no value and no error found");
    }
}
