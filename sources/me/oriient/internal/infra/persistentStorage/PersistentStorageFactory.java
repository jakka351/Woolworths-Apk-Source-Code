package me.oriient.internal.infra.persistentStorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.Keep;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import androidx.security.crypto.MasterKeys;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lme/oriient/internal/infra/persistentStorage/PersistentStorageFactory;", "", "()V", "create", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "context", "Landroid/content/Context;", "createEncrypted", "createInMemory", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PersistentStorageFactory {

    @NotNull
    public static final PersistentStorageFactory INSTANCE = new PersistentStorageFactory();

    private PersistentStorageFactory() {
    }

    @NotNull
    public final PersistentStorage create(@NotNull Context context) {
        Intrinsics.h(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return new a(defaultSharedPreferences);
    }

    @NotNull
    public final PersistentStorage createEncrypted(@NotNull Context context) throws GeneralSecurityException, IOException {
        Intrinsics.h(context, "context");
        MasterKey.Builder builder = new MasterKey.Builder(context, context.getPackageName() + ".oriient_encrypted_prefs_keyAlias");
        if (builder.b != null) {
            throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
        }
        MasterKey.KeyScheme keyScheme = MasterKey.KeyScheme.d;
        builder.c = keyScheme;
        String str = context.getPackageName() + ".oriient_encrypted_prefs";
        MasterKey.KeyScheme keyScheme2 = builder.c;
        if (keyScheme2 == null && builder.b == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (keyScheme2 == keyScheme) {
            builder.b = new KeyGenParameterSpec.Builder(builder.f3759a, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = builder.b;
        if (keyGenParameterSpec != null) {
            return new a(EncryptedSharedPreferences.a(str, MasterKeys.a(keyGenParameterSpec), context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.e, EncryptedSharedPreferences.PrefValueEncryptionScheme.e));
        }
        throw new NullPointerException("KeyGenParameterSpec was null after build() check");
    }

    @NotNull
    public final PersistentStorage createInMemory() {
        return new InMemoryStorage();
    }
}
