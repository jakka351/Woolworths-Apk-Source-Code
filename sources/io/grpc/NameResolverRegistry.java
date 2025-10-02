package io.grpc;

import com.google.common.collect.ImmutableMap;
import com.salesforce.marketingcloud.messages.iam.j;
import io.grpc.NameResolver;
import io.grpc.ServiceProviders;
import io.grpc.internal.DnsNameResolverProvider;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public final class NameResolverRegistry {
    public static final Logger d = Logger.getLogger(NameResolverRegistry.class.getName());
    public static NameResolverRegistry e;

    /* renamed from: a, reason: collision with root package name */
    public String f23969a = j.h;
    public final LinkedHashSet b = new LinkedHashSet();
    public ImmutableMap c = ImmutableMap.l();

    public final class NameResolverFactory extends NameResolver.Factory {
        @Override // io.grpc.NameResolver.Factory
        public final String a() {
            throw null;
        }

        @Override // io.grpc.NameResolver.Factory
        public final NameResolver b(URI uri, NameResolver.Args args) {
            throw null;
        }
    }

    public static final class NameResolverPriorityAccessor implements ServiceProviders.PriorityAccessor<NameResolverProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final boolean a(Object obj) {
            ((NameResolverProvider) obj).getClass();
            return true;
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public final int b(Object obj) {
            ((NameResolverProvider) obj).getClass();
            return 5;
        }
    }

    public static synchronized NameResolverRegistry a() {
        try {
            if (e == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    boolean z = DnsNameResolverProvider.f24009a;
                    arrayList.add(DnsNameResolverProvider.class);
                } catch (ClassNotFoundException e2) {
                    d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e2);
                }
                List<NameResolverProvider> listA = ServiceProviders.a(NameResolverProvider.class, Collections.unmodifiableList(arrayList), NameResolverProvider.class.getClassLoader(), new NameResolverPriorityAccessor());
                if (listA.isEmpty()) {
                    d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                e = new NameResolverRegistry();
                for (NameResolverProvider nameResolverProvider : listA) {
                    d.fine("Service loader found " + nameResolverProvider);
                    NameResolverRegistry nameResolverRegistry = e;
                    synchronized (nameResolverRegistry) {
                        nameResolverProvider.getClass();
                        nameResolverRegistry.b.add(nameResolverProvider);
                    }
                }
                e.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NameResolverProvider b(String str) {
        ImmutableMap immutableMap;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            immutableMap = this.c;
        }
        return (NameResolverProvider) immutableMap.get(str.toLowerCase(Locale.US));
    }

    public final synchronized void c() {
        try {
            HashMap map = new HashMap();
            String strA = j.h;
            Iterator it = this.b.iterator();
            char c = 0;
            while (it.hasNext()) {
                NameResolverProvider nameResolverProvider = (NameResolverProvider) it.next();
                String strA2 = nameResolverProvider.a();
                if (((NameResolverProvider) map.get(strA2)) == null) {
                    map.put(strA2, nameResolverProvider);
                }
                if (c < 5) {
                    strA = nameResolverProvider.a();
                    c = 5;
                }
            }
            this.c = ImmutableMap.c(map);
            this.f23969a = strA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
