package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorTimeJumpData;", "", "id", "", "timestampNano", "", "previousTimestampNano", "timeDeltaNano", "totalJumpNano", "jumpCount", "firstGyroTime", "sensorType", "(IJJJJIJI)V", "getFirstGyroTime", "()J", "getId", "()I", "getJumpCount", "getPreviousTimestampNano", "getSensorType", "getTimeDeltaNano", "getTimestampNano", "getTotalJumpNano", "toMap", "", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SensorTimeJumpData {
    private final long firstGyroTime;
    private final int id;
    private final int jumpCount;
    private final long previousTimestampNano;
    private final int sensorType;
    private final long timeDeltaNano;
    private final long timestampNano;
    private final long totalJumpNano;

    public SensorTimeJumpData(int i, long j, long j2, long j3, long j4, int i2, long j5, int i3) {
        this.id = i;
        this.timestampNano = j;
        this.previousTimestampNano = j2;
        this.timeDeltaNano = j3;
        this.totalJumpNano = j4;
        this.jumpCount = i2;
        this.firstGyroTime = j5;
        this.sensorType = i3;
    }

    public final long getFirstGyroTime() {
        return this.firstGyroTime;
    }

    public final int getId() {
        return this.id;
    }

    public final int getJumpCount() {
        return this.jumpCount;
    }

    public final long getPreviousTimestampNano() {
        return this.previousTimestampNano;
    }

    public final int getSensorType() {
        return this.sensorType;
    }

    public final long getTimeDeltaNano() {
        return this.timeDeltaNano;
    }

    public final long getTimestampNano() {
        return this.timestampNano;
    }

    public final long getTotalJumpNano() {
        return this.totalJumpNano;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return MapsKt.j(new Pair("id", Integer.valueOf(this.id)), new Pair("timestampNano", Long.valueOf(this.timestampNano)), new Pair("previousTimestampNano", Long.valueOf(this.previousTimestampNano)), new Pair("timeDeltaNano", Long.valueOf(this.timeDeltaNano)), new Pair("totalJumpNano", Long.valueOf(this.totalJumpNano)), new Pair("jumpCount", Integer.valueOf(this.jumpCount)), new Pair("firstGyroTime", Long.valueOf(this.firstGyroTime)), new Pair("sensorType", Integer.valueOf(this.sensorType)));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorTimeJumpData{id=");
        sb.append(this.id);
        sb.append(", timestampNano=");
        sb.append(this.timestampNano);
        sb.append(", previousTimestampNano=");
        sb.append(this.previousTimestampNano);
        sb.append(", timeDeltaNano=");
        sb.append(this.timeDeltaNano);
        sb.append(", totalJumpNano=");
        sb.append(this.totalJumpNano);
        sb.append(", jumpCount=");
        sb.append(this.jumpCount);
        sb.append(", firstGyroTime=");
        sb.append(this.firstGyroTime);
        sb.append(", sensorType=");
        return YU.a.l(sb, this.sensorType, '}');
    }
}
