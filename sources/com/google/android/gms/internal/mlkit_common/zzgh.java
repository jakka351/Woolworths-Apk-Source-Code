package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgh implements ObjectEncoder {
    static final zzgh zza = new zzgh();
    private static final FieldDescriptor zzb = a.g(1, new FieldDescriptor.Builder("modelType"));
    private static final FieldDescriptor zzc = a.g(2, new FieldDescriptor.Builder("isDownloaded"));
    private static final FieldDescriptor zzd = a.g(3, new FieldDescriptor.Builder("modelName"));

    private zzgh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmjVar.zza());
        objectEncoderContext.add(zzc, zzmjVar.zzb());
        objectEncoderContext.add(zzd, (Object) null);
    }
}
