package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzkx implements ObjectEncoder {
    static final zzkx zza = new zzkx();

    static {
        a.A(9, a.y(8, a.y(7, a.y(6, a.y(5, a.y(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME), "version"), "source"), "uri"), "hash"), "modelType"), "size"), "hasLabelMap"), "isManifestModel"));
    }

    private zzkx() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
