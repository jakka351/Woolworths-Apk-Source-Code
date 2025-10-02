package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzdb implements ObjectEncoder {
    static final zzdb zza = new zzdb();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("maxResults"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("modelType"));

    private zzdb() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
