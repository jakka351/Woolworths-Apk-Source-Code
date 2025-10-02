package me.oriient.ipssdk.realtime.ips.proximity.local;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028 X \u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "Dwell", "Enter", "Exit", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Dwell;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Enter;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Exit;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class LocalProximityEventTrigger {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Dwell;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "", "seconds", "<init>", "(D)V", "a", "D", "getSeconds", "()D", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Dwell extends LocalProximityEventTrigger {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final double seconds;

        public Dwell(double d) {
            super(null);
            this.seconds = d;
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventTrigger
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "onDwell";
        }

        public final double getSeconds() {
            return this.seconds;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Enter;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Enter extends LocalProximityEventTrigger {

        @NotNull
        public static final Enter INSTANCE = new Enter();

        private Enter() {
            super(null);
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventTrigger
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "onEnter";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger$Exit;", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventTrigger;", "", "getDescription$me_oriient_sdk_realtime", "()Ljava/lang/String;", lqlqqlq.mmm006Dm006Dm, "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Exit extends LocalProximityEventTrigger {

        @NotNull
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super(null);
        }

        @Override // me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventTrigger
        @NotNull
        public String getDescription$me_oriient_sdk_realtime() {
            return "onExit";
        }
    }

    public LocalProximityEventTrigger(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getDescription$me_oriient_sdk_realtime();
}
