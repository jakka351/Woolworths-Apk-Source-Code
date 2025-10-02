package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "UserAddressRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zze();

    @SafeParcelable.Field(id = 2)
    List<CountrySpecification> zza;

    public final class Builder {
        public /* synthetic */ Builder(zzd zzdVar) {
        }

        @NonNull
        public Builder addAllowedCountrySpecification(@NonNull CountrySpecification countrySpecification) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.zza == null) {
                userAddressRequest.zza = new ArrayList();
            }
            UserAddressRequest.this.zza.add(countrySpecification);
            return this;
        }

        @NonNull
        public Builder addAllowedCountrySpecifications(@NonNull Collection<CountrySpecification> collection) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.zza == null) {
                userAddressRequest.zza = new ArrayList();
            }
            UserAddressRequest.this.zza.addAll(collection);
            return this;
        }

        @NonNull
        public UserAddressRequest build() {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            List<CountrySpecification> list = userAddressRequest.zza;
            if (list != null) {
                userAddressRequest.zza = Collections.unmodifiableList(list);
            }
            return UserAddressRequest.this;
        }
    }

    public UserAddressRequest() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new UserAddressRequest().new Builder(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UserAddressRequest(@SafeParcelable.Param(id = 2) List<CountrySpecification> list) {
        this.zza = list;
    }
}
