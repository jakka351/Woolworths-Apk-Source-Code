package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzhl implements ObjectEncoder {
    static final zzhl zza = new zzhl();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("hasResult"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("isColdCall"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("imageInfo"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("options"));
    private static final FieldDescriptor zzg = a.z(6, new FieldDescriptor.Builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zzh = a.z(7, new FieldDescriptor.Builder("detectedBarcodeValueTypes"));

    private zzhl() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzft zzftVar = (zzft) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzftVar.zzc());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zzftVar.zze());
        objectEncoderContext.add(zze, (Object) null);
        objectEncoderContext.add(zzf, zzftVar.zzd());
        objectEncoderContext.add(zzg, zzftVar.zza());
        objectEncoderContext.add(zzh, zzftVar.zzb());
    }
}
