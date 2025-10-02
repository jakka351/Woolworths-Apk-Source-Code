package io.grpc.internal;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import io.grpc.Attributes;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.EquivalentAddressGroup;
import io.grpc.InternalChannelz;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class ManagedChannelImplBuilder extends ManagedChannelBuilder<ManagedChannelImplBuilder> {
    public static final Method E;

    /* renamed from: a, reason: collision with root package name */
    public final SharedResourcePool f24052a;
    public final SharedResourcePool b;
    public final ArrayList c;
    public final NameResolverRegistry d;
    public final ArrayList e;
    public final String f;
    public final String g;
    public final DecompressorRegistry h;
    public final CompressorRegistry i;
    public final long j;
    public final int k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final InternalChannelz p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final ClientTransportFactoryBuilder w;
    public final ChannelBuilderDefaultPortProvider x;
    public static final Logger y = Logger.getLogger(ManagedChannelImplBuilder.class.getName());
    public static final long z = TimeUnit.MINUTES.toMillis(30);
    public static final long A = TimeUnit.SECONDS.toMillis(1);
    public static final SharedResourcePool B = new SharedResourcePool(GrpcUtil.p);
    public static final DecompressorRegistry C = DecompressorRegistry.d;
    public static final CompressorRegistry D = CompressorRegistry.b;

    public interface ChannelBuilderDefaultPortProvider {
        int a();
    }

    public interface ClientTransportFactoryBuilder {
        ClientTransportFactory a();
    }

    public static class DirectAddressNameResolverProvider extends NameResolverProvider {
        @Override // io.grpc.NameResolver.Factory
        public final String a() {
            return "directaddress";
        }

        @Override // io.grpc.NameResolver.Factory
        public final NameResolver b(URI uri, NameResolver.Args args) {
            return new NameResolver() { // from class: io.grpc.internal.ManagedChannelImplBuilder.DirectAddressNameResolverProvider.1
                @Override // io.grpc.NameResolver
                public final String a() {
                    DirectAddressNameResolverProvider.this.getClass();
                    return null;
                }

                @Override // io.grpc.NameResolver
                public final void c() {
                }

                @Override // io.grpc.NameResolver
                public final void e(NameResolver.Listener2 listener2) {
                    NameResolver.ResolutionResult.Builder builderA = NameResolver.ResolutionResult.a();
                    List listSingletonList = Collections.singletonList(new EquivalentAddressGroup(null));
                    builderA.f23968a = listSingletonList;
                    Attributes attributes = Attributes.b;
                    builderA.b = attributes;
                    listener2.b(new NameResolver.ResolutionResult(listSingletonList, attributes, builderA.c));
                }
            };
        }

        @Override // io.grpc.NameResolverProvider
        public final Collection c() {
            return null;
        }
    }

    public static final class FixedPortProvider implements ChannelBuilderDefaultPortProvider {
        @Override // io.grpc.internal.ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider
        public final int a() {
            return 0;
        }
    }

    public static final class ManagedChannelDefaultPortProvider implements ChannelBuilderDefaultPortProvider {
        @Override // io.grpc.internal.ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider
        public final int a() {
            return 443;
        }
    }

    public static class UnsupportedClientTransportFactoryBuilder implements ClientTransportFactoryBuilder {
        @Override // io.grpc.internal.ManagedChannelImplBuilder.ClientTransportFactoryBuilder
        public final ClientTransportFactory a() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            y.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
            E = declaredMethod;
        } catch (NoSuchMethodException e2) {
            y.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
            E = declaredMethod;
        }
        E = declaredMethod;
    }

    public ManagedChannelImplBuilder(ClientTransportFactoryBuilder clientTransportFactoryBuilder, ChannelBuilderDefaultPortProvider channelBuilderDefaultPortProvider) {
        SharedResourcePool sharedResourcePool = B;
        this.f24052a = sharedResourcePool;
        this.b = sharedResourcePool;
        this.c = new ArrayList();
        this.d = NameResolverRegistry.a();
        this.e = new ArrayList();
        this.g = "pick_first";
        this.h = C;
        this.i = D;
        this.j = z;
        this.k = 5;
        this.l = 5;
        this.m = llqqqql.c0063cc006300630063;
        this.n = llqqqql.c0063c0063c00630063;
        this.o = true;
        this.p = InternalChannelz.e;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.f = "firestore.googleapis.com";
        this.w = clientTransportFactoryBuilder;
        this.x = channelBuilderDefaultPortProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @Override // io.grpc.ManagedChannelBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.grpc.ManagedChannel a() {
        /*
            r16 = this;
            r2 = r16
            io.grpc.internal.ManagedChannelOrphanWrapper r8 = new io.grpc.internal.ManagedChannelOrphanWrapper
            io.grpc.internal.ManagedChannelImpl r1 = new io.grpc.internal.ManagedChannelImpl
            io.grpc.internal.ManagedChannelImplBuilder$ClientTransportFactoryBuilder r0 = r2.w
            io.grpc.internal.ClientTransportFactory r3 = r0.a()
            io.grpc.internal.ExponentialBackoffPolicy$Provider r4 = new io.grpc.internal.ExponentialBackoffPolicy$Provider
            r4.<init>()
            io.grpc.internal.SharedResourceHolder$Resource r0 = io.grpc.internal.GrpcUtil.p
            io.grpc.internal.SharedResourcePool r5 = new io.grpc.internal.SharedResourcePool
            r5.<init>(r0)
            com.google.common.base.Supplier r6 = io.grpc.internal.GrpcUtil.r
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList r0 = r2.c
            r7.<init>(r0)
            io.grpc.InternalGlobalInterceptors.a()
            boolean r0 = r2.r
            java.lang.String r10 = "Unable to apply census stats"
            java.util.logging.Logger r11 = io.grpc.internal.ManagedChannelImplBuilder.y
            r12 = 0
            if (r0 == 0) goto L66
            java.lang.reflect.Method r0 = io.grpc.internal.ManagedChannelImplBuilder.E
            if (r0 == 0) goto L5f
            boolean r13 = r2.s     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            boolean r14 = r2.t     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Boolean r15 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            boolean r9 = r2.u     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Object[] r9 = new java.lang.Object[]{r13, r14, r15, r9}     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            java.lang.Object r0 = r0.invoke(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            io.grpc.ClientInterceptor r0 = (io.grpc.ClientInterceptor) r0     // Catch: java.lang.reflect.InvocationTargetException -> L50 java.lang.IllegalAccessException -> L52
            goto L60
        L50:
            r0 = move-exception
            goto L54
        L52:
            r0 = move-exception
            goto L5a
        L54:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
            goto L5f
        L5a:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
        L5f:
            r0 = r12
        L60:
            if (r0 == 0) goto L66
            r9 = 0
            r7.add(r9, r0)
        L66:
            boolean r0 = r2.v
            if (r0 == 0) goto La3
            java.lang.String r0 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L7e java.lang.IllegalAccessException -> L80 java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L84
            java.lang.String r9 = "getClientInterceptor"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L7e java.lang.IllegalAccessException -> L80 java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L84
            java.lang.Object r0 = r0.invoke(r12, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L7e java.lang.IllegalAccessException -> L80 java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L84
            io.grpc.ClientInterceptor r0 = (io.grpc.ClientInterceptor) r0     // Catch: java.lang.reflect.InvocationTargetException -> L7e java.lang.IllegalAccessException -> L80 java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L84
            r12 = r0
            goto L9d
        L7e:
            r0 = move-exception
            goto L86
        L80:
            r0 = move-exception
            goto L8c
        L82:
            r0 = move-exception
            goto L92
        L84:
            r0 = move-exception
            goto L98
        L86:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
            goto L9d
        L8c:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
            goto L9d
        L92:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
            goto L9d
        L98:
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            r11.log(r9, r10, r0)
        L9d:
            if (r12 == 0) goto La3
            r9 = 0
            r7.add(r9, r12)
        La3:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.<init>(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ManagedChannelImplBuilder.a():io.grpc.ManagedChannel");
    }
}
