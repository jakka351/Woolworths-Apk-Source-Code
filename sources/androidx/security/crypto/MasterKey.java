package androidx.security.crypto;

import YU.a;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes2.dex */
public final class MasterKey {

    /* renamed from: androidx.security.crypto.MasterKey$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            try {
                new int[KeyScheme.values().length][0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f3759a;
        public KeyGenParameterSpec b;
        public KeyScheme c;

        public Builder(@NonNull Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public Builder(Context context, String str) {
            context.getApplicationContext();
            this.f3759a = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyScheme {
        public static final KeyScheme d;
        public static final /* synthetic */ KeyScheme[] e;

        static {
            KeyScheme keyScheme = new KeyScheme("AES256_GCM", 0);
            d = keyScheme;
            e = new KeyScheme[]{keyScheme};
        }

        public static KeyScheme valueOf(String str) {
            return (KeyScheme) Enum.valueOf(KeyScheme.class, str);
        }

        public static KeyScheme[] values() {
            return (KeyScheme[]) e.clone();
        }
    }

    public final String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean zContainsAlias;
        StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
        sb.append((String) null);
        sb.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            zContainsAlias = keyStore.containsAlias(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            zContainsAlias = false;
        }
        return a.k("}", sb, zContainsAlias);
    }
}
