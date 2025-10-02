package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzof implements ObjectEncoder {
    static final zzof zza = new zzof();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("xMin"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("yMin"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("xMax"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("yMax"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("confidenceScore"));

    private zzof() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzur zzurVar = (zzur) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzurVar.zzc());
        objectEncoderContext.add(zzc, zzurVar.zze());
        objectEncoderContext.add(zzd, zzurVar.zzb());
        objectEncoderContext.add(zze, zzurVar.zzd());
        objectEncoderContext.add(zzf, zzurVar.zza());
    }
}
