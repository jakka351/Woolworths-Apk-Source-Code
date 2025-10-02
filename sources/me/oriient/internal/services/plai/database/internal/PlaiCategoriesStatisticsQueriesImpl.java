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
import me.oriient.internal.services.plai.database.DbPlaiCategoriesStatistics;
import me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries;
import me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001f B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016JX\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u001326\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016JX\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001a26\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/plai/database/PlaiCategoriesStatisticsQueries;", "database", "Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getCategoriesStatistics", "", "Lcom/squareup/sqldelight/Query;", "getGetCategoriesStatistics$internal_publishRelease", "()Ljava/util/List;", "getExpiredCategoriesStatistics", "getGetExpiredCategoriesStatistics$internal_publishRelease", "clearStatistics", "", "Lme/oriient/internal/services/plai/database/DbPlaiCategoriesStatistics;", "buildingId", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "lastUpdatedTimestampMillis", "timestamp", "removeBuildingCategoriesStatistics", "upsertCategoriesStatistics", "GetCategoriesStatisticsQuery", "GetExpiredCategoriesStatisticsQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaiCategoriesStatisticsQueriesImpl extends TransacterImpl implements PlaiCategoriesStatisticsQueries {

    @NotNull
    private final PlaiSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getCategoriesStatistics;

    @NotNull
    private final List<Query<?>> getExpiredCategoriesStatistics;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl$GetCategoriesStatisticsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetCategoriesStatisticsQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ PlaiCategoriesStatisticsQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCategoriesStatisticsQuery(@NotNull PlaiCategoriesStatisticsQueriesImpl plaiCategoriesStatisticsQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiCategoriesStatisticsQueriesImpl.getGetCategoriesStatistics$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiCategoriesStatisticsQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-692116332, "SELECT * FROM DbPlaiCategoriesStatistics WHERE buildingId = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl$GetCategoriesStatisticsQuery$execute$1
                final /* synthetic */ PlaiCategoriesStatisticsQueriesImpl.GetCategoriesStatisticsQuery<T> this$0;

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
            return "PlaiCategoriesStatistics.sq:getCategoriesStatistics";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl$GetExpiredCategoriesStatisticsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "timestamp", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getTimestamp", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetExpiredCategoriesStatisticsQuery<T> extends Query<T> {
        final /* synthetic */ PlaiCategoriesStatisticsQueriesImpl this$0;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetExpiredCategoriesStatisticsQuery(PlaiCategoriesStatisticsQueriesImpl plaiCategoriesStatisticsQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiCategoriesStatisticsQueriesImpl.getGetExpiredCategoriesStatistics$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiCategoriesStatisticsQueriesImpl;
            this.timestamp = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(526138703, "SELECT * FROM DbPlaiCategoriesStatistics WHERE lastUpdatedTimestampMillis < ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl$GetExpiredCategoriesStatisticsQuery$execute$1
                final /* synthetic */ PlaiCategoriesStatisticsQueriesImpl.GetExpiredCategoriesStatisticsQuery<T> this$0;

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
            return "PlaiCategoriesStatistics.sq:getExpiredCategoriesStatistics";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaiCategoriesStatisticsQueriesImpl(@NotNull PlaiSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getCategoriesStatistics = new CopyOnWriteArrayList();
        this.getExpiredCategoriesStatistics = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    public void clearStatistics() {
        this.driver.t1(735264271, "DELETE FROM DbPlaiCategoriesStatistics", null);
        notifyQueries(735264271, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.clearStatistics.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetExpiredCategoriesStatistics$internal_publishRelease(), PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetCategoriesStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    @NotNull
    public <T> Query<T> getCategoriesStatistics(@NotNull String buildingId, @NotNull final Function2<? super String, ? super Long, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetCategoriesStatisticsQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.getCategoriesStatistics.1
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

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    @NotNull
    public <T> Query<T> getExpiredCategoriesStatistics(long timestamp, @NotNull final Function2<? super String, ? super Long, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetExpiredCategoriesStatisticsQuery(this, timestamp, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.getExpiredCategoriesStatistics.1
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
    public final List<Query<?>> getGetCategoriesStatistics$internal_publishRelease() {
        return this.getCategoriesStatistics;
    }

    @NotNull
    public final List<Query<?>> getGetExpiredCategoriesStatistics$internal_publishRelease() {
        return this.getExpiredCategoriesStatistics;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    public void removeBuildingCategoriesStatistics(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-2006507848, "DELETE FROM DbPlaiCategoriesStatistics WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.removeBuildingCategoriesStatistics.1
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
        notifyQueries(-2006507848, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.removeBuildingCategoriesStatistics.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetExpiredCategoriesStatistics$internal_publishRelease(), PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetCategoriesStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    public void upsertCategoriesStatistics(@NotNull final String buildingId, final long lastUpdatedTimestampMillis) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(28355599, "INSERT OR REPLACE INTO DbPlaiCategoriesStatistics(buildingId, lastUpdatedTimestampMillis) VALUES (?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.upsertCategoriesStatistics.1
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
        notifyQueries(28355599, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.upsertCategoriesStatistics.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetExpiredCategoriesStatistics$internal_publishRelease(), PlaiCategoriesStatisticsQueriesImpl.this.database.getPlaiCategoriesStatisticsQueries().getGetCategoriesStatistics$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    @NotNull
    public Query<DbPlaiCategoriesStatistics> getCategoriesStatistics(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getCategoriesStatistics(buildingId, new Function2<String, Long, DbPlaiCategoriesStatistics>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.getCategoriesStatistics.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((String) obj, ((Number) obj2).longValue());
            }

            @NotNull
            public final DbPlaiCategoriesStatistics invoke(@NotNull String buildingId_, long j) {
                Intrinsics.h(buildingId_, "buildingId_");
                return new DbPlaiCategoriesStatistics(buildingId_, j);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesStatisticsQueries
    @NotNull
    public Query<DbPlaiCategoriesStatistics> getExpiredCategoriesStatistics(long timestamp) {
        return getExpiredCategoriesStatistics(timestamp, new Function2<String, Long, DbPlaiCategoriesStatistics>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesStatisticsQueriesImpl.getExpiredCategoriesStatistics.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((String) obj, ((Number) obj2).longValue());
            }

            @NotNull
            public final DbPlaiCategoriesStatistics invoke(@NotNull String buildingId, long j) {
                Intrinsics.h(buildingId, "buildingId");
                return new DbPlaiCategoriesStatistics(buildingId, j);
            }
        });
    }
}
