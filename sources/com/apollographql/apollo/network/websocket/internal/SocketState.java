package com.apollographql.apollo.network.websocket.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SocketState {
    public static final /* synthetic */ SocketState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        SocketState[] socketStateArr = {new SocketState("AwaitOpen", 0), new SocketState("AwaitAck", 1), new SocketState("Connected", 2), new SocketState("ShutDown", 3)};
        d = socketStateArr;
        e = EnumEntriesKt.a(socketStateArr);
    }

    public static SocketState valueOf(String str) {
        return (SocketState) Enum.valueOf(SocketState.class, str);
    }

    public static SocketState[] values() {
        return (SocketState[]) d.clone();
    }
}
