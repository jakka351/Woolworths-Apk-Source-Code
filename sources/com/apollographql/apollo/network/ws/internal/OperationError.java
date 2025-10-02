package com.apollographql.apollo.network.ws.internal;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/OperationError;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperationError implements Event {

    /* renamed from: a, reason: collision with root package name */
    public final String f13645a;
    public final Map b;

    public OperationError(String str, Map map) {
        this.f13645a = str;
        this.b = map;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    /* renamed from: getId, reason: from getter */
    public final String getF13645a() {
        return this.f13645a;
    }
}
