package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi
/* loaded from: classes5.dex */
public final class zzcfz extends zzcfy {
    public zzcfz(zzcek zzcekVar, zzbbh zzbbhVar, boolean z, @Nullable zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z, zzecyVar);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
