package me.oriient.internal.infra.powerManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/powerManager/PowerManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "batteryLevel", "Lkotlinx/coroutines/flow/StateFlow;", "", "getBatteryLevel", "()Lkotlinx/coroutines/flow/StateFlow;", "isCharging", "", "isNetworkMetered", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PowerManager extends DiProvidable {
    @NotNull
    StateFlow<Float> getBatteryLevel();

    @NotNull
    StateFlow<Boolean> isCharging();

    @NotNull
    StateFlow<Boolean> isNetworkMetered();
}
