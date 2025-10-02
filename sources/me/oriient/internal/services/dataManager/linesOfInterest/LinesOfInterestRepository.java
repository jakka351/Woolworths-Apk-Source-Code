package me.oriient.internal.services.dataManager.linesOfInterest;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/dataManager/linesOfInterest/LinesOfInterestRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getLinesOfInterest", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterest;", "Lme/oriient/internal/infra/utils/core/OriientError;", "mapId", "", "forceRefresh", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LinesOfInterestRepository extends DiProvidable {
    @Nullable
    Object getLinesOfInterest(@NotNull String str, boolean z, @NotNull Continuation<? super Outcome<List<LineOfInterest>, OriientError>> continuation);
}
