package io.grpc.internal;

import com.google.common.base.Joiner;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.HandlerRegistry;
import io.grpc.ServerBuilder;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class ServerImplBuilder extends ServerBuilder<ServerImplBuilder> {

    public interface ClientTransportServersBuilder {
    }

    public static final class DefaultFallbackRegistry extends HandlerRegistry {
    }

    static {
        Logger.getLogger(ServerImplBuilder.class.getName());
        Logger logger = GrpcUtil.f24015a;
        Joiner joiner = DecompressorRegistry.c;
        CompressorRegistry compressorRegistry = CompressorRegistry.b;
        TimeUnit.SECONDS.toMillis(120L);
    }
}
