package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzdnx;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgol;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzau extends zzbyd {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbdn zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcgv zzf;
    private Context zzg;
    private final zzauu zzh;
    private final zzfdg zzi;
    private final zzfeb zzj;
    private final zzgpd zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbto zzm;
    private final zzdsr zzp;
    private final zzfjv zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhH)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhG)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhJ)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhL)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhK);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhM);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhN);

    public zzau(zzcgv zzcgvVar, Context context, zzauu zzauuVar, zzfeb zzfebVar, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzdsr zzdsrVar, zzfjv zzfjvVar, VersionInfoParcel versionInfoParcel, zzbdn zzbdnVar, zzfdg zzfdgVar, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = zzcgvVar;
        this.zzg = context;
        this.zzh = zzauuVar;
        this.zzi = zzfdgVar;
        this.zzj = zzfebVar;
        this.zzk = zzgpdVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdsrVar;
        this.zzq = zzfjvVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdnVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhO)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhP));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhQ));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhR));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhS));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbtl zzbtlVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzie)).booleanValue()) {
            try {
                zzbtlVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        zzgpd zzgpdVar = this.zzk;
        ListenableFuture listenableFutureSubmit = zzgpdVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureSubmit = zzgot.zzj(listenableFutureSubmit, new zzgob() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzp((ArrayList) obj);
                }
            }, zzgpdVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzgot.zzq(listenableFutureSubmit, new zzae(this, zzbtlVar, z), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbtl zzbtlVar, boolean z) {
        ListenableFuture listenableFutureSubmit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzie)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbtlVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String strValueOf = String.valueOf(list);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzgpd zzgpdVar = this.zzk;
                listenableFutureSubmit = zzgpdVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureSubmit = zzgot.zzj(listenableFutureSubmit, new zzgob() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzr((Uri) obj);
                        }
                    }, zzgpdVar);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                listenableFutureSubmit = zzgot.zza(uri);
            }
            arrayList.add(listenableFutureSubmit);
        }
        zzgot.zzq(zzgot.zzl(arrayList), new zzaf(this, zzbtlVar, z), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkr)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzku)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzky)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzau zzauVar;
        ListenableFuture listenableFutureZza;
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlS)).booleanValue()) {
            listenableFutureZza = zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // com.google.android.gms.internal.ads.zzgoa
                public final /* synthetic */ ListenableFuture zza() {
                    return this.zza.zzs();
                }
            }, zzbzh.zza);
            zzauVar = this;
        } else {
            zzauVar = this;
            listenableFutureZza = zzauVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
        }
        zzgot.zzq(listenableFutureZza, new zzag(this), zzauVar.zzf.zzb());
    }

    private static boolean zzV(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzW(android.content.Context r6, java.lang.String r7, java.lang.String r8, com.google.android.gms.ads.internal.client.zzr r9, com.google.android.gms.ads.internal.client.zzm r10, int r11, @androidx.annotation.Nullable java.lang.String r12, android.os.Bundle r13, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzbyi r14) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzfdb r0 = new com.google.android.gms.internal.ads.zzfdb
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r8)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            if (r2 == 0) goto L18
            com.google.android.gms.internal.ads.zzfcp r2 = r0.zzj()
            r4 = 2
            r2.zza(r4)
            goto L26
        L18:
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.zzfcp r2 = r0.zzj()
            r4 = 3
            r2.zza(r4)
        L26:
            com.google.android.gms.internal.ads.zzcgv r2 = r5.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzab r2 = r2.zzp()
            com.google.android.gms.internal.ads.zzcva r4 = new com.google.android.gms.internal.ads.zzcva
            r4.<init>()
            r4.zza(r6)
            if (r7 != 0) goto L38
            java.lang.String r7 = "adUnitId"
        L38:
            r0.zzg(r7)
            if (r10 != 0) goto L46
            com.google.android.gms.ads.internal.client.zzn r7 = new com.google.android.gms.ads.internal.client.zzn
            r7.<init>()
            com.google.android.gms.ads.internal.client.zzm r10 = r7.zza()
        L46:
            r0.zza(r10)
            if (r9 != 0) goto L94
            int r7 = r8.hashCode()
            switch(r7) {
                case -1999289321: goto L82;
                case -428325382: goto L75;
                case 543046670: goto L6a;
                case 1854800829: goto L63;
                case 1951953708: goto L53;
                default: goto L52;
            }
        L52:
            goto L8f
        L53:
            java.lang.String r7 = "BANNER"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = new com.google.android.gms.ads.internal.client.zzr
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.BANNER
            r9.<init>(r6, r7)
            goto L94
        L63:
            boolean r6 = r8.equals(r3)
            if (r6 == 0) goto L8f
            goto L70
        L6a:
            boolean r6 = r8.equals(r1)
            if (r6 == 0) goto L8f
        L70:
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzc()
            goto L94
        L75:
            java.lang.String r6 = "APP_OPEN_AD"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzd()
            goto L94
        L82:
            java.lang.String r6 = "NATIVE"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzb()
            goto L94
        L8f:
            com.google.android.gms.ads.internal.client.zzr r9 = new com.google.android.gms.ads.internal.client.zzr
            r9.<init>()
        L94:
            r0.zzc(r9)
            r6 = 1
            r0.zzu(r6)
            r0.zzv(r13)
            com.google.android.gms.internal.ads.zzfdc r6 = r0.zzz()
            r4.zzb(r6)
            r4.zzh(r11)
            com.google.android.gms.internal.ads.zzcvb r6 = r4.zze()
            r2.zzc(r6)
            com.google.android.gms.ads.nonagon.signalgeneration.zzax r6 = new com.google.android.gms.ads.nonagon.signalgeneration.zzax
            r6.<init>()
            r6.zza(r8)
            r6.zzb(r12)
            r6.zzc(r14)
            com.google.android.gms.ads.nonagon.signalgeneration.zzay r7 = new com.google.android.gms.ads.nonagon.signalgeneration.zzay
            r8 = 0
            r7.<init>(r6, r8)
            r2.zzb(r7)
            com.google.android.gms.internal.ads.zzdbr r6 = new com.google.android.gms.internal.ads.zzdbr
            r6.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r6 = r2.zza()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzW(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzbyi):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final ListenableFuture zzX(final String str) {
        final zzdnx[] zzdnxVarArr = new zzdnx[1];
        ListenableFuture listenableFutureZzb = this.zzj.zzb();
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzu(zzdnxVarArr, str, (zzdnx) obj);
            }
        };
        zzgpd zzgpdVar = this.zzk;
        ListenableFuture listenableFutureZzj = zzgot.zzj(listenableFutureZzb, zzgobVar, zzgpdVar);
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzv(zzdnxVarArr);
            }
        }, zzgpdVar);
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzi(zzgol.zzw(listenableFutureZzj), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzif)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzaq.zza, zzgpdVar), Exception.class, zzar.zza, zzgpdVar);
    }

    private final boolean zzY() {
        Map map;
        zzbto zzbtoVar = this.zzm;
        return (zzbtoVar == null || (map = zzbtoVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        a.B(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzghs.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzfib zzy(ListenableFuture listenableFuture, zzbyi zzbyiVar) {
        if (!zzfie.zza() || !((Boolean) zzbeb.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfib zzfibVarZzb = ((zzac) zzgot.zzr(listenableFuture)).zzb();
            zzfibVarZzb.zzb(new ArrayList(Collections.singletonList(zzbyiVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyiVar.zzd;
            zzfibVarZzb.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzfibVarZzb.zzd(zzmVar.zzm);
            return zzfibVarZzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ zzdsr zzA() {
        return this.zzp;
    }

    public final /* synthetic */ zzfjv zzB() {
        return this.zzq;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    public final /* synthetic */ String zzG() {
        return this.zzv;
    }

    public final /* synthetic */ String zzH() {
        return this.zzw;
    }

    public final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    public final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    public final /* synthetic */ String zzK() {
        return this.zzz;
    }

    public final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    public final /* synthetic */ String zzM() {
        return this.zzA;
    }

    public final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    public final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    @VisibleForTesting
    public final boolean zzc(@NonNull Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    @VisibleForTesting
    public final boolean zzd(@NonNull Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzbye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r11, final com.google.android.gms.internal.ads.zzbyi r12, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzbyb r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zze(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbyi, com.google.android.gms.internal.ads.zzbyb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzie)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbto zzbtoVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbtoVar == null ? null : zzbtoVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) {
        zzR(list, iObjectWrapper, zzbtlVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) {
        zzS(list, iObjectWrapper, zzbtlVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzi(zzbto zzbtoVar) {
        this.zzm = zzbtoVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    @SuppressLint
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkq)).booleanValue()) {
            zzbbz zzbbzVar = zzbci.zzhV;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzbzh.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkA)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                zzfVar.zza(webView);
                if (((Boolean) zzben.zzd.zze()).booleanValue()) {
                    zzbzh.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzjVar.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkB)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) {
        zzR(list, iObjectWrapper, zzbtlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) {
        zzS(list, iObjectWrapper, zzbtlVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkE)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbdn zzbdnVar = this.zzI;
        zzbdnVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbdnVar.zzb());
    }

    public final /* synthetic */ zzac zzn(zzbyi zzbyiVar, int i, Bundle bundle) {
        return zzW(this.zzg, zzbyiVar.zza, zzbyiVar.zzb, zzbyiVar.zzc, zzbyiVar.zzd, i, zzbyiVar.zzf, bundle, zzbyiVar);
    }

    public final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzauu zzauuVar = this.zzh;
        String strZzj = zzauuVar.zzb() != null ? zzauuVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ ListenableFuture zzp(final ArrayList arrayList) {
        return zzgot.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzggr() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfdg zzfdgVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || (zzfdgVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfdgVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzauv e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ ListenableFuture zzr(final Uri uri) {
        return zzgot.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzggr(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ ListenableFuture zzs() {
        return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    public final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ListenableFuture zzu(zzdnx[] zzdnxVarArr, String str, zzdnx zzdnxVar) throws JSONException {
        zzdnxVarArr[0] = zzdnxVar;
        Context context = this.zzg;
        zzbto zzbtoVar = this.zzm;
        Map map = zzbtoVar.zzb;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbtoVar.zza, null);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnxVar.zzc(str, jSONObject);
    }

    public final /* synthetic */ void zzv(zzdnx[] zzdnxVarArr) {
        zzdnx zzdnxVar = zzdnxVarArr[0];
        if (zzdnxVar != null) {
            this.zzj.zzc(zzgot.zza(zzdnxVar));
        }
    }

    public final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    public final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}
