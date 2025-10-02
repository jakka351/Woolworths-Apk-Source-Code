package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgu implements ObjectEncoder {
    static final zzgu zza = new zzgu();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("appId"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("appVersion"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("apiKey"));
    private static final FieldDescriptor zzi = a.C(8, new FieldDescriptor.Builder("languages"));
    private static final FieldDescriptor zzj = a.C(9, new FieldDescriptor.Builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.C(10, new FieldDescriptor.Builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.C(11, new FieldDescriptor.Builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.C(12, new FieldDescriptor.Builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.C(13, new FieldDescriptor.Builder("buildLevel"));
    private static final FieldDescriptor zzo = a.C(14, new FieldDescriptor.Builder("optionalModuleVersion"));

    private zzgu() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzlaVar.zzg());
        objectEncoderContext.add(zzc, zzlaVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzlaVar.zzj());
        objectEncoderContext.add(zzf, zzlaVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzlaVar.zza());
        objectEncoderContext.add(zzj, zzlaVar.zzi());
        objectEncoderContext.add(zzk, zzlaVar.zzb());
        objectEncoderContext.add(zzl, zzlaVar.zzd());
        objectEncoderContext.add(zzm, zzlaVar.zzc());
        objectEncoderContext.add(zzn, zzlaVar.zze());
        objectEncoderContext.add(zzo, zzlaVar.zzf());
    }
}
