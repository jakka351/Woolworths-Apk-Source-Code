package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzeh implements ObjectEncoder {
    static final zzeh zza = new zzeh();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("durationMs"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("isColdCall"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("eventsCount"));
    private static final FieldDescriptor zzi = a.C(8, new FieldDescriptor.Builder("otherErrors"));
    private static final FieldDescriptor zzj = a.C(9, new FieldDescriptor.Builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = a.C(10, new FieldDescriptor.Builder("isAccelerated"));

    private zzeh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
