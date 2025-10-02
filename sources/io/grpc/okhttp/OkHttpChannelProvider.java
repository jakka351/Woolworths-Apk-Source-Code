package io.grpc.okhttp;

import io.grpc.Internal;
import io.grpc.InternalServiceProviders;
import io.grpc.ManagedChannelProvider;

@Internal
/* loaded from: classes7.dex */
public final class OkHttpChannelProvider extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public final OkHttpChannelBuilder a() {
        return new OkHttpChannelBuilder();
    }

    @Override // io.grpc.ManagedChannelProvider
    public final int b() {
        return InternalServiceProviders.a(OkHttpChannelProvider.class.getClassLoader()) ? 8 : 3;
    }
}
