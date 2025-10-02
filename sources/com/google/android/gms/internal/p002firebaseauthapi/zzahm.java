package com.google.android.gms.internal.p002firebaseauthapi;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahm implements zzafa {
    private String zza;

    @Nullable
    private String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;
    private ActionCodeSettings zze;

    @Nullable
    private String zzf;

    @Nullable
    private String zzg;

    public zzahm(int i) {
        this.zza = zza(i);
    }

    public static zzahm zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzahm(7, actionCodeSettings, null, str2, str, null, null);
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzahm zzc(@Nullable String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzahm zzb(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    @Nullable
    public final String zzd() {
        return this.zzd;
    }

    private zzahm(int i, ActionCodeSettings actionCodeSettings, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = zza(7);
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahm zza(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzahm zza(@Nullable String str) {
        this.zzg = str;
        return this;
    }

    @SuppressLint
    private static String zza(int i) {
        if (i == 1) {
            return "PASSWORD_RESET";
        }
        if (i == 4) {
            return "VERIFY_EMAIL";
        }
        if (i == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        i = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i = 7;
                break;
            case "EMAIL_SIGNIN":
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        jSONObject.put("requestType", i);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Scopes.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.h);
            jSONObject.put("canHandleCodeInApp", this.zze.j);
            String str5 = this.zze.d;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.e;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.g;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.i;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.m;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.n;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzajk.zza(jSONObject, "captchaResp", str13);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
