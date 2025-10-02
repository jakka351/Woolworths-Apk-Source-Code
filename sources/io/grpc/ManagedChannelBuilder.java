package io.grpc;

import io.grpc.ManagedChannelBuilder;
import io.grpc.ManagedChannelProvider;
import io.grpc.ManagedChannelRegistry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public abstract class ManagedChannelBuilder<T extends ManagedChannelBuilder<T>> {
    public static ManagedChannelBuilder b() {
        ManagedChannelRegistry managedChannelRegistry;
        List list;
        Logger logger = ManagedChannelRegistry.c;
        synchronized (ManagedChannelRegistry.class) {
            try {
                if (ManagedChannelRegistry.d == null) {
                    List<ManagedChannelProvider> listA = ServiceProviders.a(ManagedChannelProvider.class, ManagedChannelRegistry.a(), ManagedChannelProvider.class.getClassLoader(), new ManagedChannelRegistry.ManagedChannelPriorityAccessor());
                    ManagedChannelRegistry.d = new ManagedChannelRegistry();
                    for (ManagedChannelProvider managedChannelProvider : listA) {
                        ManagedChannelRegistry.c.fine("Service loader found " + managedChannelProvider);
                        ManagedChannelRegistry managedChannelRegistry2 = ManagedChannelRegistry.d;
                        synchronized (managedChannelRegistry2) {
                            managedChannelProvider.getClass();
                            managedChannelRegistry2.f23958a.add(managedChannelProvider);
                        }
                    }
                    ManagedChannelRegistry managedChannelRegistry3 = ManagedChannelRegistry.d;
                    synchronized (managedChannelRegistry3) {
                        ArrayList arrayList = new ArrayList(managedChannelRegistry3.f23958a);
                        Collections.sort(arrayList, Collections.reverseOrder(new ManagedChannelRegistry.AnonymousClass1()));
                        managedChannelRegistry3.b = Collections.unmodifiableList(arrayList);
                    }
                }
                managedChannelRegistry = ManagedChannelRegistry.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (managedChannelRegistry) {
            list = managedChannelRegistry.b;
        }
        ManagedChannelProvider managedChannelProvider2 = list.isEmpty() ? null : (ManagedChannelProvider) list.get(0);
        if (managedChannelProvider2 != null) {
            return managedChannelProvider2.a();
        }
        throw new ManagedChannelProvider.ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public abstract ManagedChannel a();

    public void c() {
        throw new UnsupportedOperationException();
    }
}
