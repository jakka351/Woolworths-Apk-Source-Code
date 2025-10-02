package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzcgl;
import com.google.android.gms.internal.ads.zzdpl;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfcm;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzggo;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzhqn;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.salesforce.marketingcloud.UrlHandler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzs {
    public static final zzfro zza = new zzf(Looper.getMainLooper());

    @GuardedBy
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzA(View view) {
        float f;
        float fMin = Float.MAX_VALUE;
        do {
            boolean z = view instanceof View;
            f = BitmapDescriptorFactory.HUE_RED;
            if (!z) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > BitmapDescriptorFactory.HUE_RED);
        if (fMin >= BitmapDescriptorFactory.HUE_RED) {
            f = fMin;
        }
        return Math.round(f * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final WebResourceResponse zzB(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzC() {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        return resourcesZzf != null ? resourcesZzf.getString(R.string.s7) : "Test Ad";
    }

    @Nullable
    public static final zzbo zzD(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinder);
            }
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzE(Context context, String str) {
        Context contextZza = zzbvf.zza(context);
        return Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzF(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzG(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfF)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfH);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfG);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzH(Context context) {
        KeyguardManager keyguardManagerZzad;
        return (context == null || (keyguardManagerZzad = zzad(context)) == null || !keyguardManagerZzad.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzI(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzJ() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzK(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzL(Context context) {
        try {
            Bundle bundleZzag = zzag(context);
            String string = bundleZzag.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzaf(bundleZzag))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzM(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzN(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strZza;
        zzfcj zzfcjVarZzC;
        zzfcm zzfcmVarZzaC;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpl) {
                childAt = ((zzdpl) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzh) || (childAt instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long jZzA = zzA(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            boolean z = childAt instanceof zzcfr;
            String str4 = DevicePublicKeyStringDef.NONE;
            if (!z || (zzfcmVarZzaC = ((zzcfr) childAt).zzaC()) == null) {
                str2 = str;
                str3 = DevicePublicKeyStringDef.NONE;
            } else {
                str3 = zzfcmVarZzaC.zzb;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if (!(childAt instanceof zzceb) || (zzfcjVarZzC = ((zzceb) childAt).zzC()) == null) {
                strZza = str2;
            } else {
                strZza = zzfcj.zza(zzfcjVarZzC.zzb);
                i2 = zzfcjVarZzC.zze;
                str4 = zzfcjVarZzC.zzE;
            }
            Locale locale = Locale.US;
            String str5 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strZza + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzA + ", state=" + Integer.toString(i, 2) + ">";
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str5);
        } catch (Exception e) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzO(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzP(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzQ(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzber.zzb.zze()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void zzR(Context context, zzfcj zzfcjVar, zzdsm zzdsmVar) {
        zzdsl zzdslVarZza = zzdsmVar.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdslVarZza.zzc("foreground", true != zzK(context) ? "1" : "0");
        zzdslVarZza.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
        if (zzfcjVar != null) {
            List list = zzfcjVar.zzt;
            if (!list.isEmpty()) {
                zzdslVarZza.zzc("ancn", (String) list.get(0));
            }
            zzdslVarZza.zzc("ad_format", zzfcj.zza(zzfcjVar.zzb));
        }
        zzdslVarZza.zzd();
    }

    public static final boolean zzS(@Nullable zzfcj zzfcjVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoi)).booleanValue() && zzfcjVar != null && zzfcjVar.zze == 4;
    }

    public static final int zzT(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strConcat = "Could not parse value:".concat(e.toString());
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return 0;
        }
    }

    @Nullable
    public static final Map zzU(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzr)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzV(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzW(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzy = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzy[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzy[1])};
    }

    public static final boolean zzX(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzc().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzq(view);
        long jZzA = zzA(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbz)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzls)).booleanValue()) {
            if (jZzA < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlu)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void zzY(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlP)).booleanValue()) {
            zzai(context, intent);
            return;
        }
        try {
            zzai(context, intent);
        } catch (SecurityException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzZ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzs(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            String string2 = sb.toString();
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
        } catch (ActivityNotFoundException e) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String strK = a.k(new StringBuilder(String.valueOf(i).length() + 86), "HTTP timeout too low: ", i, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strK);
        return 60000;
    }

    public static final int[] zzaa(Activity activity) {
        int[] iArrZzV = zzV(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzV[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzV[1])};
    }

    public static final boolean zzab(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzX(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzad(context));
    }

    public static final void zzac(Context context, Intent intent, @Nullable zzdsm zzdsmVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznU)).booleanValue() || !(context instanceof zzcgl)) {
            zzY(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznW))) {
                    ((zzcgl) context).zza(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznV)).booleanValue() || zzdsmVar == null) {
                        return;
                    }
                    zzdsl zzdslVarZza = zzdsmVar.zza();
                    zzdslVarZza.zzc(UrlHandler.ACTION, "hila");
                    zzdslVarZza.zzc("gqi", zzghs.zza(str));
                    zzdslVarZza.zzf();
                    return;
                }
            }
            zzY(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (Exception e3) {
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "AdUtil.startActivityForResult");
            zzY(context, intent);
        }
    }

    @Nullable
    private static KeyguardManager zzad(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzae(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzaf(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    @Nullable
    private static Bundle zzag(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static final void zzah(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzai(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzaj(final Context context, String str) {
        String strZzu;
        String str2;
        if (str == null) {
            return zzu();
        }
        try {
            zzce zzceVarZza = zzce.zza();
            if (TextUtils.isEmpty(zzceVarZza.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            zze.zza("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                zze.zza("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                zzceVarZza.zza = str2;
            }
            strZzu = zzceVarZza.zza;
        } catch (Exception unused) {
            strZzu = null;
        }
        if (TextUtils.isEmpty(strZzu)) {
            strZzu = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strZzu)) {
            strZzu = zzu();
        }
        String strP = YU.a.p(new StringBuilder(c.f(10, strZzu) + str.length()), strZzu, " (Mobile; ", str);
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                StringBuilder sb = new StringBuilder(strP.length() + 4);
                sb.append(strP);
                sb.append(";aia");
                strP = sb.toString();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getUserAgent");
        }
        return strP.concat(")");
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzh.zza.execute(runnable);
        }
    }

    public static List zzk() {
        zzbbz zzbbzVar = zzbci.zza;
        List listZzf = com.google.android.gms.ads.internal.client.zzbd.zzb().zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzghq.zza(zzggo.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static String zzl(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public static zzq zzm(Context context) {
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager localeManagerA = au.com.woolworths.shop.product.details.a.a(context.getSystemService(au.com.woolworths.shop.product.details.a.e()));
        if (localeManagerA == null || localeManagerA.getSystemLocales().isEmpty()) {
            return zzqVar;
        }
        Locale locale2 = localeManagerA.getSystemLocales().get(0);
        return new zzq(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzq(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzq(android.view.View):boolean");
    }

    public static final boolean zzr(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfro zzfroVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzba)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzs(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzt(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaf(zzag(context));
    }

    public static final String zzu() {
        StringBuilder sbO = a.o(256, "Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sbO.append(" ");
            sbO.append(str);
        }
        sbO.append("; ");
        sbO.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sbO.append("; ");
            sbO.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sbO.append(" Build/");
                sbO.append(str3);
            }
        }
        sbO.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sbO.toString();
    }

    public static final String zzv() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : YU.a.p(new StringBuilder(c.f(1, str) + str2.length()), str, " ", str2);
    }

    @Nullable
    public static final Integer zzw(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzx(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzy() {
        return new int[]{0, 0};
    }

    public static final Map zzz(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    public final void zzb(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        String strK = a.k(new StringBuilder(String.valueOf(iZza).length() + 28), "HTTP timeout: ", iZza, " milliseconds.");
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strK);
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint
    public final boolean zzc(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbci.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    @SuppressLint
    public final boolean zzd(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbci.zza(context);
        byte[] bArr = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmb)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzaj(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String strZzaj = zzaj(context, str);
                this.zzh = strZzaj;
                return strZzaj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture zzf(final Uri uri) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfro zzfroVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzU(uri);
            }
        }, this.zzl);
    }

    public final void zzg(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString("device", zzv());
        zzbbz zzbbzVar = zzbci.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zzb().zze()));
        if (bundle.isEmpty()) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlq);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.zzn(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzB(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfro zzfroVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzP(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzi(String str) {
        return zzae(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzav));
    }

    public final boolean zzj(String str) {
        return zzae(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaw));
    }

    public final /* synthetic */ void zzn(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzac.zzb(context, str));
    }

    public final /* synthetic */ void zzo(boolean z) {
        this.zzf = z;
    }

    public final int zzp(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzah(context, uri);
            return 2;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfd)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfb)).booleanValue()) {
                zzah(context, uri);
                return 9;
            }
            zzbdj zzbdjVar = new zzbdj();
            zzbdjVar.zzd(new zzk(this, zzbdjVar, context, uri));
            zzbdjVar.zze((Activity) context);
            return 5;
        }
        CustomTabsIntent customTabsIntentA = new CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzt.zzn().zzb()).a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfp)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzw()) {
                return 5;
            }
        }
        customTabsIntentA.f208a.setPackage(zzhqn.zza(context));
        customTabsIntentA.b(context, uri);
        return 5;
    }
}
