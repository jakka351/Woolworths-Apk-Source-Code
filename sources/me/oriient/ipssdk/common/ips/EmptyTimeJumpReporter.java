package me.oriient.ipssdk.common.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.SensorTimeJumpData;
import me.oriient.internal.services.sensorsManager.TimeJumpReporter;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/ips/EmptyTimeJumpReporter;", "Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;", "()V", "isEmpty", "", "()Z", "reportTimeJump", "", "sensorType", "", "data", "Lme/oriient/internal/services/sensorsManager/SensorTimeJumpData;", "eLog", "Lme/oriient/internal/services/elog/ELog;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyTimeJumpReporter implements TimeJumpReporter {
    @Override // me.oriient.internal.services.sensorsManager.TimeJumpReporter
    public boolean isEmpty() {
        return true;
    }

    @Override // me.oriient.internal.services.sensorsManager.TimeJumpReporter
    public void reportTimeJump(int sensorType, @NotNull SensorTimeJumpData data, @NotNull ELog eLog) {
        Intrinsics.h(data, "data");
        Intrinsics.h(eLog, "eLog");
    }
}
