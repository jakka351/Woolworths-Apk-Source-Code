package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class zzcb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15206a;
    public final String b;
    public final SharedPreferences c;
    public final Logger d;

    public zzcb(Context context, String str) {
        Preconditions.checkNotNull(context);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(str);
        this.b = strCheckNotEmpty;
        Context applicationContext = context.getApplicationContext();
        this.f15206a = applicationContext;
        this.c = applicationContext.getSharedPreferences("com.google.firebase.auth.api.Store." + strCheckNotEmpty, 0);
        this.d = new Logger("StorageHelpers", new String[0]);
    }

    public final zzahv a(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        String strD = d("com.google.firebase.auth.GET_TOKEN_RESPONSE." + zzafVar.e.d);
        if (strD == null) {
            return null;
        }
        try {
            return zzahv.zzb(strD);
        } catch (zzaao unused) {
            this.d.i("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    public final zzaf b() {
        String strD = d("com.google.firebase.auth.FIREBASE_USER");
        if (!TextUtils.isEmpty(strD)) {
            try {
                JSONObject jSONObject = new JSONObject(strD);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    return c(jSONObject);
                }
            } catch (Exception unused) {
                this.d.i("Failed to restore user data from persistent storage.", new Object[0]);
                return null;
            }
        }
        return null;
    }

    public final zzaf c(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzah zzahVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(zzab.d(jSONArray3.getString(i)));
            }
            zzaf zzafVar = new zzaf(FirebaseApp.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.C2(zzahv.zzb(string));
            }
            if (!z) {
                zzafVar.k = Boolean.FALSE;
            }
            zzafVar.j = str;
            if (jSONObject.has("userMetadata") && (zzahVarA = zzah.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.l = zzahVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.v(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.v(jSONObject2) : null);
                }
                zzafVar.G2(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(com.google.firebase.auth.zzan.v(new JSONObject(jSONArray.getString(i3))));
                }
                zzafVar.p = arrayList3;
            }
            return zzafVar;
        } catch (zzaao e) {
            e = e;
            this.d.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            this.d.wtf(e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            this.d.wtf(e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            this.d.wtf(e);
            return null;
        }
    }

    public final String d(String str) {
        String str2;
        String string = this.c.getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        zzby zzbyVarA = zzby.a(this.f15206a, this.b);
        String strSubstring = string.substring(10);
        zzbyVarA.getClass();
        Preconditions.checkNotNull(strSubstring);
        zzmy zzmyVar = zzbyVarA.b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzba) zzbyVarA.b.zza().zza(zzco.zza(), com.google.android.gms.internal.p002firebaseauthapi.zzba.class)).zza(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            a.v("Exception encountered while decrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            return null;
        }
    }

    public final void e(zzahv zzahvVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahvVar);
        f(YU.a.A("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.k0()), zzahvVar.zzf());
    }

    public final void f(String str, String str2) {
        String strEncodeToString;
        zzby zzbyVarA = zzby.a(this.f15206a, this.b);
        zzbyVarA.getClass();
        Preconditions.checkNotNull(str2);
        zzmy zzmyVar = zzbyVarA.b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    strEncodeToString = Base64.encodeToString(((com.google.android.gms.internal.p002firebaseauthapi.zzba) zzbyVarA.b.zza().zza(zzco.zza(), com.google.android.gms.internal.p002firebaseauthapi.zzba.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e) {
                a.v("Exception encountered while encrypting bytes:\n", e.getMessage(), "FirebearStorageCryptoHelper");
            }
        }
        if (str3 != null) {
            c.v(this.c, str, "ENCRYPTED:".concat(str3));
        }
    }

    public final void g() {
        this.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
    }

    public final void h(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        this.c.edit().remove(YU.a.A("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.k0())).apply();
    }

    public final void i(FirebaseUser firebaseUser) {
        String string;
        boolean z;
        Preconditions.checkNotNull(firebaseUser);
        Logger logger = this.d;
        JSONObject jSONObject = new JSONObject();
        if (firebaseUser instanceof zzaf) {
            zzaf zzafVar = (zzaf) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzafVar.d.zzf());
                FirebaseApp firebaseAppE = FirebaseApp.e(zzafVar.f);
                firebaseAppE.a();
                jSONObject.put("applicationName", firebaseAppE.b);
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzafVar.h != null) {
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = zzafVar.h;
                    int size = arrayList.size();
                    if (arrayList.size() > 30) {
                        logger.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList.size()));
                        size = 30;
                    }
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        z = true;
                        if (i >= size) {
                            break;
                        }
                        zzab zzabVar = (zzab) arrayList.get(i);
                        if (zzabVar.e.equals("firebase")) {
                            z2 = true;
                        }
                        if (i == size - 1 && !z2) {
                            break;
                        }
                        jSONArray.put(zzabVar.zzb());
                        i++;
                    }
                    if (!z2) {
                        for (int i2 = size - 1; i2 < arrayList.size() && i2 >= 0; i2++) {
                            zzab zzabVar2 = (zzab) arrayList.get(i2);
                            if (zzabVar2.e.equals("firebase")) {
                                jSONArray.put(zzabVar2.zzb());
                                break;
                            } else {
                                if (i2 == arrayList.size() - 1) {
                                    jSONArray.put(zzabVar2.zzb());
                                }
                            }
                        }
                        z = z2;
                        if (!z) {
                            logger.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList.size()), Integer.valueOf(size));
                            if (arrayList.size() < 5) {
                                StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    sb.append("Provider - " + ((zzab) it.next()).e + "\n");
                                }
                                logger.w(sb.toString(), new Object[0]);
                            }
                        }
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzafVar.d2());
                jSONObject.put("version", "2");
                zzah zzahVar = zzafVar.l;
                if (zzahVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("lastSignInTimestamp", zzahVar.d);
                        jSONObject2.put("creationTimestamp", zzahVar.e);
                    } catch (JSONException unused) {
                    }
                    jSONObject.put("userMetadata", jSONObject2);
                }
                ArrayList arrayListA = new zzaj(zzafVar).a();
                if (!arrayListA.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i3 = 0; i3 < arrayListA.size(); i3++) {
                        jSONArray2.put(((MultiFactorInfo) arrayListA.get(i3)).toJson());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                List list = zzafVar.p;
                if (list != null && !list.isEmpty()) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        com.google.firebase.auth.zzan zzanVar = (com.google.firebase.auth.zzan) list.get(i4);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("credentialId", zzanVar.d);
                        jSONObject3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzanVar.e);
                        jSONObject3.put("displayName", zzanVar.f);
                        jSONArray3.put(jSONObject3);
                    }
                    jSONObject.put("passkeyInfo", jSONArray3);
                }
                string = jSONObject.toString();
            } catch (Exception e) {
                logger.wtf("Failed to turn object into JSON", e, new Object[0]);
                throw new zzaao(e);
            }
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        f("com.google.firebase.auth.FIREBASE_USER", string);
    }
}
