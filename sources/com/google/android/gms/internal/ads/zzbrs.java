package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Map;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.bouncycastle.i18n.ErrorBundle;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzbrs extends zzbsb {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrs(zzcek zzcekVar, Map map) {
        super(zzcekVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
        this.zzc = zzd(lqlqqlq.mmm006Dm006Dm);
        this.zzf = zzd(ErrorBundle.SUMMARY_ENTRY);
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbbp(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        builderZzO.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.s5) : "Create calendar event");
        builderZzO.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzO.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.s3) : RequestBuilder.ACCEPT, new zzbrq(this));
        builderZzO.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.s4) : "Decline", new zzbrr(this));
        builderZzO.create().show();
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra(lqlqqlq.mmm006Dm006Dm, this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final /* synthetic */ Context zzc() {
        return this.zzb;
    }
}
