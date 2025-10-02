package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzcce implements zzbjl {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strL = androidx.constraintlayout.core.state.a.l(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            androidx.constraintlayout.core.state.a.B(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return i;
    }

    private static void zzc(zzcar zzcarVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcarVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strJ = YU.a.j("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strJ);
                return;
            }
        }
        if (str2 != null) {
            zzcarVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcarVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcarVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcarVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i;
        Integer numValueOf;
        int i2;
        zzcbd zzcbdVar = (zzcbd) obj;
        String str = (String) map.get(UrlHandler.ACTION);
        if (str == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzcbdVar.zzdr() != null ? zzcbdVar.zzdr().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Event intended for player " + numValueOf2 + ", but sent to player " + numZza + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbdVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbdVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbdVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbdVar.zze("onVideoEvent", map4);
            return;
        }
        zzcas zzcasVarZzdr = zzcbdVar.zzdr();
        if (zzcasVarZzdr == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcbdVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbbz zzbbzVar = zzbci.zzeo;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbdVar.zzy() : Math.min(iZzb3, zzcbdVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzcbdVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + au.com.woolworths.shop.checkout.ui.confirmation.c.e(String.valueOf(iZzb3).length() + 72, 4, String.valueOf(iZzy)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iZzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iZzy);
                    sb2.append(", x ");
                    sb2.append(iZzb);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                iMin = Math.min(iZzb3, zzcbdVar.zzy() - iZzb);
            }
            int i5 = iMin;
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbdVar.zzx() : Math.min(iZzb4, zzcbdVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzx = zzcbdVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb2).length() + au.com.woolworths.shop.checkout.ui.confirmation.c.e(String.valueOf(iZzb4).length() + 75, 4, String.valueOf(iZzx)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iZzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iZzx);
                    sb3.append(", y ");
                    sb3.append(iZzb2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin2 = Math.min(iZzb4, zzcbdVar.zzx() - iZzb2);
            }
            int i6 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcasVarZzdr.zzd() != null) {
                zzcasVarZzdr.zzb(iZzb, iZzb2, i5, i6);
                return;
            }
            zzcasVarZzdr.zzc(iZzb, iZzb2, i5, i6, i, z, new zzcbc((String) map.get("flags")));
            zzcar zzcarVarZzd = zzcasVarZzdr.zzd();
            if (zzcarVarZzd != null) {
                zzc(zzcarVarZzd, map);
                return;
            }
            return;
        }
        zzcfq zzcfqVarZzh = zzcbdVar.zzh();
        if (zzcfqVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfqVarZzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcfqVarZzh.zzr();
                return;
            }
        }
        zzcar zzcarVarZzd2 = zzcasVarZzdr.zzd();
        if (zzcarVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcbdVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcbdVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcarVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcarVarZzd2.zzt((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcarVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcarVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcarVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcarVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcarVarZzd2.zzu();
                return;
            } else {
                zzcarVarZzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcarVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzcarVarZzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzcarVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcbdVar.getContext();
                zzcarVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcbdVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzcarVarZzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzcarVarZzd2.zzw(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzco)).booleanValue() && TextUtils.isEmpty(str9)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i2 = 1;
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        } else {
            i2 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i2];
        strArr[0] = str9;
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    String string2 = jSONArray.getString(i7);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzco)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzco)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzcbdVar.zzo(numValueOf.intValue());
        }
        zzcarVarZzd2.zzo(str9, strArr);
    }
}
