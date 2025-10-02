package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzfg implements ObjectEncoder {
    static final zzfg zza = new zzfg();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("detectorOptions"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("durationMs"));

    private zzfg() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
