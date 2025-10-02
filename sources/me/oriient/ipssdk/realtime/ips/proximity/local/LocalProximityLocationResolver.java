package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationResolver;", "", "isPositionInside", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "position", "Lme/oriient/positioningengine/common/PositioningUpdate;", "(Lme/oriient/positioningengine/common/PositioningUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface LocalProximityLocationResolver {
    @Nullable
    Object isPositionInside(@NotNull PositioningUpdate positioningUpdate, @NotNull Continuation<? super Outcome<Boolean, SdkError>> continuation);
}
