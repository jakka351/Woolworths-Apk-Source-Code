package me.oriient.internal.infra.utils.android.appState;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "appState", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "getAppState", "()Lkotlinx/coroutines/flow/StateFlow;", "wasResumed", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getWasResumed", "()Lkotlinx/coroutines/flow/SharedFlow;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AppStateProvider extends DiProvidable {
    @NotNull
    StateFlow<AppState> getAppState();

    @NotNull
    SharedFlow<Unit> getWasResumed();
}
