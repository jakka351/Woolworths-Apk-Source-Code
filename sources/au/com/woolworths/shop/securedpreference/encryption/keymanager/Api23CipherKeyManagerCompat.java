package au.com.woolworths.shop.securedpreference.encryption.keymanager;

import android.security.keystore.KeyGenParameterSpec;
import au.com.woolworths.shop.securedpreference.encryption.CipherSettings;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;

/* loaded from: classes4.dex */
public class Api23CipherKeyManagerCompat implements CipherKeyManagerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final KeyStore f12920a;
    public final CipherSettings b;

    public Api23CipherKeyManagerCompat(CipherSettings cipherSettings) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.b = cipherSettings;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        this.f12920a = keyStore;
        keyStore.load(null);
    }

    public final void a(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
        keyGenerator.generateKey();
    }
}
