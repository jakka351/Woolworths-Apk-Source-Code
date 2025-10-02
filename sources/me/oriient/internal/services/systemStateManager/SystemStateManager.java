package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/systemStateManager/SystemStateManager;", "Lme/oriient/internal/services/systemStateManager/SystemStateProvider;", "onEngineEvent", "", "engineEvent", "Lme/oriient/internal/services/systemStateManager/EngineEvent;", "onUiEvent", "uiEvent", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SystemStateManager extends SystemStateProvider {
    void onEngineEvent(@NotNull EngineEvent engineEvent);

    void onUiEvent(@NotNull UiEvent uiEvent);
}
