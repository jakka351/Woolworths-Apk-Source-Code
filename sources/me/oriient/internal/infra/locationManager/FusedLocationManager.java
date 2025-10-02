package me.oriient.internal.infra.locationManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.AndroidPermissionManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f*\u0001=\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0019\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R$\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\u0011\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u001eR\u0014\u0010K\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lme/oriient/internal/infra/locationManager/FusedLocationManager;", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "Lme/oriient/internal/infra/locationManager/ReadOnlySystemLocationManager;", "Landroid/content/Context;", "context", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationProviderClient", "Landroid/os/Looper;", "looper", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "locationUpdates", "Ljava/lang/Error;", "Lkotlin/Error;", "errors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isActive", "<init>", "(Landroid/content/Context;Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/os/Looper;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "", "fetchLastKnownLocation", "()V", "startPermissionMonitoring", "stopPermissionMonitoring", "startLocationUpdatesImpl", "onModeChanged", "Lme/oriient/internal/infra/locationManager/N;", "activityMode", "startLocationUpdates", "(Lme/oriient/internal/infra/locationManager/N;)V", "requestSingleUpdate", "stopLocationUpdates", "Landroid/content/Context;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "Landroid/os/Looper;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getLocationUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "getErrors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "permissionManager$delegate", "getPermissionManager", "()Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "permissionManager", "", "permissionManagerRequestId", "Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "permissionMonitoringJob", "Lkotlinx/coroutines/Job;", "_lastKnownLocation", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "me/oriient/internal/infra/locationManager/d", "locationCallback", "Lme/oriient/internal/infra/locationManager/d;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "value", "Lme/oriient/internal/infra/locationManager/N;", "getActivityMode", "()Lme/oriient/internal/infra/locationManager/N;", "setActivityMode", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "getHasPermission", "()Z", "hasPermission", "getLastKnownLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "lastKnownLocation", "Companion", "me/oriient/internal/infra/locationManager/b", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FusedLocationManager implements SystemLocationManager, ReadOnlySystemLocationManager {

    @NotNull
    private static final C1190b Companion = new C1190b();
    private static final long LOCATION_REQUEST_INTERVAL_TIME_MILLI = TimeUnit.MINUTES.toMillis(1);

    @NotNull
    private static final String TAG = "FusedLocationManager";

    @Nullable
    private SystemLocation _lastKnownLocation;

    @NotNull
    private N activityMode;

    @NotNull
    private final CancellationTokenSource cancellationTokenSource;

    @NotNull
    private final Context context;

    @NotNull
    private final MutableSharedFlow<Error> errors;

    @NotNull
    private final FusedLocationProviderClient fusedLocationProviderClient;

    @NotNull
    private final MutableStateFlow<Boolean> isActive;

    @NotNull
    private final C1192d locationCallback;

    @NotNull
    private final MutableSharedFlow<SystemLocation> locationUpdates;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final Looper looper;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager;

    @NotNull
    private final String permissionManagerRequestId;

    @Nullable
    private Job permissionMonitoringJob;

    public FusedLocationManager(@NotNull Context context, @NotNull FusedLocationProviderClient fusedLocationProviderClient, @NotNull Looper looper, @NotNull MutableSharedFlow<SystemLocation> locationUpdates, @NotNull MutableSharedFlow<Error> errors, @NotNull MutableStateFlow<Boolean> isActive) {
        Intrinsics.h(context, "context");
        Intrinsics.h(fusedLocationProviderClient, "fusedLocationProviderClient");
        Intrinsics.h(looper, "looper");
        Intrinsics.h(locationUpdates, "locationUpdates");
        Intrinsics.h(errors, "errors");
        Intrinsics.h(isActive, "isActive");
        this.context = context;
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        this.looper = looper;
        this.locationUpdates = locationUpdates;
        this.errors = errors;
        this.isActive = isActive;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.permissionManager = InternalDiKt.getDi().inject(reflectionFactory.b(AndroidPermissionManager.class));
        this.permissionManagerRequestId = "location-manager-" + hashCode();
        this.locationCallback = new C1192d(this);
        this.cancellationTokenSource = new CancellationTokenSource();
        this.activityMode = new L();
        fetchLastKnownLocation();
    }

    @SuppressLint
    private final void fetchLastKnownLocation() {
        if (getHasPermission()) {
            this.fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new com.woolworths.scanlibrary.ui.tap.a(new C1191c(this), 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchLastKnownLocation$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final LocationRequest getLocationRequest() {
        LocationRequest locationRequestCreate = LocationRequest.create();
        Intrinsics.g(locationRequestCreate, "create(...)");
        N activityMode = getActivityMode();
        if (activityMode instanceof L) {
            locationRequestCreate.setInterval(0L);
            locationRequestCreate.setPriority(100);
            return locationRequestCreate;
        }
        if (activityMode instanceof M) {
            locationRequestCreate.setInterval(LOCATION_REQUEST_INTERVAL_TIME_MILLI);
            locationRequestCreate.setPriority(102);
        }
        return locationRequestCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AndroidPermissionManager getPermissionManager() {
        return (AndroidPermissionManager) this.permissionManager.getD();
    }

    @SuppressLint
    private final void onModeChanged() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new C1193e(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleUpdate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission
    public final void startLocationUpdatesImpl() {
        getLogger().d(TAG, "startLocationUpdatesImpl() called");
        this.fusedLocationProviderClient.requestLocationUpdates(getLocationRequest(), this.locationCallback, this.looper);
        getLogger().d(TAG, "startLocationUpdatesImpl: started updates");
        isActive().setValue(Boolean.TRUE);
    }

    @SuppressLint
    private final void startPermissionMonitoring() {
        getLogger().d(TAG, "startPermissionMonitoring() called");
        getPermissionManager().enable(this.permissionManagerRequestId, null);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.permissionMonitoringJob = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new C1196h(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPermissionMonitoring() {
        getLogger().d(TAG, "stopPermissionMonitoring() called");
        this.permissionMonitoringJob = null;
        getPermissionManager().disable(this.permissionManagerRequestId, null);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public N getActivityMode() {
        return this.activityMode;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public boolean getHasPermission() {
        return this.context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager, me.oriient.internal.infra.locationManager.ReadOnlySystemLocationManager
    @Nullable
    /* renamed from: getLastKnownLocation, reason: from getter */
    public SystemLocation get_lastKnownLocation() {
        return this._lastKnownLocation;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @SuppressLint
    public void requestSingleUpdate() {
        getLogger().d(TAG, "requestSingleUpdates() called");
        if (getHasPermission()) {
            this.fusedLocationProviderClient.getCurrentLocation(100, this.cancellationTokenSource.getToken()).addOnSuccessListener(new com.woolworths.scanlibrary.ui.tap.a(new C1194f(this), 9));
        } else {
            getLogger().w(TAG, "Cannot request location without permission!");
            getErrors().f(new Error("Can not request location without permission!"));
        }
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void setActivityMode(@NotNull N value) {
        Intrinsics.h(value, "value");
        boolean zC = Intrinsics.c(this.activityMode, value);
        this.activityMode = value;
        if (zC) {
            return;
        }
        onModeChanged();
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @SuppressLint
    public void startLocationUpdates(@Nullable N activityMode) {
        getLogger().d(TAG, "startLocationUpdates() called");
        if (activityMode != null) {
            setActivityMode(activityMode);
        }
        if (((Boolean) isActive().getValue()).booleanValue()) {
            return;
        }
        if (getHasPermission()) {
            startLocationUpdatesImpl();
        } else {
            startPermissionMonitoring();
            getErrors().f(new Error("Can not start location updates. No permission granted"));
        }
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void stopLocationUpdates() {
        getLogger().d(TAG, "stopLocationUpdates: ");
        stopPermissionMonitoring();
        if (getHasPermission() && ((Boolean) isActive().getValue()).booleanValue()) {
            isActive().setValue(Boolean.FALSE);
            getLogger().d(TAG, "stopLocationUpdatesImpl() called");
            this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
        }
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public MutableSharedFlow<Error> getErrors() {
        return this.errors;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public MutableSharedFlow<SystemLocation> getLocationUpdates() {
        return this.locationUpdates;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public MutableStateFlow<Boolean> isActive() {
        return this.isActive;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FusedLocationManager(Context context, FusedLocationProviderClient fusedLocationProviderClient, Looper looper, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableStateFlow mutableStateFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.g(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        }
        FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
        if ((i & 4) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.g(looper, "getMainLooper(...)");
        }
        this(context, fusedLocationProviderClient2, looper, (i & 8) != 0 ? SharedFlowKt.a(1, 1, BufferOverflow.e) : mutableSharedFlow, (i & 16) != 0 ? UtilsKt.EventFlow() : mutableSharedFlow2, (i & 32) != 0 ? StateFlowKt.a(Boolean.FALSE) : mutableStateFlow);
    }
}
