package au.com.woolworths.shop.auth.keycloak.data;

import au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakCredentialException;
import au.com.woolworths.shop.auth.keycloak.exception.PkceException;
import au.com.woolworths.shop.auth.keycloak.model.KeycloakCredentials;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakApiService;", "", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class KeycloakApiService {

    /* renamed from: a, reason: collision with root package name */
    public final KeycloakAuthParameters f10238a;
    public final boolean b;
    public final CoroutineDispatcher c;
    public final Json d;
    public final Lazy e;
    public final Lazy f;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakApiService$Companion;", "", "", "HTTP_TIMEOUT_DURATION_SECONDS", "J", "", "FORM_DATA_CLIENT_ID", "Ljava/lang/String;", "FORM_DATA_REDIRECT_URI", "FORM_DATA_GRANT_TYPE", "FORM_DATA_CODE_VERIFIER", "FORM_DATA_CODE", "FORM_DATA_REFRESH_TOKEN", "", "RESPONSE_CODE_400", "I", "RESPONSE_CODE_499", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public KeycloakApiService(KeycloakAuthParameters keycloakAuthParameters, boolean z) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler dispatcher = DefaultIoScheduler.f;
        Intrinsics.h(dispatcher, "dispatcher");
        this.f10238a = keycloakAuthParameters;
        this.b = z;
        this.c = dispatcher;
        this.d = JsonKt.a(new au.com.woolworths.shop.aem.components.ui.merchcard.a(14));
        final int i = 0;
        this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.auth.keycloak.data.a
            public final /* synthetic */ KeycloakApiService e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KeycloakApiService keycloakApiService = this.e;
                        Headers.Builder builder = new Headers.Builder();
                        for (Map.Entry entry : keycloakApiService.f10238a.m.entrySet()) {
                            builder.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        return builder.e();
                    default:
                        KeycloakApiService keycloakApiService2 = this.e;
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
                        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.f;
                        if (!keycloakApiService2.b) {
                            level = null;
                        }
                        if (level == null) {
                            level = HttpLoggingInterceptor.Level.d;
                        }
                        httpLoggingInterceptor.d = level;
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        Duration durationOfSeconds = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds, "ofSeconds(...)");
                        builder2.b(durationOfSeconds);
                        Duration durationOfSeconds2 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds2, "ofSeconds(...)");
                        long millis = durationOfSeconds2.toMillis();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        builder2.d(millis, timeUnit);
                        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds3, "ofSeconds(...)");
                        builder2.c(durationOfSeconds3.toMillis(), timeUnit);
                        Duration durationOfSeconds4 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds4, "ofSeconds(...)");
                        builder2.e(durationOfSeconds4.toMillis(), timeUnit);
                        builder2.a(httpLoggingInterceptor);
                        return new OkHttpClient(builder2);
                }
            }
        });
        final int i2 = 1;
        this.f = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.auth.keycloak.data.a
            public final /* synthetic */ KeycloakApiService e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KeycloakApiService keycloakApiService = this.e;
                        Headers.Builder builder = new Headers.Builder();
                        for (Map.Entry entry : keycloakApiService.f10238a.m.entrySet()) {
                            builder.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        return builder.e();
                    default:
                        KeycloakApiService keycloakApiService2 = this.e;
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
                        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.f;
                        if (!keycloakApiService2.b) {
                            level = null;
                        }
                        if (level == null) {
                            level = HttpLoggingInterceptor.Level.d;
                        }
                        httpLoggingInterceptor.d = level;
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        Duration durationOfSeconds = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds, "ofSeconds(...)");
                        builder2.b(durationOfSeconds);
                        Duration durationOfSeconds2 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds2, "ofSeconds(...)");
                        long millis = durationOfSeconds2.toMillis();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        builder2.d(millis, timeUnit);
                        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds3, "ofSeconds(...)");
                        builder2.c(durationOfSeconds3.toMillis(), timeUnit);
                        Duration durationOfSeconds4 = Duration.ofSeconds(30L);
                        Intrinsics.g(durationOfSeconds4, "ofSeconds(...)");
                        builder2.e(durationOfSeconds4.toMillis(), timeUnit);
                        builder2.a(httpLoggingInterceptor);
                        return new OkHttpClient(builder2);
                }
            }
        });
    }

    public final Object a(String str, Continuation continuation) {
        return BuildersKt.f(this.c, new KeycloakApiService$postPkce$2(this, str, null), continuation);
    }

    public final KeycloakCredentials b(String str, boolean z) {
        try {
            Json json = this.d;
            json.getClass();
            return (KeycloakCredentials) json.b(KeycloakCredentials.INSTANCE.serializer(), str);
        } catch (SerializationException e) {
            if (z) {
                throw new KeycloakAuthException("Unable to parse PKCE response body.", new PkceException());
            }
            throw new KeycloakCredentialException(e);
        } catch (IllegalArgumentException e2) {
            if (z) {
                throw new KeycloakAuthException("", new PkceException());
            }
            throw new KeycloakCredentialException(e2);
        }
    }
}
