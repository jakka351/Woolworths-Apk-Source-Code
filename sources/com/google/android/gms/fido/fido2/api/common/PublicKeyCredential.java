package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
/* loaded from: classes5.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzal();

    @NonNull
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zza;

    @NonNull
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final String zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getRawId", id = 3)
    private final byte[] zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getRegisterResponse", id = 4)
    private final AuthenticatorAttestationResponse zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getSignResponse", id = 5)
    private final AuthenticatorAssertionResponse zze;

    @Nullable
    @SafeParcelable.Field(getter = "getErrorResponse", id = 6)
    private final AuthenticatorErrorResponse zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getClientExtensionResults", id = 7)
    private final AuthenticationExtensionsClientOutputs zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getAuthenticatorAttachment", id = 8)
    private final String zzh;

    public static class Builder {
        private String zza;
        private byte[] zzb;
        private AuthenticatorResponse zzc;
        private AuthenticationExtensionsClientOutputs zzd;
        private String zze;

        @NonNull
        public PublicKeyCredential build() {
            AuthenticatorResponse authenticatorResponse = this.zzc;
            return new PublicKeyCredential(this.zza, PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, authenticatorResponse instanceof AuthenticatorAttestationResponse ? (AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorAssertionResponse ? (AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorErrorResponse ? (AuthenticatorErrorResponse) authenticatorResponse : null, this.zzd, this.zze);
        }

        @NonNull
        public Builder setAuthenticationExtensionsClientOutputs(@Nullable AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.zzd = authenticationExtensionsClientOutputs;
            return this;
        }

        @NonNull
        public Builder setAuthenticatorAttachment(@NonNull String str) {
            this.zze = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setRawId(@NonNull byte[] bArr) {
            this.zzb = bArr;
            return this;
        }

        @NonNull
        public Builder setResponse(@NonNull AuthenticatorResponse authenticatorResponse) {
            this.zzc = authenticatorResponse;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublicKeyCredential(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr, @Nullable @SafeParcelable.Param(id = 4) AuthenticatorAttestationResponse authenticatorAttestationResponse, @Nullable @SafeParcelable.Param(id = 5) AuthenticatorAssertionResponse authenticatorAssertionResponse, @Nullable @SafeParcelable.Param(id = 6) AuthenticatorErrorResponse authenticatorErrorResponse, @Nullable @SafeParcelable.Param(id = 7) AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @Nullable @SafeParcelable.Param(id = 8) String str3) {
        boolean z = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
    }

    @NonNull
    public static PublicKeyCredential deserializeFromBytes(@NonNull byte[] bArr) {
        return (PublicKeyCredential) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.equal(this.zza, publicKeyCredential.zza) && Objects.equal(this.zzb, publicKeyCredential.zzb) && Arrays.equals(this.zzc, publicKeyCredential.zzc) && Objects.equal(this.zzd, publicKeyCredential.zzd) && Objects.equal(this.zze, publicKeyCredential.zze) && Objects.equal(this.zzf, publicKeyCredential.zzf) && Objects.equal(this.zzg, publicKeyCredential.zzg) && Objects.equal(this.zzh, publicKeyCredential.zzh);
    }

    @Nullable
    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    @Nullable
    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    @NonNull
    public byte[] getRawId() {
        return this.zzc;
    }

    @NonNull
    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    @NonNull
    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toJson() throws JSONException {
        JSONObject jSONObjectZza;
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] bArr = this.zzc;
            if (bArr != null && bArr.length > 0) {
                jSONObject.put("rawId", Base64Utils.encodeUrlSafeNoPadding(bArr));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectZza = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectZza = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectZza = authenticatorErrorResponse.zza();
                        str4 = "error";
                    } else {
                        jSONObjectZza = null;
                    }
                }
            }
            if (jSONObjectZza != null) {
                jSONObject.put(str4, jSONObjectZza);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
            } else if (z) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
