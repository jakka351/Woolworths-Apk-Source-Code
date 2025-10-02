package io.grpc.okhttp;

import androidx.compose.ui.input.pointer.a;
import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.OkHostnameVerifier;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.Util;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
final class OkHttpTlsUpgrader {

    /* renamed from: a, reason: collision with root package name */
    public static final List f24127a = Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, ConnectionSpec connectionSpec) throws IOException {
        Protocol protocol;
        Preconditions.j(sSLSocketFactory, "sslSocketFactory");
        Preconditions.j(socket, "socket");
        Preconditions.j(connectionSpec, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = connectionSpec.b;
        String[] strArr2 = strArr != null ? (String[]) Util.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) Util.a(connectionSpec.c, sSLSocket.getEnabledProtocols());
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
        if (!builder.f24133a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            builder.b = null;
        } else {
            builder.b = (String[]) strArr2.clone();
        }
        if (!builder.f24133a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            builder.c = null;
        } else {
            builder.c = (String[]) strArr3.clone();
        }
        ConnectionSpec connectionSpec2 = new ConnectionSpec(builder);
        sSLSocket.setEnabledProtocols(connectionSpec2.c);
        String[] strArr4 = connectionSpec2.b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        OkHttpProtocolNegotiator okHttpProtocolNegotiator = OkHttpProtocolNegotiator.c;
        boolean z = connectionSpec.d;
        List list = f24127a;
        String strD = okHttpProtocolNegotiator.d(sSLSocket, str, z ? list : null);
        if (strD.equals("http/1.0")) {
            protocol = Protocol.HTTP_1_0;
        } else if (strD.equals("http/1.1")) {
            protocol = Protocol.HTTP_1_1;
        } else if (strD.equals("h2")) {
            protocol = Protocol.HTTP_2;
        } else {
            if (!strD.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strD));
            }
            protocol = Protocol.SPDY_3;
        }
        Preconditions.p("Only " + list + " are supported, but negotiated protocol is %s", strD, list.contains(protocol));
        if (OkHostnameVerifier.f24137a.verify((str.startsWith("[") && str.endsWith("]")) ? a.h(1, 1, str) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
