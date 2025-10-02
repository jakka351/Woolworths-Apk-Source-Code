package io.grpc.internal;

import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes7.dex */
public interface ClientStreamListener extends StreamListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RpcProgress {
        public static final RpcProgress d;
        public static final RpcProgress e;
        public static final RpcProgress f;
        public static final RpcProgress g;
        public static final /* synthetic */ RpcProgress[] h;

        static {
            RpcProgress rpcProgress = new RpcProgress("PROCESSED", 0);
            d = rpcProgress;
            RpcProgress rpcProgress2 = new RpcProgress("REFUSED", 1);
            e = rpcProgress2;
            RpcProgress rpcProgress3 = new RpcProgress("DROPPED", 2);
            f = rpcProgress3;
            RpcProgress rpcProgress4 = new RpcProgress("MISCARRIED", 3);
            g = rpcProgress4;
            h = new RpcProgress[]{rpcProgress, rpcProgress2, rpcProgress3, rpcProgress4};
        }

        public static RpcProgress valueOf(String str) {
            return (RpcProgress) Enum.valueOf(RpcProgress.class, str);
        }

        public static RpcProgress[] values() {
            return (RpcProgress[]) h.clone();
        }
    }

    void b(Metadata metadata);

    void c(Status status, RpcProgress rpcProgress, Metadata metadata);
}
