package me.oriient.ipssdk.realtime.ips.proximity.local;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028 X \u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;", "", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "Infinite", "Once", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy$Infinite;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy$Once;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class LocalProximityEventRepetitionStrategy {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy$Infinite;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;", "", "cooldownSeconds", "<init>", "(D)V", "a", "D", "getCooldownSeconds", "()D", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Infinite extends LocalProximityEventRepetitionStrategy {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final double cooldownSeconds;

        public Infinite(double d) {
            super(null);
            this.cooldownSeconds = d;
        }

        public final double getCooldownSeconds() {
            return this.cooldownSeconds;
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventRepetitionStrategy
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "infinite";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy$Once;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventRepetitionStrategy;", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Once extends LocalProximityEventRepetitionStrategy {

        @NotNull
        public static final Once INSTANCE = new Once();

        private Once() {
            super(null);
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventRepetitionStrategy
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "once";
        }
    }

    public LocalProximityEventRepetitionStrategy(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getDescription$me_oriient_sdk_realtime();
}
