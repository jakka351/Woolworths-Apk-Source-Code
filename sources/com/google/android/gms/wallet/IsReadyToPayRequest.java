package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();

    @SafeParcelable.Field(id = 2)
    ArrayList zza;

    @SafeParcelable.Field(id = 4)
    String zzb;

    @SafeParcelable.Field(id = 5)
    String zzc;

    @SafeParcelable.Field(id = 6)
    ArrayList zzd;

    @SafeParcelable.Field(id = 7)
    boolean zze;

    @SafeParcelable.Field(id = 8)
    String zzf;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzp zzpVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.addAll(collection);
            return this;
        }

        @NonNull
        public IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        @NonNull
        public Builder setExistingPaymentMethodRequired(boolean z) {
            IsReadyToPayRequest.this.zze = z;
            return this;
        }
    }

    public IsReadyToPayRequest() {
    }

    @NonNull
    public static IsReadyToPayRequest fromJson(@NonNull String str) {
        Builder builderNewBuilder = newBuilder();
        IsReadyToPayRequest.this.zzf = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new IsReadyToPayRequest().new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzd;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.zze;
    }

    @NonNull
    public String toJson() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzc, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        SafeParcelWriter.writeString(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public IsReadyToPayRequest(@SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) ArrayList arrayList2, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) String str3) {
        this.zza = arrayList;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = arrayList2;
        this.zze = z;
        this.zzf = str3;
    }
}
