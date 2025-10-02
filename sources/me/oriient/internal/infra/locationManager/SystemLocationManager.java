package me.oriient.internal.infra.locationManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`\u00170\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0006¨\u0006 "}, d2 = {"Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "", "Lme/oriient/internal/infra/locationManager/N;", "activityMode", "", "startLocationUpdates", "(Lme/oriient/internal/infra/locationManager/N;)V", "stopLocationUpdates", "()V", "requestSingleUpdate", "Lkotlinx/coroutines/flow/SharedFlow;", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "getLocationUpdates", "()Lkotlinx/coroutines/flow/SharedFlow;", "locationUpdates", "getLastKnownLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "lastKnownLocation", "", "getHasPermission", "()Z", "hasPermission", "Ljava/lang/Error;", "Lkotlin/Error;", "getErrors", "errors", "Lkotlinx/coroutines/flow/StateFlow;", "isActive", "()Lkotlinx/coroutines/flow/StateFlow;", "getActivityMode", "()Lme/oriient/internal/infra/locationManager/N;", "setActivityMode", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SystemLocationManager {
    @NotNull
    N getActivityMode();

    @NotNull
    SharedFlow<Error> getErrors();

    boolean getHasPermission();

    @Nullable
    SystemLocation getLastKnownLocation();

    @NotNull
    SharedFlow<SystemLocation> getLocationUpdates();

    @NotNull
    StateFlow<Boolean> isActive();

    void requestSingleUpdate();

    void setActivityMode(@NotNull N n);

    void startLocationUpdates(@Nullable N activityMode);

    void stopLocationUpdates();
}
