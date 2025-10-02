package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "InstrumentInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final int CARD_CLASS_CREDIT = 1;
    public static final int CARD_CLASS_DEBIT = 2;
    public static final int CARD_CLASS_PREPAID = 3;
    public static final int CARD_CLASS_UNKNOWN = 0;

    @NonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzo();

    @SafeParcelable.Field(getter = "getInstrumentType", id = 2)
    private String zza;

    @SafeParcelable.Field(getter = "getInstrumentDetails", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getCardClass", id = 4)
    private int zzc;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardClass {
    }

    private InstrumentInfo() {
    }

    public int getCardClass() {
        int i = this.zzc;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getInstrumentDetails() {
        return this.zzb;
    }

    @NonNull
    public String getInstrumentType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getInstrumentType(), false);
        SafeParcelWriter.writeString(parcel, 3, getInstrumentDetails(), false);
        SafeParcelWriter.writeInt(parcel, 4, getCardClass());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public InstrumentInfo(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }
}
