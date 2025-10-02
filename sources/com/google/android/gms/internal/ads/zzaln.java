package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzaln implements zzajv {
    private final zzef zza = new zzef();
    private final zzale zzb = new zzale();

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) throws zzas {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i2 + i);
        zzefVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzefVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzefVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzefVar.zzh(iZzg);
                throw zzas.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzefVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int iZzg2 = 0;
                while (c == 65535) {
                    iZzg2 = zzefVar.zzg();
                    String strZzN2 = zzefVar.zzN(StandardCharsets.UTF_8);
                    c = strZzN2 == null ? (char) 0 : "STYLE".equals(strZzN2) ? (char) 2 : strZzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzefVar.zzh(iZzg2);
                if (c == 0) {
                    zzajp.zza(new zzalq(arrayList2), zzajuVar, zzdfVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzalg zzalgVarZza = zzalm.zza(zzefVar, arrayList);
                    if (zzalgVarZza != null) {
                        arrayList2.add(zzalgVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzefVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzefVar));
                }
            }
        } catch (zzas e) {
            throw new IllegalArgumentException(e);
        }
    }
}
