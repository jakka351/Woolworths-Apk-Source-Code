package me.oriient.internal.services.runtimeDataProvider;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "currentSpaceId", "", "getCurrentSpaceId", "()Ljava/lang/String;", "currentUserId", "getCurrentUserId", "isCalibrationActive", "", "()Z", "isInSilentMode", "isInSilentModeFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "isPositioningActive", "loginSession", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "getLoginSession", "()Lkotlinx/coroutines/flow/StateFlow;", "userSession", "getUserSession", "()Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "userSessionFlow", "getUserSessionFlow", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RuntimeDataProvider extends DiProvidable {
    @Nullable
    String getCurrentSpaceId();

    @Nullable
    String getCurrentUserId();

    @NotNull
    StateFlow<UniqueSession> getLoginSession();

    @NotNull
    UniqueSession getUserSession();

    @NotNull
    SharedFlow<UniqueSession> getUserSessionFlow();

    boolean isCalibrationActive();

    boolean isInSilentMode();

    @NotNull
    SharedFlow<Boolean> isInSilentModeFlow();

    boolean isPositioningActive();
}
