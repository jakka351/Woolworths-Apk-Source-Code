package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzggr;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final /* synthetic */ class zzaq implements zzggr {
    static final /* synthetic */ zzaq zza = new zzaq();

    private /* synthetic */ zzaq() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        int i = zzau.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
