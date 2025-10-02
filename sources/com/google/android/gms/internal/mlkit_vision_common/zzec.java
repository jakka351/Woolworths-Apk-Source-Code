package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("renderer"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("vendor"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("version"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("maxImages"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("maxSsbo"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("workGroupSizes"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("errorCode"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
