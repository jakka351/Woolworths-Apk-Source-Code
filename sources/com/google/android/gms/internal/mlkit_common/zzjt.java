package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzjt implements ObjectEncoder {
    static final zzjt zza = new zzjt();

    static {
        a.m(7, a.f(6, a.f(5, a.f(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("pipelineNamespace"), AppMeasurementSdk.ConditionalUserProperty.NAME), "clientLibraryName"), "clientLibraryVersion"), "minClientLibraryVersion"), "maxClientLibraryVersion"), "sourceProduct"));
    }

    private zzjt() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
