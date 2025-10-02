package io.grpc;

import io.grpc.NameResolver;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Collections;

@ExperimentalApi
/* loaded from: classes7.dex */
public abstract class NameResolverProvider extends NameResolver.Factory {
    public Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
