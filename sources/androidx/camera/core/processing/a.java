package androidx.camera.core.processing;

import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.authentication.ParameterBuilder;
import com.auth0.android.authentication.storage.CredentialsManager;
import com.auth0.android.authentication.storage.CredentialsManager$awaitCredentials$6$1;
import com.auth0.android.authentication.storage.CredentialsManagerException;
import com.auth0.android.authentication.storage.SharedPreferencesStorage;
import com.auth0.android.request.HttpMethod;
import com.auth0.android.request.internal.BaseRequest;
import com.auth0.android.request.internal.GsonAdapter;
import com.auth0.android.request.internal.RequestFactory;
import com.auth0.android.result.Credentials;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.utils.DwellEventListener;
import me.oriient.ipssdk.realtime.utils.models.ProximityTrigger;
import me.oriient.ipssdk.realtime.utils.models.Region;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, CallbackToFutureAdapter.Completer completer) {
        this.d = 0;
        Map map = Collections.EMPTY_MAP;
        this.h = defaultSurfaceProcessor;
        this.e = dynamicRange;
        this.f = map;
        this.g = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.h;
                DynamicRange dynamicRange = (DynamicRange) this.e;
                Map map = Collections.EMPTY_MAP;
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.g;
                try {
                    defaultSurfaceProcessor.d.e(dynamicRange);
                    completer.b(null);
                    return;
                } catch (RuntimeException e) {
                    completer.d(e);
                    return;
                }
            case 1:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.h;
                DynamicRange dynamicRange2 = (DynamicRange) this.e;
                Map map2 = Collections.EMPTY_MAP;
                CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) this.g;
                try {
                    dualSurfaceProcessor.d.e(dynamicRange2);
                    completer2.b(null);
                    return;
                } catch (RuntimeException e2) {
                    completer2.d(e2);
                    return;
                }
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.h;
                AudioSink.Listener listener = (AudioSink.Listener) this.e;
                Handler handler = (Handler) this.f;
                AudioSink.AudioTrackConfig audioTrackConfig = (AudioSink.AudioTrackConfig) this.g;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (listener != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.camera.core.impl.utils.futures.e(13, listener, audioTrackConfig));
                    }
                    synchronized (DefaultAudioSink.j0) {
                        try {
                            int i = DefaultAudioSink.l0 - 1;
                            DefaultAudioSink.l0 = i;
                            if (i == 0) {
                                DefaultAudioSink.k0.shutdown();
                                DefaultAudioSink.k0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (listener != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.camera.core.impl.utils.futures.e(13, listener, audioTrackConfig));
                    }
                    synchronized (DefaultAudioSink.j0) {
                        try {
                            int i2 = DefaultAudioSink.l0 - 1;
                            DefaultAudioSink.l0 = i2;
                            if (i2 == 0) {
                                DefaultAudioSink.k0.shutdown();
                                DefaultAudioSink.k0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 3:
                CredentialsManager credentialsManager = (CredentialsManager) this.h;
                CredentialsManager$awaitCredentials$6$1 credentialsManager$awaitCredentials$6$1 = (CredentialsManager$awaitCredentials$6$1) this.e;
                Map map3 = (Map) this.f;
                Map map4 = (Map) this.g;
                SharedPreferencesStorage sharedPreferencesStorage = credentialsManager.b;
                String strC = sharedPreferencesStorage.c("com.auth0.access_token");
                String strC2 = sharedPreferencesStorage.c("com.auth0.refresh_token");
                String strC3 = sharedPreferencesStorage.c("com.auth0.id_token");
                String strC4 = sharedPreferencesStorage.c("com.auth0.token_type");
                Long lB = sharedPreferencesStorage.b();
                String strC5 = sharedPreferencesStorage.c("com.auth0.scope");
                if ((TextUtils.isEmpty(strC) && TextUtils.isEmpty(strC3)) || lB == null) {
                    credentialsManager$awaitCredentials$6$1.a(new CredentialsManagerException("No Credentials were previously set.", null));
                    return;
                }
                long j = 0;
                if (!credentialsManager.a(lB.longValue(), j)) {
                    if (strC3 == null) {
                        strC3 = "";
                    }
                    credentialsManager$awaitCredentials$6$1.onSuccess(new Credentials(strC3, strC == null ? "" : strC, strC4 == null ? "" : strC4, strC2, new Date(lB.longValue()), strC5));
                    return;
                }
                if (strC2 == null) {
                    credentialsManager$awaitCredentials$6$1.a(new CredentialsManagerException("Credentials need to be renewed but no Refresh Token is available to renew them.", null));
                    return;
                }
                AuthenticationAPIClient authenticationAPIClient = credentialsManager.f13656a;
                ParameterBuilder parameterBuilderA = ParameterBuilder.Companion.a();
                Auth0 auth0 = authenticationAPIClient.f13651a;
                parameterBuilderA.c(auth0.f13650a);
                parameterBuilderA.b("refresh_token", strC2);
                parameterBuilderA.b("grant_type", "refresh_token");
                Map mapQ = MapsKt.q(parameterBuilderA.f13653a);
                HttpUrl.Companion companion = HttpUrl.j;
                String strValueOf = String.valueOf(auth0.b);
                companion.getClass();
                HttpUrl.Builder builderG = HttpUrl.Companion.c(strValueOf).g();
                builderG.b("oauth");
                builderG.b("token");
                HttpUrl httpUrlD = builderG.d();
                GsonAdapter gsonAdapter = new GsonAdapter(authenticationAPIClient.c);
                RequestFactory requestFactory = authenticationAPIClient.b;
                String url = httpUrlD.i;
                requestFactory.getClass();
                Intrinsics.h(url, "url");
                BaseRequest baseRequestA = requestFactory.a(HttpMethod.POST.f13678a, url, gsonAdapter, requestFactory.b);
                baseRequestA.b(mapQ);
                baseRequestA.b(map3);
                for (Map.Entry entry : map4.entrySet()) {
                    baseRequestA.a((String) entry.getKey(), (String) entry.getValue());
                }
                try {
                    Credentials credentials = (Credentials) baseRequestA.c();
                    long time = credentials.getExpiresAt().getTime();
                    if (credentialsManager.a(time, j)) {
                        credentialsManager$awaitCredentials$6$1.a(new CredentialsManagerException(String.format(Locale.getDefault(), "The lifetime of the renewed Access Token (%d) is less than the minTTL requested (%d). Increase the 'Token Expiration' setting of your Auth0 API in the dashboard, or request a lower minTTL.", Arrays.copyOf(new Object[]{Long.valueOf(((time - System.currentTimeMillis()) - 0) / (-1000)), 0}, 2)), null));
                        return;
                    }
                    if (!TextUtils.isEmpty(credentials.getRefreshToken())) {
                        strC2 = credentials.getRefreshToken();
                    }
                    Credentials credentials2 = new Credentials(credentials.getIdToken(), credentials.getAccessToken(), credentials.getType(), strC2, credentials.getExpiresAt(), credentials.getScope());
                    credentialsManager.d(credentials2);
                    credentialsManager$awaitCredentials$6$1.onSuccess(credentials2);
                    return;
                } catch (AuthenticationException e3) {
                    credentialsManager$awaitCredentials$6$1.a(new CredentialsManagerException("An error occurred while trying to use the Refresh Token to renew the Credentials.", e3));
                    return;
                }
            case 4:
                TwaLauncher twaLauncher = (TwaLauncher) this.h;
                TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder = (TrustedWebActivityIntentBuilder) this.e;
                SplashScreenStrategy splashScreenStrategy = (SplashScreenStrategy) this.f;
                Runnable runnable = (Runnable) this.g;
                CustomTabsSession customTabsSession = twaLauncher.f;
                if (customTabsSession == null) {
                    throw new IllegalStateException("mSession is null in launchWhenSessionEstablished");
                }
                if (splashScreenStrategy != null) {
                    splashScreenStrategy.a(trustedWebActivityIntentBuilder, customTabsSession, new g(twaLauncher, trustedWebActivityIntentBuilder, runnable, 16));
                    return;
                } else {
                    twaLauncher.b(trustedWebActivityIntentBuilder, runnable);
                    return;
                }
            case 5:
                TwaLauncher twaLauncher2 = (TwaLauncher) this.h;
                ((TwaLauncher.FallbackStrategy) this.e).h(twaLauncher2.f14785a, (TrustedWebActivityIntentBuilder) this.f, twaLauncher2.b, (Runnable) this.g);
                return;
            default:
                ProximityTrigger.TriggerEventDwell.a((ProximityTrigger) this.h, (Region) this.e, (ProximityTrigger.TriggerEventDwell) this.f, (DwellEventListener) this.g);
                return;
        }
    }

    public /* synthetic */ a(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange, CallbackToFutureAdapter.Completer completer) {
        this.d = 1;
        Map map = Collections.EMPTY_MAP;
        this.h = dualSurfaceProcessor;
        this.e = dynamicRange;
        this.f = map;
        this.g = completer;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.h = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }
}
