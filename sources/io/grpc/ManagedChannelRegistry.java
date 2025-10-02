package io.grpc;

import io.grpc.ServiceProviders;
import io.grpc.okhttp.OkHttpChannelProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Internal
/* loaded from: classes7.dex */
public final class ManagedChannelRegistry {
    public static final Logger c = Logger.getLogger(ManagedChannelRegistry.class.getName());
    public static ManagedChannelRegistry d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23958a = new LinkedHashSet();
    public List b = Collections.EMPTY_LIST;

    /* renamed from: io.grpc.ManagedChannelRegistry$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<ManagedChannelProvider> {
        @Override // java.util.Comparator
        public final int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.b() - managedChannelProvider2.b();
        }
    }

    public static final class ManagedChannelPriorityAccessor implements ServiceProviders.PriorityAccessor<ManagedChannelProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final boolean a(Object obj) {
            ((ManagedChannelProvider) obj).getClass();
            return true;
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final int b(Object obj) {
            return ((ManagedChannelProvider) obj).b();
        }
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    public static List a() {
        Logger logger = c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(OkHttpChannelProvider.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
