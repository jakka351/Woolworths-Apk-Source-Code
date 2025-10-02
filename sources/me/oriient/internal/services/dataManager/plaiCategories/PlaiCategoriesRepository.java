package me.oriient.internal.services.dataManager.plaiCategories;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ,\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoriesRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBuildingData", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoryInfo", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryResult;", "Lme/oriient/internal/infra/utils/core/OriientError;", "categoryId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiCategoriesRepository extends DiProvidable {
    @Nullable
    Object cleanData(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearBuildingData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getCategoryInfo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<PlaiCategoryResult, OriientError>> continuation);

    @Nullable
    Object getCategoryInfo(@NotNull String str, @NotNull Continuation<? super Outcome<List<PlaiCategoryResult>, OriientError>> continuation);
}
