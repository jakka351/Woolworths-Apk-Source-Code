package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahy {

    @Nullable
    private final String zza;

    @NonNull
    private final String zzb;

    @Nullable
    private final String zzc;
    private final long zzd;

    @Nullable
    private final zzaiz zze;

    private zzahy(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable zzaiz zzaizVar) {
        if (!TextUtils.isEmpty(str) && zzaizVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzaizVar;
    }

    private static long zza(String str) {
        try {
            return zzaoo.zza(zzaoo.zza(str));
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e);
            return 0L;
        }
    }

    @Nullable
    public final zzaiz zzb() {
        return this.zze;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    @Nullable
    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzahy zza(@NonNull JSONObject jSONObject) {
        zzahy zzahyVar = new zzahy(Strings.emptyToNull(jSONObject.optString("phoneInfo")), Strings.emptyToNull(jSONObject.optString("mfaEnrollmentId")), Strings.emptyToNull(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzaiz() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahyVar;
    }

    public static List<zzahy> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(zza(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
