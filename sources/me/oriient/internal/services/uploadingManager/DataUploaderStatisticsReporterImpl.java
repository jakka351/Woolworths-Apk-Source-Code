package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.time.TimeFormattingExtKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderStatisticsReporterImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploaderStatisticsReporter;", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "filesManager", "<init>", "(Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;)V", "", "timeMillis", "", "setLastUploadSuccessTime", "(J)V", "setLastUploadStartTime", "", "error", "addUploadError", "(Ljava/lang/String;)V", "cleanErrors", "()V", "reportDeviceStatistics", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "Lkotlin/Lazy;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "lastSuccessTimeMillis", "J", "lastUploadStartTimeMillis", "", "errorsCount", "I", "Companion", "me/oriient/internal/services/uploadingManager/U", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderStatisticsReporterImpl implements DataUploaderStatisticsReporter {

    @NotNull
    private static final U Companion = new U();

    @NotNull
    private static final String TAG = "DataUploaderStatisticsR";

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;
    private int errorsCount;

    @NotNull
    private final DataUploaderFilesManager filesManager;
    private long lastSuccessTimeMillis;
    private long lastUploadStartTimeMillis;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public DataUploaderStatisticsReporterImpl(@NotNull DataUploaderFilesManager filesManager) {
        Intrinsics.h(filesManager, "filesManager");
        this.filesManager = filesManager;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.eLog = di.inject(reflectionFactory.b(ELog.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderStatisticsReporter
    public void addUploadError(@NotNull String error) {
        Intrinsics.h(error, "error");
        this.errorsCount++;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderStatisticsReporter
    public void cleanErrors() {
        this.errorsCount = 0;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderStatisticsReporter
    public void reportDeviceStatistics() {
        DataUploaderFilesManager.FileManagerStats fileManagerStatsCalculateStoredRecordsData = this.filesManager.calculateStoredRecordsData();
        long j = 1048576;
        getELog().d(TAG, "Device stats", MapsKt.j(new Pair("errorsCount", Integer.valueOf(this.errorsCount)), new Pair("lastSuccessTime", TimeFormattingExtKt.toIso8601WithoutTimezone(this.lastSuccessTimeMillis, getTimeProvider().getTimeZoneGmt())), new Pair("lastUploadStartTime", TimeFormattingExtKt.toIso8601WithoutTimezone(this.lastUploadStartTimeMillis, getTimeProvider().getTimeZoneGmt())), new Pair("recordsCount", Integer.valueOf(fileManagerStatsCalculateStoredRecordsData.getRecordsCount())), new Pair("recordsSizeMB", Long.valueOf(fileManagerStatsCalculateStoredRecordsData.getTotalSizeBytes() / j)), new Pair("freeSizeMB", Long.valueOf(fileManagerStatsCalculateStoredRecordsData.getFreeSizeBytes() / j))));
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderStatisticsReporter
    public void setLastUploadStartTime(long timeMillis) {
        this.lastUploadStartTimeMillis = timeMillis;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderStatisticsReporter
    public void setLastUploadSuccessTime(long timeMillis) {
        this.lastSuccessTimeMillis = timeMillis;
    }
}
