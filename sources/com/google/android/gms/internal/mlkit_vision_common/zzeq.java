package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzeq implements ObjectEncoder {
    static final zzeq zza = new zzeq();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("version"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("source"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("uri"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("hash"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("modelType"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("size"));
    private static final FieldDescriptor zzi = a.C(8, new FieldDescriptor.Builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.C(9, new FieldDescriptor.Builder("isManifestModel"));

    private zzeq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
