package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
final class zzcba extends zzfrr {
    private final SensorManager zza;
    private final Object zzb;
    private final Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private Handler zzg;
    private zzcaz zzh;

    public zzcba(Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new Object();
    }

    public final void zza() {
        if (this.zzg != null) {
            return;
        }
        SensorManager sensorManager = this.zza;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzfro zzfroVar = new zzfro(handlerThread.getLooper());
        this.zzg = zzfroVar;
        if (sensorManager.registerListener(this, defaultSensor, 0, zzfroVar)) {
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("SensorManager.registerListener failed.");
        zzb();
    }

    public final void zzb() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzcay(this));
        this.zzg = null;
    }

    public final void zzc(zzcaz zzcazVar) {
        this.zzh = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == BitmapDescriptorFactory.HUE_RED && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzf == null) {
                    this.zzf = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.zzd;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.zze);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.zze);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.zze, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.zze);
        }
        float[] fArr3 = this.zze;
        float f = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f;
        float f2 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f2;
        float f3 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f3;
        synchronized (this.zzb) {
            System.arraycopy(fArr3, 0, this.zzf, 0, 9);
        }
        zzcaz zzcazVar = this.zzh;
        if (zzcazVar != null) {
            zzcazVar.zza();
        }
    }

    public final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            try {
                float[] fArr2 = this.zzf;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
