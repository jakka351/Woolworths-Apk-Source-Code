package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzeb implements ObjectEncoder {
    static final zzeb zza = new zzeb();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("mode"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("landmark"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("classification"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("prominentFaceOnly"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("tracking"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("minFaceSize"));

    private zzeb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
