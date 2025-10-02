package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjk {
    public static final zzbjl zza = zzbjj.zza;
    public static final zzbjl zzb = zzbja.zza;
    public static final zzbjl zzc = zzbjb.zza;
    public static final zzbjl zzd = new zzbis();
    public static final zzbjl zze = new zzbit();
    public static final zzbjl zzf = zzbjg.zza;
    public static final zzbjl zzg = new zzbiu();
    public static final zzbjl zzh = new zzbiv();
    public static final zzbjl zzi = zzbjh.zza;
    public static final zzbjl zzj = new zzbiw();
    public static final zzbjl zzk = new zzbix();
    public static final zzbjl zzl = new zzcce();
    public static final zzbjl zzm = new zzccf();
    public static final zzbjl zzn = new zzbie();
    public static final zzbkc zzo = new zzbkc();
    public static final zzbjl zzp = new zzbiy();
    public static final zzbjl zzq = new zzbiz();
    public static final zzbjl zzr = new zzbif();
    public static final zzbjl zzs = new zzbig();
    public static final zzbjl zzt = new zzbih();
    public static final zzbjl zzu = new zzbii();
    public static final zzbjl zzv = new zzbij();
    public static final zzbjl zzw = new zzbik();
    public static final zzbjl zzx = new zzbil();
    public static final zzbjl zzy = new zzbim();
    public static final zzbjl zzz = new zzbin();
    public static final zzbjl zzA = new zzbio();
    public static final zzbjl zzB = new zzbiq();
    public static final zzbjl zzC = new zzbir();

    public static ListenableFuture zza(zzcek zzcekVar, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Uri uriZzd = Uri.parse(str);
        try {
            zzauu zzauuVarZzS = zzcekVar.zzS();
            zzfdg zzfdgVarZzT = zzcekVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzfdgVarZzT == null) {
                if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                    uriZzd = zzauuVarZzS.zzd(uriZzd, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
                }
            } else if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                uriZzd = zzfdgVarZzT.zza(uriZzd, zzcekVar.getContext(), zzcekVar.zzE(), zzcekVar.zzj());
            }
        } catch (zzauv unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcekVar.zzC() != null) {
            map = zzcekVar.zzC().zzaw;
        }
        final String strZzb = zzbxt.zzb(uriZzd, zzcekVar.getContext(), map);
        long jLongValue = ((Long) zzbeh.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 253410000) {
            return zzgot.zza(strZzb);
        }
        zzgol zzgolVarZzw = zzgol.zzw(zzcekVar.zzaF());
        zzbjc zzbjcVar = zzbjc.zza;
        zzgpd zzgpdVar = zzbzh.zzg;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzgolVarZzw, Throwable.class, zzbjcVar, zzgpdVar), new zzggr() { // from class: com.google.android.gms.internal.ads.zzbjd
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzggr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbjl r0 = com.google.android.gms.internal.ads.zzbjk.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbds r1 = com.google.android.gms.internal.ads.zzbeh.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbds r1 = com.google.android.gms.internal.ads.zzbeh.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbds r2 = com.google.android.gms.internal.ads.zzbeh.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjd.apply(java.lang.Object):java.lang.Object");
            }
        }, zzgpdVar), Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzbje
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjl zzbjlVar = zzbjk.zza;
                if (((Boolean) zzbeh.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgpdVar);
    }

    public static zzbjl zzb(final zzddz zzddzVar, final zzcmi zzcmiVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzbjf
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddzVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcmi zzcmiVar2 = zzcmiVar;
                zzgol zzgolVarZzw = zzgol.zzw(zzbjk.zza(zzcekVar, str));
                zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbji
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcmi zzcmiVar3;
                        String str2 = (String) obj2;
                        zzbjl zzbjlVar = zzbjk.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar3 = zzcmiVar2) != null && zzcmi.zzc(str)) ? zzcmiVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgot.zza(str2);
                    }
                };
                zzgpd zzgpdVar = zzbzh.zza;
                zzgot.zzq((zzgol) zzgot.zzj(zzgolVarZzw, zzgobVar, zzgpdVar), new zzbip(zzcekVar), zzgpdVar);
            }
        };
    }

    public static void zzc(Map map, zzddz zzddzVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlA)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcfw r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjk.zze(com.google.android.gms.internal.ads.zzcfw, java.util.Map):void");
    }
}
