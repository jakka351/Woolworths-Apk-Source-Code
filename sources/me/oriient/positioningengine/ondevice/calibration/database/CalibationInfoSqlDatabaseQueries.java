package me.oriient.positioningengine.ondevice.calibration.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0082\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062`\u0010\t\u001a\\\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H\u00070\nH&J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H&¨\u0006\u0016"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/CalibationInfoSqlDatabaseQueries;", "Lcom/squareup/sqldelight/Transacter;", "getCalibrationRecord", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/positioningengine/ondevice/calibration/database/CalibrationRecordTable;", "type", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "timeCreatedInMillis", "", "sessionId", "", "calibrationInfo", "calibrationType", "upsertCalibrationRecord", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CalibationInfoSqlDatabaseQueries extends Transacter {
    @NotNull
    Query<CalibrationRecordTable> getCalibrationRecord(int type);

    @NotNull
    <T> Query<T> getCalibrationRecord(int type, @NotNull Function4<? super Long, ? super String, ? super byte[], ? super Integer, ? extends T> mapper);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertCalibrationRecord(long timeCreatedInMillis, @NotNull String sessionId, @NotNull byte[] calibrationInfo, int calibrationType);
}
