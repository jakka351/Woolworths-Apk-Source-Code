package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzep implements ObjectEncoder {
    static final zzep zza = new zzep();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("options"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("errorCode"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("downloadStatus"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("mddDownloadErrorCodes"));

    private zzep() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
