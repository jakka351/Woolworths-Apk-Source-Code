package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzhk implements ObjectEncoder {
    static final zzhk zza = new zzhk();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("logEventKey"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("eventCount"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("inferenceDurationStats"));

    private zzhk() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzfv zzfvVar = (zzfv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzfvVar.zza());
        objectEncoderContext.add(zzc, zzfvVar.zzc());
        objectEncoderContext.add(zzd, zzfvVar.zzb());
    }
}
