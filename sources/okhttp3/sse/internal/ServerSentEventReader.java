package okhttp3.sse.internal;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader;", "", "Callback", "Companion", "okhttp-sse"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ServerSentEventReader {
    public static final Companion d = new Companion(0);
    public static final Options e;
    public static final ByteString f;

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSource f26778a;
    public final RealEventSource b;
    public String c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader$Callback;", "", "okhttp-sse"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Callback {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader$Companion;", "", "<init>", "()V", "Lokio/ByteString;", "CRLF", "Lokio/ByteString;", "okhttp-sse"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ByteString byteString = ByteString.g;
        e = Options.Companion.b(ByteString.Companion.b("\r\n"), ByteString.Companion.b("\r"), ByteString.Companion.b("\n"), ByteString.Companion.b("data: "), ByteString.Companion.b("data:"), ByteString.Companion.b("data\r\n"), ByteString.Companion.b("data\r"), ByteString.Companion.b("data\n"), ByteString.Companion.b("id: "), ByteString.Companion.b("id:"), ByteString.Companion.b("id\r\n"), ByteString.Companion.b("id\r"), ByteString.Companion.b("id\n"), ByteString.Companion.b("event: "), ByteString.Companion.b("event:"), ByteString.Companion.b("event\r\n"), ByteString.Companion.b("event\r"), ByteString.Companion.b("event\n"), ByteString.Companion.b("retry: "), ByteString.Companion.b("retry:"));
        f = ByteString.Companion.b("\r\n");
    }

    public ServerSentEventReader(BufferedSource source, RealEventSource realEventSource) {
        Intrinsics.h(source, "source");
        this.f26778a = source;
        this.b = realEventSource;
    }

    public final boolean a() throws NumberFormatException {
        String strB1 = this.c;
        Buffer buffer = new Buffer();
        while (true) {
            String strB12 = null;
            while (true) {
                BufferedSource bufferedSource = this.f26778a;
                Options options = e;
                int iA2 = bufferedSource.A2(options);
                if (iA2 >= 0 && iA2 < 3) {
                    if (buffer.e == 0) {
                        return true;
                    }
                    this.c = strB1;
                    buffer.skip(1L);
                    String strV = buffer.v();
                    this.b.e.f9040a.k(new ChannelFactory.MainChannel.SseEvent.SsePayload(strV, strB1, strB12));
                    return true;
                }
                ByteString byteString = f;
                Companion companion = d;
                if (3 <= iA2 && iA2 < 5) {
                    companion.getClass();
                    buffer.Y(10);
                    bufferedSource.l1(buffer, bufferedSource.V(byteString));
                    bufferedSource.A2(options);
                } else if (5 <= iA2 && iA2 < 8) {
                    buffer.Y(10);
                } else if (8 <= iA2 && iA2 < 10) {
                    strB1 = bufferedSource.B1();
                    if (strB1.length() <= 0) {
                        strB1 = null;
                    }
                } else if (10 <= iA2 && iA2 < 13) {
                    strB1 = null;
                } else if (13 <= iA2 && iA2 < 15) {
                    strB12 = bufferedSource.B1();
                    if (strB12.length() > 0) {
                    }
                } else if (15 > iA2 || iA2 >= 18) {
                    if (18 <= iA2 && iA2 < 20) {
                        companion.getClass();
                        String strB13 = bufferedSource.B1();
                        byte[] bArr = _UtilCommonKt.f26698a;
                        try {
                            Long.parseLong(strB13);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (iA2 != -1) {
                            throw new AssertionError();
                        }
                        long jV = bufferedSource.V(byteString);
                        if (jV == -1) {
                            return false;
                        }
                        bufferedSource.skip(jV);
                        bufferedSource.A2(options);
                    }
                }
            }
        }
    }
}
