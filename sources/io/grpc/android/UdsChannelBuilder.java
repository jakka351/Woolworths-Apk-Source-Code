package io.grpc.android;

import io.grpc.ExperimentalApi;
import io.grpc.ManagedChannelBuilder;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.internal.ConnectionSpec;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class UdsChannelBuilder {
    static {
        try {
            ConnectionSpec connectionSpec = OkHttpChannelBuilder.m;
            OkHttpChannelBuilder.class.asSubclass(ManagedChannelBuilder.class);
        } catch (ClassNotFoundException unused) {
        }
    }
}
