package me.oriient.internal.services.dataManager.floorMetadata;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\tJ2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\tJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\t¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "buildingId", "", "floorId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorMetadata", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "Lme/oriient/internal/infra/utils/core/OriientError;", "allowOutdated", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorMetadataWithBitmap", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithImage;", "fetchFloorMetadataWithSvg", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithSvgImage;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FloorMetadataRepository extends DiProvidable {
    @Nullable
    Object cleanCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object fetchFloorMetadata(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation<? super Outcome<FloorMetadata, OriientError>> continuation);

    @Nullable
    Object fetchFloorMetadataWithBitmap(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<FloorMetadataWithImage, OriientError>> continuation);

    @Nullable
    Object fetchFloorMetadataWithSvg(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<FloorMetadataWithSvgImage, OriientError>> continuation);
}
