package com.auth0.android.authentication.storage;

import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.util.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/authentication/storage/BaseCredentialsManager;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class BaseCredentialsManager {

    /* renamed from: a, reason: collision with root package name */
    public final AuthenticationAPIClient f13656a;
    public final SharedPreferencesStorage b;
    public final Clock c = new ClockImpl();

    public BaseCredentialsManager(AuthenticationAPIClient authenticationAPIClient, SharedPreferencesStorage sharedPreferencesStorage, JWTDecoder jWTDecoder) {
        this.f13656a = authenticationAPIClient;
        this.b = sharedPreferencesStorage;
    }

    public final boolean a(long j, long j2) {
        if (j <= 0) {
            return false;
        }
        return j <= (j2 * ((long) 1000)) + System.currentTimeMillis();
    }
}
