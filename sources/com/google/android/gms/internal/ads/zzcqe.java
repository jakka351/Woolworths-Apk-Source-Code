package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzcqe extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqe(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqe zza(Context context, View view, zzfcj zzfcjVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqe zzcqeVar = new zzcqe(context);
        List list = zzfcjVar.zzu;
        if (!list.isEmpty() && (resources = zzcqeVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((zzfck) list.get(0)).zza;
            float f2 = displayMetrics.density;
            zzcqeVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r4.zzb * f2)));
        }
        zzcqeVar.zzb = view;
        zzcqeVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zzb(zzcqeVar, zzcqeVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzbzu.zza(zzcqeVar, zzcqeVar);
        JSONObject jSONObject = zzfcjVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqeVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqeVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqeVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqeVar.addView(relativeLayout);
        return zzcqeVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(TextBundle.TEXT_ENTRY, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
