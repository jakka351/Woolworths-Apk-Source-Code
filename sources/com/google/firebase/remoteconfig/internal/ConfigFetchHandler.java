package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.work.d;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ConfigFetchHandler {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseInstallationsApi f15763a;
    public final Provider b;
    public final Executor c;
    public final Clock d;
    public final Random e;
    public final ConfigCacheClient f;
    public final ConfigFetchHttpClient g;
    public final ConfigSharedPrefsClient h;
    public final Map i;

    /* loaded from: classes6.dex */
    public static class FetchResponse {

        /* renamed from: a, reason: collision with root package name */
        public final int f15764a;
        public final ConfigContainer b;
        public final String c;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        public FetchResponse(int i, ConfigContainer configContainer, String str) {
            this.f15764a = i;
            this.b = configContainer;
            this.c = str;
        }

        public static FetchResponse a(ConfigContainer configContainer) {
            return new FetchResponse(1, configContainer, null);
        }

        public static FetchResponse b(ConfigContainer configContainer, String str) {
            return new FetchResponse(0, configContainer, str);
        }

        public static FetchResponse c() {
            return new FetchResponse(2, null, null);
        }

        public final ConfigContainer d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final int f() {
            return this.f15764a;
        }
    }

    public enum FetchType {
        /* JADX INFO: Fake field, exist only in values array */
        BASE("BASE"),
        /* JADX INFO: Fake field, exist only in values array */
        REALTIME("REALTIME");

        FetchType(String str) {
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, HashMap map) {
        this.f15763a = firebaseInstallationsApi;
        this.b = provider;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = configCacheClient;
        this.g = configFetchHttpClient;
        this.h = configSharedPrefsClient;
        this.i = map;
    }

    public final FetchResponse a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.g;
            HashMap mapD = d();
            String string = this.h.f15770a.getString("last_fetch_etag", null);
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.b.get();
            FetchResponse fetchResponseFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, analyticsConnector != null ? (Long) analyticsConnector.g(true).get("_fot") : null, date, this.h.b());
            if (fetchResponseFetch.d() != null) {
                ConfigSharedPrefsClient configSharedPrefsClient = this.h;
                long j2 = fetchResponseFetch.d().f;
                synchronized (configSharedPrefsClient.b) {
                    configSharedPrefsClient.f15770a.edit().putLong("last_template_version", j2).apply();
                }
            }
            if (fetchResponseFetch.e() != null) {
                ConfigSharedPrefsClient configSharedPrefsClient2 = this.h;
                String strE = fetchResponseFetch.e();
                synchronized (configSharedPrefsClient2.b) {
                    configSharedPrefsClient2.f15770a.edit().putString("last_fetch_etag", strE).apply();
                }
            }
            this.h.d(0, ConfigSharedPrefsClient.f);
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.d;
            ConfigSharedPrefsClient configSharedPrefsClient3 = this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = configSharedPrefsClient3.a().f15771a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = k;
                configSharedPrefsClient3.d(i2, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.e.nextInt((int) r3)));
            }
            ConfigSharedPrefsClient.BackoffMetadata backoffMetadataA = configSharedPrefsClient3.a();
            int i3 = e.d;
            if (backoffMetadataA.f15771a > 1 || i3 == 429) {
                backoffMetadataA.b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e.d, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task b(Task task, long j2, HashMap map) {
        Task taskContinueWithTask;
        boolean zBefore;
        Date date = new Date(this.d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        ConfigSharedPrefsClient configSharedPrefsClient = this.h;
        if (zIsSuccessful) {
            Date date2 = new Date(configSharedPrefsClient.f15770a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(ConfigSharedPrefsClient.e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(FetchResponse.c());
            }
        }
        Date date3 = configSharedPrefsClient.a().b;
        if (!date.before(date3)) {
            date3 = null;
        }
        Executor executor = this.c;
        if (date3 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date3.getTime() - date.getTime()));
            date3.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            FirebaseInstallationsApi firebaseInstallationsApi = this.f15763a;
            Task id = firebaseInstallationsApi.getId();
            Task taskA = firebaseInstallationsApi.a();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, taskA}).continueWithTask(executor, new androidx.work.b(this, id, taskA, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new d(5, this, date));
    }

    public final Task c(int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f.b().continueWithTask(this.c, new au.com.woolworths.product.details.b(9, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.b.get();
        if (analyticsConnector != null) {
            for (Map.Entry entry : analyticsConnector.g(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
