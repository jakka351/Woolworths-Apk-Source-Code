package me.oriient.ipssdk.realtime.ips;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.services.elog.EngineSessionDataProvider;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/EngineSessionDataProviderImpl;", "Lme/oriient/ipssdk/common/services/elog/EngineSessionDataProvider;", "<init>", "()V", "", "getEngineSessionId", "()Ljava/lang/String;", "engineSessionId", "", "getPositioningSessionStartTimeMillis", "()Ljava/lang/Long;", "positioningSessionStartTimeMillis", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EngineSessionDataProviderImpl implements EngineSessionDataProvider {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25829a = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(SupportPositioningEngineManager.class));

    @Override // me.oriient.ipssdk.common.services.elog.EngineSessionDataProvider
    @Nullable
    public String getEngineSessionId() {
        return CoreLogic.INSTANCE.getEngineSessionId();
    }

    @Override // me.oriient.ipssdk.common.services.elog.EngineSessionDataProvider
    @Nullable
    public Long getPositioningSessionStartTimeMillis() {
        StateFlow<PositioningEngineState> state;
        PositioningEngineState positioningEngineState;
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) this.f25829a.getD()).getEngine().getValue();
        if (positioningEngine == null || (state = positioningEngine.getState()) == null || (positioningEngineState = (PositioningEngineState) state.getValue()) == null) {
            return null;
        }
        if (positioningEngineState instanceof PositioningEngineState.Idle ? true : positioningEngineState instanceof PositioningEngineState.Calibrating) {
            return null;
        }
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            return Long.valueOf(((PositioningEngineState.Positioning) positioningEngineState).getContext().getStartTimeMillis());
        }
        throw new NoWhenBranchMatchedException();
    }
}
