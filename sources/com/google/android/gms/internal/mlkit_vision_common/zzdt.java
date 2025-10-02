package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzdt implements ObjectEncoder {
    static final zzdt zza = new zzdt();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder(lllqqql.cc006300630063cc));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("osBuild"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("brand"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("device"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("hardware"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("manufacturer"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("model"));
    private static final FieldDescriptor zzi = a.C(8, new FieldDescriptor.Builder("product"));
    private static final FieldDescriptor zzj = a.C(9, new FieldDescriptor.Builder("soc"));
    private static final FieldDescriptor zzk = a.C(10, new FieldDescriptor.Builder("socMetaBuildId"));

    private zzdt() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
