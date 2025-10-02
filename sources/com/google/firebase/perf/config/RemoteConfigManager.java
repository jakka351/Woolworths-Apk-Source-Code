package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final DeviceCacheManager cache;
    private final Executor executor;

    @Nullable
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final AndroidLogger logger = AndroidLogger.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint
    private RemoteConfigManager() {
        this(DeviceCacheManager.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(str);
        if (firebaseRemoteConfigValue.g() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", firebaseRemoteConfigValue.asString(), str);
        return firebaseRemoteConfigValue;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.h("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        firebaseRemoteConfig.b().onSuccessTask(firebaseRemoteConfig.b, new androidx.compose.runtime.snapshots.a(firebaseRemoteConfig, 10)).addOnSuccessListener(this.executor, new a(this)).addOnFailureListener(this.executor, new a(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.c());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new Optional<>();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new Optional<>(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return new Optional<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new Optional<>();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new Optional<>(Double.valueOf(remoteConfigValue.b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return new Optional<>();
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new Optional<>();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new Optional<>(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return new Optional<>();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.asBoolean());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.b());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) remoteConfigValue.asString();
                    }
                    T t2 = (T) remoteConfigValue.asString();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (!remoteConfigValue.asString().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.a());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new Optional<>();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new Optional<>(remoteConfigValue.asString()) : new Optional<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Provider<RemoteConfigComponent> provider;
        RemoteConfigComponent remoteConfigComponent;
        if (this.firebaseRemoteConfig == null && (provider = this.firebaseRemoteConfigProvider) != null && (remoteConfigComponent = (RemoteConfigComponent) provider.get()) != null) {
            this.firebaseRemoteConfig = remoteConfigComponent.c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        return firebaseRemoteConfig == null || firebaseRemoteConfig.d().f15774a == 1 || this.firebaseRemoteConfig.d().f15774a == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable Provider<RemoteConfigComponent> provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        ConfigurationConstants.ExperimentTTID experimentTTIDD = ConfigurationConstants.ExperimentTTID.d();
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap = this.allRcConfigMap;
        experimentTTIDD.getClass();
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (firebaseRemoteConfigValue == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", firebaseRemoteConfigValue.asBoolean());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(DeviceCacheManager deviceCacheManager, Executor executor, FirebaseRemoteConfig firebaseRemoteConfig, long j) {
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = deviceCacheManager;
        this.executor = executor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        if (firebaseRemoteConfig == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig.c());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
