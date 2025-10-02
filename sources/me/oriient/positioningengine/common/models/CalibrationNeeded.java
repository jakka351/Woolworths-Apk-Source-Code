package me.oriient.positioningengine.common.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001d"}, d2 = {"Lme/oriient/positioningengine/common/models/CalibrationNeeded;", "", "Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;", "reason", "", "info", "<init>", "(Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;Ljava/lang/String;)V", "component1", "()Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;", "component2", "()Ljava/lang/String;", "copy", "(Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;Ljava/lang/String;)Lme/oriient/positioningengine/common/models/CalibrationNeeded;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;", "getReason", "Ljava/lang/String;", "getInfo", "Companion", "me/oriient/positioningengine/common/models/a", "Reason", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CalibrationNeeded {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    private static final CalibrationNeeded Timeout = new CalibrationNeeded(Reason.TIMEOUT, null, 2, 0 == true ? 1 : 0);

    @Nullable
    private final String info;

    @NotNull
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lme/oriient/positioningengine/common/models/CalibrationNeeded$Reason;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "me/oriient/positioningengine/common/models/b", "TIMEOUT", "MAGNETIC", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;

        @NotNull
        public static final b Companion;

        @NotNull
        private final String value;
        public static final Reason TIMEOUT = new Reason("TIMEOUT", 0, "timeout");
        public static final Reason MAGNETIC = new Reason("MAGNETIC", 1, "magnetic");

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{TIMEOUT, MAGNETIC};
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = EnumEntriesKt.a(reasonArr$values);
            Companion = new b();
        }

        private Reason(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public CalibrationNeeded(@NotNull Reason reason, @Nullable String str) {
        Intrinsics.h(reason, "reason");
        this.reason = reason;
        this.info = str;
    }

    public static /* synthetic */ CalibrationNeeded copy$default(CalibrationNeeded calibrationNeeded, Reason reason, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = calibrationNeeded.reason;
        }
        if ((i & 2) != 0) {
            str = calibrationNeeded.info;
        }
        return calibrationNeeded.copy(reason, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final CalibrationNeeded copy(@NotNull Reason reason, @Nullable String info) {
        Intrinsics.h(reason, "reason");
        return new CalibrationNeeded(reason, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibrationNeeded)) {
            return false;
        }
        CalibrationNeeded calibrationNeeded = (CalibrationNeeded) other;
        return this.reason == calibrationNeeded.reason && Intrinsics.c(this.info, calibrationNeeded.info);
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = this.reason.hashCode() * 31;
        String str = this.info;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CalibrationNeeded(reason=");
        sb.append(this.reason);
        sb.append(", info=");
        return androidx.camera.core.impl.b.r(sb, this.info, ')');
    }

    public /* synthetic */ CalibrationNeeded(Reason reason, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : str);
    }
}
