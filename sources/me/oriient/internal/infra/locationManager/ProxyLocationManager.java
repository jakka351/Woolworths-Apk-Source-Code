package me.oriient.internal.infra.locationManager;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\f\u0012\b\u0012\u00060+j\u0002`,0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020(058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001e\u0010@\u001a\f\u0012\b\u0012\u00060+j\u0002`,058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0012¨\u0006H"}, d2 = {"Lme/oriient/internal/infra/locationManager/ProxyLocationManager;", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "Lme/oriient/internal/infra/locationManager/ReadOnlySystemLocationManager;", "Lkotlin/Function0;", "Lme/oriient/internal/infra/locationManager/LocationManagerAndroid;", "standardLocationManagerProvider", "Lme/oriient/internal/infra/locationManager/FusedLocationManager;", "fusedLocationManagerProvider", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V", "", "applyCurrentConfig", "()V", "Lme/oriient/internal/infra/locationManager/N;", "activityMode", "startLocationUpdates", "(Lme/oriient/internal/infra/locationManager/N;)V", "stopLocationUpdates", "requestSingleUpdate", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "Lme/oriient/internal/services/config/InternalConfigManager;", "config$delegate", "Lkotlin/Lazy;", "getConfig", "()Lme/oriient/internal/services/config/InternalConfigManager;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "", "useFusedLocationProvider", "Z", "currentLocationManager", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "proxyLocationUpdates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljava/lang/Error;", "Lkotlin/Error;", "proxyErrors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "proxyIsActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/Job;", "jobs", "Ljava/util/List;", "Lkotlinx/coroutines/flow/SharedFlow;", "getLocationUpdates", "()Lkotlinx/coroutines/flow/SharedFlow;", "locationUpdates", "getLastKnownLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "lastKnownLocation", "getHasPermission", "()Z", "hasPermission", "getErrors", "errors", "Lkotlinx/coroutines/flow/StateFlow;", "isActive", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "getActivityMode", "()Lme/oriient/internal/infra/locationManager/N;", "setActivityMode", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProxyLocationManager implements SystemLocationManager, ReadOnlySystemLocationManager {

    /* renamed from: config$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy config;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private SystemLocationManager currentLocationManager;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @NotNull
    private final Function0<FusedLocationManager> fusedLocationManagerProvider;

    @NotNull
    private List<Job> jobs;

    @NotNull
    private final MutableSharedFlow<Error> proxyErrors;

    @NotNull
    private final MutableStateFlow<Boolean> proxyIsActive;

    @NotNull
    private final MutableSharedFlow<SystemLocation> proxyLocationUpdates;

    @NotNull
    private final Function0<LocationManagerAndroid> standardLocationManagerProvider;
    private boolean useFusedLocationProvider;

    public ProxyLocationManager(@NotNull Function0<LocationManagerAndroid> standardLocationManagerProvider, @NotNull Function0<FusedLocationManager> fusedLocationManagerProvider, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(standardLocationManagerProvider, "standardLocationManagerProvider");
        Intrinsics.h(fusedLocationManagerProvider, "fusedLocationManagerProvider");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.standardLocationManagerProvider = standardLocationManagerProvider;
        this.fusedLocationManagerProvider = fusedLocationManagerProvider;
        this.coroutineScope = coroutineScope;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.config = di.inject(reflectionFactory.b(InternalConfigManager.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.proxyLocationUpdates = SharedFlowKt.b(0, 0, null, 7);
        this.proxyErrors = SharedFlowKt.b(0, 0, null, 7);
        this.proxyIsActive = StateFlowKt.a(Boolean.FALSE);
        this.jobs = new ArrayList();
        this.currentLocationManager = (SystemLocationManager) standardLocationManagerProvider.invoke();
        this.useFusedLocationProvider = ((InternalConfig) getConfig().getConfig().getValue()).getUseFusedLocationProvider();
        applyCurrentConfig();
        BuildersKt.c(coroutineScope, null, null, new B(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCurrentConfig() {
        Object objInvoke;
        SystemLocationManager systemLocationManager;
        boolean zBooleanValue = ((Boolean) this.currentLocationManager.isActive().getValue()).booleanValue();
        N activityMode = this.currentLocationManager.getActivityMode();
        this.currentLocationManager.stopLocationUpdates();
        if (((InternalConfig) getConfig().getConfig().getValue()).getUseFusedLocationProvider()) {
            try {
                objInvoke = this.fusedLocationManagerProvider.invoke();
            } catch (Throwable th) {
                getELog().w("ProxyLocationManager", "No compatible FusedLocation found. Fallback to standard.", new C(th));
                objInvoke = this.standardLocationManagerProvider.invoke();
            }
            systemLocationManager = (SystemLocationManager) objInvoke;
        } else {
            systemLocationManager = (SystemLocationManager) this.standardLocationManagerProvider.invoke();
        }
        this.currentLocationManager = systemLocationManager;
        Iterator<T> it = this.jobs.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
        }
        this.jobs.clear();
        this.jobs.add(BuildersKt.c(this.coroutineScope, null, null, new E(this, null), 3));
        this.jobs.add(BuildersKt.c(this.coroutineScope, null, null, new G(this, null), 3));
        this.jobs.add(BuildersKt.c(this.coroutineScope, null, null, new I(this, null), 3));
        this.currentLocationManager.requestSingleUpdate();
        if (zBooleanValue) {
            this.currentLocationManager.startLocationUpdates(activityMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalConfigManager getConfig() {
        return (InternalConfigManager) this.config.getD();
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public N getActivityMode() {
        return this.currentLocationManager.getActivityMode();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public SharedFlow<Error> getErrors() {
        return this.proxyErrors;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public boolean getHasPermission() {
        return this.currentLocationManager.getHasPermission();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager, me.oriient.internal.infra.locationManager.ReadOnlySystemLocationManager
    @Nullable
    /* renamed from: getLastKnownLocation */
    public SystemLocation get_lastKnownLocation() {
        return this.currentLocationManager.get_lastKnownLocation();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public SharedFlow<SystemLocation> getLocationUpdates() {
        return this.proxyLocationUpdates;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public StateFlow<Boolean> isActive() {
        return this.proxyIsActive;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void requestSingleUpdate() {
        this.currentLocationManager.requestSingleUpdate();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void setActivityMode(@NotNull N value) {
        Intrinsics.h(value, "value");
        this.currentLocationManager.setActivityMode(value);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void startLocationUpdates(@Nullable N activityMode) {
        this.currentLocationManager.startLocationUpdates(activityMode);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void stopLocationUpdates() {
        this.currentLocationManager.stopLocationUpdates();
    }

    public ProxyLocationManager(Function0 function0, Function0 function02, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? CoroutineScopeKt.a(Dispatchers.f24691a) : coroutineScope);
    }
}
