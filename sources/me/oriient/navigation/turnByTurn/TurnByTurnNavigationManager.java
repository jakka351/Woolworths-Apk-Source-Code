package me.oriient.navigation.turnByTurn;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfig;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.models.Turn;
import me.oriient.navigation.turnByTurn.models.NavigationInstruction;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0011H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u001b"}, d2 = {"Lme/oriient/navigation/turnByTurn/TurnByTurnNavigationManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "instructionsUpdates", "Lkotlinx/coroutines/flow/SharedFlow;", "", "Lme/oriient/navigation/turnByTurn/models/NavigationInstruction;", "getInstructionsUpdates", "()Lkotlinx/coroutines/flow/SharedFlow;", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "turnsUpdates", "Lme/oriient/navigation/common/models/Turn;", "getTurnsUpdates", "onNewConfig", "", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "(Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRouteUpdate", "route", "Lme/oriient/navigation/common/models/Route;", "userPosition", "Lme/oriient/navigation/common/models/NavigationPosition;", "reset", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TurnByTurnNavigationManager extends DiProvidable {
    @NotNull
    SharedFlow<List<NavigationInstruction>> getInstructionsUpdates();

    @NotNull
    SharedFlow<List<Turn>> getTurnsUpdates();

    /* renamed from: isEnabled */
    boolean get_isEnabled();

    @Nullable
    Object onNewConfig(@NotNull TurnByTurnConfig turnByTurnConfig, @NotNull Continuation<? super Unit> continuation);

    void onRouteUpdate(@NotNull Route route, @NotNull NavigationPosition userPosition);

    void reset();

    void setEnabled(boolean z);
}
