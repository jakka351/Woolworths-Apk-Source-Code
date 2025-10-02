package me.oriient.internal.services.sensorsManager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class M extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorWrapper f25557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(SensorWrapper sensorWrapper, Looper looper) {
        super(looper);
        Intrinsics.h(looper, "looper");
        this.f25557a = sensorWrapper;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.h(msg, "msg");
        if (this.f25557a.sensorTimeJumpData == null) {
            ELog eLog = this.f25557a.getELog();
            String str = SensorWrapper.TAG;
            Intrinsics.g(str, "access$getTAG$cp(...)");
            eLog.e(str, "reportTimeJump: jump data is null");
            return;
        }
        if (this.f25557a.timeJumpReporter == null || this.f25557a.timeJumpReporter.isEmpty()) {
            ELog eLog2 = this.f25557a.getELog();
            String str2 = SensorWrapper.TAG;
            Intrinsics.g(str2, "access$getTAG$cp(...)");
            eLog2.w(str2, "reportTimeJump", MapsKt.i(new Pair("reportTimeJump", this.f25557a.sensorTimeJumpData)));
            return;
        }
        TimeJumpReporter timeJumpReporter = this.f25557a.timeJumpReporter;
        int type = this.f25557a.getType();
        SensorTimeJumpData sensorTimeJumpData = this.f25557a.sensorTimeJumpData;
        Intrinsics.e(sensorTimeJumpData);
        timeJumpReporter.reportTimeJump(type, sensorTimeJumpData, this.f25557a.getELog());
    }
}
