package me.oriient.internal.services.runtimeDataProvider;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataManager;", "Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "currentSpaceId", "", "getCurrentSpaceId", "()Ljava/lang/String;", "setCurrentSpaceId", "(Ljava/lang/String;)V", "currentUserId", "getCurrentUserId", "setCurrentUserId", "isCalibrationActive", "", "()Z", "setCalibrationActive", "(Z)V", "isPositioningActive", "setPositioningActive", "leaveSilentMode", "", "setLoginSession", "session", "Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RuntimeDataManager extends RuntimeDataProvider {
    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @Nullable
    String getCurrentSpaceId();

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @Nullable
    String getCurrentUserId();

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    boolean isCalibrationActive();

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    boolean isPositioningActive();

    void leaveSilentMode();

    void setCalibrationActive(boolean z);

    void setCurrentSpaceId(@Nullable String str);

    void setCurrentUserId(@Nullable String str);

    void setLoginSession(@Nullable UniqueSession session);

    void setPositioningActive(boolean z);
}
