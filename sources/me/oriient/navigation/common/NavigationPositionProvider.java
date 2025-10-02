package me.oriient.navigation.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lme/oriient/navigation/common/NavigationPositionProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "currentBuilding", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/navigation/common/models/NavigationBuilding;", "getCurrentBuilding", "()Lkotlinx/coroutines/flow/StateFlow;", "currentPosition", "Lme/oriient/navigation/common/models/NavigationPosition;", "getCurrentPosition", "()Lme/oriient/navigation/common/models/NavigationPosition;", "currentSessionId", "", "getCurrentSessionId", "positionUpdates", "Lkotlinx/coroutines/flow/SharedFlow;", "getPositionUpdates", "()Lkotlinx/coroutines/flow/SharedFlow;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface NavigationPositionProvider extends DiProvidable {
    @NotNull
    StateFlow<NavigationBuilding> getCurrentBuilding();

    @Nullable
    NavigationPosition getCurrentPosition();

    @NotNull
    StateFlow<String> getCurrentSessionId();

    @NotNull
    SharedFlow<NavigationPosition> getPositionUpdates();
}
