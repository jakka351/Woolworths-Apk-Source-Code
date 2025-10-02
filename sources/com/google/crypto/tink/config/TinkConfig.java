package com.google.crypto.tink.config;

import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.hybrid.HybridConfig;
import com.google.crypto.tink.proto.RegistryConfig;
import com.google.crypto.tink.signature.SignatureConfig;
import com.google.crypto.tink.streamingaead.StreamingAeadConfig;

/* loaded from: classes.dex */
public final class TinkConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14992a = 0;

    static {
        RegistryConfig.Builder builderNewBuilder = RegistryConfig.newBuilder();
        builderNewBuilder.j(HybridConfig.f14997a);
        builderNewBuilder.j(SignatureConfig.f15125a);
        builderNewBuilder.g();
        ((RegistryConfig) builderNewBuilder.e).setConfigName("TINK_1_0_0");
        RegistryConfig.Builder builderNewBuilder2 = RegistryConfig.newBuilder();
        builderNewBuilder2.j(HybridConfig.b);
        builderNewBuilder2.j(SignatureConfig.b);
        builderNewBuilder2.j(DeterministicAeadConfig.f14993a);
        builderNewBuilder2.j(StreamingAeadConfig.f15128a);
        builderNewBuilder2.g();
        ((RegistryConfig) builderNewBuilder2.e).setConfigName("TINK_1_1_0");
        RegistryConfig.Builder builderNewBuilder3 = RegistryConfig.newBuilder();
        builderNewBuilder3.j(HybridConfig.c);
        builderNewBuilder3.j(SignatureConfig.c);
        builderNewBuilder3.j(DeterministicAeadConfig.b);
        builderNewBuilder3.j(StreamingAeadConfig.b);
        builderNewBuilder3.g();
        ((RegistryConfig) builderNewBuilder3.e).setConfigName("TINK");
    }
}
