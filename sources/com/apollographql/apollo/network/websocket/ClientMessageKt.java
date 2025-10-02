package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ClientMessageKt {
    public static final TextClientMessage a(Map map) {
        Buffer buffer = new Buffer();
        JsonWriters.a(new BufferedSinkJsonWriter(buffer), map);
        buffer.v();
        return new TextClientMessage();
    }
}
