package com.google.android.gms.maps.model;

import YU.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    public Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @NonNull
    public String toString() {
        return a.m(new StringBuilder("[Cap: type="), this.zzb, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Cap zza() {
        int i = this.zzb;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            Log.w(zza, "Unknown Cap type: " + i);
            return this;
        }
        BitmapDescriptor bitmapDescriptor = this.zzc;
        Preconditions.checkState(bitmapDescriptor != null, "bitmapDescriptor must not be null");
        Float f = this.zzd;
        Preconditions.checkState(f != null, "bitmapRefWidth must not be null");
        return new CustomCap(bitmapDescriptor, f.floatValue());
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 4) Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, @Nullable BitmapDescriptor bitmapDescriptor, @Nullable Float f) {
        boolean z = f != null && f.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (i == 3) {
            z = bitmapDescriptor != null && z;
            i = 3;
        }
        Preconditions.checkArgument(z, "Invalid Cap: type=" + i + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f);
        this.zzb = i;
        this.zzc = bitmapDescriptor;
        this.zzd = f;
    }

    public Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }
}
