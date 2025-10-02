package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ServiceProviders;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import io.grpc.util.SecretRoundRobinLoadBalancerProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public final class LoadBalancerRegistry {
    public static final Logger c;
    public static LoadBalancerRegistry d;
    public static final List e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23957a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    public static final class LoadBalancerPriorityAccessor implements ServiceProviders.PriorityAccessor<LoadBalancerProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final boolean a(Object obj) {
            ((LoadBalancerProvider) obj).getClass();
            return true;
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final int b(Object obj) {
            ((LoadBalancerProvider) obj).getClass();
            return 5;
        }
    }

    static {
        Logger logger = Logger.getLogger(LoadBalancerRegistry.class.getName());
        c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = PickFirstLoadBalancerProvider.b;
            arrayList.add(PickFirstLoadBalancerProvider.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            int i = SecretRoundRobinLoadBalancerProvider.Provider.b;
            arrayList.add(SecretRoundRobinLoadBalancerProvider.Provider.class);
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized LoadBalancerRegistry a() {
        try {
            if (d == null) {
                List<LoadBalancerProvider> listA = ServiceProviders.a(LoadBalancerProvider.class, e, LoadBalancerProvider.class.getClassLoader(), new LoadBalancerPriorityAccessor());
                d = new LoadBalancerRegistry();
                for (LoadBalancerProvider loadBalancerProvider : listA) {
                    c.fine("Service loader found " + loadBalancerProvider);
                    LoadBalancerRegistry loadBalancerRegistry = d;
                    synchronized (loadBalancerRegistry) {
                        loadBalancerProvider.getClass();
                        loadBalancerRegistry.f23957a.add(loadBalancerProvider);
                    }
                }
                d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public final synchronized LoadBalancerProvider b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.b;
        Preconditions.j(str, "policy");
        return (LoadBalancerProvider) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.b.clear();
        Iterator it = this.f23957a.iterator();
        while (it.hasNext()) {
            LoadBalancerProvider loadBalancerProvider = (LoadBalancerProvider) it.next();
            String strB = loadBalancerProvider.b();
            if (((LoadBalancerProvider) this.b.get(strB)) == null) {
                this.b.put(strB, loadBalancerProvider);
            }
        }
    }
}
