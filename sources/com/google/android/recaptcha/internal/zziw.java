package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class zziw extends Lambda implements Function0 {
    public static final zziw zza = new zziw();

    public zziw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbd {
        int i = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
