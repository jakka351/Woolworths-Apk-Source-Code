package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzej implements ObjectEncoder {
    static final zzej zza = new zzej();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("durationMs"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("imageSource"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("imageFormat"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("imageByteSize"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("imageWidth"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("imageHeight"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("rotationDegrees"));

    private zzej() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zziqVar.zzg());
        objectEncoderContext.add(zzc, zziqVar.zzb());
        objectEncoderContext.add(zzd, zziqVar.zza());
        objectEncoderContext.add(zze, zziqVar.zzc());
        objectEncoderContext.add(zzf, zziqVar.zze());
        objectEncoderContext.add(zzg, zziqVar.zzd());
        objectEncoderContext.add(zzh, zziqVar.zzf());
    }
}
