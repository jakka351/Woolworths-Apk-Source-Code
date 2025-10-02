package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/BuildingCoordinateConverterRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConverter", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/BuildingCoordinateConverter;", "Lme/oriient/internal/infra/utils/core/OriientError;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BuildingCoordinateConverterRepository extends DiProvidable {
    @Nullable
    Object cleanCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getConverter(@NotNull String str, @NotNull Continuation<? super Outcome<BuildingCoordinateConverter, OriientError>> continuation);
}
