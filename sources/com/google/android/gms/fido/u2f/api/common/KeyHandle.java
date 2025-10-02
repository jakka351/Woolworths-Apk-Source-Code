package com.google.android.gms.fido.u2f.api.common;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "KeyHandleCreator")
@Deprecated
/* loaded from: classes5.dex */
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getBytes", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List zzd;

    @SafeParcelable.Constructor
    public KeyHandle(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @Nullable @SafeParcelable.Param(id = 4) List list) {
        this.zza = i;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static KeyHandle parseFromJson(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            try {
                return new KeyHandle(Base64.decode(jSONObject.getString(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE), 8), ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), jSONObject.has("transports") ? Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
            } catch (IllegalArgumentException e) {
                throw new JSONException(e.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new JSONException(e2.toString());
        }
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && keyHandle.zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.zzd) != null && list2.containsAll(list) && keyHandle.zzd.containsAll(this.zzd);
    }

    @NonNull
    public byte[] getBytes() {
        return this.zzb;
    }

    @NonNull
    public ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    @NonNull
    public List<Transport> getTransports() {
        return this.zzd;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd);
    }

    @NonNull
    public JSONObject toJson() {
        return zza();
    }

    @NonNull
    public String toString() {
        List list = this.zzd;
        String string = list == null ? "null" : list.toString();
        String strEncode = Base64Utils.encode(this.zzb);
        ProtocolVersion protocolVersion = this.zzc;
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(strEncode);
        sb.append(", version: ");
        sb.append(protocolVersion);
        sb.append(", transports: ");
        return a.o(sb, string, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeByteArray(parcel, 2, getBytes(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc.toString(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(bArr, 11));
            }
            ProtocolVersion protocolVersion = this.zzc;
            if (protocolVersion != null) {
                jSONObject.put("version", protocolVersion.toString());
            }
            if (this.zzd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public KeyHandle(@NonNull byte[] bArr, @NonNull ProtocolVersion protocolVersion, @Nullable List<Transport> list) {
        this.zza = 1;
        this.zzb = bArr;
        this.zzc = protocolVersion;
        this.zzd = list;
    }
}
