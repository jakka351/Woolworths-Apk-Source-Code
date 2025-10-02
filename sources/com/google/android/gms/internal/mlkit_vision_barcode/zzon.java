package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzon implements ObjectEncoder {
    static final zzon zza = new zzon();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("appId"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("appVersion"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("firebaseProjectId"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = a.z(6, new FieldDescriptor.Builder("gcmSenderId"));
    private static final FieldDescriptor zzh = a.z(7, new FieldDescriptor.Builder("apiKey"));
    private static final FieldDescriptor zzi = a.z(8, new FieldDescriptor.Builder("languages"));
    private static final FieldDescriptor zzj = a.z(9, new FieldDescriptor.Builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = a.z(10, new FieldDescriptor.Builder("isClearcutClient"));
    private static final FieldDescriptor zzl = a.z(11, new FieldDescriptor.Builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = a.z(12, new FieldDescriptor.Builder("isJsonLogging"));
    private static final FieldDescriptor zzn = a.z(13, new FieldDescriptor.Builder("buildLevel"));
    private static final FieldDescriptor zzo = a.z(14, new FieldDescriptor.Builder("optionalModuleVersion"));

    private zzon() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzvd zzvdVar = (zzvd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzvdVar.zzg());
        objectEncoderContext.add(zzc, zzvdVar.zzh());
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzvdVar.zzj());
        objectEncoderContext.add(zzf, zzvdVar.zzk());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzvdVar.zza());
        objectEncoderContext.add(zzj, zzvdVar.zzi());
        objectEncoderContext.add(zzk, zzvdVar.zzb());
        objectEncoderContext.add(zzl, zzvdVar.zzd());
        objectEncoderContext.add(zzm, zzvdVar.zzc());
        objectEncoderContext.add(zzn, zzvdVar.zze());
        objectEncoderContext.add(zzo, zzvdVar.zzf());
    }
}
