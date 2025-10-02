package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinderRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getObstaclesPolygonsFinder", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinder;", "Lme/oriient/internal/infra/utils/core/OriientError;", "buildingId", "", "floorId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ObstaclesPolygonsFinderRepository extends DiProvidable {
    @Nullable
    Object cleanCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getObstaclesPolygonsFinder(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<ObstaclesPolygonsFinder, OriientError>> continuation);
}
