package io.grpc.internal;

import com.google.common.base.Objects;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.HttpConnectProxiedSocketAddress;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public interface ClientTransportFactory extends Closeable {

    public static final class ClientTransportOptions {

        /* renamed from: a, reason: collision with root package name */
        public String f23999a;
        public Attributes b;
        public HttpConnectProxiedSocketAddress c;

        public final boolean equals(Object obj) {
            if (!(obj instanceof ClientTransportOptions)) {
                return false;
            }
            ClientTransportOptions clientTransportOptions = (ClientTransportOptions) obj;
            return this.f23999a.equals(clientTransportOptions.f23999a) && this.b.equals(clientTransportOptions.b) && Objects.a(null, null) && Objects.a(this.c, clientTransportOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23999a, this.b, null, this.c});
        }
    }

    public static final class SwapChannelCredentialsResult {
    }

    ConnectionClientTransport K0(SocketAddress socketAddress, ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger);

    Collection Y0();

    ScheduledExecutorService j0();
}
