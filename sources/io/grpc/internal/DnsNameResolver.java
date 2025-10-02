package io.grpc.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.google.gson.stream.JsonReader;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;
import io.grpc.ProxiedSocketAddress;
import io.grpc.ProxyDetector;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.SharedResourceHolder;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class DnsNameResolver extends NameResolver {
    public static final Logger s;
    public static final Set t;
    public static final boolean u;
    public static final boolean v;
    public static final boolean w;
    public static final ResourceResolverFactory x;
    public static String y;

    /* renamed from: a, reason: collision with root package name */
    public final ProxyDetector f24007a;
    public final Random b = new Random();
    public volatile AddressResolver c = JdkAddressResolver.d;
    public final AtomicReference d = new AtomicReference();
    public final String e;
    public final String f;
    public final int g;
    public final SharedResourceHolder.Resource h;
    public final long i;
    public final SynchronizationContext j;
    public final Stopwatch k;
    public boolean l;
    public boolean m;
    public Executor n;
    public final boolean o;
    public final NameResolver.ServiceConfigParser p;
    public boolean q;
    public NameResolver.Listener2 r;

    @VisibleForTesting
    public interface AddressResolver {
    }

    public static final class InternalResolutionResult {

        /* renamed from: a, reason: collision with root package name */
        public Status f24008a;
        public List b;
        public NameResolver.ConfigOrError c;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JdkAddressResolver implements AddressResolver {
        public static final JdkAddressResolver d;
        public static final /* synthetic */ JdkAddressResolver[] e;

        static {
            JdkAddressResolver jdkAddressResolver = new JdkAddressResolver("INSTANCE", 0);
            d = jdkAddressResolver;
            e = new JdkAddressResolver[]{jdkAddressResolver};
        }

        public static JdkAddressResolver valueOf(String str) {
            return (JdkAddressResolver) Enum.valueOf(JdkAddressResolver.class, str);
        }

        public static JdkAddressResolver[] values() {
            return (JdkAddressResolver[]) e.clone();
        }
    }

    public final class Resolve implements Runnable {
        public final NameResolver.Listener2 d;

        public Resolve(NameResolver.Listener2 listener2) {
            Preconditions.j(listener2, "savedListener");
            this.d = listener2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final boolean z;
            Runnable runnable;
            EquivalentAddressGroup equivalentAddressGroup;
            NameResolver.ResolutionResult.Builder builderA;
            NameResolver.Listener2 listener2 = this.d;
            DnsNameResolver dnsNameResolver = DnsNameResolver.this;
            String str = dnsNameResolver.f;
            SynchronizationContext synchronizationContext = dnsNameResolver.j;
            Logger logger = DnsNameResolver.s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Attempting DNS resolution of " + str);
            }
            InternalResolutionResult internalResolutionResultF = null;
            try {
                try {
                    ProxiedSocketAddress proxiedSocketAddressA = dnsNameResolver.f24007a.a(InetSocketAddress.createUnresolved(str, dnsNameResolver.g));
                    equivalentAddressGroup = proxiedSocketAddressA != null ? new EquivalentAddressGroup(proxiedSocketAddressA) : null;
                    builderA = NameResolver.ResolutionResult.a();
                } catch (IOException e) {
                    listener2.a(Status.n.i("Unable to resolve host " + str).h(e));
                    z = 0 != 0 && internalResolutionResultF.f24008a == null;
                    runnable = new Runnable() { // from class: io.grpc.internal.DnsNameResolver.Resolve.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DnsNameResolver dnsNameResolver2 = DnsNameResolver.this;
                            if (z) {
                                dnsNameResolver2.l = true;
                                if (dnsNameResolver2.i > 0) {
                                    Stopwatch stopwatch = dnsNameResolver2.k;
                                    stopwatch.b = 0L;
                                    stopwatch.f14868a = false;
                                    stopwatch.b();
                                }
                            }
                            dnsNameResolver2.q = false;
                        }
                    };
                }
                if (equivalentAddressGroup != null) {
                    if (logger.isLoggable(level)) {
                        logger.finer("Using proxy address " + equivalentAddressGroup);
                    }
                    builderA.f23968a = Collections.singletonList(equivalentAddressGroup);
                } else {
                    internalResolutionResultF = dnsNameResolver.f();
                    Status status = internalResolutionResultF.f24008a;
                    if (status != null) {
                        listener2.a(status);
                        z = internalResolutionResultF.f24008a == null;
                        runnable = new Runnable() { // from class: io.grpc.internal.DnsNameResolver.Resolve.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DnsNameResolver dnsNameResolver2 = DnsNameResolver.this;
                                if (z) {
                                    dnsNameResolver2.l = true;
                                    if (dnsNameResolver2.i > 0) {
                                        Stopwatch stopwatch = dnsNameResolver2.k;
                                        stopwatch.b = 0L;
                                        stopwatch.f14868a = false;
                                        stopwatch.b();
                                    }
                                }
                                dnsNameResolver2.q = false;
                            }
                        };
                        synchronizationContext.execute(runnable);
                    }
                    List list = internalResolutionResultF.b;
                    if (list != null) {
                        builderA.f23968a = list;
                    }
                    NameResolver.ConfigOrError configOrError = internalResolutionResultF.c;
                    if (configOrError != null) {
                        builderA.c = configOrError;
                    }
                }
                listener2.b(new NameResolver.ResolutionResult(builderA.f23968a, builderA.b, builderA.c));
                z = internalResolutionResultF != null && internalResolutionResultF.f24008a == null;
                runnable = new Runnable() { // from class: io.grpc.internal.DnsNameResolver.Resolve.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DnsNameResolver dnsNameResolver2 = DnsNameResolver.this;
                        if (z) {
                            dnsNameResolver2.l = true;
                            if (dnsNameResolver2.i > 0) {
                                Stopwatch stopwatch = dnsNameResolver2.k;
                                stopwatch.b = 0L;
                                stopwatch.f14868a = false;
                                stopwatch.b();
                            }
                        }
                        dnsNameResolver2.q = false;
                    }
                };
                synchronizationContext.execute(runnable);
            } catch (Throwable th) {
                z = 0 != 0 && internalResolutionResultF.f24008a == null;
                synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.DnsNameResolver.Resolve.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DnsNameResolver dnsNameResolver2 = DnsNameResolver.this;
                        if (z) {
                            dnsNameResolver2.l = true;
                            if (dnsNameResolver2.i > 0) {
                                Stopwatch stopwatch = dnsNameResolver2.k;
                                stopwatch.b = 0L;
                                stopwatch.f14868a = false;
                                stopwatch.b();
                            }
                        }
                        dnsNameResolver2.q = false;
                    }
                });
                throw th;
            }
        }
    }

    @VisibleForTesting
    public interface ResourceResolver {
        List a(String str);
    }

    public interface ResourceResolverFactory {
        ResourceResolver a();

        Throwable b();
    }

    @VisibleForTesting
    public static final class SrvRecord {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SrvRecord.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, 0});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(null, "host");
            toStringHelperB.a(0, "port");
            return toStringHelperB.toString();
        }
    }

    static {
        Logger logger = Logger.getLogger(DnsNameResolver.class.getName());
        s = logger;
        t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = Boolean.parseBoolean(property);
        v = Boolean.parseBoolean(property2);
        w = Boolean.parseBoolean(property3);
        ResourceResolverFactory resourceResolverFactory = null;
        try {
            try {
                try {
                    ResourceResolverFactory resourceResolverFactory2 = (ResourceResolverFactory) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, DnsNameResolver.class.getClassLoader()).asSubclass(ResourceResolverFactory.class).getConstructor(null).newInstance(null);
                    if (resourceResolverFactory2.b() != null) {
                        logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", resourceResolverFactory2.b());
                    } else {
                        resourceResolverFactory = resourceResolverFactory2;
                    }
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        x = resourceResolverFactory;
    }

    public DnsNameResolver(String str, NameResolver.Args args, SharedResourceHolder.Resource resource, Stopwatch stopwatch, boolean z) throws NumberFormatException {
        Preconditions.j(args, "args");
        this.h = resource;
        Preconditions.j(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        URI uriCreate = URI.create("//".concat(str));
        Preconditions.e("Invalid DNS name: %s", str, uriCreate.getHost() != null);
        String authority = uriCreate.getAuthority();
        Preconditions.k(authority, "nameUri (%s) doesn't have an authority", uriCreate);
        this.e = authority;
        this.f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.g = args.f23964a;
        } else {
            this.g = uriCreate.getPort();
        }
        ProxyDetector proxyDetector = args.b;
        Preconditions.j(proxyDetector, "proxyDetector");
        this.f24007a = proxyDetector;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.i = nanos;
        this.k = stopwatch;
        SynchronizationContext synchronizationContext = args.c;
        Preconditions.j(synchronizationContext, "syncContext");
        this.j = synchronizationContext;
        Executor executor = args.g;
        this.n = executor;
        this.o = executor == null;
        NameResolver.ServiceConfigParser serviceConfigParser = args.d;
        Preconditions.j(serviceConfigParser, "serviceConfigParser");
        this.p = serviceConfigParser;
    }

    public static Map g(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Verify.a("Bad key: %s", entry, t.contains(entry.getKey()));
        }
        List listD = JsonUtil.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = JsonUtil.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            Verify.a("Bad percentage: %s", dE, iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = JsonUtil.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = JsonUtil.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = JsonParser.f24032a;
                JsonReader jsonReader = new JsonReader(new StringReader(strSubstring));
                try {
                    Object objA = JsonParser.a(jsonReader);
                    if (!(objA instanceof List)) {
                        throw new ClassCastException(androidx.camera.core.impl.b.m(objA, "wrong type "));
                    }
                    List list2 = (List) objA;
                    JsonUtil.a(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                }
            } else {
                s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // io.grpc.NameResolver
    public final String a() {
        return this.e;
    }

    @Override // io.grpc.NameResolver
    public final void b() {
        Preconditions.q("not started", this.r != null);
        i();
    }

    @Override // io.grpc.NameResolver
    public final void c() {
        if (this.m) {
            return;
        }
        this.m = true;
        Executor executor = this.n;
        if (executor == null || !this.o) {
            return;
        }
        SharedResourceHolder.b(this.h, executor);
        this.n = null;
    }

    @Override // io.grpc.NameResolver
    public final void e(NameResolver.Listener2 listener2) {
        Preconditions.q("already started", this.r == null);
        if (this.o) {
            this.n = (Executor) SharedResourceHolder.a(this.h);
        }
        this.r = listener2;
        i();
    }

    public final InternalResolutionResult f() {
        ResourceResolver resourceResolverA;
        ResourceResolverFactory resourceResolverFactory;
        NameResolver.ConfigOrError configOrError;
        String str = this.f;
        InternalResolutionResult internalResolutionResult = new InternalResolutionResult();
        try {
            internalResolutionResult.b = j();
            if (w) {
                List listA = Collections.EMPTY_LIST;
                boolean z = false;
                if (u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z = v;
                    } else if (!str.contains(":")) {
                        boolean z2 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (cCharAt != '.') {
                                z2 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z = !z2;
                    }
                }
                NameResolver.ConfigOrError configOrError2 = null;
                if (z) {
                    resourceResolverA = (ResourceResolver) this.d.get();
                    if (resourceResolverA == null && (resourceResolverFactory = x) != null) {
                        resourceResolverA = resourceResolverFactory.a();
                    }
                } else {
                    resourceResolverA = null;
                }
                Logger logger = s;
                if (resourceResolverA != null) {
                    try {
                        listA = resourceResolverA.a("_grpc_config." + str);
                    } catch (Exception e) {
                        logger.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e);
                    }
                }
                if (listA.isEmpty()) {
                    logger.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.b;
                    if (y == null) {
                        try {
                            y = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    String str2 = y;
                    try {
                        Iterator it = h(listA).iterator();
                        Map mapG = null;
                        while (it.hasNext()) {
                            try {
                                mapG = g((Map) it.next(), random, str2);
                                if (mapG != null) {
                                    break;
                                }
                            } catch (RuntimeException e3) {
                                configOrError = new NameResolver.ConfigOrError(Status.g.i("failed to pick service config choice").h(e3));
                            }
                        }
                        configOrError = mapG == null ? null : new NameResolver.ConfigOrError(mapG);
                    } catch (IOException | RuntimeException e4) {
                        configOrError = new NameResolver.ConfigOrError(Status.g.i("failed to parse TXT records").h(e4));
                    }
                    if (configOrError != null) {
                        Status status = configOrError.f23966a;
                        configOrError2 = status != null ? new NameResolver.ConfigOrError(status) : this.p.a((Map) configOrError.b);
                    }
                }
                internalResolutionResult.c = configOrError2;
            }
            return internalResolutionResult;
        } catch (Exception e5) {
            internalResolutionResult.f24008a = Status.n.i("Unable to resolve host " + str).h(e5);
            return internalResolutionResult;
        }
    }

    public final void i() {
        if (this.q || this.m) {
            return;
        }
        if (this.l) {
            long j = this.i;
            if (j != 0) {
                if (j <= 0) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (this.k.a() <= j) {
                    return;
                }
            }
        }
        this.q = true;
        this.n.execute(new Resolve(this.r));
    }

    public final List j() {
        try {
            try {
                AddressResolver addressResolver = this.c;
                String str = this.f;
                ((JdkAddressResolver) addressResolver).getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new EquivalentAddressGroup(new InetSocketAddress((InetAddress) it.next(), this.g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Throwables.a(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
