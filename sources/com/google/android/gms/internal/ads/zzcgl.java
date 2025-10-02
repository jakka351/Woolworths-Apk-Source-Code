package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcgl extends MutableContextWrapper {

    @Nullable
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcgl(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof Activity ? (Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
        }
    }

    public final void zza(Intent intent, int i) {
        if (this.zza == null) {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(strValueOf);
        sb.append(" and requestCode: 236");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.zza.startActivityForResult(intent, 236);
    }

    @Nullable
    public final Activity zzb() {
        return this.zza;
    }

    public final Context zzc() {
        return this.zzc;
    }
}
