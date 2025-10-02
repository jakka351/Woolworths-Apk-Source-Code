package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventTrigger;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;", "", "trigger", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;)V", "getTrigger$me_oriient_sdk_realtime", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IPSLocalProximityEventTrigger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LocalProximityEventTrigger trigger;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger$Companion;", "", "()V", "onDwell", "Lme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;", "seconds", "", "onEnter", "onExit", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IPSLocalProximityEventTrigger onDwell(double seconds) {
            return new IPSLocalProximityEventTrigger(new LocalProximityEventTrigger.Dwell(seconds));
        }

        @NotNull
        public final IPSLocalProximityEventTrigger onEnter() {
            return new IPSLocalProximityEventTrigger(LocalProximityEventTrigger.Enter.INSTANCE);
        }

        @NotNull
        public final IPSLocalProximityEventTrigger onExit() {
            return new IPSLocalProximityEventTrigger(LocalProximityEventTrigger.Exit.INSTANCE);
        }

        private Companion() {
        }
    }

    public IPSLocalProximityEventTrigger(@NotNull LocalProximityEventTrigger trigger) {
        Intrinsics.h(trigger, "trigger");
        this.trigger = trigger;
    }

    @NotNull
    /* renamed from: getTrigger$me_oriient_sdk_realtime, reason: from getter */
    public final LocalProximityEventTrigger getTrigger() {
        return this.trigger;
    }
}
