package io.grpc.okhttp;

import com.google.common.base.MoreObjects;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.internal.InternalServer;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class OkHttpServer implements InternalServer {

    public static final class ListenSocket implements InternalInstrumented<InternalChannelz.SocketStats> {
        @Override // io.grpc.InternalWithLogId
        public final InternalLogId b() {
            return null;
        }

        public final String toString() {
            MoreObjects.b(this);
            throw null;
        }
    }

    static {
        Logger.getLogger(OkHttpServer.class.getName());
    }
}
