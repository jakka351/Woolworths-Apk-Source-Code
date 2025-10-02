package com.auth0.android.authentication.storage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.result.Credentials;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/authentication/storage/CredentialsManager;", "Lcom/auth0/android/authentication/storage/BaseCredentialsManager;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CredentialsManager extends BaseCredentialsManager {
    public final ExecutorService d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/auth0/android/authentication/storage/CredentialsManager$Companion;", "", "", "KEY_ACCESS_TOKEN", "Ljava/lang/String;", "KEY_EXPIRES_AT", "KEY_ID_TOKEN", "KEY_REFRESH_TOKEN", "KEY_SCOPE", "KEY_TOKEN_TYPE", "LEGACY_KEY_CACHE_EXPIRES_AT", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public CredentialsManager(AuthenticationAPIClient authenticationAPIClient, SharedPreferencesStorage sharedPreferencesStorage) {
        JWTDecoder jWTDecoder = new JWTDecoder();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        super(authenticationAPIClient, sharedPreferencesStorage, jWTDecoder);
        this.d = executorServiceNewSingleThreadExecutor;
    }

    public final void b() {
        SharedPreferencesStorage sharedPreferencesStorage = this.b;
        sharedPreferencesStorage.a("com.auth0.access_token");
        sharedPreferencesStorage.a("com.auth0.refresh_token");
        sharedPreferencesStorage.a("com.auth0.id_token");
        sharedPreferencesStorage.a("com.auth0.token_type");
        sharedPreferencesStorage.a("com.auth0.expires_at");
        sharedPreferencesStorage.a("com.auth0.scope");
        sharedPreferencesStorage.a("com.auth0.cache_expires_at");
    }

    public final boolean c() {
        SharedPreferencesStorage sharedPreferencesStorage = this.b;
        String strC = sharedPreferencesStorage.c("com.auth0.access_token");
        String strC2 = sharedPreferencesStorage.c("com.auth0.refresh_token");
        String strC3 = sharedPreferencesStorage.c("com.auth0.id_token");
        Long lB = sharedPreferencesStorage.b();
        if ((TextUtils.isEmpty(strC) && TextUtils.isEmpty(strC3)) || lB == null) {
            return false;
        }
        return (a(lB.longValue(), 0L) && strC2 == null) ? false : true;
    }

    public final void d(Credentials credentials) {
        SharedPreferencesStorage sharedPreferencesStorage = this.b;
        SharedPreferences sharedPreferences = sharedPreferencesStorage.f13658a;
        Intrinsics.h(credentials, "credentials");
        if (TextUtils.isEmpty(credentials.getAccessToken()) && TextUtils.isEmpty(credentials.getIdToken())) {
            throw new CredentialsManagerException("Credentials must have a valid date of expiration and a valid access_token or id_token value.", null);
        }
        sharedPreferencesStorage.d("com.auth0.access_token", credentials.getAccessToken());
        sharedPreferencesStorage.d("com.auth0.refresh_token", credentials.getRefreshToken());
        sharedPreferencesStorage.d("com.auth0.id_token", credentials.getIdToken());
        sharedPreferencesStorage.d("com.auth0.token_type", credentials.getType());
        sharedPreferences.edit().putLong("com.auth0.expires_at", credentials.getExpiresAt().getTime()).apply();
        sharedPreferencesStorage.d("com.auth0.scope", credentials.getScope());
        sharedPreferences.edit().putLong("com.auth0.cache_expires_at", credentials.getExpiresAt().getTime()).apply();
    }
}
