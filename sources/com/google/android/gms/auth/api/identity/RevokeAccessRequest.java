package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p000authapi.zbbi;
import java.util.List;

@SafeParcelable.Class(creator = "RevokeAccessRequestCreator")
/* loaded from: classes5.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new zbr();

    @SafeParcelable.Field(getter = "getScopes", id = 1)
    private final zbbi zba;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private final Account zbb;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    public static abstract class Builder {
        @NonNull
        public abstract RevokeAccessRequest build();

        @NonNull
        public abstract Builder setAccount(@NonNull Account account);

        @NonNull
        public abstract Builder setScopes(@NonNull List<Scope> list);

        @NonNull
        public abstract Builder zba(@Nullable String str);
    }

    @SafeParcelable.Constructor
    public RevokeAccessRequest(@NonNull @SafeParcelable.Param(id = 1) List list, @NonNull @SafeParcelable.Param(id = 2) Account account, @Nullable @SafeParcelable.Param(id = 3) String str) {
        this.zba = zbbi.zbi(list);
        this.zbb = account;
        this.zbc = str;
    }

    @NonNull
    public static Builder builder() {
        return new zbf();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.zba;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.zba;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && Objects.equal(this.zbb, revokeAccessRequest.zbb) && Objects.equal(this.zbc, revokeAccessRequest.zbc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Account getAccount() {
        return this.zbb;
    }

    @NonNull
    public List<Scope> getScopes() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zba() {
        return this.zbc;
    }

    @NonNull
    public final Builder zbb() {
        return new zbf(this);
    }
}
