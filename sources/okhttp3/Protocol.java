package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Protocol;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Protocol {
    public static final Companion e;
    public static final Protocol f;
    public static final Protocol g;
    public static final Protocol h;
    public static final Protocol i;
    public static final Protocol j;
    public static final Protocol k;
    public static final Protocol l;
    public static final /* synthetic */ Protocol[] m;
    public static final /* synthetic */ EnumEntries n;
    public final String d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static Protocol a(String str) throws IOException {
            Protocol protocol = Protocol.f;
            if (str.equals("http/1.0")) {
                return protocol;
            }
            Protocol protocol2 = Protocol.g;
            if (str.equals("http/1.1")) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.j;
            if (str.equals("h2_prior_knowledge")) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.i;
            if (str.equals("h2")) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.h;
            if (str.equals("spdy/3.1")) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.k;
            if (str.equals("quic")) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.l;
            if (StringsKt.W(str, "h3", false)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: ".concat(str));
        }

        private Companion() {
        }
    }

    static {
        Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
        f = protocol;
        Protocol protocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
        g = protocol2;
        Protocol protocol3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        h = protocol3;
        Protocol protocol4 = new Protocol("HTTP_2", 3, "h2");
        i = protocol4;
        Protocol protocol5 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        j = protocol5;
        Protocol protocol6 = new Protocol("QUIC", 5, "quic");
        k = protocol6;
        Protocol protocol7 = new Protocol("HTTP_3", 6, "h3");
        l = protocol7;
        Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4, protocol5, protocol6, protocol7};
        m = protocolArr;
        n = EnumEntriesKt.a(protocolArr);
        e = new Companion(0);
    }

    public Protocol(String str, int i2, String str2) {
        this.d = str2;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) m.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
