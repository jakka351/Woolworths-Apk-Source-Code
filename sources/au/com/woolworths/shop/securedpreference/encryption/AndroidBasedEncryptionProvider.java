package au.com.woolworths.shop.securedpreference.encryption;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.securedpreference.encryption.CipherSettings;
import au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider;
import au.com.woolworths.shop.securedpreference.encryption.keymanager.Api23CipherKeyManagerCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import timber.log.Timber;

/* loaded from: classes4.dex */
public class AndroidBasedEncryptionProvider implements EncryptionProvider {
    public static AndroidBasedEncryptionProvider d;
    public static KeyStore e;
    public static EncryptionProvider.Callback f;

    /* renamed from: a, reason: collision with root package name */
    public final CipherSettings f12917a;
    public final Api23CipherKeyManagerCompat b;
    public final boolean c;

    public AndroidBasedEncryptionProvider(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean z;
        CipherSettings.Builder builder = new CipherSettings.Builder();
        builder.f12919a = "WooliesXKeyStore";
        builder.b = "AES/CBC/PKCS7Padding";
        CipherSettings cipherSettings = new CipherSettings(builder);
        String str = cipherSettings.f12918a;
        this.c = false;
        this.f12917a = cipherSettings;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            e = keyStore;
            keyStore.load(null);
        } catch (Exception e2) {
            Bark.f8483a.d(new ReportOwner(ReportOwner.Squad.u), e2, "Error loading the Android Key Store", null);
        }
        this.b = new Api23CipherKeyManagerCompat(cipherSettings);
        Provider[] providers = Security.getProviders();
        if (providers != null) {
            for (Provider provider : providers) {
                if (provider.getService("Cipher", cipherSettings.b) != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.c = z;
        try {
            if (e.containsAlias(str)) {
                Timber.f27013a.b("Key store contains the alias " + str, new Object[0]);
            } else {
                this.b.a(this.f12917a.f12918a);
            }
        } catch (Exception e3) {
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "Exception occurred during Android Key generation " + e3.getMessage() + Log.getStackTraceString(e3), null);
        }
    }

    @Override // au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider
    public final String a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, InvalidAlgorithmParameterException {
        if (this.c) {
            Api23CipherKeyManagerCompat api23CipherKeyManagerCompat = this.b;
            api23CipherKeyManagerCompat.getClass();
            try {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length == 2) {
                    byte[] bArrDecode = Base64.decode(strArrSplit[0], 0);
                    String str2 = strArrSplit[1];
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrDecode);
                    CipherSettings cipherSettings = api23CipherKeyManagerCompat.b;
                    Cipher cipher = Cipher.getInstance(cipherSettings.b);
                    cipher.init(2, api23CipherKeyManagerCompat.f12920a.getKey(cipherSettings.f12918a, null), ivParameterSpec);
                    CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str2, 0)), cipher);
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        int i = cipherInputStream.read();
                        if (i == -1) {
                            break;
                        }
                        arrayList.add(Byte.valueOf((byte) i));
                    }
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
                    }
                    return new String(bArr, 0, size, "UTF-8");
                }
            } catch (IOException e2) {
                e = e2;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "Exception occurred during decryption process " + e.getMessage() + Log.getStackTraceString(e), null);
                c();
                return "";
            } catch (GeneralSecurityException e3) {
                e = e3;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "Exception occurred during decryption process " + e.getMessage() + Log.getStackTraceString(e), null);
                c();
                return "";
            }
        }
        return str;
    }

    @Override // au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider
    public final String b(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, InvalidAlgorithmParameterException {
        if (!this.c) {
            return str;
        }
        Api23CipherKeyManagerCompat api23CipherKeyManagerCompat = this.b;
        api23CipherKeyManagerCompat.getClass();
        try {
            if (str.length() == 0) {
                return str;
            }
            CipherSettings cipherSettings = api23CipherKeyManagerCompat.b;
            Cipher cipher = Cipher.getInstance(cipherSettings.b);
            cipher.init(1, api23CipherKeyManagerCompat.f12920a.getKey(cipherSettings.f12918a, null), (AlgorithmParameterSpec) null);
            String strEncodeToString = Base64.encodeToString(cipher.getIV() != null ? cipher.getIV() : new byte[0], 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
            cipherOutputStream.write(str.getBytes("UTF-8"));
            cipherOutputStream.close();
            return strEncodeToString + ":" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e2) {
            e = e2;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "Exception occurred during encryption process " + e.getMessage() + Log.getStackTraceString(e), null);
            c();
            return null;
        } catch (GeneralSecurityException e3) {
            e = e3;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "Exception occurred during encryption process " + e.getMessage() + Log.getStackTraceString(e), null);
            c();
            return null;
        }
    }

    public final void c() throws KeyStoreException {
        String str = this.f12917a.f12918a;
        try {
            if (e.containsAlias(str)) {
                Timber.f27013a.h("Deleting the key alias because of invalid key store", new Object[0]);
                e.deleteEntry(str);
            }
        } catch (KeyStoreException unused) {
        }
        f.a();
    }
}
