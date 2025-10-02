package com.medallia.digital.mobilesdk;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import com.medallia.digital.mobilesdk.d7;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
final class t4 implements m8 {
    private static final String b = "AndroidKeyStore";
    private static final String c = "AES/GCM/NoPadding";
    private static final String d = "MD_SDK_KEYSTORE_V2";
    private static final String e = "MD_SDK_KEYSTORE";
    private static final int f = 12;
    private static final int g = 128;
    private static t4 h;

    /* renamed from: a, reason: collision with root package name */
    private KeyStore f16711a;

    private t4() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        c();
        h();
    }

    private void c() {
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.LENNY;
        if (d7VarB.a(aVar, "").isEmpty()) {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            d7.b().b(aVar, Base64.encodeToString(bArr, 0));
        }
    }

    private byte[] d() {
        return Base64.decode(d7.b().a(d7.a.LENNY, ""), 0);
    }

    public static t4 e() {
        if (h == null) {
            h = new t4();
        }
        return h;
    }

    private Key f() {
        return g();
    }

    private Key g() {
        try {
            return this.f16711a.getKey(d, null);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return null;
        }
    }

    @TargetApi
    private void h() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance(b);
            this.f16711a = keyStore;
            keyStore.load(null);
            if (this.f16711a.containsAlias(d)) {
                return;
            }
            a();
            b();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", b);
            try {
                boolean zHasSystemFeature = i4.c().b().getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
                a4.b("using Strong Box: " + zHasSystemFeature);
                keyGenerator.init(new KeyGenParameterSpec.Builder(d, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setIsStrongBoxBacked(zHasSystemFeature).build());
            } catch (Exception e2) {
                a4.c(e2.getMessage());
                keyGenerator.init(new KeyGenParameterSpec.Builder(d, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
            }
            keyGenerator.generateKey();
        } catch (Exception e3) {
            a4.c(e3.getMessage());
        }
    }

    public String a(d7.a aVar) {
        String strA = d7.b().a(aVar, (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return a(strA);
    }

    public String b(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(c);
            cipher.init(1, f(), new GCMParameterSpec(128, d()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return "";
        }
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        h = null;
    }

    private void b() {
        try {
            d7.b().c().edit().remove("MD_KEY_IV").commit();
            d7.b().c().edit().remove("MD_KEY_AES").commit();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public String a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(c);
            cipher.init(2, f(), new GCMParameterSpec(128, d()));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return "";
        }
    }

    private void a() throws KeyStoreException {
        try {
            if (this.f16711a.containsAlias(e)) {
                this.f16711a.deleteEntry(e);
            }
        } catch (KeyStoreException e2) {
            a4.c(e2.getMessage());
        }
    }

    public void a(d7.a aVar, String str) {
        d7.b().b(aVar, !TextUtils.isEmpty(str) ? b(str) : null);
    }
}
