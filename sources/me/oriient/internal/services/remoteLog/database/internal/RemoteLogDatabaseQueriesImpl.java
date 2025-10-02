package me.oriient.internal.services.remoteLog.database.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.QueryKt;
import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.db.SqlPreparedStatement;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.internal.a;
import me.oriient.internal.services.remoteLog.database.GetLastMessagesShort;
import me.oriient.internal.services.remoteLog.database.RemoteLogBatchConfigTable;
import me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries;
import me.oriient.internal.services.remoteLog.database.RemoteLogMessagesTable;
import me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003DEFB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0016J»\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002030\n2\u0006\u00104\u001a\u00020 H\u0016JX\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2\u0006\u00104\u001a\u00020 26\u0010%\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H#05H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002070\n2\u0006\u00106\u001a\u00020'H\u0016Jm\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2\u0006\u00106\u001a\u00020'2K\u0010%\u001aG\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u001109¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H#08H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010/\u001a\u00020 H\u0016JÃ\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2\u0006\u0010/\u001a\u00020 2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0016J»\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0016J»\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0016J»\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0016J»\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\b\b\u0000\u0010#*\u00020$2 \u0001\u0010%\u001a\u009b\u0001\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110 ¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(/\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(1\u0012\u0013\u0012\u001100¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002H#0&H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020'H\u0016J\u0016\u0010<\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020'0>H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u00106\u001a\u00020'H\u0016J\u0016\u0010@\u001a\u00020\u001e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020 0>H\u0016J@\u0010B\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0016J \u0010C\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020 2\u0006\u0010:\u001a\u0002092\u0006\u00106\u001a\u00020'H\u0016R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f¨\u0006G"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabaseQueries;", "database", "Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "countMessages", "", "Lcom/squareup/sqldelight/Query;", "getCountMessages$internal_publishRelease", "()Ljava/util/List;", "getBatches", "getGetBatches$internal_publishRelease", "getLastMessagesShort", "getGetLastMessagesShort$internal_publishRelease", "getMessagesForBatch", "getGetMessagesForBatch$internal_publishRelease", "getPassedTimeBatches", "getGetPassedTimeBatches$internal_publishRelease", "getScheduledBatches", "getGetScheduledBatches$internal_publishRelease", "getScheduledMeteredBatches", "getGetScheduledMeteredBatches$internal_publishRelease", "getScheduledNotChargerBatches", "getGetScheduledNotChargerBatches$internal_publishRelease", "getScheduledNotChargerMeteredBatches", "getGetScheduledNotChargerMeteredBatches$internal_publishRelease", "clearBatches", "", "timeToDelete", "", "clearMessages", "Lme/oriient/internal/services/remoteLog/database/RemoteLogBatchConfigTable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "url", "time", "", "retries", "timeToSend", "", "requireCharger", "allowMeteredNetworks", "Lme/oriient/internal/services/remoteLog/database/GetLastMessagesShort;", "amount", "Lkotlin/Function2;", "batchId", "Lme/oriient/internal/services/remoteLog/database/RemoteLogMessagesTable;", "Lkotlin/Function3;", "", "message", "removeBatchConfig", "removeBatchConfigsWithoutMessages", "ids", "", "removeBatchMessages", "removeMessages", "msgTimes", "upsertBatchConfig", "upsertMessage", "GetLastMessagesShortQuery", "GetMessagesForBatchQuery", "GetPassedTimeBatchesQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RemoteLogDatabaseQueriesImpl extends TransacterImpl implements RemoteLogDatabaseQueries {

    @NotNull
    private final List<Query<?>> countMessages;

    @NotNull
    private final RemoteLogDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getBatches;

    @NotNull
    private final List<Query<?>> getLastMessagesShort;

    @NotNull
    private final List<Query<?>> getMessagesForBatch;

    @NotNull
    private final List<Query<?>> getPassedTimeBatches;

    @NotNull
    private final List<Query<?>> getScheduledBatches;

    @NotNull
    private final List<Query<?>> getScheduledMeteredBatches;

    @NotNull
    private final List<Query<?>> getScheduledNotChargerBatches;

    @NotNull
    private final List<Query<?>> getScheduledNotChargerMeteredBatches;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl$GetLastMessagesShortQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "amount", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getAmount", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetLastMessagesShortQuery<T> extends Query<T> {
        private final long amount;
        final /* synthetic */ RemoteLogDatabaseQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLastMessagesShortQuery(RemoteLogDatabaseQueriesImpl remoteLogDatabaseQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(remoteLogDatabaseQueriesImpl.getGetLastMessagesShort$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = remoteLogDatabaseQueriesImpl;
            this.amount = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-1434142505, "SELECT time, batchId FROM RemoteLogMessagesTable WHERE time IN (SELECT (time) FROM RemoteLogMessagesTable ORDER BY time LIMIT ?)", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl$GetLastMessagesShortQuery$execute$1
                final /* synthetic */ RemoteLogDatabaseQueriesImpl.GetLastMessagesShortQuery<T> this$0;

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
                    executeQuery.c(1, Long.valueOf(this.this$0.getAmount()));
                }
            });
        }

        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        public String toString() {
            return "RemoteLogDatabase.sq:getLastMessagesShort";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl$GetMessagesForBatchQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "batchId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBatchId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetMessagesForBatchQuery<T> extends Query<T> {

        @NotNull
        private final String batchId;
        final /* synthetic */ RemoteLogDatabaseQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMessagesForBatchQuery(@NotNull RemoteLogDatabaseQueriesImpl remoteLogDatabaseQueriesImpl, @NotNull String batchId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(remoteLogDatabaseQueriesImpl.getGetMessagesForBatch$internal_publishRelease(), mapper);
            Intrinsics.h(batchId, "batchId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = remoteLogDatabaseQueriesImpl;
            this.batchId = batchId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(297334912, "SELECT * FROM RemoteLogMessagesTable WHERE batchId=?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl$GetMessagesForBatchQuery$execute$1
                final /* synthetic */ RemoteLogDatabaseQueriesImpl.GetMessagesForBatchQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getBatchId());
                }
            });
        }

        @NotNull
        public final String getBatchId() {
            return this.batchId;
        }

        @NotNull
        public String toString() {
            return "RemoteLogDatabase.sq:getMessagesForBatch";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl$GetPassedTimeBatchesQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "timeToSend", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getTimeToSend", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetPassedTimeBatchesQuery<T> extends Query<T> {
        final /* synthetic */ RemoteLogDatabaseQueriesImpl this$0;
        private final long timeToSend;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPassedTimeBatchesQuery(RemoteLogDatabaseQueriesImpl remoteLogDatabaseQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(remoteLogDatabaseQueriesImpl.getGetPassedTimeBatches$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = remoteLogDatabaseQueriesImpl;
            this.timeToSend = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-1738180472, "SELECT * FROM RemoteLogBatchConfigTable WHERE timeToSend<=? AND timeToSend>=0", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl$GetPassedTimeBatchesQuery$execute$1
                final /* synthetic */ RemoteLogDatabaseQueriesImpl.GetPassedTimeBatchesQuery<T> this$0;

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
                    executeQuery.c(1, Long.valueOf(this.this$0.getTimeToSend()));
                }
            });
        }

        public final long getTimeToSend() {
            return this.timeToSend;
        }

        @NotNull
        public String toString() {
            return "RemoteLogDatabase.sq:getPassedTimeBatches";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLogDatabaseQueriesImpl(@NotNull RemoteLogDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getMessagesForBatch = new CopyOnWriteArrayList();
        this.countMessages = new CopyOnWriteArrayList();
        this.getLastMessagesShort = new CopyOnWriteArrayList();
        this.getPassedTimeBatches = new CopyOnWriteArrayList();
        this.getScheduledBatches = new CopyOnWriteArrayList();
        this.getScheduledNotChargerBatches = new CopyOnWriteArrayList();
        this.getScheduledMeteredBatches = new CopyOnWriteArrayList();
        this.getScheduledNotChargerMeteredBatches = new CopyOnWriteArrayList();
        this.getBatches = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void clearBatches(final long timeToDelete) {
        this.driver.t1(1524952910, "DELETE FROM RemoteLogBatchConfigTable WHERE time < ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.clearBatches.1
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
                execute.c(1, Long.valueOf(timeToDelete));
            }
        });
        notifyQueries(1524952910, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.clearBatches.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerBatches$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetPassedTimeBatches$internal_publishRelease())))));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void clearMessages(final long timeToDelete) {
        this.driver.t1(1260932134, "DELETE FROM RemoteLogMessagesTable WHERE time < ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.clearMessages.1
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
                execute.c(1, Long.valueOf(timeToDelete));
            }
        });
        notifyQueries(1260932134, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.clearMessages.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getCountMessages$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetMessagesForBatch$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetLastMessagesShort$internal_publishRelease()));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<Long> countMessages() {
        return QueryKt.a(1087112424, this.countMessages, this.driver, "RemoteLogDatabase.sq", "countMessages", "SELECT COUNT(time) FROM RemoteLogMessagesTable", new Function1<SqlCursor, Long>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.countMessages.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Long invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                return l;
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getBatches(@NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(1028860645, this.getBatches, this.driver, "RemoteLogDatabase.sq", "getBatches", "SELECT * FROM RemoteLogBatchConfigTable", new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getCountMessages$internal_publishRelease() {
        return this.countMessages;
    }

    @NotNull
    public final List<Query<?>> getGetBatches$internal_publishRelease() {
        return this.getBatches;
    }

    @NotNull
    public final List<Query<?>> getGetLastMessagesShort$internal_publishRelease() {
        return this.getLastMessagesShort;
    }

    @NotNull
    public final List<Query<?>> getGetMessagesForBatch$internal_publishRelease() {
        return this.getMessagesForBatch;
    }

    @NotNull
    public final List<Query<?>> getGetPassedTimeBatches$internal_publishRelease() {
        return this.getPassedTimeBatches;
    }

    @NotNull
    public final List<Query<?>> getGetScheduledBatches$internal_publishRelease() {
        return this.getScheduledBatches;
    }

    @NotNull
    public final List<Query<?>> getGetScheduledMeteredBatches$internal_publishRelease() {
        return this.getScheduledMeteredBatches;
    }

    @NotNull
    public final List<Query<?>> getGetScheduledNotChargerBatches$internal_publishRelease() {
        return this.getScheduledNotChargerBatches;
    }

    @NotNull
    public final List<Query<?>> getGetScheduledNotChargerMeteredBatches$internal_publishRelease() {
        return this.getScheduledNotChargerMeteredBatches;
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getLastMessagesShort(long amount, @NotNull final Function2<? super Long, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetLastMessagesShortQuery(this, amount, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getLastMessagesShort.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function2<Long, String, T> function2 = mapper;
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                String string = cursor.getString(1);
                Intrinsics.e(string);
                return (T) function2.invoke(l, string);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getMessagesForBatch(@NotNull String batchId, @NotNull final Function3<? super Long, ? super byte[], ? super String, ? extends T> mapper) {
        Intrinsics.h(batchId, "batchId");
        Intrinsics.h(mapper, "mapper");
        return new GetMessagesForBatchQuery(this, batchId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getMessagesForBatch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function3<Long, byte[], String, T> function3 = mapper;
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                byte[] bytes = cursor.getBytes(1);
                Intrinsics.e(bytes);
                String string = cursor.getString(2);
                Intrinsics.e(string);
                return (T) function3.invoke(l, bytes, string);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getPassedTimeBatches(long timeToSend, @NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetPassedTimeBatchesQuery(this, timeToSend, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getPassedTimeBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getScheduledBatches(@NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(2067781406, this.getScheduledBatches, this.driver, "RemoteLogDatabase.sq", "getScheduledBatches", "SELECT * FROM RemoteLogBatchConfigTable WHERE timeToSend<0", new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getScheduledMeteredBatches(@NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-714075158, this.getScheduledMeteredBatches, this.driver, "RemoteLogDatabase.sq", "getScheduledMeteredBatches", "SELECT * FROM RemoteLogBatchConfigTable WHERE timeToSend<0 AND allowMeteredNetworks>0", new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledMeteredBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getScheduledNotChargerBatches(@NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-969083085, this.getScheduledNotChargerBatches, this.driver, "RemoteLogDatabase.sq", "getScheduledNotChargerBatches", "SELECT * FROM RemoteLogBatchConfigTable WHERE timeToSend<0 AND requireCharger=0", new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledNotChargerBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public <T> Query<T> getScheduledNotChargerMeteredBatches(@NotNull final Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(1323803189, this.getScheduledNotChargerMeteredBatches, this.driver, "RemoteLogDatabase.sq", "getScheduledNotChargerMeteredBatches", "SELECT * FROM RemoteLogBatchConfigTable WHERE timeToSend<0 AND allowMeteredNetworks>0 AND requireCharger=0", new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledNotChargerMeteredBatches.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Long, Integer, Long, Boolean, Boolean, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Long l2 = cursor.getLong(3);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(4);
                Intrinsics.e(l3);
                Long l4 = cursor.getLong(5);
                Intrinsics.e(l4);
                Boolean boolValueOf = Boolean.valueOf(l4.longValue() == 1);
                Long l5 = cursor.getLong(6);
                Intrinsics.e(l5);
                return (T) function7.invoke(string, strA, l, numValueOf, l3, boolValueOf, Boolean.valueOf(l5.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void removeBatchConfig(@NotNull final String id) {
        Intrinsics.h(id, "id");
        this.driver.t1(-1454000411, "DELETE FROM RemoteLogBatchConfigTable WHERE id=?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchConfig.1
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
                execute.z(1, id);
            }
        });
        notifyQueries(-1454000411, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchConfig.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerBatches$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetPassedTimeBatches$internal_publishRelease())))));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void removeBatchConfigsWithoutMessages(@NotNull final Collection<String> ids) {
        Intrinsics.h(ids, "ids");
        String strCreateArguments = createArguments(ids.size());
        ids.size();
        this.driver.t1(null, "DELETE FROM RemoteLogBatchConfigTable WHERE id IN " + strCreateArguments + " AND id NOT IN (SELECT DISTINCT batchId FROM RemoteLogMessagesTable)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchConfigsWithoutMessages.1
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
                int i = 0;
                for (Object obj : ids) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.z(i2, (String) obj);
                    i = i2;
                }
            }
        });
        notifyQueries(1287835174, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchConfigsWithoutMessages.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerBatches$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetPassedTimeBatches$internal_publishRelease())))));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void removeBatchMessages(@NotNull final String batchId) {
        Intrinsics.h(batchId, "batchId");
        this.driver.t1(-1311975377, "DELETE FROM RemoteLogMessagesTable WHERE batchId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchMessages.1
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
                execute.z(1, batchId);
            }
        });
        notifyQueries(-1311975377, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeBatchMessages.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getCountMessages$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetMessagesForBatch$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetLastMessagesShort$internal_publishRelease()));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void removeMessages(@NotNull final Collection<Long> msgTimes) {
        Intrinsics.h(msgTimes, "msgTimes");
        String strCreateArguments = createArguments(msgTimes.size());
        msgTimes.size();
        this.driver.t1(null, "DELETE FROM RemoteLogMessagesTable WHERE time IN " + strCreateArguments, new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeMessages.1
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
                int i = 0;
                for (Object obj : msgTimes) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.c(i2, Long.valueOf(((Number) obj).longValue()));
                    i = i2;
                }
            }
        });
        notifyQueries(1227979299, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.removeMessages.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getCountMessages$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetMessagesForBatch$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetLastMessagesShort$internal_publishRelease()));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void upsertBatchConfig(@NotNull final String id, @NotNull final String url, final long time, final int retries, final long timeToSend, final boolean requireCharger, final boolean allowMeteredNetworks) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        this.driver.t1(1315900762, "INSERT OR REPLACE INTO RemoteLogBatchConfigTable(id, url, time, retries, timeToSend, requireCharger, allowMeteredNetworks) VALUES (?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.upsertBatchConfig.1
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
                execute.z(1, id);
                execute.z(2, url);
                execute.c(3, Long.valueOf(time));
                execute.c(4, Long.valueOf(retries));
                execute.c(5, Long.valueOf(timeToSend));
                execute.c(6, Long.valueOf(requireCharger ? 1L : 0L));
                execute.c(7, Long.valueOf(allowMeteredNetworks ? 1L : 0L));
            }
        });
        notifyQueries(1315900762, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.upsertBatchConfig.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledMeteredBatches$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetScheduledNotChargerBatches$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetPassedTimeBatches$internal_publishRelease())))));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    public void upsertMessage(final long time, @NotNull final byte[] message, @NotNull final String batchId) {
        Intrinsics.h(message, "message");
        Intrinsics.h(batchId, "batchId");
        this.driver.t1(-357996219, "INSERT OR REPLACE INTO RemoteLogMessagesTable(time, message, batchId) VALUES (?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.upsertMessage.1
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
                execute.c(1, Long.valueOf(time));
                execute.e(2, message);
                execute.z(3, batchId);
            }
        });
        notifyQueries(-357996219, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.upsertMessage.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getCountMessages$internal_publishRelease(), CollectionsKt.c0(RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetMessagesForBatch$internal_publishRelease(), RemoteLogDatabaseQueriesImpl.this.database.getRemoteLogDatabaseQueries().getGetLastMessagesShort$internal_publishRelease()));
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<GetLastMessagesShort> getLastMessagesShort(long amount) {
        return getLastMessagesShort(amount, new Function2<Long, String, GetLastMessagesShort>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getLastMessagesShort.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (String) obj2);
            }

            @NotNull
            public final GetLastMessagesShort invoke(long j, @NotNull String batchId) {
                Intrinsics.h(batchId, "batchId");
                return new GetLastMessagesShort(j, batchId);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogMessagesTable> getMessagesForBatch(@NotNull String batchId) {
        Intrinsics.h(batchId, "batchId");
        return getMessagesForBatch(batchId, new Function3<Long, byte[], String, RemoteLogMessagesTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getMessagesForBatch.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).longValue(), (byte[]) obj2, (String) obj3);
            }

            @NotNull
            public final RemoteLogMessagesTable invoke(long j, @NotNull byte[] message, @NotNull String batchId_) {
                Intrinsics.h(message, "message");
                Intrinsics.h(batchId_, "batchId_");
                return new RemoteLogMessagesTable(j, message, batchId_);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getPassedTimeBatches(long timeToSend) {
        return getPassedTimeBatches(timeToSend, new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getPassedTimeBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getBatches() {
        return getBatches(new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getScheduledBatches() {
        return getScheduledBatches(new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getScheduledMeteredBatches() {
        return getScheduledMeteredBatches(new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledMeteredBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getScheduledNotChargerBatches() {
        return getScheduledNotChargerBatches(new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledNotChargerBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabaseQueries
    @NotNull
    public Query<RemoteLogBatchConfigTable> getScheduledNotChargerMeteredBatches() {
        return getScheduledNotChargerMeteredBatches(new Function7<String, String, Long, Integer, Long, Boolean, Boolean, RemoteLogBatchConfigTable>() { // from class: me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseQueriesImpl.getScheduledNotChargerMeteredBatches.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).intValue(), ((Number) obj5).longValue(), ((Boolean) obj6).booleanValue(), ((Boolean) obj7).booleanValue());
            }

            @NotNull
            public final RemoteLogBatchConfigTable invoke(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(url, "url");
                return new RemoteLogBatchConfigTable(id, url, j, i, j2, z, z2);
            }
        });
    }
}
