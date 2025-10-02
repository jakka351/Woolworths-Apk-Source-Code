package com.google.crypto.tink.integration.android;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;

@TargetApi
/* loaded from: classes.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    public static AndroidKeystoreAesGcm c(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = Validators.b(str);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(strB)) {
            String strB2 = Validators.b(str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(strB2, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
        }
        return new AndroidKeystoreKmsClient().b(str);
    }

    @Override // com.google.crypto.tink.KmsClient
    public final boolean a(String str) {
        return str.toLowerCase().startsWith("android-keystore://");
    }

    @Override // com.google.crypto.tink.KmsClient
    public final AndroidKeystoreAesGcm b(String str) throws GeneralSecurityException {
        try {
            return new AndroidKeystoreAesGcm(Validators.b(str));
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
