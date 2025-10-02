package me.oriient.internal.services.plai.database.internal;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.plai.database.DbPlaiStatistics;
import me.oriient.internal.services.plai.database.PlaiStatisticsQueries;
import me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001f B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016JX\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u001326\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016JX\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001826\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/plai/database/PlaiStatisticsQueries;", "database", "Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getExpiredStatistics", "", "Lcom/squareup/sqldelight/Query;", "getGetExpiredStatistics$internal_publishRelease", "()Ljava/util/List;", "getStatistics", "getGetStatistics$internal_publishRelease", "clearStatistics", "", "Lme/oriient/internal/services/plai/database/DbPlaiStatistics;", "timestamp", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "buildingId", "lastUpdatedTimestampMillis", "removeBuildingStatistics", "upsertStatistics", "GetExpiredStatisticsQuery", "GetStatisticsQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaiStatisticsQueriesImpl extends TransacterImpl implements PlaiStatisticsQueries {

    @NotNull
    private final PlaiSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getExpiredStatistics;

    @NotNull
    private final List<Query<?>> getStatistics;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl$GetExpiredStatisticsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "timestamp", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getTimestamp", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetExpiredStatisticsQuery<T> extends Query<T> {
        final /* synthetic */ PlaiStatisticsQueriesImpl this$0;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetExpiredStatisticsQuery(PlaiStatisticsQueriesImpl plaiStatisticsQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiStatisticsQueriesImpl.getGetExpiredStatistics$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiStatisticsQueriesImpl;
            this.timestamp = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(628123607, "SELECT * FROM DbPlaiStatistics WHERE lastUpdatedTimestampMillis < ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl$GetExpiredStatisticsQuery$execute$1
                final /* synthetic */ PlaiStatisticsQueriesImpl.GetExpiredStatisticsQuery<T> this$0;

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
                    executeQuery.c(1, Long.valueOf(this.this$0.getTimestamp()));
                }
            });
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public String toString() {
            return "PlaiStatistics.sq:getExpiredStatistics";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl$GetStatisticsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetStatisticsQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ PlaiStatisticsQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetStatisticsQuery(@NotNull PlaiStatisticsQueriesImpl plaiStatisticsQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiStatisticsQueriesImpl.getGetStatistics$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiStatisticsQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(198052436, "SELECT * FROM DbPlaiStatistics WHERE buildingId = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl$GetStatisticsQuery$execute$1
                final /* synthetic */ PlaiStatisticsQueriesImpl.GetStatisticsQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getBuildingId());
                }
            });
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public String toString() {
            return "PlaiStatistics.sq:getStatistics";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaiStatisticsQueriesImpl(@NotNull PlaiSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getStatistics = new CopyOnWriteArrayList();
        this.getExpiredStatistics = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    public void clearStatistics() {
        this.driver.t1(-436222517, "DELETE FROM DbPlaiStatistics", null);
        notifyQueries(-436222517, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.clearStatistics.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetExpiredStatistics$internal_publishRelease(), PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    @NotNull
    public <T> Query<T> getExpiredStatistics(long timestamp, @NotNull final Function2<? super String, ? super Long, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetExpiredStatisticsQuery(this, timestamp, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.getExpiredStatistics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function2<String, Long, T> function2 = mapper;
                String string = cursor.getString(0);
                Intrinsics.e(string);
                Long l = cursor.getLong(1);
                Intrinsics.e(l);
                return (T) function2.invoke(string, l);
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetExpiredStatistics$internal_publishRelease() {
        return this.getExpiredStatistics;
    }

    @NotNull
    public final List<Query<?>> getGetStatistics$internal_publishRelease() {
        return this.getStatistics;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    @NotNull
    public <T> Query<T> getStatistics(@NotNull String buildingId, @NotNull final Function2<? super String, ? super Long, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetStatisticsQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.getStatistics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function2<String, Long, T> function2 = mapper;
                String string = cursor.getString(0);
                Intrinsics.e(string);
                Long l = cursor.getLong(1);
                Intrinsics.e(l);
                return (T) function2.invoke(string, l);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    public void removeBuildingStatistics(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(1352976000, "DELETE FROM DbPlaiStatistics WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.removeBuildingStatistics.1
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
                execute.z(1, buildingId);
            }
        });
        notifyQueries(1352976000, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.removeBuildingStatistics.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetExpiredStatistics$internal_publishRelease(), PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    public void upsertStatistics(@NotNull final String buildingId, final long lastUpdatedTimestampMillis) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(1711392919, "INSERT OR REPLACE INTO DbPlaiStatistics(buildingId, lastUpdatedTimestampMillis) VALUES (?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.upsertStatistics.1
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
                execute.z(1, buildingId);
                execute.c(2, Long.valueOf(lastUpdatedTimestampMillis));
            }
        });
        notifyQueries(1711392919, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.upsertStatistics.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetExpiredStatistics$internal_publishRelease(), PlaiStatisticsQueriesImpl.this.database.getPlaiStatisticsQueries().getGetStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    @NotNull
    public Query<DbPlaiStatistics> getExpiredStatistics(long timestamp) {
        return getExpiredStatistics(timestamp, new Function2<String, Long, DbPlaiStatistics>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.getExpiredStatistics.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((String) obj, ((Number) obj2).longValue());
            }

            @NotNull
            public final DbPlaiStatistics invoke(@NotNull String buildingId, long j) {
                Intrinsics.h(buildingId, "buildingId");
                return new DbPlaiStatistics(buildingId, j);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiStatisticsQueries
    @NotNull
    public Query<DbPlaiStatistics> getStatistics(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getStatistics(buildingId, new Function2<String, Long, DbPlaiStatistics>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiStatisticsQueriesImpl.getStatistics.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((String) obj, ((Number) obj2).longValue());
            }

            @NotNull
            public final DbPlaiStatistics invoke(@NotNull String buildingId_, long j) {
                Intrinsics.h(buildingId_, "buildingId_");
                return new DbPlaiStatistics(buildingId_, j);
            }
        });
    }
}
