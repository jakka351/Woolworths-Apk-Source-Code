package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IidStore {
    public static final String[] c = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15620a;
    public final String b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IidStore(com.google.firebase.FirebaseApp r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f15169a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f15620a = r0
            r4.a()
            com.google.firebase.FirebaseOptions r0 = r4.c
            java.lang.String r1 = r0.e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.a()
            java.lang.String r1 = r0.b
            java.lang.String r4 = "1:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.IidStore.<init>(com.google.firebase.FirebaseApp):void");
    }

    public final String a() {
        String string;
        synchronized (this.f15620a) {
            try {
                synchronized (this.f15620a) {
                    string = this.f15620a.getString("|S|id", null);
                }
                if (string != null) {
                    return string;
                }
                return b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f15620a) {
            String strEncodeToString = null;
            String string = this.f15620a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    public final String c() {
        synchronized (this.f15620a) {
            try {
                String[] strArr = c;
                int i = 0;
                while (true) {
                    String string = null;
                    if (i >= 4) {
                        return null;
                    }
                    String str = strArr[i];
                    String string2 = this.f15620a.getString("|T|" + this.b + lllqqql.c0063ccc0063c + str, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                            string2 = string;
                        }
                        return string2;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
