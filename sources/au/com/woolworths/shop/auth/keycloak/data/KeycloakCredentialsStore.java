package au.com.woolworths.shop.auth.keycloak.data;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakCredentialsStore;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class KeycloakCredentialsStore {
    public static final /* synthetic */ KProperty[] e = {Reflection.f24268a.i(new PropertyReference2Impl(KeycloakCredentialsStore.class))};

    /* renamed from: a, reason: collision with root package name */
    public final Context f10243a;
    public final KeyStore b;
    public final PreferenceDataStoreSingletonDelegate c;
    public final Preferences.Key d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakCredentialsStore$Companion;", "", "", "KEYCLOAK_CREDENTIALS_KEY", "Ljava/lang/String;", "ANDROID_KEYSTORE_PROVIDER", "CIPHER_TRANSFORMATION_KEY", "ENCRYPTION_KEY_ALIAS", "ENCRYPTION_ALGORITHM", "ENCRYPTION_BLOCK_MODE", "ENCRYPTION_PADDING", "", "AUTHENTICATION_TAG_LENGTH", "I", "IV_BUFFER_SIZE", "ENCRYPTION_KEY_SIZE", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public KeycloakCredentialsStore(@NotNull Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Intrinsics.h(context, "context");
        this.f10243a = context;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.b = keyStore;
        this.c = PreferenceDataStoreDelegateKt.a(context.getApplicationContext().getPackageName() + ".keycloak_credentials", null, null, 14);
        this.d = PreferencesKeys.c("keycloak_credentials");
    }

    public final SecretKey a() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Key key = this.b.getKey("secure_credentials_key", null);
        if (key != null) {
            return (SecretKey) key;
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("secure_credentials_key", 3);
        builder.setKeySize(256);
        builder.setBlockModes(CodePackage.GCM);
        builder.setEncryptionPaddings("NoPadding");
        builder.setRandomizedEncryptionRequired(true);
        builder.setUserAuthenticationRequired(false);
        KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
        Intrinsics.g(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.g(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }
}
