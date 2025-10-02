package me.oriient.internal.services.dataManager.database.internal;

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
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.DbObstacles;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;
import me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002()B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016JÓ\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00180\n\"\b\b\u0000\u0010\u0018*\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112 \u0001\u0010\u001a\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u00180\u001bH\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010%\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J(\u0010&\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J8\u0010'\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006*"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/dataManager/database/ObstaclesQueries;", "database", "Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getExpiredObstaclesFilePaths", "", "Lcom/squareup/sqldelight/Query;", "getGetExpiredObstaclesFilePaths$internal_publishRelease", "()Ljava/util/List;", "getObstacles", "getGetObstacles$internal_publishRelease", "clearObstacles", "", "", "timestamp", "", "Lme/oriient/internal/services/dataManager/database/DbObstacles;", "buildingId", "floorId", "spaceId", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "mapId", "", "mapVersion", "filePath", "lastReadTimeStampMillis", "removeBuildingObstacles", "removeExpiredObstacles", "removeObstacles", "updateObstaclesReadTimestamp", "upsertObstacles", "GetExpiredObstaclesFilePathsQuery", "GetObstaclesQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ObstaclesQueriesImpl extends TransacterImpl implements ObstaclesQueries {

    @NotNull
    private final DataManagerSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getExpiredObstaclesFilePaths;

    @NotNull
    private final List<Query<?>> getObstacles;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl$GetExpiredObstaclesFilePathsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "timestamp", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getTimestamp", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetExpiredObstaclesFilePathsQuery<T> extends Query<T> {
        final /* synthetic */ ObstaclesQueriesImpl this$0;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetExpiredObstaclesFilePathsQuery(ObstaclesQueriesImpl obstaclesQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(obstaclesQueriesImpl.getGetExpiredObstaclesFilePaths$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = obstaclesQueriesImpl;
            this.timestamp = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(701730390, "SELECT filePath FROM DbObstacles WHERE lastReadTimeStampMillis < ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl$GetExpiredObstaclesFilePathsQuery$execute$1
                final /* synthetic */ ObstaclesQueriesImpl.GetExpiredObstaclesFilePathsQuery<T> this$0;

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
            return "Obstacles.sq:getExpiredObstaclesFilePaths";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl$GetObstaclesQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "floorId", "spaceId", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "getSpaceId", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetObstaclesQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;

        @NotNull
        private final String floorId;

        @NotNull
        private final String spaceId;
        final /* synthetic */ ObstaclesQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetObstaclesQuery(@NotNull ObstaclesQueriesImpl obstaclesQueriesImpl, @NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(obstaclesQueriesImpl.getGetObstacles$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(floorId, "floorId");
            Intrinsics.h(spaceId, "spaceId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = obstaclesQueriesImpl;
            this.buildingId = buildingId;
            this.floorId = floorId;
            this.spaceId = spaceId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1655786151, "SELECT * FROM DbObstacles WHERE buildingId = ? AND floorId = ? AND spaceId = ? LIMIT 1", 3, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl$GetObstaclesQuery$execute$1
                final /* synthetic */ ObstaclesQueriesImpl.GetObstaclesQuery<T> this$0;

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
                    executeQuery.z(2, this.this$0.getFloorId());
                    executeQuery.z(3, this.this$0.getSpaceId());
                }
            });
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final String getFloorId() {
            return this.floorId;
        }

        @NotNull
        public final String getSpaceId() {
            return this.spaceId;
        }

        @NotNull
        public String toString() {
            return "Obstacles.sq:getObstacles";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObstaclesQueriesImpl(@NotNull DataManagerSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getObstacles = new CopyOnWriteArrayList();
        this.getExpiredObstaclesFilePaths = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void clearObstacles() {
        this.driver.t1(1879836496, "DELETE FROM DbObstacles", null);
        notifyQueries(1879836496, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.clearObstacles.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    @NotNull
    public Query<String> getExpiredObstaclesFilePaths(long timestamp) {
        return new GetExpiredObstaclesFilePathsQuery(this, timestamp, new Function1<SqlCursor, String>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.getExpiredObstaclesFilePaths.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                String string = cursor.getString(0);
                Intrinsics.e(string);
                return string;
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetExpiredObstaclesFilePaths$internal_publishRelease() {
        return this.getExpiredObstaclesFilePaths;
    }

    @NotNull
    public final List<Query<?>> getGetObstacles$internal_publishRelease() {
        return this.getObstacles;
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    @NotNull
    public <T> Query<T> getObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, @NotNull final Function7<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super Long, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(mapper, "mapper");
        return new GetObstaclesQuery(this, buildingId, floorId, spaceId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.getObstacles.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, String, String, Integer, String, Long, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String strA2 = a.a(string2, cursor, 3);
                Long l = cursor.getLong(4);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string3 = cursor.getString(5);
                Intrinsics.e(string3);
                Long l2 = cursor.getLong(6);
                Intrinsics.e(l2);
                return (T) function7.invoke(string, strA, string2, strA2, numValueOf, string3, l2);
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void removeBuildingObstacles(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(1188189203, "DELETE FROM DbObstacles WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeBuildingObstacles.1
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
        notifyQueries(1188189203, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeBuildingObstacles.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void removeExpiredObstacles(final long timestamp) {
        this.driver.t1(-434514660, "DELETE FROM DbObstacles WHERE lastReadTimeStampMillis < ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeExpiredObstacles.1
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
                execute.c(1, Long.valueOf(timestamp));
            }
        });
        notifyQueries(-434514660, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeExpiredObstacles.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void removeObstacles(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        this.driver.t1(-565260441, "DELETE FROM DbObstacles WHERE buildingId = ? AND floorId = ? AND spaceId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeObstacles.1
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
                execute.z(2, floorId);
                execute.z(3, spaceId);
            }
        });
        notifyQueries(-565260441, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.removeObstacles.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void updateObstaclesReadTimestamp(final long lastReadTimeStampMillis, @NotNull final String buildingId, @NotNull final String floorId, @NotNull final String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        this.driver.t1(1299891838, "UPDATE DbObstacles SET lastReadTimeStampMillis = ? WHERE buildingId = ? AND floorId = ? AND spaceId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.updateObstaclesReadTimestamp.1
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
                execute.c(1, Long.valueOf(lastReadTimeStampMillis));
                execute.z(2, buildingId);
                execute.z(3, floorId);
                execute.z(4, spaceId);
            }
        });
        notifyQueries(1299891838, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.updateObstaclesReadTimestamp.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    public void upsertObstacles(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String spaceId, final int mapVersion, @NotNull final String filePath, final long lastReadTimeStampMillis) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(filePath, "filePath");
        this.driver.t1(-414892260, "INSERT OR REPLACE INTO DbObstacles(buildingId, floorId, mapId, spaceId, mapVersion, filePath, lastReadTimeStampMillis) VALUES (?, ?, \"\", ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.upsertObstacles.1
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
                execute.z(2, floorId);
                execute.z(3, spaceId);
                execute.c(4, Long.valueOf(mapVersion));
                execute.z(5, filePath);
                execute.c(6, Long.valueOf(lastReadTimeStampMillis));
            }
        });
        notifyQueries(-414892260, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.upsertObstacles.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetObstacles$internal_publishRelease(), ObstaclesQueriesImpl.this.database.getObstaclesQueries().getGetExpiredObstaclesFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.ObstaclesQueries
    @NotNull
    public Query<DbObstacles> getObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        return getObstacles(buildingId, floorId, spaceId, new Function7<String, String, String, String, Integer, String, Long, DbObstacles>() { // from class: me.oriient.internal.services.dataManager.database.internal.ObstaclesQueriesImpl.getObstacles.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Number) obj5).intValue(), (String) obj6, ((Number) obj7).longValue());
            }

            @NotNull
            public final DbObstacles invoke(@NotNull String buildingId_, @NotNull String floorId_, @NotNull String mapId, @NotNull String spaceId_, int i, @NotNull String filePath, long j) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId_, "floorId_");
                Intrinsics.h(mapId, "mapId");
                Intrinsics.h(spaceId_, "spaceId_");
                Intrinsics.h(filePath, "filePath");
                return new DbObstacles(buildingId_, floorId_, mapId, spaceId_, i, filePath, j);
            }
        });
    }
}
