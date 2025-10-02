package com.google.android.gms.maps.model;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PatternItem extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzq();
    private static final String zza = "PatternItem";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i, @Nullable @SafeParcelable.Param(id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < BitmapDescriptorFactory.HUE_RED)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.zzb = i;
        this.zzc = f;
    }

    @Nullable
    public static List zza(@Nullable List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem dot = (PatternItem) it.next();
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.zzb;
                if (i == 0) {
                    Float f = dot.zzc;
                    Preconditions.checkState(f != null, "length must not be null.");
                    dash = new Dash(f.floatValue());
                } else if (i == 1) {
                    dot = new Dot();
                } else if (i != 2) {
                    Log.w(zza, "Unknown PatternItem type: " + i);
                } else {
                    Float f2 = dot.zzc;
                    Preconditions.checkState(f2 != null, "length must not be null.");
                    dash = new Gap(f2.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    @NonNull
    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
