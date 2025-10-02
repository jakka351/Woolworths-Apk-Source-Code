package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusLine {
    public static final Companion d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f26732a;
    public final int b;
    public final String c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static StatusLine a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i;
            String strSubstring;
            Intrinsics.h(statusLine, "statusLine");
            if (StringsKt.W(statusLine, "HTTP/1.", false)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.f;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.g;
                }
            } else if (StringsKt.W(statusLine, "ICY ", false)) {
                protocol = Protocol.f;
                i = 4;
            } else {
                if (!StringsKt.W(statusLine, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.g;
                i = 12;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            String strSubstring2 = statusLine.substring(i, i2);
            Intrinsics.g(strSubstring2, "substring(...)");
            Integer numI0 = StringsKt.i0(strSubstring2);
            if (numI0 == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iIntValue = numI0.intValue();
            if (statusLine.length() <= i2) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i + 4);
                Intrinsics.g(strSubstring, "substring(...)");
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i, String message) {
        Intrinsics.h(protocol, "protocol");
        Intrinsics.h(message, "message");
        this.f26732a = protocol;
        this.b = i;
        this.c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f26732a == Protocol.f) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
