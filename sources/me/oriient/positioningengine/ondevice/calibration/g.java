package me.oriient.positioningengine.ondevice.calibration;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.ondevice.calibration.database.CalibrationInfoSqlDatabase;
import me.oriient.positioningengine.ondevice.calibration.database.CalibrationRecordTable;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g implements CalibrationInfoDatabase {

    @NotNull
    public static final f Companion = new f();

    /* renamed from: a, reason: collision with root package name */
    public final CalibrationInfoSqlDatabase f26416a;
    public final Lazy b;

    public g(CalibrationInfoSqlDatabase database) {
        Intrinsics.h(database, "database");
        this.f26416a = database;
        this.b = DiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.CalibrationInfoDatabase
    public final Object getCalibrationRecord(me.oriient.positioningengine.ondevice.models.calibration.c cVar, Continuation continuation) {
        CalibrationRecordTable calibrationRecordTableExecuteAsOneOrNull = this.f26416a.getCalibationInfoSqlDatabaseQueries().getCalibrationRecord(cVar.getValue()).executeAsOneOrNull();
        if (calibrationRecordTableExecuteAsOneOrNull == null) {
            return null;
        }
        try {
            return new me.oriient.positioningengine.ondevice.models.calibration.b(calibrationRecordTableExecuteAsOneOrNull.getTimeCreatedInMillis(), calibrationRecordTableExecuteAsOneOrNull.getSessionId(), (EngineCalibrationInfo) ByteArrayExtensionsKt.toSerializableObject(calibrationRecordTableExecuteAsOneOrNull.getCalibrationInfo()), cVar);
        } catch (Exception e) {
            ((Logger) this.b.getD()).e("CalibrationInfoDatabase", "getEngineCalibrationInfo: failed to parse calibration info", e);
            return null;
        }
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.CalibrationInfoDatabase
    public final Object upsertCalibrationRecord(me.oriient.positioningengine.ondevice.models.calibration.b bVar, Continuation continuation) {
        try {
            this.f26416a.getCalibationInfoSqlDatabaseQueries().upsertCalibrationRecord(bVar.f26472a, bVar.b, ByteArrayExtensionsKt.toByteArray(bVar.c), bVar.d.getValue());
        } catch (Exception e) {
            ((Logger) this.b.getD()).e("CalibrationInfoDatabase", "failed to save calibration record", e);
        }
        return Unit.f24250a;
    }
}
