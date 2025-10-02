package me.oriient.internal.infra.locationManager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.CancellationSignal;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
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
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0005v_Y\u0011\\B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0011R\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020$H\u0003¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0017¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001e\u0010:\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010(R$\u0010?\u001a\f\u0012\b\u0012\u00060=j\u0002`>0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010*R\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bV\u0010WR\u0018\u0010Z\u001a\u00060YR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u00060\\R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010f\u001a\n e*\u0004\u0018\u00010d0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR(\u0010l\u001a\u0004\u0018\u00010k2\b\u0010E\u001a\u0004\u0018\u00010k8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0016\u0010t\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010(¨\u0006w"}, d2 = {"Lme/oriient/internal/infra/locationManager/LocationManagerAndroid;", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "Lme/oriient/internal/infra/locationManager/ReadOnlySystemLocationManager;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "currentTimeMillis", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "", "startLocationUpdatesImpl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "provider", "Lme/oriient/internal/infra/locationManager/N;", "activityMode", "Lme/oriient/internal/infra/locationManager/m;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "requestUpdates", "(Ljava/lang/String;Lme/oriient/internal/infra/locationManager/N;Lme/oriient/internal/infra/locationManager/m;)Z", "startPermissionMonitoring", "()V", "stopPermissionMonitoring", "stopLocationUpdatesImpl", "onModeChanged", "resetLastKnownLocation", "locationTimeMilli", "isLocationExpired", "(J)Z", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "location", "currentBestLocation", "isBetterLocation", "(Lme/oriient/internal/infra/locationManager/SystemLocation;Lme/oriient/internal/infra/locationManager/SystemLocation;)Z", "Landroid/location/LocationListener;", "stopUpdates", "(Landroid/location/LocationListener;)V", "getAndroidLastKnownLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "startLocationUpdates", "(Lme/oriient/internal/infra/locationManager/N;)V", "requestSingleUpdate", "stopLocationUpdates", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "locationUpdates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getLocationUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroid/location/LocationManager;", "locationManager$delegate", "Lkotlin/Lazy;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager", "_lastKnownLocation", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "get_lastKnownLocation", "Ljava/lang/Error;", "Lkotlin/Error;", "errors", "getErrors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "Lme/oriient/internal/infra/locationManager/N;", "getActivityMode", "()Lme/oriient/internal/infra/locationManager/N;", "setActivityMode", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "permissionManager$delegate", "getPermissionManager", "()Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "permissionManager", "Lme/oriient/internal/infra/locationManager/l;", "gpsListener", "Lme/oriient/internal/infra/locationManager/l;", "Lme/oriient/internal/infra/locationManager/n;", "networkListener", "Lme/oriient/internal/infra/locationManager/n;", "Lme/oriient/internal/infra/locationManager/k;", "oneTimeLocationListener", "Lme/oriient/internal/infra/locationManager/k;", "permissionManagerRequestId", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "singleLocationRequestsExecutor", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/CancellationSignal;", "currentLocationCancellationSignal", "Landroid/os/CancellationSignal;", "Lkotlinx/coroutines/Job;", "permissionMonitoringJob", "Lkotlinx/coroutines/Job;", "setPermissionMonitoringJob", "(Lkotlinx/coroutines/Job;)V", "getHasPermission", "()Z", "hasPermission", "getLastKnownLocation", "lastKnownLocation", "Companion", "me/oriient/internal/infra/locationManager/j", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LocationManagerAndroid implements SystemLocationManager, ReadOnlySystemLocationManager {
    private static final double HORIZONTAL_ACCURACY_DELTA = 200.0d;
    private static final long LOCATION_EXPIRATION_TIME_MILLI;
    private static final long LOCATION_REQUEST_INTERVAL_TIME_MILLI;

    @NotNull
    private static final String TAG = "LocationManagerAndroid";

    @Nullable
    private SystemLocation _lastKnownLocation;

    @NotNull
    private N activityMode;

    @NotNull
    private final Context context;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @Nullable
    private CancellationSignal currentLocationCancellationSignal;

    @NotNull
    private final Function0<Long> currentTimeMillis;

    @NotNull
    private final MutableSharedFlow<Error> errors;

    @NotNull
    private final C1200l gpsListener;

    @NotNull
    private final MutableStateFlow<Boolean> isActive;

    /* renamed from: locationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationManager;

    @NotNull
    private final MutableSharedFlow<SystemLocation> locationUpdates;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final C1202n networkListener;

    @NotNull
    private final C1199k oneTimeLocationListener;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager;

    @NotNull
    private final String permissionManagerRequestId;

    @Nullable
    private Job permissionMonitoringJob;
    private final ExecutorService singleLocationRequestsExecutor;

    @NotNull
    private static final C1198j Companion = new C1198j();

    @NotNull
    private static final List<String> SUPPORTED_PROVIDERS = CollectionsKt.R("gps", "network", "OriientLocationServiceTestProvider");
    private static final int LOCATION_OLD_TIME_MILLI = (int) TimeUnit.SECONDS.toMillis(2);

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        LOCATION_EXPIRATION_TIME_MILLI = timeUnit.toMillis(2L);
        LOCATION_REQUEST_INTERVAL_TIME_MILLI = timeUnit.toMillis(1L);
    }

    public LocationManagerAndroid(@NotNull Context context, @NotNull Function0<Long> currentTimeMillis) {
        Intrinsics.h(context, "context");
        Intrinsics.h(currentTimeMillis, "currentTimeMillis");
        this.context = context;
        this.currentTimeMillis = currentTimeMillis;
        this.locationUpdates = SharedFlowKt.a(1, 1, BufferOverflow.e);
        this.locationManager = LazyKt.b(new C1203o(this));
        this.errors = UtilsKt.EventFlow();
        this.isActive = StateFlowKt.a(Boolean.FALSE);
        this.activityMode = new L();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.permissionManager = InternalDiKt.getDi().inject(reflectionFactory.b(AndroidPermissionManager.class));
        this.gpsListener = new C1200l(this);
        this.networkListener = new C1202n(this);
        this.oneTimeLocationListener = new C1199k(this);
        this.permissionManagerRequestId = "location-manager-" + hashCode();
        this.singleLocationRequestsExecutor = Executors.newCachedThreadPool();
        resetLastKnownLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public final SystemLocation getAndroidLastKnownLocation() {
        Object next;
        if (!getHasPermission()) {
            return null;
        }
        List<String> list = SUPPORTED_PROVIDERS;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Location lastKnownLocation = getLocationManager().getAllProviders().contains(str) ? getLocationManager().getLastKnownLocation(str) : null;
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (!isLocationExpired(((Location) next2).getTime())) {
                arrayList2.add(next2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float accuracy = ((Location) next).getAccuracy();
                do {
                    Object next3 = it2.next();
                    float accuracy2 = ((Location) next3).getAccuracy();
                    if (Float.compare(accuracy, accuracy2) > 0) {
                        next = next3;
                        accuracy = accuracy2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Location location = (Location) next;
        if (location != null) {
            return AbstractC1189a.a(location);
        }
        return null;
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AndroidPermissionManager getPermissionManager() {
        return (AndroidPermissionManager) this.permissionManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemLocation get_lastKnownLocation() {
        SystemLocation systemLocation = this._lastKnownLocation;
        if (systemLocation == null || isLocationExpired(systemLocation.getTimestampMs())) {
            return null;
        }
        return systemLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBetterLocation(SystemLocation location, SystemLocation currentBestLocation) {
        if (currentBestLocation == null || Intrinsics.c(location, currentBestLocation)) {
            return true;
        }
        long timestampMs = location.getTimestampMs() - currentBestLocation.getTimestampMs();
        int i = LOCATION_OLD_TIME_MILLI;
        boolean z = timestampMs > ((long) i);
        boolean z2 = timestampMs < ((long) (-i));
        boolean z3 = timestampMs > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int horizontalAccuracy = (int) (location.getHorizontalAccuracy() - currentBestLocation.getHorizontalAccuracy());
        boolean z4 = horizontalAccuracy > 0;
        boolean z5 = horizontalAccuracy < 0;
        boolean z6 = ((double) horizontalAccuracy) > HORIZONTAL_ACCURACY_DELTA;
        boolean zC = Intrinsics.c(location.getProvider(), currentBestLocation.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && zC;
        }
        return true;
    }

    private final boolean isLocationExpired(long locationTimeMilli) {
        return ((Number) this.currentTimeMillis.invoke()).longValue() - locationTimeMilli > LOCATION_EXPIRATION_TIME_MILLI;
    }

    private final void onModeChanged() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new C1204p(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public final boolean requestUpdates(String provider, N activityMode, AbstractC1201m listener) {
        String str;
        Exception exc;
        getLogger().d(TAG, "requestUpdates() called with: provider = " + provider + ", mode = " + activityMode);
        try {
            if (getLocationManager().getAllProviders().contains(provider)) {
                str = provider;
                try {
                    getLocationManager().requestLocationUpdates(str, activityMode.b(), activityMode.a(), listener);
                    return true;
                } catch (Exception e) {
                    e = e;
                    exc = e;
                    getLogger().e(TAG, "requestUpdates failed for provider " + str, exc);
                    return false;
                }
            }
            try {
                getLogger().w(TAG, "startLocationUpdates: no " + provider);
                return false;
            } catch (Exception e2) {
                exc = e2;
                str = provider;
                getLogger().e(TAG, "requestUpdates failed for provider " + str, exc);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            str = provider;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public final void resetLastKnownLocation() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new r(this, null), 3);
    }

    private final void setPermissionMonitoringJob(Job job) {
        Job job2 = this.permissionMonitoringJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.permissionMonitoringJob = job;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startLocationUpdatesImpl(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof me.oriient.internal.infra.locationManager.C1207t
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.infra.locationManager.t r0 = (me.oriient.internal.infra.locationManager.C1207t) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.infra.locationManager.t r0 = new me.oriient.internal.infra.locationManager.t
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            kotlin.Unit r3 = kotlin.Unit.f24250a
            java.lang.String r4 = "LocationManagerAndroid"
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            me.oriient.internal.infra.locationManager.LocationManagerAndroid r0 = r0.f24958a
            kotlin.ResultKt.b(r9)
            goto L8c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.infra.utils.core.Logger r9 = r8.getLogger()
            java.lang.String r2 = "startLocationUpdatesImpl() called"
            r9.d(r4, r2)
            me.oriient.internal.infra.locationManager.N r9 = r8.getActivityMode()
            boolean r2 = r9 instanceof me.oriient.internal.infra.locationManager.L
            java.lang.String r6 = "gps"
            java.lang.String r7 = "network"
            if (r2 == 0) goto L5b
            me.oriient.internal.infra.locationManager.n r2 = r8.networkListener
            boolean r2 = r8.requestUpdates(r7, r9, r2)
            me.oriient.internal.infra.locationManager.l r7 = r8.gpsListener
            boolean r9 = r8.requestUpdates(r6, r9, r7)
            r9 = r9 | r2
            goto L73
        L5b:
            boolean r2 = r9 instanceof me.oriient.internal.infra.locationManager.M
            if (r2 == 0) goto La9
            me.oriient.internal.infra.locationManager.n r2 = r8.networkListener
            boolean r2 = r8.requestUpdates(r7, r9, r2)
            if (r2 != 0) goto L72
            me.oriient.internal.infra.locationManager.l r2 = r8.gpsListener
            boolean r9 = r8.requestUpdates(r6, r9, r2)
            if (r9 == 0) goto L70
            goto L72
        L70:
            r9 = 0
            goto L73
        L72:
            r9 = r5
        L73:
            if (r9 != 0) goto L96
            kotlinx.coroutines.flow.MutableSharedFlow r9 = r8.getErrors()
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r6 = "failed to start location updates"
            r2.<init>(r6)
            r0.f24958a = r8
            r0.d = r5
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            r0 = r8
        L8c:
            me.oriient.internal.infra.utils.core.Logger r9 = r0.getLogger()
            java.lang.String r0 = "startLocationUpdates: failed to start location updates"
            r9.e(r4, r0)
            return r3
        L96:
            me.oriient.internal.infra.utils.core.Logger r9 = r8.getLogger()
            java.lang.String r0 = "startLocationUpdatesImpl: started updates"
            r9.d(r4, r0)
            kotlinx.coroutines.flow.MutableStateFlow r9 = r8.isActive()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.setValue(r0)
            return r3
        La9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.locationManager.LocationManagerAndroid.startLocationUpdatesImpl(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPermissionMonitoring() {
        getLogger().d(TAG, "startPermissionMonitoring() called");
        getPermissionManager().enable(this.permissionManagerRequestId, null);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        setPermissionMonitoringJob(BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new w(this, null), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public final void stopLocationUpdatesImpl() {
        getLogger().d(TAG, "stopLocationUpdatesImpl() called");
        getLocationManager().removeUpdates(this.gpsListener);
        getLocationManager().removeUpdates(this.networkListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPermissionMonitoring() {
        getLogger().d(TAG, "stopPermissionMonitoring() called");
        setPermissionMonitoringJob(null);
        getPermissionManager().disable(this.permissionManagerRequestId, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint
    public final void stopUpdates(LocationListener listener) {
        getLogger().d(TAG, "stopUpdates() called with: listener = " + listener);
        getLocationManager().removeUpdates(listener);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @NotNull
    public N getActivityMode() {
        return this.activityMode;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public boolean getHasPermission() {
        return ContextCompat.a(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager, me.oriient.internal.infra.locationManager.ReadOnlySystemLocationManager
    @Nullable
    /* renamed from: getLastKnownLocation */
    public SystemLocation get_lastKnownLocation() {
        SystemLocation systemLocation = get_lastKnownLocation();
        return systemLocation == null ? getAndroidLastKnownLocation() : systemLocation;
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    @SuppressLint
    public void requestSingleUpdate() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new C1205q(this, null), 3);
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
    public void startLocationUpdates(@Nullable N activityMode) {
        getLogger().d(TAG, "startLocationUpdates() called");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new C1206s(activityMode, this, null), 3);
    }

    @Override // me.oriient.internal.infra.locationManager.SystemLocationManager
    public void stopLocationUpdates() {
        getLogger().d(TAG, "stopLocationUpdates: ");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new x(this, null), 3);
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

    public /* synthetic */ LocationManagerAndroid(Context context, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? C1197i.f24951a : function0);
    }
}
