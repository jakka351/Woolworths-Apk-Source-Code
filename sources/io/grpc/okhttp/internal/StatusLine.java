package io.grpc.okhttp.internal;

import java.net.ProtocolException;

/* loaded from: classes7.dex */
public final class StatusLine {

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f24141a;
    public final int b;
    public final String c;

    public StatusLine(Protocol protocol, int i, String str) {
        this.f24141a = protocol;
        this.b = i;
        this.c = str;
    }

    public static StatusLine a(String str) throws ProtocolException, NumberFormatException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        Protocol protocol = Protocol.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new StatusLine(protocol, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24141a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        String str = this.c;
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        return sb.toString();
    }
}
