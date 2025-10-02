package me.oriient.ipssdk.common.geofencing;

import android.content.Intent;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0016H\u0007J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010!\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/common/geofencing/Geofencing;", "", "()V", "TAG", "", "liveGeofenceService", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceManager;", "getLiveGeofenceService", "()Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceManager;", "liveGeofenceService$delegate", "Lkotlin/Lazy;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "runtimeDataProvider", "Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;", "getRuntimeDataProvider", "()Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;", "runtimeDataProvider$delegate", "addLiveGeofenceListener", "", "buildingIdString", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/listeners/IPSLiveGeofenceListener;", "clearLiveGeofencingListeners", "getBuildingsNearBy", "", "registerToGeofencingEvents", "intent", "Landroid/content/Intent;", "removeLiveGeofenceListener", "unregisterFromGeofencingEvents", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Geofencing {

    @NotNull
    public static final Geofencing INSTANCE = new Geofencing();

    @NotNull
    private static final String TAG = "Geofencing";

    /* renamed from: liveGeofenceService$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy liveGeofenceService;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy logger;

    /* renamed from: runtimeDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy runtimeDataProvider;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        logger = di.inject(reflectionFactory.b(Logger.class));
        liveGeofenceService = DependencyInjectionKt.getDi().inject(reflectionFactory.b(LiveGeofenceManager.class));
        runtimeDataProvider = DependencyInjectionKt.getDi().inject(reflectionFactory.b(CommonRuntimeDataProvider.class));
    }

    private Geofencing() {
    }

    @JvmStatic
    public static final void addLiveGeofenceListener(@NotNull String buildingIdString, @NotNull IPSLiveGeofenceListener listener) {
        Unit unit;
        Intrinsics.h(buildingIdString, "buildingIdString");
        Intrinsics.h(listener, "listener");
        Geofencing geofencing = INSTANCE;
        geofencing.getLogger().d(TAG, "addLiveGeofenceListener() called with: buildingIdString = [" + buildingIdString + "], listener = [" + listener + ']');
        if (geofencing.getRuntimeDataProvider().getF25787a() != null) {
            geofencing.getLogger().d(TAG, "addLiveGeofenceListener: adding listener");
            geofencing.getLiveGeofenceService().addListener(buildingIdString, listener);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            geofencing.getLogger().e(TAG, "Unable to set IPSLiveGeofenceListener before login");
        }
    }

    @JvmStatic
    public static final void clearLiveGeofencingListeners() {
        Geofencing geofencing = INSTANCE;
        geofencing.getLogger().d(TAG, "clearLiveGeofencingListeners() called");
        geofencing.getLiveGeofenceService().clearListeners();
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final List<String> getBuildingsNearBy() {
        return INSTANCE.getLiveGeofenceService().getBuildingIdsInside();
    }

    private final LiveGeofenceManager getLiveGeofenceService() {
        return (LiveGeofenceManager) liveGeofenceService.getD();
    }

    private final Logger getLogger() {
        return (Logger) logger.getD();
    }

    private final CommonRuntimeDataProvider getRuntimeDataProvider() {
        return (CommonRuntimeDataProvider) runtimeDataProvider.getD();
    }

    @JvmStatic
    public static final void registerToGeofencingEvents(@NotNull Intent intent) {
        Intrinsics.h(intent, "intent");
    }

    @JvmStatic
    public static final void removeLiveGeofenceListener(@NotNull String buildingIdString, @NotNull IPSLiveGeofenceListener listener) {
        Intrinsics.h(buildingIdString, "buildingIdString");
        Intrinsics.h(listener, "listener");
        Geofencing geofencing = INSTANCE;
        geofencing.getLogger().d(TAG, "removeLiveGeofenceListener() called with: buildingIdString = [" + buildingIdString + "], listener = [" + listener + ']');
        geofencing.getLiveGeofenceService().removeListener(buildingIdString, listener);
    }

    @JvmStatic
    public static final void unregisterFromGeofencingEvents() {
    }
}
