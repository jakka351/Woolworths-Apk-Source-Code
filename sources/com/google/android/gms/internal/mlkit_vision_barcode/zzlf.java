package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzlf implements ObjectEncoder {
    static final zzlf zza = new zzlf();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("options"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("detectedBarcodeValueTypes"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("imageInfo"));

    private zzlf() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzrr zzrrVar = (zzrr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzrrVar.zzd());
        objectEncoderContext.add(zzc, zzrrVar.zze());
        objectEncoderContext.add(zzd, zzrrVar.zza());
        objectEncoderContext.add(zze, zzrrVar.zzb());
        objectEncoderContext.add(zzf, zzrrVar.zzc());
    }
}
