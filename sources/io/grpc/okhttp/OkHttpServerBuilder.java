package io.grpc.okhttp;

import io.grpc.ExperimentalApi;
import io.grpc.ForwardingServerBuilder;
import io.grpc.TlsServerCredentials;
import io.grpc.okhttp.internal.ConnectionSpec;
import java.net.InetAddress;
import java.net.Socket;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class OkHttpServerBuilder extends ForwardingServerBuilder<OkHttpServerBuilder> {

    /* renamed from: io.grpc.okhttp.OkHttpServerBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24125a;

        static {
            int[] iArr = new int[TlsServerCredentials.ClientAuth.values().length];
            f24125a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24125a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24125a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class ClientCertRequestingSocketFactory extends SSLSocketFactory {
        @Override // javax.net.ssl.SSLSocketFactory
        public final Socket createSocket(Socket socket, String str, int i, boolean z) {
            throw null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getDefaultCipherSuites() {
            throw null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getSupportedCipherSuites() {
            throw null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i) {
            throw null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
            throw null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i) {
            throw null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
            throw null;
        }
    }

    public static final class HandshakerSocketFactoryResult {
    }

    static {
        Logger.getLogger(OkHttpServerBuilder.class.getName());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toNanos(1L);
        timeUnit.toNanos(1L);
        TimeUnit.DAYS.toNanos(1000L);
        ConnectionSpec connectionSpec = OkHttpChannelBuilder.m;
        EnumSet.of(TlsServerCredentials.Feature.d, TlsServerCredentials.Feature.e);
    }
}
