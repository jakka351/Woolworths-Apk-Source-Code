package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes5.dex */
final class zzced implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    public zzced(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
