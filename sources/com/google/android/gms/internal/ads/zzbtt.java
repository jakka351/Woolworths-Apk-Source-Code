package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.messages.iam.j;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbtt implements zzbtv {

    @Nullable
    @VisibleForTesting
    public static zzbtv zza;

    @Nullable
    @VisibleForTesting
    static zzbtv zzb;

    @Nullable
    @VisibleForTesting
    static zzbtv zzc;

    @Nullable
    @VisibleForTesting
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;

    @Nullable
    private final PackageInfo zzk;
    private final String zzl;

    @Nullable
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbtt(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfrn.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbbz r4 = com.google.android.gms.internal.ads.zzbci.zziy
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r0.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbbz r3 = com.google.android.gms.internal.ads.zzbci.zzim
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r4.zzd(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L82
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L83
        L82:
            r4 = r1
        L83:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb2
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9c
            goto Lb3
        L9c:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            if (r3 != 0) goto Lab
            goto Lb3
        Lab:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            goto Lb3
        Lb2:
            r0 = r1
        Lb3:
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzbbz r3 = com.google.android.gms.internal.ads.zzbci.zzii
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto Lce
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.zzp = r3
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtt.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbtv zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbtt(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbtu();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbtv zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z = false;
                    if (((Boolean) zzbea.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzig)).booleanValue() || ((Boolean) zzbea.zza.zze()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbtt zzbttVar = new zzbtt(context, versionInfoParcel);
                        zzbttVar.zzl();
                        zzbttVar.zzk();
                        zzc = zzbttVar;
                    } else if (!z || context == null) {
                        zzc = new zzbtu();
                    } else {
                        zzbtt zzbttVar2 = new zzbtt(context, versionInfoParcel, true);
                        zzbttVar2.zzl();
                        zzbttVar2.zzk();
                        zzc = zzbttVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbtv zzc(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbtt.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbtv r1 = com.google.android.gms.internal.ads.zzbtt.zzb     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzih     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzig     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.zzbtt r1 = new com.google.android.gms.internal.ads.zzbtt     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbtt.zzb = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.zzbtu r3 = new com.google.android.gms.internal.ads.zzbtu     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbtt.zzb = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbtv r3 = com.google.android.gms.internal.ads.zzbtt.zzb
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtt.zzc(android.content.Context):com.google.android.gms.internal.ads.zzbtv");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbtv zzd(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbtt.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbtv r1 = com.google.android.gms.internal.ads.zzbtt.zzb     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzih     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzig     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.zzbtt r1 = new com.google.android.gms.internal.ads.zzbtt     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbtt.zzb = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.zzbtu r3 = new com.google.android.gms.internal.ads.zzbtu     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbtt.zzb = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbtv r3 = com.google.android.gms.internal.ads.zzbtt.zzb
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtt.zzd(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):com.google.android.gms.internal.ads.zzbtv");
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzghs.zza(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzbb.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznz)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzig)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbtq(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbtr(this, thread.getUncaughtExceptionHandler()));
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= zzbtt.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzii)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbea.zzc.zze()).booleanValue()) {
                return;
            }
            zzbbt.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        String packageName;
        ActivityManager.MemoryInfo memoryInfoZze;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) zzber.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcD)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjC)).booleanValue() ? zzf(th) : "";
            double d = f;
            double dRandom = Math.random();
            int i = f > BitmapDescriptorFactory.HUE_RED ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = j.h;
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str2 = Build.MANUFACTURER;
                String strP = Build.MODEL;
                if (!strP.startsWith(str2)) {
                    strP = YU.a.p(new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.f(1, str2) + strP.length()), str2, " ", strP);
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strP);
                VersionInfoParcel versionInfoParcel = this.zzj;
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "798351165").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzber.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter4.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzin)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    builderAppendQueryParameter4.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter4.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter4.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzim)).booleanValue()) {
                    String str3 = this.zzl;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter4.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.zzm;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter4.appendQueryParameter("psv", str4);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        builderAppendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        builderAppendQueryParameter4.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        builderAppendQueryParameter4.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter4.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter4.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    final String str5 = (String) it.next();
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbts
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzuVar.zza(str5);
                        }
                    });
                }
            }
        }
    }

    public zzbtt(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
