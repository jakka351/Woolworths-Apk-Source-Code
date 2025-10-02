package io.grpc;

import io.grpc.ServiceProviders;
import java.util.Comparator;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Internal
/* loaded from: classes7.dex */
public final class ServerRegistry {

    /* renamed from: io.grpc.ServerRegistry$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<ServerProvider> {
        @Override // java.util.Comparator
        public final int compare(ServerProvider serverProvider, ServerProvider serverProvider2) {
            serverProvider.getClass();
            serverProvider2.getClass();
            return 0;
        }
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    public static final class ServerPriorityAccessor implements ServiceProviders.PriorityAccessor<ServerProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final boolean a(Object obj) {
            ((ServerProvider) obj).getClass();
            return true;
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final int b(Object obj) {
            ((ServerProvider) obj).getClass();
            return 4;
        }
    }

    static {
        Logger.getLogger(ServerRegistry.class.getName());
    }
}
