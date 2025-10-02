package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.tozny.AesCbcWithIntegrity;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class a extends AesCbcWithIntegrity implements c {
    private static final String b = "F6389234-1024-481F-9173-37D9D7F5051F";
    private static final String c = "com.salesforce.marketingcloud.storagePrefs";
    private static final String d = "install_date_enc";
    private static final int e = 500;

    /* renamed from: a, reason: collision with root package name */
    private final AesCbcWithIntegrity.SecretKeys f17070a;

    public a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) throws GeneralSecurityException, UnsupportedEncodingException {
        this(context, str, str2, str3, e);
    }

    @Override // com.salesforce.marketingcloud.util.c
    public String a(String str) throws GeneralSecurityException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.encrypt(str, this.f17070a).toString();
    }

    @Override // com.salesforce.marketingcloud.util.c
    public String b(String str) throws GeneralSecurityException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.decryptString(new AesCbcWithIntegrity.CipherTextIvMac(str), this.f17070a);
    }

    public a(Context context, String str, String str2, String str3, int i) throws GeneralSecurityException, UnsupportedEncodingException {
        this.f17070a = AesCbcWithIntegrity.generateKeyFromPassword(a(str, str2, str3), a(context, str), i);
        a();
    }

    private String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        StringBuilder sbT = YU.a.t(str, "--");
        sbT.append(l.e(str2));
        sbT.append(lqlqqlq.m006D006D006Dm006Dm);
        sbT.append(l.e(str3));
        return Base64.encodeToString(l.e(sbT.toString()).getBytes(l.b), 2);
    }

    public String a(@NonNull Context context, @NonNull String str) throws GeneralSecurityException {
        SharedPreferences sharedPreferences = context.getSharedPreferences(c, 0);
        String string = sharedPreferences.getString(d, null);
        if (string != null) {
            return string;
        }
        String strSaltString = AesCbcWithIntegrity.saltString(AesCbcWithIntegrity.generateSalt());
        au.com.woolworths.shop.checkout.ui.confirmation.c.v(sharedPreferences, d, strSaltString);
        return strSaltString;
    }

    private void a() throws GeneralSecurityException, UnsupportedEncodingException {
        if (!b.equals(b(a(b)))) {
            throw new GeneralSecurityException("Encryption/decryption test failed");
        }
    }
}
