package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/systemStateManager/SystemStateProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "systemState", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/services/systemStateManager/SystemState;", "getSystemState", "()Lkotlinx/coroutines/flow/StateFlow;", "systemStateUpdate", "Lkotlinx/coroutines/flow/SharedFlow;", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdate;", "getSystemStateUpdate", "()Lkotlinx/coroutines/flow/SharedFlow;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SystemStateProvider extends DiProvidable {
    @NotNull
    StateFlow<SystemState> getSystemState();

    @NotNull
    SharedFlow<SystemStateUpdate> getSystemStateUpdate();
}
