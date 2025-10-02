package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzcn implements ObjectEncoder {
    static final zzcn zza = new zzcn();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("hasResult"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("isColdCall"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("imageInfo"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("detectorOptions"));

    private zzcn() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
