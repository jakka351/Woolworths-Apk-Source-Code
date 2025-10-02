package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzkk implements ObjectEncoder {
    static final zzkk zza = new zzkk();
    private static final FieldDescriptor zzb = a.z(1, new FieldDescriptor.Builder("durationMs"));
    private static final FieldDescriptor zzc = a.z(2, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zzd = a.z(3, new FieldDescriptor.Builder("isColdCall"));
    private static final FieldDescriptor zze = a.z(4, new FieldDescriptor.Builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.z(5, new FieldDescriptor.Builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.z(6, new FieldDescriptor.Builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.z(7, new FieldDescriptor.Builder("eventsCount"));
    private static final FieldDescriptor zzi = a.z(8, new FieldDescriptor.Builder("otherErrors"));
    private static final FieldDescriptor zzj = a.z(9, new FieldDescriptor.Builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.z(10, new FieldDescriptor.Builder("isAccelerated"));

    private zzkk() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqq zzqqVar = (zzqq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqqVar.zze());
        objectEncoderContext.add(zzc, zzqqVar.zza());
        objectEncoderContext.add(zzd, zzqqVar.zzd());
        objectEncoderContext.add(zze, zzqqVar.zzb());
        objectEncoderContext.add(zzf, zzqqVar.zzc());
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
        objectEncoderContext.add(zzk, (Object) null);
    }
}
