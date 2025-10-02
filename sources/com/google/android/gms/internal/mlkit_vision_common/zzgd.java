package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgd implements ObjectEncoder {
    static final zzgd zza = new zzgd();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("detectorMode"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("personDetectionMode"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("landmarkDetectionMode"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("preferredHardwareConfigs"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("runConfig"));

    private zzgd() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
