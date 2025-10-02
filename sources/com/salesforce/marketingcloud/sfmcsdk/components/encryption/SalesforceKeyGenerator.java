package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.KeyGenerator;

/* loaded from: classes6.dex */
class SalesforceKeyGenerator {
    private static final String AES = "AES";
    private static final String KEYSTORE_ALIAS = "com.salesforce.androidsdk.security.KEYPAIR";
    private static final String SHA1PRNG = "SHA1PRNG";
    private static final String SHA256 = "SHA-256";
    private static final String TAG = "SalesforceKeyGenerator";
    private final Map<String, String> CACHED_ENCRYPTION_KEYS = new ConcurrentHashMap();
    private final Context context;
    private final KeyStoreWrapper keyStoreWrapper;

    public SalesforceKeyGenerator(Context context, KeyStoreWrapper keyStoreWrapper) {
        this.context = context.getApplicationContext();
        this.keyStoreWrapper = keyStoreWrapper;
    }

    private synchronized String generateEncryptionKey(String str) {
        String strEncodeToString;
        try {
            byte[] bArr = new byte[32];
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(getUniqueId(str).getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 32);
            strEncodeToString = Base64.encodeToString(bArr, 2);
        } catch (Exception e) {
            Log.e(TAG, "Exception thrown while getting encryption key", e);
            strEncodeToString = null;
        }
        return strEncodeToString;
    }

    private synchronized String generateUniqueId(String str, int i) {
        String string;
        String fromNoBackupFile = readFromNoBackupFile(str);
        if (fromNoBackupFile != null) {
            return Encryptor.decryptWithRSA(this.keyStoreWrapper.getRSAPrivateKey(KEYSTORE_ALIAS), fromNoBackupFile);
        }
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(SHA1PRNG);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
            keyGenerator.init(i, secureRandom);
            string = Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 2);
        } catch (Exception e) {
            Log.e(TAG, "Security exception thrown", e);
            string = UUID.randomUUID().toString();
        }
        storeInNoBackupFile(str, Encryptor.encryptWithRSA(this.keyStoreWrapper.getRSAPublicKey(KEYSTORE_ALIAS), string));
        return string;
    }

    private String readFromNoBackupFile(String str) {
        return FileUtilsKt.retrieveModuleKey(this.context, str);
    }

    private synchronized void storeInNoBackupFile(String str, String str2) {
        FileUtilsKt.storeModuleKey(this.context, str, str2);
    }

    public String getEncryptionKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strGenerateEncryptionKey = this.CACHED_ENCRYPTION_KEYS.get(str);
        if (strGenerateEncryptionKey == null && (strGenerateEncryptionKey = generateEncryptionKey(str)) != null) {
            this.CACHED_ENCRYPTION_KEYS.put(str, strGenerateEncryptionKey);
        }
        return strGenerateEncryptionKey;
    }

    public String getRandom128ByteKey() {
        byte[] bArr = new byte[128];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public String getSHA256Hash(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.US_ASCII)), 11);
        } catch (Exception e) {
            Log.e(TAG, "Exception thrown while generating SHA-256 hash", e);
            return null;
        }
    }

    public String getUniqueId(String str) {
        return getUniqueId(str, 256);
    }

    public String getUniqueId(String str, int i) {
        return generateUniqueId(str, i);
    }
}
