package me.oriient.ipssdk.base.remoteconfig;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.SnappingConfigResponse;
import me.oriient.internal.services.dataModel.auth.AuthConfigResponse;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.EngineConfigResponse;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfigResponse;
import me.oriient.internal.services.dataModel.navigation.NavigationConfigResponse;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfigResponse;
import me.oriient.internal.services.dataModel.plai.PlaiConfigResponse;
import me.oriient.internal.services.dataModel.positioning.PositioningConfigResponse;
import me.oriient.internal.services.dataModel.sensors.SensorsConfigResponse;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.responses.ProximityConfigResponse;
import me.oriient.ipssdk.base.remoteconfig.responses.RemoteConfigResponse;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigManagerImpl;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigManager;", "<init>", "()V", "Lme/oriient/ipssdk/base/auth/User;", "user", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "refresh", "(Lme/oriient/ipssdk/base/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "buildingId", "getEngineConfig", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfig;", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getConfig", "()Lkotlinx/coroutines/flow/MutableStateFlow;", MlModel.MODEL_FILE_SUFFIX, "g", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "getDefaultEngineConfig", "()Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "setDefaultEngineConfig", "(Lme/oriient/internal/services/dataModel/engine/EngineConfig;)V", "defaultEngineConfig", "Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "getCommonConfig", "()Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "commonConfig", "Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "getRealTimeConfig", "()Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "realTimeConfig", "Companion", "me/oriient/ipssdk/base/remoteconfig/a", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RemoteConfigManagerImpl implements RemoteConfigManager {

    @NotNull
    private static final a Companion = new a();

    @Deprecated
    @NotNull
    public static final String PREF_KEY = "pref_key_remote_config";

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25701a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;

    /* renamed from: f, reason: from kotlin metadata */
    private final MutableStateFlow config;

    /* renamed from: g, reason: from kotlin metadata */
    private EngineConfig defaultEngineConfig;
    private LinkedHashMap h;

    public RemoteConfigManagerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25701a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigRest.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PersistentStorage.class));
        this.c = lazyInject;
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.config = StateFlowKt.a(new RemoteConfigResponse((Boolean) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Double) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Float) null, (Float) null, (Float) null, (Float) null, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Float) null, (Float) null, (Float) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Float) null, (Boolean) null, (Integer) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Double) null, (Boolean) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (Integer) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (Boolean) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Boolean) null, (Double) null, (Long) null, (Boolean) null, (Double) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (SensorsConfigResponse) null, (Boolean) null, (EngineConfigResponse) null, (String) null, (String) null, (Double) null, (NavigationConfigResponse) null, (Boolean) null, (AuthConfigResponse) null, (GeofenceConfigResponse) null, (PositioningConfigResponse) null, (TurnByTurnConfigResponse) null, (ProximityConfigResponse) null, (SnappingConfigResponse) null, (PlaiConfigResponse) null, -1, -1, 536870911, (DefaultConstructorMarker) null).toRemoteConfig());
        this.h = new LinkedHashMap();
        Object asJson = null;
        String string = ((PersistentStorage) lazyInject.getD()).getString(PREF_KEY, null);
        if (string != null) {
            try {
                asJson = JsonSerializationKt.parseAsJson(string, Reflection.b(RemoteConfigResponse.class));
            } catch (Throwable unused) {
            }
            RemoteConfigResponse remoteConfigResponse = (RemoteConfigResponse) asJson;
            if (remoteConfigResponse != null) {
                a(remoteConfigResponse);
            }
        }
    }

    private final Outcome a(RemoteConfigResponse remoteConfigResponse) {
        EngineConfig engineConfig;
        List<String> buildingIds;
        RemoteConfig remoteConfig = remoteConfigResponse.toRemoteConfig();
        EngineConfigResponse engine = remoteConfigResponse.getEngine();
        if (engine == null || (engineConfig = engine.toEngineConfig(remoteConfig.getExtraEngineConfigs())) == null) {
            return new Outcome.Failure(new Exception("config response is not valid"));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<EngineConfigResponse> customConfigs = remoteConfigResponse.getEngine().getCustomConfigs();
        if (customConfigs != null) {
            for (EngineConfigResponse engineConfigResponse : customConfigs) {
                EngineConfig engineConfig2 = engineConfigResponse.toEngineConfig(remoteConfig.getExtraEngineConfigs());
                if (engineConfig2 != null && (buildingIds = engineConfigResponse.getBuildingIds()) != null) {
                    Iterator<T> it = buildingIds.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put((String) it.next(), engineConfig2);
                    }
                }
            }
        }
        setDefaultEngineConfig(engineConfig);
        this.h = linkedHashMap;
        getConfig().setValue(remoteConfig);
        BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) this.e.getD()).getDefault()), null, null, new b(this, remoteConfig, null), 3);
        ((Logger) this.f25701a.getD()).d("RemoteConfigManager", "onNewConfig() returned: " + engineConfig);
        return new Outcome.Success(engineConfig);
    }

    public static final InternalConfigManager access$getInternalConfigManager(RemoteConfigManagerImpl remoteConfigManagerImpl) {
        return (InternalConfigManager) remoteConfigManagerImpl.d.getD();
    }

    public static final RemoteConfigRest access$getRemoteConfigRest(RemoteConfigManagerImpl remoteConfigManagerImpl) {
        return (RemoteConfigRest) remoteConfigManagerImpl.b.getD();
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @NotNull
    public CommonConfig getCommonConfig() {
        return ((RemoteConfig) getConfig().getValue()).getCommon();
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @Nullable
    public EngineConfig getDefaultEngineConfig() {
        return this.defaultEngineConfig;
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @Nullable
    public Object getEngineConfig(@Nullable String str, @NotNull Continuation<? super EngineConfig> continuation) {
        boolean z = str == null;
        if (z) {
            return getDefaultEngineConfig();
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        EngineConfig engineConfig = (EngineConfig) this.h.get(str);
        return engineConfig == null ? getDefaultEngineConfig() : engineConfig;
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @NotNull
    public RealTimeConfig getRealTimeConfig() {
        return ((RemoteConfig) getConfig().getValue()).getRealTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object refresh(@org.jetbrains.annotations.NotNull me.oriient.ipssdk.base.auth.User r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.internal.services.dataModel.engine.EngineConfig, java.lang.Exception>> r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.base.remoteconfig.RemoteConfigManagerImpl.refresh(me.oriient.ipssdk.base.auth.User, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void setDefaultEngineConfig(@Nullable EngineConfig engineConfig) {
        this.defaultEngineConfig = engineConfig;
    }

    @Override // me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager
    @NotNull
    public MutableStateFlow<RemoteConfig> getConfig() {
        return this.config;
    }
}
