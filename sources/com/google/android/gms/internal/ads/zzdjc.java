package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface zzdjc {
    void zzA();

    void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void zzb(View view, Map map);

    void zzc(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType);

    void zzd(String str);

    void zze(Bundle bundle);

    void zzf(@Nullable View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i);

    void zzg();

    boolean zzh();

    void zzj(@Nullable View view, MotionEvent motionEvent, View view2);

    void zzk(Bundle bundle);

    JSONObject zzl(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    JSONObject zzm(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzn();

    void zzo(View view);

    void zzp(zzbhn zzbhnVar);

    void zzq();

    void zzr(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar);

    void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar);

    void zzt();

    int zzu();

    boolean zzv();

    void zzw(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzx(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzy();

    boolean zzz(Bundle bundle);
}
