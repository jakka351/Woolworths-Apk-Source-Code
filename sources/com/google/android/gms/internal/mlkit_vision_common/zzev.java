package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzev implements ObjectEncoder {
    static final zzev zza = new zzev();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("type"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("version"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("featureLevel"));

    private zzev() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
