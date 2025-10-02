package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsFrameType;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WsFrameType {
    public static final WsFrameType d;
    public static final /* synthetic */ WsFrameType[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        WsFrameType wsFrameType = new WsFrameType("Text", 0);
        d = wsFrameType;
        WsFrameType[] wsFrameTypeArr = {wsFrameType, new WsFrameType("Binary", 1)};
        e = wsFrameTypeArr;
        f = EnumEntriesKt.a(wsFrameTypeArr);
    }

    public static WsFrameType valueOf(String str) {
        return (WsFrameType) Enum.valueOf(WsFrameType.class, str);
    }

    public static WsFrameType[] values() {
        return (WsFrameType[]) e.clone();
    }
}
