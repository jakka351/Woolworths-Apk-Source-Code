package au.com.woolworths.android.onesite.featuretoggles;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.interop.e;
import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManagerBaseImpl;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class FeatureToggleManagerBaseImpl implements FeatureToggleManager {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseRepository f4254a;
    public final ConnectionManager b;
    public final Set c;
    public final long d;
    public final FirebaseRemoteConfig e;
    public final MutableStateFlow f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final WeakHashMap k;
    public final WeakHashMap l;
    public boolean m;
    public final MutableStateFlow n;
    public final MutableStateFlow o;

    public FeatureToggleManagerBaseImpl(Application application, Set allFeatures, Set remoteConfigs, FirebaseRepository firebaseRepository, ConnectionManager connectionManager) throws Throwable {
        Intrinsics.h(allFeatures, "allFeatures");
        Intrinsics.h(remoteConfigs, "remoteConfigs");
        Intrinsics.h(firebaseRepository, "firebaseRepository");
        Intrinsics.h(connectionManager, "connectionManager");
        this.f4254a = firebaseRepository;
        this.b = connectionManager;
        this.c = allFeatures;
        FirebaseRemoteConfig firebaseRemoteConfigC = ((RemoteConfigComponent) FirebaseApp.d().b(RemoteConfigComponent.class)).c("firebase");
        Intrinsics.g(firebaseRemoteConfigC, "getInstance(...)");
        this.e = firebaseRemoteConfigC;
        this.f = StateFlowKt.a(EmptyList.d);
        Set<Feature> set = allFeatures;
        int iH = MapsKt.h(CollectionsKt.s(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Feature feature : set) {
            linkedHashMap.put(feature.c(), Boolean.valueOf(feature.getDefaultValue()));
        }
        this.g = MapsKt.s(linkedHashMap);
        Set<RemoteConfig> set2 = remoteConfigs;
        int iH2 = MapsKt.h(CollectionsKt.s(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
        for (RemoteConfig remoteConfig : set2) {
            linkedHashMap2.put(remoteConfig.getD(), remoteConfig.getDefaultValue());
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(linkedHashMap2);
        this.h = linkedHashMapS;
        this.i = MapsKt.s(this.g);
        this.j = MapsKt.s(linkedHashMapS);
        this.k = new WeakHashMap();
        this.l = new WeakHashMap();
        PackageManager packageManager = application.getPackageManager();
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(application.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(application.getPackageName(), 0);
        String str = packageInfo.versionName;
        this.d = packageInfo.getLongVersionCode();
        i();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RemoteConfigSyncState.d);
        this.n = mutableStateFlowA;
        this.o = mutableStateFlowA;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow a(Feature feature) {
        String strC = feature.c();
        WeakHashMap weakHashMap = this.k;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) weakHashMap.get(strC);
        if (mutableStateFlow != null) {
            return mutableStateFlow;
        }
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(Boolean.valueOf(h(feature, true)));
        weakHashMap.put(strC, mutableStateFlowA);
        return mutableStateFlowA;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void activate() {
        for (Map.Entry entry : this.e.c().entrySet()) {
            Object key = entry.getKey();
            LinkedHashMap linkedHashMap = this.i;
            if (((Boolean) linkedHashMap.get(key)) != null) {
                linkedHashMap.put(entry.getKey(), Boolean.valueOf(((FirebaseRemoteConfigValue) entry.getValue()).asBoolean()));
            }
            Object key2 = entry.getKey();
            LinkedHashMap linkedHashMap2 = this.j;
            if (((String) linkedHashMap2.get(key2)) != null) {
                linkedHashMap2.put(entry.getKey(), ((FirebaseRemoteConfigValue) entry.getValue()).asString());
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow b() {
        RewardsRemoteConfig rewardsRemoteConfig = RewardsRemoteConfig.f;
        WeakHashMap weakHashMap = this.l;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) weakHashMap.get("s_rewards_maintenance_v2");
        if (mutableStateFlow != null) {
            return mutableStateFlow;
        }
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(e(rewardsRemoteConfig, true));
        weakHashMap.put("s_rewards_maintenance_v2", mutableStateFlowA);
        return mutableStateFlowA;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final boolean c(Feature feature) {
        Intrinsics.h(feature, "feature");
        return h(feature, !feature.b());
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void d() {
        this.n.setValue(RemoteConfigSyncState.f);
        FirebaseRemoteConfig firebaseRemoteConfig = this.e;
        firebaseRemoteConfig.b().addOnCompleteListener(new a(this, 0));
        if (this.m) {
            return;
        }
        this.m = true;
        ConfigUpdateListener configUpdateListener = new ConfigUpdateListener() { // from class: au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManagerBaseImpl$fetch$2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public final void a(ConfigUpdate configUpdate) {
                FeatureToggleManagerBaseImpl featureToggleManagerBaseImpl = this.f4255a;
                featureToggleManagerBaseImpl.e.a().addOnCompleteListener(new e(12, featureToggleManagerBaseImpl, configUpdate));
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                this.f4255a.n.setValue(RemoteConfigSyncState.d);
                Timber.f27013a.f(firebaseRemoteConfigException);
            }
        };
        ConfigRealtimeHandler configRealtimeHandler = firebaseRemoteConfig.j;
        synchronized (configRealtimeHandler) {
            configRealtimeHandler.f15767a.add(configUpdateListener);
            configRealtimeHandler.a();
        }
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final String e(RemoteConfig config, boolean z) {
        Intrinsics.h(config, "config");
        if (this.d != this.f4254a.b()) {
            String str = (String) this.h.get(config.getD());
            if (str != null) {
                return str;
            }
            f(config);
            return config.getDefaultValue();
        }
        if (z) {
            return RemoteConfigKt.a(this.e, config.getD()).asString();
        }
        String str2 = (String) this.j.get(config.getD());
        if (str2 != null) {
            return str2;
        }
        f(config);
        return config.getDefaultValue();
    }

    public final void f(RemoteConfig remoteConfig) {
        Timber.f27013a.o("No default or cached value found for config: " + remoteConfig, new Object[0]);
        this.h.put(remoteConfig.getD(), remoteConfig.getDefaultValue());
        this.j.put(remoteConfig.getD(), remoteConfig.getDefaultValue());
        i();
    }

    public final void g(Feature feature) {
        Timber.f27013a.o("No default or cached value found for feature: " + feature, new Object[0]);
        this.g.put(feature.c(), Boolean.valueOf(feature.getDefaultValue()));
        this.i.put(feature.c(), Boolean.valueOf(feature.getDefaultValue()));
        i();
    }

    public final boolean h(Feature feature, boolean z) {
        Intrinsics.h(feature, "feature");
        if (this.d != this.f4254a.b()) {
            Boolean bool = (Boolean) this.g.get(feature.c());
            if (bool != null) {
                return bool.booleanValue();
            }
            g(feature);
            return feature.getDefaultValue();
        }
        if (z) {
            return RemoteConfigKt.a(this.e, feature.c()).asBoolean();
        }
        Boolean bool2 = (Boolean) this.i.get(feature.c());
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        g(feature);
        return feature.getDefaultValue();
    }

    public final void i() {
        Task taskForResult;
        LinkedHashMap linkedHashMapM = MapsKt.m(this.g, this.h);
        FirebaseRemoteConfig firebaseRemoteConfig = this.e;
        firebaseRemoteConfig.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry : linkedHashMapM.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            ConfigContainer.Builder builderC = ConfigContainer.c();
            builderC.f15762a = new JSONObject(map);
            taskForResult = firebaseRemoteConfig.e.d(builderC.a()).onSuccessTask(FirebaseExecutors.a(), new com.google.firebase.remoteconfig.a(0));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            taskForResult = Tasks.forResult(null);
        }
        taskForResult.addOnCompleteListener(new a(this, 2));
    }
}
