package com.apollographql.apollo;

import com.apollographql.apollo.annotations.ApolloExperimental;
import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ContextScope;

@ApolloExperimental
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ConcurrencyInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Key", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConcurrencyInfo implements ExecutionContext.Element {
    public static final Key c = new Key();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f13491a;
    public final ContextScope b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ConcurrencyInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/ConcurrencyInfo;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements ExecutionContext.Key<ConcurrencyInfo> {
    }

    public ConcurrencyInfo(CoroutineDispatcher dispatcher, ContextScope contextScope) {
        Intrinsics.h(dispatcher, "dispatcher");
        this.f13491a = dispatcher;
        this.b = contextScope;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final ExecutionContext.Key getKey() {
        return c;
    }
}
