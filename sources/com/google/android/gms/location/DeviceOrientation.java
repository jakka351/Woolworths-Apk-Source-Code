package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.b;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "DeviceOrientationCreator")
@SafeParcelable.Reserved({2, 3})
/* loaded from: classes5.dex */
public class DeviceOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getAttitude", id = 1)
    private final float[] zza;

    @SafeParcelable.Field(getter = "getHeadingDegrees", id = 4)
    private final float zzb;

    @SafeParcelable.Field(getter = "getHeadingErrorDegrees", id = 5)
    private final float zzc;

    @SafeParcelable.Field(getter = "getElapsedRealtimeNs", id = 6)
    private final long zzd;

    @SafeParcelable.Field(getter = "getFieldMask", id = 7)
    private final byte zze;

    @SafeParcelable.Field(getter = "getConservativeHeadingErrorVonMisesKappa", id = 8)
    private final float zzf;

    @SafeParcelable.Field(getter = "getConservativeHeadingErrorDegrees", id = 9)
    private final float zzg;

    @SafeParcelable.Constructor
    public DeviceOrientation(@SafeParcelable.Param(id = 1) float[] fArr, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) float f2, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) byte b, @SafeParcelable.Param(id = 8) float f3, @SafeParcelable.Param(id = 9) float f4) {
        zzj(fArr);
        zzer.zza(f >= BitmapDescriptorFactory.HUE_RED && f < 360.0f);
        zzer.zza(f2 >= BitmapDescriptorFactory.HUE_RED && f2 <= 180.0f);
        zzer.zza(f4 >= BitmapDescriptorFactory.HUE_RED && f4 <= 180.0f);
        zzer.zza(j >= 0);
        this.zza = fArr;
        this.zzb = f;
        this.zzc = f2;
        this.zzf = f3;
        this.zzg = f4;
        this.zzd = j;
        this.zze = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        zzer.zzb((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    @Pure
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.zzb, deviceOrientation.zzb) == 0 && Float.compare(this.zzc, deviceOrientation.zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || Float.compare(this.zzf, deviceOrientation.zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.zzd == deviceOrientation.zzd && Arrays.equals(this.zza, deviceOrientation.zza);
    }

    @NonNull
    @Pure
    public float[] getAttitude() {
        return (float[]) this.zza.clone();
    }

    @Pure
    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }

    @Pure
    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    @Pure
    public float getHeadingDegrees() {
        return this.zzb;
    }

    @Pure
    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    @Pure
    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.zze & 64) != 0;
    }

    @Pure
    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzb), Float.valueOf(this.zzc), Float.valueOf(this.zzg), Long.valueOf(this.zzd), this.zza, Byte.valueOf(this.zze));
    }

    @NonNull
    @Pure
    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.zza));
        sb.append(", headingDegrees=");
        sb.append(this.zzb);
        sb.append(", headingErrorDegrees=");
        sb.append(this.zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.zzg);
        }
        sb.append(", elapsedRealtimeNs=");
        return b.q(sb, this.zzd, ']');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, getAttitude(), false);
        SafeParcelWriter.writeFloat(parcel, 4, getHeadingDegrees());
        SafeParcelWriter.writeFloat(parcel, 5, getHeadingErrorDegrees());
        SafeParcelWriter.writeLong(parcel, 6, getElapsedRealtimeNs());
        SafeParcelWriter.writeByte(parcel, 7, this.zze);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 9, getConservativeHeadingErrorDegrees());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Pure
    public final boolean zza() {
        return (this.zze & 32) != 0;
    }

    public final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    public final /* synthetic */ float zzd() {
        return this.zzb;
    }

    public final /* synthetic */ float zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ byte zzg() {
        return this.zze;
    }

    public final /* synthetic */ float zzh() {
        return this.zzf;
    }

    public final /* synthetic */ float zzi() {
        return this.zzg;
    }

    public static final class Builder {
        private final float[] zza;
        private float zzb;
        private float zzc;
        private long zzd;
        private byte zze;
        private float zzf;
        private float zzg;

        public Builder(@NonNull DeviceOrientation deviceOrientation) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(deviceOrientation.zzc());
            this.zza = Arrays.copyOf(deviceOrientation.zzc(), deviceOrientation.zzc().length);
            setHeadingDegrees(deviceOrientation.zzd());
            setHeadingErrorDegrees(deviceOrientation.zze());
            setConservativeHeadingErrorDegrees(deviceOrientation.zzi());
            setElapsedRealtimeNs(deviceOrientation.zzf());
            this.zzf = deviceOrientation.zzh();
            this.zze = deviceOrientation.zzg();
        }

        @NonNull
        public DeviceOrientation build() {
            return new DeviceOrientation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        @NonNull
        public Builder clearConservativeHeadingErrorDegrees() {
            this.zzg = 180.0f;
            int i = this.zze & (-65);
            this.zzf = BitmapDescriptorFactory.HUE_RED;
            this.zze = (byte) (((byte) i) & (-33));
            return this;
        }

        @NonNull
        public Builder setAttitude(@NonNull float[] fArr) {
            DeviceOrientation.zzj(fArr);
            System.arraycopy(fArr, 0, this.zza, 0, fArr.length);
            return this;
        }

        @NonNull
        public Builder setConservativeHeadingErrorDegrees(float f) {
            float fCos = BitmapDescriptorFactory.HUE_RED;
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 180.0f) {
                z = true;
            }
            zzer.zzb(z, "conservativeHeadingErrorDegrees should be between 0 and 180.");
            this.zzg = f;
            this.zze = (byte) (this.zze | 64);
            Parcelable.Creator<DeviceOrientation> creator = DeviceOrientation.CREATOR;
            if (f < 180.0f) {
                fCos = (float) (2.0d / (1.0d - Math.cos(Math.toRadians(f))));
            }
            this.zzf = fCos;
            this.zze = (byte) (this.zze | 32);
            return this;
        }

        @NonNull
        public Builder setElapsedRealtimeNs(long j) {
            zzer.zzb(j >= 0, "elapsedRealtimeNs should be greater than or equal to 0.");
            this.zzd = j;
            return this;
        }

        @NonNull
        public Builder setHeadingDegrees(float f) {
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f < 360.0f) {
                z = true;
            }
            zzer.zzb(z, "headingDegrees should be greater than or equal to 0 and less than 360.");
            this.zzb = f;
            return this;
        }

        @NonNull
        public Builder setHeadingErrorDegrees(float f) {
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 180.0f) {
                z = true;
            }
            zzer.zzb(z, "headingErrorDegrees should be between 0 and 180.");
            this.zzc = f;
            return this;
        }

        public Builder(@NonNull float[] fArr, float f, float f2, long j) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(fArr);
            this.zza = Arrays.copyOf(fArr, fArr.length);
            setHeadingDegrees(f);
            setHeadingErrorDegrees(f2);
            setElapsedRealtimeNs(j);
            this.zzf = BitmapDescriptorFactory.HUE_RED;
            this.zzg = 180.0f;
            this.zze = (byte) 0;
        }
    }
}
