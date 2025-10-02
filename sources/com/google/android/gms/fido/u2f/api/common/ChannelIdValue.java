package com.google.android.gms.fido.u2f.api.common;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType zza;

    @SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final String zzc;

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();

    @NonNull
    public static final ChannelIdValue ABSENT = new ChannelIdValue();

    @NonNull
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");

    @NonNull
    public static final ChannelIdValue UNUSED = new ChannelIdValue("unused");

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();
        private final int zzb;

        ChannelIdValueType(int i) {
            this.zzb = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i) {
            super(a.e(i, "ChannelIdValueType ", " not supported"));
        }
    }

    private ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    @NonNull
    public static ChannelIdValueType toChannelIdValueType(int i) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(i);
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.zzb.equals(channelIdValue.zzb);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.zzc.equals(channelIdValue.zzc);
    }

    @NonNull
    public JSONObject getObjectValue() {
        if (this.zzc == null) {
            return null;
        }
        try {
            return new JSONObject(this.zzc);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String getObjectValueAsString() {
        return this.zzc;
    }

    @NonNull
    public String getStringValue() {
        return this.zzb;
    }

    @NonNull
    public ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return this.zza.zzb;
    }

    public int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2 = this.zza.hashCode() + 31;
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.zzb.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.zzc.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getTypeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getStringValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getObjectValueAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ChannelIdValue(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        try {
            this.zza = toChannelIdValueType(i);
            this.zzb = str;
            this.zzc = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(@NonNull JSONObject jSONObject) {
        this.zzc = (String) Preconditions.checkNotNull(jSONObject.toString());
        this.zza = ChannelIdValueType.OBJECT;
        this.zzb = null;
    }
}
