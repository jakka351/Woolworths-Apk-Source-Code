package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventRepetitionStrategy;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;", "", "repetitionStrategy", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;)V", "getRepetitionStrategy$me_oriient_sdk_realtime", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IPSLocalProximityEventRepetitionStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LocalProximityEventRepetitionStrategy repetitionStrategy;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy$Companion;", "", "()V", "infinite", "Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;", "cooldownSeconds", "", "once", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IPSLocalProximityEventRepetitionStrategy infinite(double cooldownSeconds) {
            return new IPSLocalProximityEventRepetitionStrategy(new LocalProximityEventRepetitionStrategy.Infinite(cooldownSeconds));
        }

        @NotNull
        public final IPSLocalProximityEventRepetitionStrategy once() {
            return new IPSLocalProximityEventRepetitionStrategy(LocalProximityEventRepetitionStrategy.Once.INSTANCE);
        }

        private Companion() {
        }
    }

    public IPSLocalProximityEventRepetitionStrategy(@NotNull LocalProximityEventRepetitionStrategy repetitionStrategy) {
        Intrinsics.h(repetitionStrategy, "repetitionStrategy");
        this.repetitionStrategy = repetitionStrategy;
    }

    @NotNull
    /* renamed from: getRepetitionStrategy$me_oriient_sdk_realtime, reason: from getter */
    public final LocalProximityEventRepetitionStrategy getRepetitionStrategy() {
        return this.repetitionStrategy;
    }
}
