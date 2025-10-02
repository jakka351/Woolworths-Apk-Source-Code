package com.google.android.gms.fido.fido2.api.common;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* loaded from: classes5.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");


    @NonNull
    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzas
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            try {
                return ResidentKeyRequirement.fromString(string);
            } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ResidentKeyRequirement[i];
        }
    };

    @NonNull
    private final String zzb;

    public static class UnsupportedResidentKeyRequirementException extends Exception {
        public UnsupportedResidentKeyRequirementException(@NonNull String str) {
            super(a.h("Resident key requirement ", str, " not supported"));
        }
    }

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    @NonNull
    public static ResidentKeyRequirement fromString(@NonNull String str) throws UnsupportedResidentKeyRequirementException {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
