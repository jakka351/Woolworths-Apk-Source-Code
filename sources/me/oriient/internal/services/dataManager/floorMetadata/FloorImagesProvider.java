package me.oriient.internal.services.dataManager.floorMetadata;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorImagesProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "clearAllCaches", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearData", "id", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorFetchData;", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorFetchData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorImage", "Lme/oriient/internal/infra/utils/core/Outcome;", "Landroid/graphics/Bitmap;", "Lme/oriient/internal/infra/utils/core/OriientError;", "floorMetadata", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFloorSvgImage", "Lcom/caverock/androidsvg/SVG;", "getCachedFloorImage", "getCachedSvgFloorImage", "saveImageToCache", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithImage;", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSvgImageToCache", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithSvgImage;", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithSvgImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FloorImagesProvider extends DiProvidable {
    @Nullable
    Object clearAllCaches(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearData(@NotNull FloorFetchData floorFetchData, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object fetchFloorImage(@NotNull FloorMetadata floorMetadata, @NotNull Continuation<? super Outcome<Bitmap, OriientError>> continuation);

    @Nullable
    Object fetchFloorSvgImage(@NotNull FloorMetadata floorMetadata, @NotNull Continuation<? super Outcome<SVG, OriientError>> continuation);

    @Nullable
    Object getCachedFloorImage(@NotNull FloorMetadata floorMetadata, @NotNull Continuation<? super Outcome<Bitmap, OriientError>> continuation);

    @Nullable
    Object getCachedSvgFloorImage(@NotNull FloorMetadata floorMetadata, @NotNull Continuation<? super Outcome<SVG, OriientError>> continuation);

    @Nullable
    Object saveImageToCache(@NotNull FloorMetadataWithImage floorMetadataWithImage, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);

    @Nullable
    Object saveSvgImageToCache(@NotNull FloorMetadataWithSvgImage floorMetadataWithSvgImage, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);
}
