package com.google.android.gms.fido.u2f.api.common;

import YU.a;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes5.dex */
public class Error {

    @NonNull
    @VisibleForTesting
    public static final String JSON_ERROR_CODE = "errorCode";

    @NonNull
    @VisibleForTesting
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(@NonNull ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    @NonNull
    public ErrorCode getErrorCode() {
        return this.zza;
    }

    @NonNull
    public String getErrorMessage() {
        return this.zzb;
    }

    @NonNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            String str = this.zzb;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("errorMessage", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        if (this.zzb == null) {
            Locale locale = Locale.ENGLISH;
            return a.e(this.zza.getCode(), "{errorCode: ", "}");
        }
        Locale locale2 = Locale.ENGLISH;
        return "{errorCode: " + this.zza.getCode() + ", errorMessage: " + this.zzb + "}";
    }

    public Error(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.zza = errorCode;
        this.zzb = str;
    }
}
