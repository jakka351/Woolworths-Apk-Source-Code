package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgq implements ObjectEncoder {
    static final zzgq zza = new zzgq();
    private static final FieldDescriptor zzb = a.g(1, new FieldDescriptor.Builder("options"));
    private static final FieldDescriptor zzc = a.g(2, new FieldDescriptor.Builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.g(3, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zze = a.g(4, new FieldDescriptor.Builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.g(5, new FieldDescriptor.Builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.g(6, new FieldDescriptor.Builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.g(7, new FieldDescriptor.Builder("mddDownloadErrorCodes"));

    private zzgq() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzncVar.zzc());
        objectEncoderContext.add(zzc, zzncVar.zzf());
        objectEncoderContext.add(zzd, zzncVar.zza());
        objectEncoderContext.add(zze, zzncVar.zze());
        objectEncoderContext.add(zzf, zzncVar.zzb());
        objectEncoderContext.add(zzg, zzncVar.zzd());
        objectEncoderContext.add(zzh, (Object) null);
    }
}
