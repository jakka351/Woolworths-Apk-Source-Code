package me.oriient.ipssdk.realtime.utils.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.FilteringSequence;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.api.models.IPSProximityTrigger;
import me.oriient.ipssdk.api.models.IPSTriggerEvent;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.utils.DwellEventListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0004#$%&B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0011R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010!¨\u0006'"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "Lme/oriient/ipssdk/api/models/IPSProximityTrigger;", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "addEnterEvent", "()V", "addExitEvent", "", "timeMilli", "addDwellEvent", "(J)V", "getId", "()Ljava/lang/String;", "getName", "getMetadata", "", "Lme/oriient/ipssdk/api/models/IPSTriggerEvent;", "getTriggerEvents", "()Ljava/util/List;", "cancelDwellEvents", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "", "Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "()Ljava/util/Set;", "triggerEvents", "Companion", "TriggerEventDwell", "TriggerEventEnter", "TriggerEventExit", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ProximityTrigger implements IPSProximityTrigger {
    private static final String f = "ProximityTrigger";
    private static final ScheduledExecutorService g = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

    /* renamed from: a, reason: collision with root package name */
    private final String f26200a;
    private final String b;
    private final String c;
    private final HashSet d;
    private final Lazy e;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger$TriggerEventDwell;", "Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "", "timeMilli", "<init>", "(Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;J)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "region", "Lme/oriient/ipssdk/realtime/utils/DwellEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "onEntered", "(Lme/oriient/ipssdk/realtime/utils/models/Region;Lme/oriient/ipssdk/realtime/utils/DwellEventListener;)V", "onExited", "(Lme/oriient/ipssdk/realtime/utils/models/Region;)V", "cancelTimer", "()V", "getType", "getDurationMilli", "()J", "", "toString", "()Ljava/lang/String;", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "getContainingTrigger", "()Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "containingTrigger", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class TriggerEventDwell extends TriggerEvent {
        private final long d;
        private ScheduledFuture e;

        public TriggerEventDwell(long j) {
            this.d = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(ProximityTrigger this$0, Region region, TriggerEventDwell this$1, DwellEventListener listener) {
            Intrinsics.h(this$0, "this$0");
            Intrinsics.h(region, "$region");
            Intrinsics.h(this$1, "this$1");
            Intrinsics.h(listener, "$listener");
            Logger loggerAccess$getLogger = ProximityTrigger.access$getLogger(this$0);
            String str = ProximityTrigger.f;
            Intrinsics.g(str, "access$getTAG$cp(...)");
            StringBuilder sb = new StringBuilder("onDwell() region = [");
            sb.append(region);
            sb.append("] of trigger = [");
            sb.append(this$0);
            sb.append("] for ");
            loggerAccess$getLogger.d(str, a.l(this$1.d, " milli", sb));
            listener.onDwellEvent(this$0, region, this$1.d);
            this$1.onEventTriggered(region);
        }

        public final void cancelTimer() {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.e = null;
            }
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof TriggerEventDwell) && ((TriggerEventDwell) other).d == this.d;
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        @NotNull
        /* renamed from: getContainingTrigger, reason: from getter */
        public ProximityTrigger getD() {
            return ProximityTrigger.this;
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent, me.oriient.ipssdk.api.models.IPSTriggerEvent
        /* renamed from: getDurationMilli, reason: from getter */
        public long getD() {
            return this.d;
        }

        @Override // me.oriient.ipssdk.api.models.IPSTriggerEvent
        public int getType() {
            return 2;
        }

        public int hashCode() {
            return (int) (17 * this.d);
        }

        public final void onEntered(@NotNull Region region, @NotNull DwellEventListener listener) {
            Intrinsics.h(region, "region");
            Intrinsics.h(listener, "listener");
            cancelTimer();
            this.e = ProximityTrigger.g.schedule(new androidx.camera.core.processing.a(ProximityTrigger.this, region, this, listener, 6), this.d, TimeUnit.MILLISECONDS);
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        public void onExited(@NotNull Region region) {
            Intrinsics.h(region, "region");
            cancelTimer();
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TriggerEventDwell{type=");
            sb.append(TriggerEventDwell.class.getSimpleName());
            sb.append(", timeMilli=");
            return b.q(sb, this.d, '}');
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger$TriggerEventEnter;", "Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "(Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;)V", "containingTrigger", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "getContainingTrigger", "()Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "equals", "", "other", "", "getType", "", "hashCode", "onEntered", "", "region", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "onExited", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class TriggerEventEnter extends TriggerEvent {
        public TriggerEventEnter() {
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof TriggerEventEnter;
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        @NotNull
        /* renamed from: getContainingTrigger, reason: from getter */
        public ProximityTrigger getD() {
            return ProximityTrigger.this;
        }

        @Override // me.oriient.ipssdk.api.models.IPSTriggerEvent
        public int getType() {
            return 0;
        }

        public int hashCode() {
            return 12121212;
        }

        public final void onEntered(@NotNull Region region) {
            Intrinsics.h(region, "region");
            Logger loggerAccess$getLogger = ProximityTrigger.access$getLogger(ProximityTrigger.this);
            String str = ProximityTrigger.f;
            Intrinsics.g(str, "access$getTAG$cp(...)");
            loggerAccess$getLogger.d(str, "onEntered() region = [" + region + "] of trigger = [" + ProximityTrigger.this + ']');
            onEventTriggered(region);
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        public void onExited(@NotNull Region region) {
            Intrinsics.h(region, "region");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger$TriggerEventExit;", "Lme/oriient/ipssdk/realtime/utils/models/TriggerEvent;", "(Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;)V", "containingTrigger", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "getContainingTrigger", "()Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "equals", "", "other", "", "getType", "", "hashCode", "onEntered", "", "region", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "onExited", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class TriggerEventExit extends TriggerEvent {
        public TriggerEventExit() {
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof TriggerEventExit;
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        @NotNull
        /* renamed from: getContainingTrigger, reason: from getter */
        public ProximityTrigger getD() {
            return ProximityTrigger.this;
        }

        @Override // me.oriient.ipssdk.api.models.IPSTriggerEvent
        public int getType() {
            return 1;
        }

        public int hashCode() {
            return 23232323;
        }

        public final void onEntered(@NotNull Region region) {
            Intrinsics.h(region, "region");
        }

        @Override // me.oriient.ipssdk.realtime.utils.models.TriggerEvent
        public void onExited(@NotNull Region region) {
            Intrinsics.h(region, "region");
            Logger loggerAccess$getLogger = ProximityTrigger.access$getLogger(ProximityTrigger.this);
            String str = ProximityTrigger.f;
            Intrinsics.g(str, "access$getTAG$cp(...)");
            loggerAccess$getLogger.d(str, "onExited() region = [" + region + "] of trigger = [" + ProximityTrigger.this + ']');
            onEventTriggered(region);
        }
    }

    public ProximityTrigger(@NotNull String id, @NotNull String name, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        this.f26200a = id;
        this.b = name;
        this.c = str;
        this.d = new HashSet();
        this.e = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    public static final Logger access$getLogger(ProximityTrigger proximityTrigger) {
        return (Logger) proximityTrigger.e.getD();
    }

    public final void addDwellEvent(long timeMilli) {
        Logger logger = (Logger) this.e.getD();
        String TAG = f;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "addDwellEvent() called with: timeMilli = [" + timeMilli + ']');
        if (this.d.add(new TriggerEventDwell(timeMilli))) {
            return;
        }
        ((Logger) this.e.getD()).e(TAG, "addDwellEvent: this event already exists in the trigger");
    }

    public final void addEnterEvent() {
        Logger logger = (Logger) this.e.getD();
        String TAG = f;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "addEnterEvent() called");
        if (this.d.add(new TriggerEventEnter())) {
            return;
        }
        ((Logger) this.e.getD()).e(TAG, "addEnterEvent: this event already exists in the trigger");
    }

    public final void addExitEvent() {
        Logger logger = (Logger) this.e.getD();
        String TAG = f;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "addExitEvent() called");
        if (this.d.add(new TriggerEventExit())) {
            return;
        }
        ((Logger) this.e.getD()).e(TAG, "addExitEvent: this event already exists in the trigger");
    }

    public final void cancelDwellEvents() {
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            TriggerEvent triggerEvent = (TriggerEvent) anonymousClass1.next();
            Intrinsics.f(triggerEvent, "null cannot be cast to non-null type me.oriient.ipssdk.realtime.utils.models.ProximityTrigger.TriggerEventDwell");
            ((TriggerEventDwell) triggerEvent).cancelTimer();
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ProximityTrigger) && Intrinsics.c(this.f26200a, ((ProximityTrigger) other).f26200a);
    }

    @Override // me.oriient.ipssdk.api.models.IPSProximityTrigger
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF26200a() {
        return this.f26200a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSProximityTrigger
    @Nullable
    /* renamed from: getMetadata, reason: from getter */
    public String getC() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSProximityTrigger
    @NotNull
    /* renamed from: getName, reason: from getter */
    public String getB() {
        return this.b;
    }

    @NotNull
    /* renamed from: getTriggerEvents, reason: collision with other method in class */
    public final Set<TriggerEvent> m478getTriggerEvents() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "ProximityTrigger{id='" + this.f26200a + "', metadata='" + this.c + "', triggerEvents=" + this.d + '}';
    }

    @Override // me.oriient.ipssdk.api.models.IPSProximityTrigger
    @NotNull
    public List<IPSTriggerEvent> getTriggerEvents() {
        return CollectionsKt.G0(this.d);
    }
}
