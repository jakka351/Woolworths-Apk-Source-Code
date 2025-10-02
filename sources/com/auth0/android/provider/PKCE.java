package com.auth0.android.provider;

import android.util.Base64;
import android.util.Log;
import com.auth0.android.authentication.AuthenticationAPIClient;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;

/* loaded from: classes.dex */
class PKCE {

    /* renamed from: a, reason: collision with root package name */
    public final AuthenticationAPIClient f13668a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public PKCE(AuthenticationAPIClient authenticationAPIClient, String str, Map map) throws NoSuchAlgorithmException {
        this.f13668a = authenticationAPIClient;
        this.c = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        this.b = strEncodeToString;
        byte[] bytes = strEncodeToString.getBytes(StandardCharsets.US_ASCII);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            this.d = Base64.encodeToString(messageDigest.digest(), 11);
            this.e = map;
        } catch (NoSuchAlgorithmException e) {
            Log.e("AlgorithmHelper", "Failed to get SHA-256 signature", e);
            throw new IllegalStateException("Failed to get SHA-256 signature", e);
        }
    }
}
