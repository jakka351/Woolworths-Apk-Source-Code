package okhttp3;

import com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1;
import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lokhttp3/WebSocket;", "", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface WebSocket {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        RealWebSocket b(Request request, DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1);
    }

    boolean a(ByteString byteString);

    boolean b(String str);

    boolean e(int i, String str);
}
