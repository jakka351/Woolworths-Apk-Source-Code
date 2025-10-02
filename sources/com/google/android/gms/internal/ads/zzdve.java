package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdve extends zzfrr {

    @Nullable
    private final SensorManager zza;

    @Nullable
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzdvd zzi;
    private boolean zzj;

    public zzdve(Context context) {
        super("FlickDetector", "ads");
        this.zzc = BitmapDescriptorFactory.HUE_RED;
        this.zzd = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzdvd zzdvdVar) {
        this.zzi = zzdvdVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjR)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjR)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjT)).intValue() < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float fValueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.zzc;
            zzbbz zzbbzVar = zzbci.zzjS;
            if (fFloatValue > ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue() + f) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                this.zzc = BitmapDescriptorFactory.HUE_RED;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzdvd zzdvdVar = this.zzi;
                if (zzdvdVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjU)).intValue()) {
                        zzdvs zzdvsVar = (zzdvs) zzdvdVar;
                        zzdvsVar.zzo(new zzdvq(zzdvsVar), zzdvr.GESTURE);
                    }
                }
            }
        }
    }
}
