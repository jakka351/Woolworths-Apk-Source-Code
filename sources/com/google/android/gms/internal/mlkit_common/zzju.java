package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.salesforce.marketingcloud.UrlHandler;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzju implements ObjectEncoder {
    static final zzju zza = new zzju();

    static {
        a.m(12, a.f(11, a.f(10, a.f(9, a.f(8, a.f(7, a.f(6, a.f(5, a.f(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("deviceInfo"), "nnapiInfo"), "gpuInfo"), "pipelineIdentifier"), "acceptedConfigurations"), UrlHandler.ACTION), "status"), "customErrors"), "benchmarkStatus"), "validationTestResult"), "timestampUs"), "elapsedUs"));
    }

    private zzju() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
