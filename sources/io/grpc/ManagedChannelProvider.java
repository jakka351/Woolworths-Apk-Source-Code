package io.grpc;

import io.grpc.okhttp.OkHttpChannelBuilder;

@Internal
/* loaded from: classes7.dex */
public abstract class ManagedChannelProvider {

    public static final class NewChannelBuilderResult {
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    public abstract OkHttpChannelBuilder a();

    public abstract int b();
}
