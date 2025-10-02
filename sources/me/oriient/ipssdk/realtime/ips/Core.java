package me.oriient.ipssdk.realtime.ips;

import android.location.Location;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Space;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.internal.services.systemStateManager.UiEvent;
import me.oriient.ipssdk.api.listeners.IPSBuildingListener;
import me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSConnectionStateListener;
import me.oriient.ipssdk.api.listeners.IPSCoordinatesConverterListener;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.api.listeners.IPSLogoutListener;
import me.oriient.ipssdk.api.listeners.IPSMapListener;
import me.oriient.ipssdk.api.models.IPSBuildingLayout;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloorImageData;
import me.oriient.ipssdk.api.models.IPSSpace;
import me.oriient.ipssdk.api.utils.IPSUnavailableFeature;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.services.buildings.BuildingsManager;
import me.oriient.ipssdk.common.services.rest.CancellableRestRequest;
import me.oriient.ipssdk.common.services.rest.services.BuildingsRestService;
import me.oriient.ipssdk.common.utils.CancellableProcess;
import me.oriient.ipssdk.common.utils.IBuildingsSearchListener;
import me.oriient.ipssdk.common.utils.models.BuildingsSearchResultV4;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager;
import me.oriient.ipssdk.realtime.ips.system_state.IpsApplicationEventExtKt;
import me.oriient.ipssdk.realtime.ofs.C1613a0;
import me.oriient.ipssdk.realtime.ofs.C1619b0;
import me.oriient.ipssdk.realtime.ofs.C1625c0;
import me.oriient.ipssdk.realtime.ofs.C1631d0;
import me.oriient.ipssdk.realtime.ofs.Z;
import me.oriient.ipssdk.realtime.utils.models.SensorsUtilsKt;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001`J5\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010!J)\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010$J1\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010%J#\u0010'\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u0004\u0018\u00010\u001c2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020)¢\u0006\u0004\b-\u0010+J%\u00101\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b1\u00102J%\u00103\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020/¢\u0006\u0004\b3\u00102J/\u00107\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u000206¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002090/¢\u0006\u0004\b:\u0010;J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010@¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0013\u0010L\u001a\b\u0012\u0004\u0012\u00020K0<¢\u0006\u0004\bL\u0010?J\r\u0010M\u001a\u00020\u0002¢\u0006\u0004\bM\u0010FJ\r\u0010N\u001a\u00020\u0002¢\u0006\u0004\bN\u0010FJ\u0015\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020K¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010W\u001a\u00020\bH\u0000¢\u0006\u0004\bU\u0010VR\u0017\u0010[\u001a\u00020K8F¢\u0006\f\u0012\u0004\bZ\u0010V\u001a\u0004\bX\u0010YR\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020K0\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006a"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Core;", "Lme/oriient/ipssdk/realtime/ips/ISessionStateListener;", "", "userName", "apiKey", "ipsName", "Lme/oriient/ipssdk/api/listeners/IPSLoginListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "login", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSLoginListener;)V", "Lme/oriient/ipssdk/api/listeners/IPSLogoutListener;", "logout", "(Lme/oriient/ipssdk/api/listeners/IPSLogoutListener;)V", "id", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "setSpaceId", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/ipssdk/api/models/IPSSpace;", "getSpace", "()Lme/oriient/ipssdk/api/models/IPSSpace;", "Lme/oriient/ipssdk/api/listeners/IPSConnectionStateListener;", "addConnectionStateListener", "(Lme/oriient/ipssdk/api/listeners/IPSConnectionStateListener;)V", "removeConnectionStateListener", "Landroid/location/Location;", "location", "Lme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;", "Lme/oriient/ipssdk/api/models/IPSCancelable;", "searchBuildingsByLocation", "(Landroid/location/Location;Lme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "", "radiusMeters", "(Landroid/location/Location;FLme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", h.a.b, h.a.c, "(FFLme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "(FFFLme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "searchBuildingsByName", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/listeners/IPSBuildingListener;", "getBuildingById", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSBuildingListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "buildingClientId", "getBuildingByClientId", "buildingId", "Lme/oriient/ipssdk/api/listeners/IPSListener;", "Lme/oriient/ipssdk/api/models/IPSBuildingLayout;", "getBuildingLayout", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "getClientBuildingId", "floorId", "mapId", "Lme/oriient/ipssdk/api/listeners/IPSMapListener;", "getMapById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSMapListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/models/IPSFloorImageData;", "getFloorMapById", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "", "Lme/oriient/ipssdk/api/utils/IPSUnavailableFeature;", "unavailableFeatures", "()Ljava/util/List;", "Lme/oriient/ipssdk/api/listeners/IPSCoordinatesConverterListener;", "createCoordinatesConverter", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCoordinatesConverterListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "clearAllCaches", "(Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "getLoggedInUser", "()Ljava/lang/String;", "Lme/oriient/positioningengine/common/PositioningEngineState;", "newState", "onSessionStateChanged", "(Lme/oriient/positioningengine/common/PositioningEngineState;)V", "", "getMissingSensors", "getIPSClientId", "getUserSessionId", "applicationEvent", "registerApplicationEvent", "(I)V", "feature", "userDidEngageWithFeature", "(Ljava/lang/String;)V", "evaluateConnectionState$me_oriient_sdk_realtime", "()V", "evaluateConnectionState", "getConnectionState", "()I", "getConnectionState$annotations", "connectionState", "Lkotlinx/coroutines/flow/StateFlow;", "getConnectionStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "connectionStateFlow", "LoginCandidate", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Core implements ISessionStateListener {

    @NotNull
    public static final Core INSTANCE = new Core();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25814a;
    private static final Lazy b;
    private static final Lazy c;
    private static final Lazy d;
    private static final Lazy e;
    private static final Lazy f;
    private static final Lazy g;
    private static final Lazy h;
    private static final Lazy i;
    private static final Lazy j;
    private static final Lazy k;
    private static final Lazy l;
    private static final MutableStateFlow m;
    private static final ArrayList n;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Core$LoginCandidate;", "", "", "userName", "apiKey", "ipsName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lme/oriient/ipssdk/base/auth/User;", "user", "", "isSameAs", "(Lme/oriient/ipssdk/base/auth/User;)Z", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getUserName", "b", "getApiKey", "c", "getIpsName", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoginCandidate {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String userName;

        /* renamed from: b, reason: from kotlin metadata */
        private final String apiKey;

        /* renamed from: c, reason: from kotlin metadata */
        private final String ipsName;

        public LoginCandidate(@NotNull String userName, @NotNull String apiKey, @NotNull String ipsName) {
            Intrinsics.h(userName, "userName");
            Intrinsics.h(apiKey, "apiKey");
            Intrinsics.h(ipsName, "ipsName");
            this.userName = userName;
            this.apiKey = apiKey;
            this.ipsName = ipsName;
        }

        @NotNull
        public final String getApiKey() {
            return this.apiKey;
        }

        @NotNull
        public final String getIpsName() {
            return this.ipsName;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final boolean isSameAs(@Nullable User user) {
            return user != null && Intrinsics.c(this.userName, user.getUserNameJava()) && Intrinsics.c(this.apiKey, user.getApiKeyJava()) && Intrinsics.c(this.ipsName, user.getDomainJava());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("LoginCandidate{userName='");
            sb.append(this.userName);
            sb.append("', ipsName='");
            return YU.a.o(sb, this.ipsName, "'}");
        }
    }

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25814a = di.inject(reflectionFactory.b(Logger.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NetworkManager.class));
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Metric.class));
        e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingsManager.class));
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        j = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        k = DependencyInjectionKt.getDi().inject(reflectionFactory.b(DebugInfoManager.class));
        l = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingCoordinateConverterRepository.class));
        m = StateFlowKt.a(0);
        n = new ArrayList();
        CoreLogic.INSTANCE.addNetworkStateListener(new p());
    }

    private Core() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z) {
        INSTANCE.evaluateConnectionState$me_oriient_sdk_realtime();
    }

    public static final AuthManager access$getAuthManager(Core core) {
        core.getClass();
        return (AuthManager) j.getD();
    }

    public static final BuildingCoordinateConverterRepository access$getBuildingCoordinateConverterRepository(Core core) {
        core.getClass();
        return (BuildingCoordinateConverterRepository) l.getD();
    }

    public static final BuildingRepository access$getBuildingRepository(Core core) {
        core.getClass();
        return (BuildingRepository) i.getD();
    }

    public static final BuildingsManager access$getBuildingsManager(Core core) {
        core.getClass();
        return (BuildingsManager) e.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(Core core) {
        core.getClass();
        return (RemoteConfigManager) g.getD();
    }

    public static final CoroutineContextProvider access$getCoroutineContextProvider(Core core) {
        core.getClass();
        return (CoroutineContextProvider) h.getD();
    }

    public static final DebugInfoManager access$getDebugInfoManager(Core core) {
        core.getClass();
        return (DebugInfoManager) k.getD();
    }

    public static final ELog access$getELog(Core core) {
        core.getClass();
        return (ELog) c.getD();
    }

    public static final Logger access$getLogger(Core core) {
        core.getClass();
        return (Logger) f25814a.getD();
    }

    public static final Metric access$getMetric(Core core) {
        core.getClass();
        return (Metric) d.getD();
    }

    public static final TimeProvider access$getTimeProvider(Core core) {
        core.getClass();
        return (TimeProvider) f.getD();
    }

    public static /* synthetic */ void getConnectionState$annotations() {
    }

    public final void addConnectionStateListener(@Nullable IPSConnectionStateListener listener) {
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "addConnectionStateListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e("Core", "addConnectionStateListener: trying to add null listener!");
            return;
        }
        ArrayList arrayList = n;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final void clearAllCaches(@NotNull IPSCompletionListener listener) {
        Intrinsics.h(listener, "listener");
        boolean allowClearAllCaches = ((RemoteConfigManager) g.getD()).getRealTimeConfig().getMisc().getAllowClearAllCaches();
        ((ELog) c.getD()).api("Core", "clearAllCaches", MapsKt.i(new Pair("allow", Boolean.valueOf(allowClearAllCaches))));
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        if (coreLogic.getUser() == null) {
            ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        } else if (allowClearAllCaches) {
            coreLogic.clearAllCaches(listener);
        } else {
            ValidationService.safeFailListener(listener, new Error("clear caches is not allowed", 0, 2));
        }
    }

    @Nullable
    public final IPSCancelable createCoordinatesConverter(@NotNull String buildingId, @Nullable IPSCoordinatesConverterListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        if (CoreLogic.INSTANCE.getUser() != null) {
            return new CancellableProcess(BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) h.getD()).getIo()), null, null, new Z(buildingId, listener, null), 3));
        }
        ((Logger) f25814a.getD()).e("Core", "createCoordinatesConverter: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    public final void evaluateConnectionState$me_oriient_sdk_realtime() {
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        int i2 = 0;
        if (coreLogic.getUser() == null || coreLogic.isEngineNull()) {
            ((Logger) f25814a.getD()).d("Core", "evaluateConnectionState: Went offline");
            a(0);
            return;
        }
        if (!((Boolean) ((NetworkManager) b.getD()).isConnected().getValue()).booleanValue()) {
            if (coreLogic.isLimitedConnectionSupported()) {
                i2 = 1;
            } else if (!coreLogic.isEngineIdle()) {
                i2 = 2;
            }
            a(i2);
            return;
        }
        if (coreLogic.isEngineIdle()) {
            a(1);
        } else if (getConnectionState() != 2) {
            a(1);
        }
    }

    @Nullable
    public final IPSCancelable getBuildingByClientId(@NotNull String buildingClientId, @NotNull IPSBuildingListener listener) {
        Intrinsics.h(buildingClientId, "buildingClientId");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "getBuildingByClientId() called with: id = [" + buildingClientId + "], listener = [" + listener + ']');
        if (CoreLogic.INSTANCE.getUser() != null) {
            return new CancellableProcess(BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) h.getD()).getIo()), null, null, new C1613a0(buildingClientId, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("Core", "getBuildingById: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    @Nullable
    public final IPSCancelable getBuildingById(@NotNull String id, @NotNull IPSBuildingListener listener) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "getBuildingById() called with: id = [" + id + "], listener = [" + listener + ']');
        if (CoreLogic.INSTANCE.getUser() != null) {
            return new CancellableProcess(BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) h.getD()).getIo()), null, null, new C1619b0(id, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("Core", "getBuildingById: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    @Nullable
    public final IPSCancelable getBuildingLayout(@NotNull String buildingId, @NotNull IPSListener<IPSBuildingLayout> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        return CoreLogic.INSTANCE.getBuildingLayout(buildingId, listener);
    }

    @Nullable
    public final IPSCancelable getClientBuildingId(@NotNull String buildingId, @NotNull IPSListener<String> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "getClientBuildingId() called with: buildingId = " + buildingId + ", listener = " + listener);
        if (CoreLogic.INSTANCE.getUser() != null) {
            return new CancellableProcess(BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) h.getD()).getIo()), null, null, new C1625c0(buildingId, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("Core", "getClientBuildingId: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    public final int getConnectionState() {
        return ((Number) m.getValue()).intValue();
    }

    @NotNull
    public final StateFlow<Integer> getConnectionStateFlow() {
        return m;
    }

    @Nullable
    public final IPSCancelable getFloorMapById(@NotNull String buildingId, @NotNull String floorId, @NotNull IPSListener<IPSFloorImageData> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(listener, "listener");
        return CoreLogic.INSTANCE.getFloorMapById(buildingId, floorId, listener);
    }

    @NotNull
    public final String getIPSClientId() {
        return ((DeviceIdProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(DeviceIdProvider.class))).getDeviceId();
    }

    @Nullable
    public final String getLoggedInUser() {
        User f25787a = ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a();
        if (f25787a != null) {
            return f25787a.getUserNameJava();
        }
        return null;
    }

    @Nullable
    public final IPSCancelable getMapById(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull IPSMapListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(listener, "listener");
        return CoreLogic.INSTANCE.getMapById(buildingId, floorId, mapId, listener);
    }

    @NotNull
    public final List<Integer> getMissingSensors() {
        List<SystemSensor> missingSensors = ((SupportSensorsManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SupportSensorsManager.class))).getMissingSensors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = missingSensors.iterator();
        while (it.hasNext()) {
            Integer numAccess$toIpsSensor = CoreKt.access$toIpsSensor((SystemSensor) it.next());
            if (numAccess$toIpsSensor != null) {
                arrayList.add(numAccess$toIpsSensor);
            }
        }
        return arrayList;
    }

    @Nullable
    public final IPSSpace getSpace() {
        Space space;
        User f25787a = ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a();
        if (f25787a == null || (space = f25787a.getSpace()) == null) {
            return null;
        }
        return OriientSpaceKt.toOriientSpace(space);
    }

    @NotNull
    public final String getUserSessionId() {
        return ((RuntimeDataManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RuntimeDataManager.class))).getUserSession().getId();
    }

    public final void login(@Nullable String userName, @Nullable String apiKey, @Nullable String ipsName, @Nullable final IPSLoginListener listener) {
        Lazy lazy = f25814a;
        Logger logger = (Logger) lazy.getD();
        StringBuilder sbV = YU.a.v("login() called with: userName = [", userName, "], apiKey = [", apiKey, "], ipsName = [");
        sbV.append(ipsName);
        sbV.append("], listener = [");
        sbV.append(listener);
        sbV.append(']');
        logger.d("Core", sbV.toString());
        if (userName == null) {
            userName = "";
        }
        if (apiKey == null || apiKey.length() == 0) {
            ((Logger) lazy.getD()).e("Core", "login: api key is empty!");
            ValidationService.safeFailListener(listener, new Error("Parameter apiKey cannot be empty", 4, 2));
            return;
        }
        if ("".equals(ipsName)) {
            ((Logger) lazy.getD()).e("Core", "login: ips name is empty!");
            ValidationService.safeFailListener(listener, new Error("Parameter ipsName cannot be empty", 4, 2));
            return;
        }
        if (ipsName == null) {
            ipsName = "ips.oriient.me";
        }
        LoginCandidate loginCandidate = new LoginCandidate(userName, apiKey, ipsName);
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        coreLogic.addSessionStateListener$me_oriient_sdk_realtime(this);
        final long currentTimeMillis = ((TimeProvider) f.getD()).getCurrentTimeMillis();
        coreLogic.login$me_oriient_sdk_realtime(loginCandidate, new IPSLoginListener() { // from class: me.oriient.ipssdk.realtime.ips.Core.login.1
            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Core core = Core.INSTANCE;
                Core.access$getLogger(core).e("Core", "onLoginError() called with: error = [" + error + ']');
                ValidationService.safeFailListener(listener, error);
                core.evaluateConnectionState$me_oriient_sdk_realtime();
                Core.access$getELog(core).e("Core", "Error Login", MapsKt.j(new Pair("timeSpentMillis", Long.valueOf(Core.access$getTimeProvider(core).timeIntervalSinceNow(currentTimeMillis))), new Pair("errorMessage", error.getMessage()), new Pair("errorCode", Integer.valueOf(error.getCode()))));
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSLoginListener
            public void onLogin(@NotNull List<? extends IPSSpace> spaces) {
                Intrinsics.h(spaces, "spaces");
                Core core = Core.INSTANCE;
                Core.access$getMetric(core).i("Core", "loginTimeTotal", Core.access$getTimeProvider(core).timeIntervalSinceNowInSeconds(currentTimeMillis));
                Core.access$getLogger(core).d("Core", "onLogin() called with: spaces = [" + spaces + ']');
                core.evaluateConnectionState$me_oriient_sdk_realtime();
                try {
                    IPSLoginListener iPSLoginListener = listener;
                    if (iPSLoginListener != null) {
                        iPSLoginListener.onLogin(spaces);
                    }
                    Core.access$getELog(core).i("Core", "login succeeded", MapsKt.i(new Pair("timeSpentMillis", Long.valueOf(Core.access$getTimeProvider(core).timeIntervalSinceNow(currentTimeMillis)))));
                } catch (Exception e2) {
                    IPSLoginListener iPSLoginListener2 = listener;
                    Intrinsics.e(iPSLoginListener2);
                    ListenerException listenerException = new ListenerException(iPSLoginListener2.getClass().getSimpleName(), e2);
                    Core core2 = Core.INSTANCE;
                    kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e2.getMessage(), Core.access$getELog(core2), listener.getClass().getSimpleName(), "Exception in application");
                    Core.access$getLogger(core2).e(listener.getClass().getSimpleName(), "Exception in application", listenerException);
                }
            }
        });
    }

    public final void logout(@Nullable final IPSLogoutListener listener) {
        ((Logger) f25814a.getD()).d("Core", "logout() called with: listener = [" + listener + ']');
        final CommonRuntimeDataProvider commonRuntimeDataProvider = (CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class));
        CoreLogic.INSTANCE.logout(new IPSLogoutListener() { // from class: me.oriient.ipssdk.realtime.ips.Core.logout.1
            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Core core = Core.INSTANCE;
                Core.access$getLogger(core).e("Core", "onLogoutError() called with: error = [" + error + ']');
                commonRuntimeDataProvider.setUser(null);
                core.evaluateConnectionState$me_oriient_sdk_realtime();
                ValidationService.safeFailListener(listener, error);
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSLogoutListener
            public void onLogout() {
                Core core = Core.INSTANCE;
                Core.access$getLogger(core).d("Core", "onLogout() called");
                try {
                    commonRuntimeDataProvider.setUser(null);
                    Core.access$getDebugInfoManager(core).clean();
                    Core.access$getBuildingRepository(core).cleanInMemoryCache();
                    core.evaluateConnectionState$me_oriient_sdk_realtime();
                    IPSLogoutListener iPSLogoutListener = listener;
                    if (iPSLogoutListener != null) {
                        iPSLogoutListener.onLogout();
                    }
                } catch (Exception e2) {
                    IPSLogoutListener iPSLogoutListener2 = listener;
                    Intrinsics.e(iPSLogoutListener2);
                    ListenerException listenerException = new ListenerException(iPSLogoutListener2.getClass().getSimpleName(), e2);
                    Core core2 = Core.INSTANCE;
                    kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e2.getMessage(), Core.access$getELog(core2), listener.getClass().getSimpleName(), "Exception in application");
                    Core.access$getLogger(core2).e(listener.getClass().getSimpleName(), "Exception in application", listenerException);
                }
            }
        });
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionStateListener
    public void onSessionStateChanged(@NotNull PositioningEngineState newState) {
        Intrinsics.h(newState, "newState");
        ((Logger) f25814a.getD()).d("Core", "onSessionStateChanged() called with: newState = [" + newState + ']');
        evaluateConnectionState$me_oriient_sdk_realtime();
    }

    public final void registerApplicationEvent(int applicationEvent) {
        UiEvent uiEvent = IpsApplicationEventExtKt.toUiEvent(applicationEvent);
        if (uiEvent == null) {
            return;
        }
        CoreLogic.INSTANCE.registerSystemEvent(uiEvent);
    }

    public final void removeConnectionStateListener(@Nullable IPSConnectionStateListener listener) {
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "removeConnectionStateListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e("Core", "removeConnectionStateListener: trying to remove null listener!");
            return;
        }
        ArrayList arrayList = n;
        int iIndexOf = arrayList.indexOf(listener);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
            return;
        }
        ((Logger) lazy.getD()).w("Core", "removeConnectionStateListener: listener " + listener + " was not set");
        ((Logger) lazy.getD()).d("Core", "removeCalibrationListener: listeners: " + ArraysKt.o(arrayList.toArray(new IPSConnectionStateListener[0])));
    }

    @Nullable
    public final IPSCancelable searchBuildingsByLocation(float latitude, float longitude, float radiusMeters, @Nullable IPSBuildingsSearchListener listener) {
        ((Logger) f25814a.getD()).d("Core", "searchBuildingsByLocation() called with: latitude = [" + latitude + "], longitude = [" + longitude + "], radiusMeters = [" + radiusMeters + ']');
        return CoreLogic.INSTANCE.searchBuildingsByLocation(latitude, longitude, radiusMeters, ((RemoteConfigManager) g.getD()).getRealTimeConfig().getMisc().getDefaultBuildingsFetchRadius(), listener);
    }

    @Nullable
    public final IPSCancelable searchBuildingsByName(@Nullable String name, @Nullable final IPSBuildingsSearchListener listener) {
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "searchBuildingsByName() called with: name = [" + name + ']');
        if (name == null) {
            ((Logger) lazy.getD()).e("Core", "searchBuildingsByName: name is null!");
            ValidationService.safeFailListener(listener, new Error("name is null", 4, 2));
            return null;
        }
        User user = CoreLogic.INSTANCE.getUser();
        if (user == null) {
            ((Logger) lazy.getD()).e("Core", "searchBuildingsByName: not logged in!");
            ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
            return null;
        }
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new CancellableRestRequest(((BuildingsRestService) DependencyInjectionKt.getDi().get(reflectionFactory.b(BuildingsRestService.class))).searchBuildingByNameJava(user, ((CommonRuntimeDataProvider) di.get(reflectionFactory.b(CommonRuntimeDataProvider.class))).getUserSessionIdJava(), name, new IBuildingsSearchListener() { // from class: me.oriient.ipssdk.realtime.ips.Core.searchBuildingsByName.1
            @Override // me.oriient.ipssdk.common.utils.IBuildingsSearchListener
            public void onBuildingsSearchReceived(@NotNull List<BuildingsSearchResultV4> results) {
                Intrinsics.h(results, "results");
                Core.access$getLogger(Core.INSTANCE).d("Core", "onBuildingsSearchReceived() called with: results = [" + results + ']');
                IPSBuildingsSearchListener iPSBuildingsSearchListener = listener;
                if (iPSBuildingsSearchListener == null) {
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(results, 10));
                    Iterator<T> it = results.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new BuildingSearchResultForApi((BuildingsSearchResultV4) it.next()));
                    }
                    iPSBuildingsSearchListener.onBuildingsSearchReceived(arrayList);
                } catch (Exception e2) {
                    ListenerException listenerException = new ListenerException(listener.getClass().getSimpleName(), e2);
                    Core core = Core.INSTANCE;
                    kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e2.getMessage(), Core.access$getELog(core), listener.getClass().getSimpleName(), "Exception in application");
                    Core.access$getLogger(core).e(listener.getClass().getSimpleName(), "Exception in application", listenerException);
                }
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Core.access$getLogger(Core.INSTANCE).e("Core", "onBuildingsSearchReceived onError() called with: error = [" + error.getMessage() + ']');
                ValidationService.safeFailListener(listener, error);
            }
        }));
    }

    public final void setSpaceId(@NotNull String id, @Nullable IPSCompletionListener listener) {
        Intrinsics.h(id, "id");
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "setSpaceId() called with: id = [" + id + "], listener = [" + listener + ']');
        IPSSpace space = getSpace();
        if (space != null && id.equals(space.getId())) {
            ((Logger) lazy.getD()).i("Core", "setSpaceId: space is already set");
            ValidationService.safeCompleteListener(listener);
            return;
        }
        if (Positioning.INSTANCE.getPositioningState() != 0) {
            ValidationService.safeFailListener(listener, new Error("Can't change space while engine is busy", 3, 2));
            return;
        }
        if (ValidationService.validateConnected(listener)) {
            User f25787a = ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a();
            if (f25787a == null) {
                ((Logger) lazy.getD()).e("Core", "setSpaceId: not logged in");
                ValidationService.safeFailListener(listener, new Error("not logged in", 3, 0));
                return;
            }
            Space spaceIfAvailable = f25787a.getSpaceIfAvailable(id);
            if (spaceIfAvailable == null) {
                ((Logger) lazy.getD()).e("Core", "setSpaceId: space unavailable for user");
                ValidationService.safeFailListener(listener, new Error("space unavailable for user", 4, 2));
            } else {
                BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) h.getD()).getIo()), null, null, new a(new User(f25787a.getUserName(), f25787a.getApiKey(), f25787a.getAvailableSpacesList(), spaceIfAvailable, f25787a.getDomain(), f25787a.getSessionId(), f25787a.getCreatedAtMillis(), null), f25787a, listener, spaceIfAvailable, null), 3);
            }
        }
    }

    @NotNull
    public final List<IPSUnavailableFeature> unavailableFeatures() {
        ArrayList arrayList = new ArrayList();
        SupportSensorsManager supportSensorsManager = (SupportSensorsManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SupportSensorsManager.class));
        List<SystemSensor> missingSensors = supportSensorsManager.getMissingSensors();
        if (!missingSensors.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = missingSensors.iterator();
            while (it.hasNext()) {
                String strSensorToString = SensorsUtilsKt.sensorToString((SystemSensor) it.next());
                if (strSensorToString != null) {
                    arrayList2.add(strSensorToString);
                }
            }
            arrayList.add(new IPSUnavailableFeature(0, "Missing sensors: " + arrayList2 + JwtParser.SEPARATOR_CHAR));
        } else if (CoreLogic.INSTANCE.getBlacklistedFeatures().contains(BlacklistedFeature.POSITIONING)) {
            arrayList.add(new IPSUnavailableFeature(0, "This device model is not supported."));
        }
        if (!supportSensorsManager.getHasBarometer()) {
            arrayList.add(new IPSUnavailableFeature(1, "Missing barometer."));
            return arrayList;
        }
        if (CoreLogic.INSTANCE.getBlacklistedFeatures().contains(BlacklistedFeature.MULTI_FLOOR_POSITIONING)) {
            arrayList.add(new IPSUnavailableFeature(1, "This device model is not supported."));
        }
        return arrayList;
    }

    public final void userDidEngageWithFeature(@NotNull String feature) {
        Intrinsics.h(feature, "feature");
        ((RuntimeDataManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RuntimeDataManager.class))).leaveSilentMode();
    }

    private final void a(int i2) {
        if (getConnectionState() != i2) {
            m.setValue(Integer.valueOf(i2));
            ((ELog) c.getD()).i("Core", "connection state changed", C1631d0.f26058a);
            for (IPSConnectionStateListener iPSConnectionStateListener : CollectionsKt.G0(n)) {
                try {
                    iPSConnectionStateListener.onConnectionStateChanged(INSTANCE.getConnectionState());
                } catch (Exception e2) {
                    String simpleName = iPSConnectionStateListener.getClass().getSimpleName();
                    ListenerException listenerException = new ListenerException(simpleName, e2);
                    INSTANCE.getClass();
                    kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e2.getMessage(), (ELog) c.getD(), simpleName, "Exception in application");
                    ((Logger) f25814a.getD()).e(simpleName, "Exception in application", listenerException);
                }
            }
        }
    }

    @Nullable
    public final IPSCancelable searchBuildingsByLocation(@Nullable Location location, float radiusMeters, @Nullable IPSBuildingsSearchListener listener) {
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "searchBuildingsByLocation() called with: location = [" + location + "], radiusMeters = [" + radiusMeters + "], listener = [" + listener + ']');
        if (location == null) {
            ((Logger) lazy.getD()).e("Core", "searchBuildingsByLocation: trying to searchInBuilding on null location!");
            return null;
        }
        return searchBuildingsByLocation((float) location.getLatitude(), (float) location.getLongitude(), radiusMeters, listener);
    }

    @Nullable
    public final IPSCancelable searchBuildingsByLocation(@Nullable Location location, @Nullable IPSBuildingsSearchListener listener) {
        Lazy lazy = f25814a;
        ((Logger) lazy.getD()).d("Core", "searchBuildingsByLocation() called with: location = [" + location + ']');
        if (location == null) {
            ((Logger) lazy.getD()).e("Core", "searchBuildingsByLocation: trying to searchInBuilding on null location!");
            return null;
        }
        return searchBuildingsByLocation((float) location.getLatitude(), (float) location.getLongitude(), listener);
    }

    @Nullable
    public final IPSCancelable searchBuildingsByLocation(float latitude, float longitude, @Nullable IPSBuildingsSearchListener listener) {
        return searchBuildingsByLocation(latitude, longitude, ((RemoteConfigManager) g.getD()).getRealTimeConfig().getMisc().getNearbyBuildingsSearchRadiusMeters(), listener);
    }
}
