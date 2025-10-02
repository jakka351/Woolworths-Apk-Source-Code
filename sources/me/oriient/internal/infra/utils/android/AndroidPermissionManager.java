package me.oriient.internal.infra.utils.android;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.ActiveProcessManager;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/infra/utils/android/AndroidPermissionManager;", "Lme/oriient/internal/infra/utils/core/ActiveProcessManager;", "", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "isLocationPermissionGranted", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AndroidPermissionManager extends ActiveProcessManager<Unit>, DiProvidable {
    @NotNull
    StateFlow<Boolean> isLocationPermissionGranted();
}
