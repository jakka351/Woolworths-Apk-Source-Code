package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    static {
        new Logger(zza, new String[0]);
    }

    public zzagx(EmailAuthCredential emailAuthCredential, @Nullable String str, @Nullable String str2) {
        this.zzd = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential);
        this.zzb = Preconditions.checkNotEmpty(emailAuthCredential.d);
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.f);
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        ActionCodeUrl actionCodeUrlA = ActionCodeUrl.a(this.zzc);
        String str = actionCodeUrlA != null ? actionCodeUrlA.f15190a : null;
        String str2 = actionCodeUrlA != null ? actionCodeUrlA.b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scopes.EMAIL, this.zzb);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.zzf;
        if (str4 != null) {
            zzajk.zza(jSONObject, "captchaResp", str4);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    @Nullable
    public final String zzc() {
        return this.zzf;
    }
}
