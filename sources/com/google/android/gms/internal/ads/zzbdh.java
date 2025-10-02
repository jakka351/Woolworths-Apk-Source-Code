package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzbdh extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzdsm zzd;

    @Nullable
    private CustomTabsSession zze;

    @Nullable
    private CustomTabsClient zzf;

    private final void zzf(@Nullable Context context) {
        String strB;
        if (this.zzf != null || context == null || (strB = CustomTabsClient.b(context)) == null || strB.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.a(context, strB, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.d();
        this.zze = customTabsClient.c(new zzbde(this), null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdsm zzdsmVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdsmVar;
        zzf(context);
    }

    @Nullable
    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    @VisibleForTesting
    public final void zzc(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfc)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i) {
        zzdsm zzdsmVar = this.zzd;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzc(UrlHandler.ACTION, "cct_nav");
            zzdslVarZza.zzc("cct_navs", String.valueOf(i));
            zzdslVarZza.zzd();
        }
    }
}
