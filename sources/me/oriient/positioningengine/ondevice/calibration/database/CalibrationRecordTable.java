package me.oriient.positioningengine.ondevice.calibration.database;

import androidx.compose.ui.input.pointer.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/CalibrationRecordTable;", "", "timeCreatedInMillis", "", "sessionId", "", "calibrationInfo", "", "calibrationType", "", "(JLjava/lang/String;[BI)V", "getCalibrationInfo", "()[B", "getCalibrationType", "()I", "getSessionId", "()Ljava/lang/String;", "getTimeCreatedInMillis", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CalibrationRecordTable {

    @NotNull
    private final byte[] calibrationInfo;
    private final int calibrationType;

    @NotNull
    private final String sessionId;
    private final long timeCreatedInMillis;

    public CalibrationRecordTable(long j, @NotNull String sessionId, @NotNull byte[] calibrationInfo, int i) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(calibrationInfo, "calibrationInfo");
        this.timeCreatedInMillis = j;
        this.sessionId = sessionId;
        this.calibrationInfo = calibrationInfo;
        this.calibrationType = i;
    }

    public static /* synthetic */ CalibrationRecordTable copy$default(CalibrationRecordTable calibrationRecordTable, long j, String str, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = calibrationRecordTable.timeCreatedInMillis;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = calibrationRecordTable.sessionId;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            bArr = calibrationRecordTable.calibrationInfo;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            i = calibrationRecordTable.calibrationType;
        }
        return calibrationRecordTable.copy(j2, str2, bArr2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeCreatedInMillis() {
        return this.timeCreatedInMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final byte[] getCalibrationInfo() {
        return this.calibrationInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCalibrationType() {
        return this.calibrationType;
    }

    @NotNull
    public final CalibrationRecordTable copy(long timeCreatedInMillis, @NotNull String sessionId, @NotNull byte[] calibrationInfo, int calibrationType) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(calibrationInfo, "calibrationInfo");
        return new CalibrationRecordTable(timeCreatedInMillis, sessionId, calibrationInfo, calibrationType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibrationRecordTable)) {
            return false;
        }
        CalibrationRecordTable calibrationRecordTable = (CalibrationRecordTable) other;
        return this.timeCreatedInMillis == calibrationRecordTable.timeCreatedInMillis && Intrinsics.c(this.sessionId, calibrationRecordTable.sessionId) && Intrinsics.c(this.calibrationInfo, calibrationRecordTable.calibrationInfo) && this.calibrationType == calibrationRecordTable.calibrationType;
    }

    @NotNull
    public final byte[] getCalibrationInfo() {
        return this.calibrationInfo;
    }

    public final int getCalibrationType() {
        return this.calibrationType;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimeCreatedInMillis() {
        return this.timeCreatedInMillis;
    }

    public int hashCode() {
        return Integer.hashCode(this.calibrationType) + a.d(z.a(this.sessionId, Long.hashCode(this.timeCreatedInMillis) * 31, 31), 31, this.calibrationInfo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("\n  |CalibrationRecordTable [\n  |  timeCreatedInMillis: ");
        sb.append(this.timeCreatedInMillis);
        sb.append("\n  |  sessionId: ");
        sb.append(this.sessionId);
        sb.append("\n  |  calibrationInfo: ");
        String string = Arrays.toString(this.calibrationInfo);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append("\n  |  calibrationType: ");
        sb.append(this.calibrationType);
        sb.append("\n  |]\n  ");
        return StringsKt.n0(sb.toString());
    }
}
