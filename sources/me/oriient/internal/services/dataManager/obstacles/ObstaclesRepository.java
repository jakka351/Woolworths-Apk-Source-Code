package me.oriient.internal.services.dataManager.obstacles;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/dataManager/obstacles/ObstaclesRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanExpiredData", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getObstacles", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "Lme/oriient/internal/infra/utils/core/OriientError;", "floorId", "priority", "(Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ObstaclesRepository extends DiProvidable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getObstacles$default(ObstaclesRepository obstaclesRepository, String str, String str2, double d, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObstacles");
            }
            if ((i & 4) != 0) {
                d = 0.0d;
            }
            return obstaclesRepository.getObstacles(str, str2, d, continuation);
        }
    }

    @Nullable
    Object cleanData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanExpiredData(double d, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getObstacles(@NotNull String str, @NotNull String str2, double d, @NotNull Continuation<? super Outcome<Obstacles, OriientError>> continuation);
}
