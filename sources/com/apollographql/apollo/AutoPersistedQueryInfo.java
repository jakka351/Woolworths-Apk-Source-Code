package com.apollographql.apollo;

import com.apollographql.apollo.api.ExecutionContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/AutoPersistedQueryInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Key", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoPersistedQueryInfo implements ExecutionContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public static final Key f13489a = new Key();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/AutoPersistedQueryInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/AutoPersistedQueryInfo;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements ExecutionContext.Key<AutoPersistedQueryInfo> {
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final ExecutionContext.Key getKey() {
        return f13489a;
    }
}
