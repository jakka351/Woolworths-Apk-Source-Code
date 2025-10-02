package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzka implements ObjectEncoder {
    static final zzka zza = new zzka();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("maxMs"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("minMs"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("avgMs"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("medianMs"));
    private static final FieldDescriptor zzg = a.z(6, new FieldDescriptor.Builder("thirdQuartileMs"));

    private zzka() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqd zzqdVar = (zzqd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqdVar.zzc());
        objectEncoderContext.add(zzc, zzqdVar.zze());
        objectEncoderContext.add(zzd, zzqdVar.zza());
        objectEncoderContext.add(zze, zzqdVar.zzb());
        objectEncoderContext.add(zzf, zzqdVar.zzd());
        objectEncoderContext.add(zzg, zzqdVar.zzf());
    }
}
