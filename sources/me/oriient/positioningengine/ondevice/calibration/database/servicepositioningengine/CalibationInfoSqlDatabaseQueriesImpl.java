package me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.db.SqlPreparedStatement;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.calibration.database.CalibationInfoSqlDatabaseQueries;
import me.oriient.positioningengine.ondevice.calibration.database.CalibrationRecordTable;
import me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0082\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\b\b\u0000\u0010\u0010*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2`\u0010\u0012\u001a\\\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016J(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibationInfoSqlDatabaseQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/positioningengine/ondevice/calibration/database/CalibationInfoSqlDatabaseQueries;", "database", "Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibrationInfoSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibrationInfoSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getCalibrationRecord", "", "Lcom/squareup/sqldelight/Query;", "getGetCalibrationRecord$service_positioning_engine_publishRelease", "()Ljava/util/List;", "Lme/oriient/positioningengine/ondevice/calibration/database/CalibrationRecordTable;", "type", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "timeCreatedInMillis", "", "sessionId", "", "calibrationInfo", "calibrationType", "upsertCalibrationRecord", "", "GetCalibrationRecordQuery", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CalibationInfoSqlDatabaseQueriesImpl extends TransacterImpl implements CalibationInfoSqlDatabaseQueries {

    @NotNull
    private final CalibrationInfoSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getCalibrationRecord;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibationInfoSqlDatabaseQueriesImpl$GetCalibrationRecordQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "type", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibationInfoSqlDatabaseQueriesImpl;ILkotlin/jvm/functions/Function1;)V", "getType", "()I", "execute", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetCalibrationRecordQuery<T> extends Query<T> {
        final /* synthetic */ CalibationInfoSqlDatabaseQueriesImpl this$0;
        private final int type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCalibrationRecordQuery(CalibationInfoSqlDatabaseQueriesImpl calibationInfoSqlDatabaseQueriesImpl, @NotNull int i, Function1<? super SqlCursor, ? extends T> mapper) {
            super(calibationInfoSqlDatabaseQueriesImpl.getGetCalibrationRecord$service_positioning_engine_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = calibationInfoSqlDatabaseQueriesImpl;
            this.type = i;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1613030479, "SELECT * FROM CalibrationRecordTable WHERE calibrationType = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl$GetCalibrationRecordQuery$execute$1
                final /* synthetic */ CalibationInfoSqlDatabaseQueriesImpl.GetCalibrationRecordQuery<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SqlPreparedStatement) obj);
                    return Unit.f24250a;
                }

                public final void invoke(@NotNull SqlPreparedStatement executeQuery) {
                    Intrinsics.h(executeQuery, "$this$executeQuery");
                    executeQuery.c(1, Long.valueOf(this.this$0.getType()));
                }
            });
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "CalibationInfoSqlDatabase.sq:getCalibrationRecord";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalibationInfoSqlDatabaseQueriesImpl(@NotNull CalibrationInfoSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getCalibrationRecord = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.database.CalibationInfoSqlDatabaseQueries
    @NotNull
    public <T> Query<T> getCalibrationRecord(int type, @NotNull final Function4<? super Long, ? super String, ? super byte[], ? super Integer, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetCalibrationRecordQuery(this, type, new Function1<SqlCursor, T>() { // from class: me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl.getCalibrationRecord.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function4<Long, String, byte[], Integer, T> function4 = mapper;
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                String string = cursor.getString(1);
                Intrinsics.e(string);
                byte[] bytes = cursor.getBytes(2);
                Intrinsics.e(bytes);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                return (T) function4.invoke(l, string, bytes, Integer.valueOf((int) l2.longValue()));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetCalibrationRecord$service_positioning_engine_publishRelease() {
        return this.getCalibrationRecord;
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.database.CalibationInfoSqlDatabaseQueries
    public void upsertCalibrationRecord(final long timeCreatedInMillis, @NotNull final String sessionId, @NotNull final byte[] calibrationInfo, final int calibrationType) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(calibrationInfo, "calibrationInfo");
        this.driver.t1(1648556802, "INSERT OR REPLACE INTO CalibrationRecordTable(timeCreatedInMillis, sessionId, calibrationInfo, calibrationType) VALUES (?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl.upsertCalibrationRecord.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SqlPreparedStatement) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull SqlPreparedStatement execute) {
                Intrinsics.h(execute, "$this$execute");
                execute.c(1, Long.valueOf(timeCreatedInMillis));
                execute.z(2, sessionId);
                execute.e(3, calibrationInfo);
                execute.c(4, Long.valueOf(calibrationType));
            }
        });
        notifyQueries(1648556802, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl.upsertCalibrationRecord.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CalibationInfoSqlDatabaseQueriesImpl.this.database.getCalibationInfoSqlDatabaseQueries().getGetCalibrationRecord$service_positioning_engine_publishRelease();
            }
        });
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.database.CalibationInfoSqlDatabaseQueries
    @NotNull
    public Query<CalibrationRecordTable> getCalibrationRecord(int type) {
        return getCalibrationRecord(type, new Function4<Long, String, byte[], Integer, CalibrationRecordTable>() { // from class: me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine.CalibationInfoSqlDatabaseQueriesImpl.getCalibrationRecord.2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return invoke(((Number) obj).longValue(), (String) obj2, (byte[]) obj3, ((Number) obj4).intValue());
            }

            @NotNull
            public final CalibrationRecordTable invoke(long j, @NotNull String sessionId, @NotNull byte[] calibrationInfo, int i) {
                Intrinsics.h(sessionId, "sessionId");
                Intrinsics.h(calibrationInfo, "calibrationInfo");
                return new CalibrationRecordTable(j, sessionId, calibrationInfo, i);
            }
        });
    }
}
