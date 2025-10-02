package com.apollographql.apollo.network.websocket.internal;

import com.apollographql.apollo.network.websocket.WebSocketListener;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubscribableWebSocket implements WebSocketListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SocketState.values().length];
            try {
                SocketState[] socketStateArr = SocketState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SocketState[] socketStateArr2 = SocketState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SocketState[] socketStateArr3 = SocketState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SocketState[] socketStateArr4 = SocketState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
