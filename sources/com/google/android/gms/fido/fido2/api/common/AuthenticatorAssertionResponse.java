package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3)
    private final byte[] zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorData", id = 4)
    private final byte[] zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getSignature", id = 5)
    private final byte[] zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getUserHandle", id = 6)
    private final byte[] zze;

    @SafeParcelable.Constructor
    public AuthenticatorAssertionResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr4, @Nullable @SafeParcelable.Param(id = 6) byte[] bArr5) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr4);
        this.zze = bArr5;
    }

    @NonNull
    public static AuthenticatorAssertionResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAssertionResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.zza, authenticatorAssertionResponse.zza) && Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) && Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) && Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) && Arrays.equals(this.zze, authenticatorAssertionResponse.zze);
    }

    @NonNull
    public byte[] getAuthenticatorData() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    @NonNull
    public byte[] getSignature() {
        return this.zzd;
    }

    @Nullable
    public byte[] getUserHandle() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.zzam zzamVarZza = com.google.android.gms.internal.fido.zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.zza;
        zzamVarZza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.zzb;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.zzc;
        zzamVarZza.zzb("authenticatorData", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzchVarZzf4 = zzch.zzf();
        byte[] bArr4 = this.zzd;
        zzamVarZza.zzb("signature", zzchVarZzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            zzamVarZza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(this.zzb));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(this.zzc));
            jSONObject.put("signature", Base64Utils.encodeUrlSafeNoPadding(this.zzd));
            byte[] bArr = this.zze;
            if (bArr == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(bArr));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }
}
