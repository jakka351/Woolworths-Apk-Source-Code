package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toIpsCalibrationNeededReason", "EXPIRED", "MAGNETIC", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CalibrationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CalibrationReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CalibrationReason EXPIRED = new CalibrationReason("EXPIRED", 0, 0);
    public static final CalibrationReason MAGNETIC = new CalibrationReason("MAGNETIC", 1, 1);
    private final int value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CalibrationReason.values().length];
            try {
                iArr[CalibrationReason.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalibrationReason.MAGNETIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CalibrationReason[] $values() {
        return new CalibrationReason[]{EXPIRED, MAGNETIC};
    }

    static {
        CalibrationReason[] calibrationReasonArr$values = $values();
        $VALUES = calibrationReasonArr$values;
        $ENTRIES = EnumEntriesKt.a(calibrationReasonArr$values);
        INSTANCE = new Companion(null);
    }

    private CalibrationReason(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<CalibrationReason> getEntries() {
        return $ENTRIES;
    }

    public static CalibrationReason valueOf(String str) {
        return (CalibrationReason) Enum.valueOf(CalibrationReason.class, str);
    }

    public static CalibrationReason[] values() {
        return (CalibrationReason[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final int toIpsCalibrationNeededReason() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/CalibrationReason$Companion;", "", "", "rawValue", "Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "from", "(I)Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;", "reason", "(Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;)Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CalibrationNeeded.Reason.values().length];
                try {
                    iArr[CalibrationNeeded.Reason.TIMEOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CalibrationNeeded.Reason.MAGNETIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final CalibrationReason from(int rawValue) {
            CalibrationReason calibrationReason = CalibrationReason.EXPIRED;
            if (rawValue == calibrationReason.getValue()) {
                return calibrationReason;
            }
            CalibrationReason calibrationReason2 = CalibrationReason.MAGNETIC;
            if (rawValue == calibrationReason2.getValue()) {
                return calibrationReason2;
            }
            return null;
        }

        @Nullable
        public final CalibrationReason from(@Nullable CalibrationNeeded.Reason reason) {
            int i = reason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
            if (i == -1) {
                return null;
            }
            if (i == 1) {
                return CalibrationReason.EXPIRED;
            }
            if (i == 2) {
                return CalibrationReason.MAGNETIC;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
