package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzoe implements ObjectEncoder {
    static final zzoe zza = new zzoe();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("appName"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("sessionId"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("startZoomLevel"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("endZoomLevel"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("durationMs"));
    private static final FieldDescriptor zzg = a.z(6, new FieldDescriptor.Builder("predictedArea"));

    private zzoe() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzut zzutVar = (zzut) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzutVar.zze());
        objectEncoderContext.add(zzc, zzutVar.zzf());
        objectEncoderContext.add(zzd, zzutVar.zzc());
        objectEncoderContext.add(zze, zzutVar.zzb());
        objectEncoderContext.add(zzf, zzutVar.zzd());
        objectEncoderContext.add(zzg, zzutVar.zza());
    }
}
