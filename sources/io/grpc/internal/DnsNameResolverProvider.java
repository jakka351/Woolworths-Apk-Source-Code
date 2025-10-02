package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.medallia.digital.mobilesdk.q2;
import io.grpc.InternalServiceProviders;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class DnsNameResolverProvider extends NameResolverProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f24009a = InternalServiceProviders.a(DnsNameResolverProvider.class.getClassLoader());

    @Override // io.grpc.NameResolver.Factory
    public final String a() {
        return "dns";
    }

    @Override // io.grpc.NameResolver.Factory
    public final NameResolver b(URI uri, NameResolver.Args args) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        Preconditions.j(path, "targetPath");
        Preconditions.h(path.startsWith(q2.c), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new DnsNameResolver(strSubstring, args, GrpcUtil.p, new Stopwatch(), f24009a);
    }

    @Override // io.grpc.NameResolverProvider
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
