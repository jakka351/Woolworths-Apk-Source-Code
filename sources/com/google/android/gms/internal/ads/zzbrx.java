package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzbrx implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbry zza;

    public zzbrx(zzbry zzbryVar) {
        Objects.requireNonNull(zzbryVar);
        this.zza = zzbryVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.zza.zzg("User canceled the download.");
    }
}
