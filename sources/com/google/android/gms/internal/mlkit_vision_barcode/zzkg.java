package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzkg implements ObjectEncoder {
    static final zzkg zza = new zzkg();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("imageFormat"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("originalImageSize"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("compressedImageSize"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("isOdmlImage"));

    private zzkg() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqk zzqkVar = (zzqk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqkVar.zza());
        objectEncoderContext.add(zzc, zzqkVar.zzb());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
