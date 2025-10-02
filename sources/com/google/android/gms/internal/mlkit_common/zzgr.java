package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgr implements ObjectEncoder {
    static final zzgr zza = new zzgr();
    private static final FieldDescriptor zzb = a.g(1, new FieldDescriptor.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME));
    private static final FieldDescriptor zzc = a.g(2, new FieldDescriptor.Builder("version"));
    private static final FieldDescriptor zzd = a.g(3, new FieldDescriptor.Builder("source"));
    private static final FieldDescriptor zze = a.g(4, new FieldDescriptor.Builder("uri"));
    private static final FieldDescriptor zzf = a.g(5, new FieldDescriptor.Builder("hash"));
    private static final FieldDescriptor zzg = a.g(6, new FieldDescriptor.Builder("modelType"));
    private static final FieldDescriptor zzh = a.g(7, new FieldDescriptor.Builder("size"));
    private static final FieldDescriptor zzi = a.g(8, new FieldDescriptor.Builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.g(9, new FieldDescriptor.Builder("isManifestModel"));

    private zzgr() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zznhVar.zzd());
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zznhVar.zzb());
        objectEncoderContext.add(zze, (Object) null);
        objectEncoderContext.add(zzf, zznhVar.zzc());
        objectEncoderContext.add(zzg, zznhVar.zza());
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
    }
}
