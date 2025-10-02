package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = a.g(1, new FieldDescriptor.Builder("modelInfo"));
    private static final FieldDescriptor zzc = a.g(2, new FieldDescriptor.Builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = a.g(3, new FieldDescriptor.Builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = a.g(4, new FieldDescriptor.Builder("isModelUpdateEnabled"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, ((zznl) obj).zza());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
