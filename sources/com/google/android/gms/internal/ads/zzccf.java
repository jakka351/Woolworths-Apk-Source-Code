package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzccf implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcbd zzcbdVar = (zzcbd) obj;
        zzcfq zzcfqVarZzh = zzcbdVar.zzh();
        if (zzcfqVarZzh == null) {
            try {
                zzcfq zzcfqVar = new zzcfq(zzcbdVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbdVar.zzw(zzcfqVar);
                zzcfqVarZzh = zzcfqVar;
            } catch (NullPointerException e) {
                e = e;
                Throwable th = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                Throwable th2 = e;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i3 = Integer.parseInt((String) map.get("playbackState"));
        if (i3 < 0 || i3 > 3) {
            i3 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? BitmapDescriptorFactory.HUE_RED : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 45 + String.valueOf(f).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i3).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f2);
            sb.append(" , duration : ");
            sb.append(f);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        zzcfqVarZzh.zzs(f2, f, i3, zEquals, f3);
    }
}
