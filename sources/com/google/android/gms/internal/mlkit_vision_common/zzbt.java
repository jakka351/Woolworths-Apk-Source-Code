package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzbt implements ObjectEncoder {
    static final zzbt zza = new zzbt();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("durationMs"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("handledErrors"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("unhandledErrors"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("modelNamespace"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("delegateFilter"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("httpResponseCode"));

    private zzbt() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
