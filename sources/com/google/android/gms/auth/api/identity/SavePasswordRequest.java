package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbu();

    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword zba;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "getTheme", id = 3)
    private final int zbc;

    @Deprecated
    public static final class Builder {
        private SignInPassword zba;

        @Nullable
        private String zbb;
        private int zbc;

        @NonNull
        public SavePasswordRequest build() {
            return new SavePasswordRequest(this.zba, this.zbb, this.zbc);
        }

        @NonNull
        public Builder setSignInPassword(@NonNull SignInPassword signInPassword) {
            this.zba = signInPassword;
            return this;
        }

        @NonNull
        public final Builder zba(int i) {
            this.zbc = i;
            return this;
        }

        @NonNull
        public final Builder zbb(@NonNull String str) {
            this.zbb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @Nullable @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.zba = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zbb = str;
        this.zbc = i;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        builder.zba(savePasswordRequest.zbc);
        String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.zbb(str);
        }
        return builder;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.equal(this.zba, savePasswordRequest.zba) && Objects.equal(this.zbb, savePasswordRequest.zbb) && this.zbc == savePasswordRequest.zbc;
    }

    @NonNull
    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zbc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
