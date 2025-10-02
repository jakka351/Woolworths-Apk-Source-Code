package com.apollographql.apollo.network.ws.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/Event;", "Lcom/apollographql/apollo/network/ws/internal/Message;", "Lcom/apollographql/apollo/network/ws/internal/ConnectionReEstablished;", "Lcom/apollographql/apollo/network/ws/internal/GeneralError;", "Lcom/apollographql/apollo/network/ws/internal/NetworkError;", "Lcom/apollographql/apollo/network/ws/internal/OperationComplete;", "Lcom/apollographql/apollo/network/ws/internal/OperationError;", "Lcom/apollographql/apollo/network/ws/internal/OperationResponse;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Event extends Message {
    String getId();
}
