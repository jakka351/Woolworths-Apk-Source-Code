package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/BaseLocalProximityLocationResolver;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "Area", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationResolver;", "", "floorOrder", "area", "<init>", "(ILme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;)V", "Lme/oriient/positioningengine/common/PositioningUpdate;", "position", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "isPositionInsideImpl", "(Lme/oriient/positioningengine/common/PositioningUpdate;)Lme/oriient/internal/infra/utils/core/Outcome;", "isPositionInside", "(Lme/oriient/positioningengine/common/PositioningUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "getArea", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseLocalProximityLocationResolver<Area extends LocalProximityLocationDefinition> implements LocalProximityLocationResolver {

    /* renamed from: a, reason: collision with root package name */
    private final int f25891a;

    /* renamed from: b, reason: from kotlin metadata */
    private final LocalProximityLocationDefinition area;

    public BaseLocalProximityLocationResolver(int i, @NotNull Area area) {
        Intrinsics.h(area, "area");
        this.f25891a = i;
        this.area = area;
    }

    @NotNull
    public final Area getArea() {
        return (Area) this.area;
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolver
    @Nullable
    public Object isPositionInside(@NotNull PositioningUpdate positioningUpdate, @NotNull Continuation<? super Outcome<Boolean, SdkError>> continuation) {
        int i = this.f25891a;
        Integer floorOrder = positioningUpdate.getFloorOrder();
        return (floorOrder != null && i == floorOrder.intValue()) ? isPositionInsideImpl(positioningUpdate) : OutcomeKt.toOutcomeSuccess(Boolean.FALSE);
    }

    @NotNull
    public abstract Outcome<Boolean, SdkError> isPositionInsideImpl(@NotNull PositioningUpdate position);
}
