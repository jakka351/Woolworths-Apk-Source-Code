package me.oriient.ipssdk.realtime.ips.proximity.local;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventRepetitionStrategy;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventTrigger;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import me.oriient.ipssdk.realtime.ofs.AbstractC1733u2;
import me.oriient.ipssdk.realtime.ofs.C1738v2;
import me.oriient.ipssdk.realtime.ofs.C1743w2;
import me.oriient.ipssdk.realtime.ofs.C1748x2;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.common.util.UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapper;", "Lme/oriient/positioningengine/common/PositioningUpdate;", "positioningUpdate", "", "buildingId", "", "onNewPosition", "(Lme/oriient/positioningengine/common/PositioningUpdate;Ljava/lang/String;)V", "reset", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "a", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "getEvent", "()Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "event", "<set-?>", "d", "Z", "isConsumed", "()Z", "Companion", "me/oriient/ipssdk/realtime/ofs/u2", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LocalProximityEventWrapperImpl implements LocalProximityEventWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IPSLocalProximityEvent event;
    private final Function1 b;
    private final CoroutineScope c;

    /* renamed from: d, reason: from kotlin metadata */
    private boolean isConsumed;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private final Lazy j;
    private AbstractC1733u2 k;
    private long l;
    private boolean m;
    private int n;
    private boolean o;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapperImpl$Companion;", "", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "event", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapper;", "", "onConditionMet", "newInstance", "(Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapper;", "", "TAG", "Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final LocalProximityEventWrapper newInstance(@NotNull IPSLocalProximityEvent event, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super LocalProximityEventWrapper, Unit> onConditionMet) {
            Intrinsics.h(event, "event");
            Intrinsics.h(coroutineScope, "coroutineScope");
            Intrinsics.h(onConditionMet, "onConditionMet");
            return new LocalProximityEventWrapperImpl(event, onConditionMet, coroutineScope, null);
        }
    }

    public LocalProximityEventWrapperImpl(IPSLocalProximityEvent iPSLocalProximityEvent, Function1 function1, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this.event = iPSLocalProximityEvent;
        this.b = function1;
        this.c = coroutineScope;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.e = di.inject(reflectionFactory.b(Logger.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityStatsManager.class));
        this.j = LazyKt.b(new C1748x2(this));
        this.k = LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE;
    }

    private final void a() {
        ProximityStatsManager.EventShape eventShape;
        LocalProximityEventRepetitionStrategy repetitionStrategy = getEvent().getRepetitionStrategy().getRepetitionStrategy();
        if (repetitionStrategy instanceof LocalProximityEventRepetitionStrategy.Infinite) {
            if (((TimeProvider) this.g.getD()).timeIntervalSinceNow(this.l) < ((LocalProximityEventRepetitionStrategy.Infinite) repetitionStrategy).getCooldownSeconds() * TimeUnit.SECONDS.toMillis(1L)) {
                ((Logger) this.e.getD()).d("LocalProximityEventWrap", "initiateAction: still in cooldown");
                return;
            } else {
                ((Logger) this.e.getD()).d("LocalProximityEventWrap", "initiateAction: cooldown passed");
                this.l = ((TimeProvider) this.g.getD()).getCurrentTimeMillis();
            }
        } else if (Intrinsics.c(repetitionStrategy, LocalProximityEventRepetitionStrategy.Once.INSTANCE)) {
            ((Logger) this.e.getD()).d("LocalProximityEventWrap", "initiateAction: consumed");
            this.isConsumed = true;
        }
        ProximityStatsManager proximityStatsManager = (ProximityStatsManager) this.i.getD();
        ProximityEventOrigin origin = getEvent().getOrigin();
        boolean z = !this.o;
        LocalProximityLocationDefinition locationDefinition = getEvent().getLocationDefinition().getLocationDefinition();
        if (locationDefinition instanceof LocalProximityLocationDefinition.AreaCircle) {
            eventShape = ProximityStatsManager.EventShape.CIRCLE;
        } else if (locationDefinition instanceof LocalProximityLocationDefinition.AreaPolygon) {
            eventShape = ProximityStatsManager.EventShape.POLYGON;
        } else if (locationDefinition instanceof LocalProximityLocationDefinition.AreaRectangle) {
            eventShape = ProximityStatsManager.EventShape.RECTANGLE;
        } else {
            if (!(locationDefinition instanceof LocalProximityLocationDefinition.WalkingDistance)) {
                throw new NoWhenBranchMatchedException();
            }
            eventShape = ProximityStatsManager.EventShape.WALKING_DISTANCE;
        }
        proximityStatsManager.onEventTriggered(origin, z, eventShape);
        this.o = true;
        this.b.invoke(this);
    }

    public static final LocalProximityLocationResolver access$getResolver(LocalProximityEventWrapperImpl localProximityEventWrapperImpl) {
        return (LocalProximityLocationResolver) localProximityEventWrapperImpl.j.getD();
    }

    public static final void access$onResolverError(LocalProximityEventWrapperImpl localProximityEventWrapperImpl, SdkError sdkError, AbstractC1733u2 abstractC1733u2) {
        int i = localProximityEventWrapperImpl.n + 1;
        localProximityEventWrapperImpl.n = i;
        if (i < ((RemoteConfigManager) localProximityEventWrapperImpl.h.getD()).getRealTimeConfig().getProximityConfig().getResolverErrorsToDropState()) {
            localProximityEventWrapperImpl.k = abstractC1733u2;
            return;
        }
        localProximityEventWrapperImpl.k = LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE;
        localProximityEventWrapperImpl.n = 0;
        ((ELog) localProximityEventWrapperImpl.f.getD()).e("LocalProximityEventWrap", "Proximity resolver failed too many times", new C1743w2(localProximityEventWrapperImpl, sdkError));
    }

    public static final void access$onResolverSuccess(LocalProximityEventWrapperImpl localProximityEventWrapperImpl, boolean z, AbstractC1733u2 abstractC1733u2, long j) {
        localProximityEventWrapperImpl.n = 0;
        if (abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Inside) {
            if (!z) {
                if (z) {
                    return;
                }
                localProximityEventWrapperImpl.m = false;
                localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Outside(j);
                LocalProximityEventTrigger trigger = localProximityEventWrapperImpl.getEvent().getTrigger().getTrigger();
                if (Intrinsics.c(trigger, LocalProximityEventTrigger.Exit.INSTANCE)) {
                    localProximityEventWrapperImpl.a();
                    return;
                } else {
                    if (trigger instanceof LocalProximityEventTrigger.Dwell) {
                        return;
                    }
                    Intrinsics.c(trigger, LocalProximityEventTrigger.Enter.INSTANCE);
                    return;
                }
            }
            localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Inside(((LocalProximityEventWrapperImpl$ProximityEventState$Inside) abstractC1733u2).getSinceMillis());
            LocalProximityEventTrigger trigger2 = localProximityEventWrapperImpl.getEvent().getTrigger().getTrigger();
            if (!(trigger2 instanceof LocalProximityEventTrigger.Dwell)) {
                if (Intrinsics.c(trigger2, LocalProximityEventTrigger.Enter.INSTANCE)) {
                    return;
                }
                Intrinsics.c(trigger2, LocalProximityEventTrigger.Exit.INSTANCE);
                return;
            } else {
                if (localProximityEventWrapperImpl.m) {
                    ((Logger) localProximityEventWrapperImpl.e.getD()).d("LocalProximityEventWrap", "handleStayedInside: already triggered");
                    return;
                }
                if (Math.abs(((TimeProvider) localProximityEventWrapperImpl.g.getD()).timeIntervalSinceNow(r6)) < ((LocalProximityEventTrigger.Dwell) trigger2).getSeconds() * TimeUnit.SECONDS.toMillis(1L)) {
                    ((Logger) localProximityEventWrapperImpl.e.getD()).d("LocalProximityEventWrap", "handleStayedInside: not dwelt long enough");
                    return;
                } else {
                    localProximityEventWrapperImpl.m = true;
                    localProximityEventWrapperImpl.a();
                    return;
                }
            }
        }
        if (abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Outside) {
            if (!z) {
                if (z) {
                    return;
                }
                localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Outside(((LocalProximityEventWrapperImpl$ProximityEventState$Outside) abstractC1733u2).getSinceMillis());
                return;
            }
            localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Inside(j);
            LocalProximityEventTrigger trigger3 = localProximityEventWrapperImpl.getEvent().getTrigger().getTrigger();
            if (Intrinsics.c(trigger3, LocalProximityEventTrigger.Enter.INSTANCE)) {
                localProximityEventWrapperImpl.a();
                return;
            } else {
                if (trigger3 instanceof LocalProximityEventTrigger.Dwell) {
                    return;
                }
                Intrinsics.c(trigger3, LocalProximityEventTrigger.Exit.INSTANCE);
                return;
            }
        }
        if (!Intrinsics.c(abstractC1733u2, LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE)) {
            if (abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Pending) {
                UtilsKt.assertionFailure("state shouldn't be pending here!");
            }
        } else {
            if (!z) {
                if (z) {
                    return;
                }
                localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Outside(((TimeProvider) localProximityEventWrapperImpl.g.getD()).getCurrentTimeMillis());
                return;
            }
            localProximityEventWrapperImpl.k = new LocalProximityEventWrapperImpl$ProximityEventState$Inside(j);
            LocalProximityEventTrigger trigger4 = localProximityEventWrapperImpl.getEvent().getTrigger().getTrigger();
            if (Intrinsics.c(trigger4, LocalProximityEventTrigger.Enter.INSTANCE)) {
                localProximityEventWrapperImpl.a();
            } else {
                if (trigger4 instanceof LocalProximityEventTrigger.Dwell) {
                    return;
                }
                Intrinsics.c(trigger4, LocalProximityEventTrigger.Exit.INSTANCE);
            }
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalProximityEventWrapper) && Intrinsics.c(getEvent(), ((LocalProximityEventWrapper) other).getEvent());
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper
    @NotNull
    public IPSLocalProximityEvent getEvent() {
        return this.event;
    }

    public int hashCode() {
        return getEvent().hashCode();
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper
    /* renamed from: isConsumed, reason: from getter */
    public boolean getIsConsumed() {
        return this.isConsumed;
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper
    public void onNewPosition(@NotNull PositioningUpdate positioningUpdate, @NotNull String buildingId) {
        Intrinsics.h(positioningUpdate, "positioningUpdate");
        Intrinsics.h(buildingId, "buildingId");
        if (!Intrinsics.c(getEvent().getBuildingId(), buildingId)) {
            ((Logger) this.e.getD()).d("LocalProximityEventWrap", "onNewPosition: building is not the same");
            return;
        }
        if (getIsConsumed()) {
            return;
        }
        AbstractC1733u2 abstractC1733u2 = this.k;
        if (abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Pending) {
            ((Logger) this.e.getD()).d("LocalProximityEventWrap", "state is pending");
            LocalProximityEventWrapperImpl$ProximityEventState$Pending localProximityEventWrapperImpl$ProximityEventState$Pending = (LocalProximityEventWrapperImpl$ProximityEventState$Pending) abstractC1733u2;
            if (Math.abs(((TimeProvider) this.g.getD()).timeIntervalSinceNow(localProximityEventWrapperImpl$ProximityEventState$Pending.getSinceMillis())) < ((RemoteConfigManager) this.h.getD()).getRealTimeConfig().getProximityConfig().getPendingRequestTimeoutMillis()) {
                return;
            }
            ((Logger) this.e.getD()).d("LocalProximityEventWrap", "onNewPosition: canceling timed out pending state.");
            localProximityEventWrapperImpl$ProximityEventState$Pending.getJob().cancel((CancellationException) null);
            this.k = LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE;
        } else if (!(abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Inside) && !(abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Outside)) {
            Intrinsics.c(abstractC1733u2, LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE);
        }
        long currentTimeMillis = ((TimeProvider) this.g.getD()).getCurrentTimeMillis();
        this.k = new LocalProximityEventWrapperImpl$ProximityEventState$Pending(currentTimeMillis, BuildersKt.c(this.c, null, null, new C1738v2(this, positioningUpdate, abstractC1733u2, currentTimeMillis, null), 3));
    }

    @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper
    public void reset() {
        ((Logger) this.e.getD()).d("LocalProximityEventWrap", "reset() called");
        AbstractC1733u2 abstractC1733u2 = this.k;
        if (abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Pending) {
            ((Logger) this.e.getD()).d("LocalProximityEventWrap", "canceling pending resolve request");
            ((LocalProximityEventWrapperImpl$ProximityEventState$Pending) abstractC1733u2).getJob().cancel((CancellationException) null);
        } else if (!(abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Inside) && !(abstractC1733u2 instanceof LocalProximityEventWrapperImpl$ProximityEventState$Outside)) {
            Intrinsics.c(abstractC1733u2, LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE);
        }
        this.n = 0;
        this.l = 0L;
        this.k = LocalProximityEventWrapperImpl$ProximityEventState$Undefined.INSTANCE;
        this.isConsumed = false;
        this.m = false;
        this.o = false;
    }
}
