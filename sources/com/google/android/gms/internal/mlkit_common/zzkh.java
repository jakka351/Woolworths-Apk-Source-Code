package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzkh implements ObjectEncoder {
    static final zzkh zza = new zzkh();
    private static final FieldDescriptor zzb = a.g(1, new FieldDescriptor.Builder("appId"));
    private static final FieldDescriptor zzc = a.g(2, new FieldDescriptor.Builder("appVersion"));
    private static final FieldDescriptor zzd = a.g(3, new FieldDescriptor.Builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.g(4, new FieldDescriptor.Builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.g(5, new FieldDescriptor.Builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.g(6, new FieldDescriptor.Builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.g(7, new FieldDescriptor.Builder("apiKey"));
    private static final FieldDescriptor zzi = a.g(8, new FieldDescriptor.Builder("languages"));
    private static final FieldDescriptor zzj = a.g(9, new FieldDescriptor.Builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.g(10, new FieldDescriptor.Builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.g(11, new FieldDescriptor.Builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.g(12, new FieldDescriptor.Builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.g(13, new FieldDescriptor.Builder("buildLevel"));
    private static final FieldDescriptor zzo = a.g(14, new FieldDescriptor.Builder("optionalModuleVersion"));

    private zzkh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqvVar.zzg());
        objectEncoderContext.add(zzc, zzqvVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzqvVar.zzj());
        objectEncoderContext.add(zzf, zzqvVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzqvVar.zza());
        objectEncoderContext.add(zzj, zzqvVar.zzi());
        objectEncoderContext.add(zzk, zzqvVar.zzb());
        objectEncoderContext.add(zzl, zzqvVar.zzd());
        objectEncoderContext.add(zzm, zzqvVar.zzc());
        objectEncoderContext.add(zzn, zzqvVar.zze());
        objectEncoderContext.add(zzo, zzqvVar.zzf());
    }
}
