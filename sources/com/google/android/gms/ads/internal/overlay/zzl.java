package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzeds;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzghs;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.Collections;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class zzl extends zzbsv implements zzag {

    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;

    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;

    @VisibleForTesting
    zzcek zzd;

    @VisibleForTesting
    zzi zze;

    @VisibleForTesting
    zzt zzf;

    @VisibleForTesting
    FrameLayout zzh;

    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;

    @VisibleForTesting
    boolean zzg = false;

    @VisibleForTesting
    boolean zzj = false;

    @VisibleForTesting
    boolean zzk = false;

    @VisibleForTesting
    boolean zzm = false;

    @VisibleForTesting
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzd(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzJ(android.content.res.Configuration r7) {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r6.zzb
            com.google.android.gms.ads.internal.util.zzz r4 = com.google.android.gms.ads.internal.zzt.zzf()
            boolean r7 = r4.zzd(r3, r7)
            boolean r4 = r6.zzk
            if (r4 == 0) goto L37
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzaV
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r4.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L37
        L34:
            r7 = r2
        L35:
            r0 = r7
            goto L5b
        L37:
            if (r7 == 0) goto L4b
            com.google.android.gms.internal.ads.zzbbz r7 = com.google.android.gms.internal.ads.zzbci.zzaU
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r0.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L34
        L4b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r6.zzc
            if (r7 == 0) goto L59
            com.google.android.gms.ads.internal.zzl r7 = r7.zzo
            if (r7 == 0) goto L59
            boolean r7 = r7.zzg
            if (r7 == 0) goto L59
            r7 = r1
            goto L35
        L59:
            r7 = r1
            r0 = r2
        L5b:
            android.view.Window r3 = r3.getWindow()
            com.google.android.gms.internal.ads.zzbbz r4 = com.google.android.gms.internal.ads.zzbci.zzbs
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L87
            android.view.View r4 = r3.getDecorView()
            if (r7 == 0) goto L80
            if (r0 == 0) goto L7d
            r7 = 5894(0x1706, float:8.259E-42)
        L7b:
            r0 = r1
            goto L83
        L7d:
            r7 = 5380(0x1504, float:7.539E-42)
            goto L7b
        L80:
            r7 = 256(0x100, float:3.59E-43)
            r0 = r2
        L83:
            r4.setSystemUiVisibility(r7)
            goto La7
        L87:
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La0
            r3.addFlags(r5)
            r3.clearFlags(r4)
            if (r0 == 0) goto L9e
            android.view.View r7 = r3.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r7.setSystemUiVisibility(r0)
        L9e:
            r0 = r1
            goto La7
        La0:
            r3.addFlags(r4)
            r3.clearFlags(r5)
            r0 = r2
        La7:
            com.google.android.gms.internal.ads.zzbbz r7 = com.google.android.gms.internal.ads.zzbci.zzof
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r4.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lca
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r7 > r4) goto Lca
            if (r0 == 0) goto Lca
            android.view.WindowManager$LayoutParams r7 = r3.getAttributes()
            r7.layoutInDisplayCutoutMode = r1
            androidx.core.view.WindowCompat.b(r3, r2)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzJ(android.content.res.Configuration):void");
    }

    private final void zzK(View view) {
        zzedu zzeduVarZzU;
        zzeds zzedsVarZzV;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && (zzedsVarZzV = zzcekVar.zzV()) != null) {
            zzedsVarZzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && (zzeduVarZzU = zzcekVar.zzU()) != null && zzeduVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzeduVarZzU.zza(), view);
        }
    }

    private static final void zzL(@Nullable zzedu zzeduVar, @Nullable View view) {
        if (zzeduVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && zzeduVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzeduVar.zza(), view);
    }

    public final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzq zzqVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzH(this.zzn - 1);
            synchronized (this.zzo) {
                try {
                    if (!this.zzr && this.zzd.zzaa()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfx)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
                            zzqVar.zzdX();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzB();
                            }
                        };
                        this.zzq = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzd(zzbci.zzbl)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzB();
    }

    @VisibleForTesting
    public final void zzB() {
        zzcek zzcekVar;
        zzq zzqVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcek zzcekVar2 = this.zzd;
        if (zzcekVar2 != null) {
            this.zzl.removeView(zzcekVar2.zzE());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzai(zziVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbci.zznx)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzi zziVar2 = this.zze;
                viewGroup.addView(viewZzE, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdY(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcekVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcekVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    public final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzo) {
            try {
                this.zzr = true;
                Runnable runnable = this.zzq;
                if (runnable != null) {
                    zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfroVar.removeCallbacks(runnable);
                    zzfroVar.post(this.zzq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(zzeda zzedaVar) throws RemoteException, zzg {
        zzbsp zzbspVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbspVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbspVar.zzh(ObjectWrapper.wrap(zzedaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzecz zzeczVarZze = zzeda.zze();
            zzeczVarZze.zza(activity);
            zzeczVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzeczVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public void zzh(Bundle bundle) throws JSONException, zzg {
        zzq zzqVar;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                activity.setShowWhenLocked(true);
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzv = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzv) {
                    zzcwf zzcwfVar = this.zzc.zzt;
                    if (zzcwfVar != null) {
                        zzcwfVar.zza();
                    }
                    zzq zzqVar2 = this.zzc.zzc;
                    if (zzqVar2 != null) {
                        zzqVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzddz zzddzVar = this.zzc.zzu;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzqVar = adOverlayInfoParcel3.zzc) != null) {
                zzqVar.zzdt();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i = adOverlayInfoParcel5.zzk;
            if (i == 1) {
                zzy(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzi(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i == 3) {
                zzy(true);
            } else {
                if (i != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzg e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzq zzqVar;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            zzcek zzcekVar = this.zzd;
            if (zzcekVar == null || zzcekVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdC();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            return;
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null && !zzcekVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        zzq zzqVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdB();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i2, Intent intent) {
        zzdsm zzdsmVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbbz zzbbzVar = zzbci.zznV;
            if (((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzcek zzcekVar = this.zzd;
                if (zzcekVar == null || zzcekVar.zzP() == null || (zzdsmVarZzI = zzcekVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                    return;
                }
                zzdsl zzdslVarZza = zzdsmVarZzI.zza();
                zzdslVarZza.zzc(UrlHandler.ACTION, "hilca");
                zzdslVarZza.zzc("gqi", zzghs.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                zzdslVarZza.zzc("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdslVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdslVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdslVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdD();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdE();
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            try {
                this.zzl.removeView(zzcekVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z) throws JSONException {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbd.zzc().zzd(zzbci.zzfC)).intValue();
        boolean z2 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbo)).booleanValue() || z;
        zzs zzsVar = new zzs();
        zzsVar.zzd = 50;
        zzsVar.zza = true != z2 ? 0 : iIntValue;
        zzsVar.zzb = true != z2 ? iIntValue : 0;
        zzsVar.zzc = iIntValue;
        this.zzf = new zzt(this.zzb, zzsVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        this.zzs = true;
    }

    public final void zzt(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbm)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbn)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbsb(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzt zztVar = this.zzf;
        if (zztVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zztVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() throws JSONException {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbci.zzgu)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbci.zzgv)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzbd.zzc().zzd(zzbci.zzgw)).intValue()) {
                    if (i2 <= ((Integer) zzbd.zzc().zzd(zzbci.zzgx)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzy(boolean r44) throws org.json.JSONException, com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzy(boolean):void");
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
