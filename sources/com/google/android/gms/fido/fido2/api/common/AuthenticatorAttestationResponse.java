package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3)
    private final byte[] zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAttestationObject", id = 4)
    private final byte[] zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getTransports", id = 5)
    private final String[] zzd;

    @SafeParcelable.Constructor
    public AuthenticatorAttestationResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) String[] strArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    @NonNull
    public static AuthenticatorAttestationResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.zza, authenticatorAttestationResponse.zza) && Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) && Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc);
    }

    @NonNull
    public byte[] getAttestationObject() {
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
    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
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
        zzamVarZza.zzb("attestationObject", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzamVarZza.zzb("transports", Arrays.toString(this.zzd));
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011b A[Catch: JSONException -> 0x0015, zzdq -> 0x0184, TRY_LEAVE, TryCatch #2 {zzdq -> 0x0184, blocks: (B:33:0x00ea, B:39:0x0109, B:41:0x011b, B:46:0x012f, B:49:0x0151, B:51:0x0167, B:53:0x016d, B:56:0x0187, B:57:0x018c, B:58:0x018d, B:59:0x0192, B:64:0x019d, B:66:0x01ad, B:68:0x01bb, B:69:0x01ce, B:70:0x01d3, B:71:0x01d4, B:72:0x01d9, B:77:0x01f8, B:78:0x01fd), top: B:109:0x00ea, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8 A[Catch: JSONException -> 0x0015, zzdq -> 0x0184, TRY_ENTER, TryCatch #2 {zzdq -> 0x0184, blocks: (B:33:0x00ea, B:39:0x0109, B:41:0x011b, B:46:0x012f, B:49:0x0151, B:51:0x0167, B:53:0x016d, B:56:0x0187, B:57:0x018c, B:58:0x018d, B:59:0x0192, B:64:0x019d, B:66:0x01ad, B:68:0x01bb, B:69:0x01ce, B:70:0x01d3, B:71:0x01d4, B:72:0x01d9, B:77:0x01f8, B:78:0x01fd), top: B:109:0x00ea, outer: #1 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject zza() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.zza():org.json.JSONObject");
    }
}
