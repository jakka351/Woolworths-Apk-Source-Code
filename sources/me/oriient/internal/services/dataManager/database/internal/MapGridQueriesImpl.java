package me.oriient.internal.services.dataManager.database.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.ColumnAdapter;
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
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import me.oriient.internal.services.dataManager.database.MapGridQueries;
import me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u000201B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016Já\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u001a0\n\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u009e\u0002\u0010\u001c\u001a\u0099\u0002\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110'¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0016J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010,\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J0\u0010.\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016Jp\u0010/\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u00062"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/dataManager/database/MapGridQueries;", "database", "Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getExpiredMapGridFilePaths", "", "Lcom/squareup/sqldelight/Query;", "getGetExpiredMapGridFilePaths$internal_publishRelease", "()Ljava/util/List;", "getMapGrid", "getGetMapGrid$internal_publishRelease", "clearMapGrid", "", "", "timestamp", "", "Lme/oriient/internal/services/dataManager/database/DbMapGrid;", "buildingId", "floorId", "mapId", "spaceId", "engineVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function13;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "mapVersion", "filePath", "", "tag", "vector", "lastReadTimeStampMillis", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "gridType", "majorVersion", "createdBy", "removeExpiredMapGrids", "removeMapGrid", "removeMapGrids", "updateMapGridReadTimestamp", "upsertMapGrid", "GetExpiredMapGridFilePathsQuery", "GetMapGridQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MapGridQueriesImpl extends TransacterImpl implements MapGridQueries {

    @NotNull
    private final DataManagerSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getExpiredMapGridFilePaths;

    @NotNull
    private final List<Query<?>> getMapGrid;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl$GetExpiredMapGridFilePathsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "timestamp", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getTimestamp", "()J", "execute", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetExpiredMapGridFilePathsQuery<T> extends Query<T> {
        final /* synthetic */ MapGridQueriesImpl this$0;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetExpiredMapGridFilePathsQuery(MapGridQueriesImpl mapGridQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(mapGridQueriesImpl.getGetExpiredMapGridFilePaths$internal_publishRelease(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = mapGridQueriesImpl;
            this.timestamp = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-1360747690, "SELECT filePath FROM DbMapGrid WHERE lastReadTimeStampMillis < ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl$GetExpiredMapGridFilePathsQuery$execute$1
                final /* synthetic */ MapGridQueriesImpl.GetExpiredMapGridFilePathsQuery<T> this$0;

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
            return "MapGrid.sq:getExpiredMapGridFilePaths";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl$GetMapGridQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "floorId", "mapId", "spaceId", "engineVersion", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "getEngineVersion", "getFloorId", "getMapId", "getSpaceId", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetMapGridQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;

        @NotNull
        private final String engineVersion;

        @NotNull
        private final String floorId;

        @NotNull
        private final String mapId;

        @NotNull
        private final String spaceId;
        final /* synthetic */ MapGridQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMapGridQuery(@NotNull MapGridQueriesImpl mapGridQueriesImpl, @NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, Function1<? super SqlCursor, ? extends T> mapper) {
            super(mapGridQueriesImpl.getGetMapGrid$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(floorId, "floorId");
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(spaceId, "spaceId");
            Intrinsics.h(engineVersion, "engineVersion");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = mapGridQueriesImpl;
            this.buildingId = buildingId;
            this.floorId = floorId;
            this.mapId = mapId;
            this.spaceId = spaceId;
            this.engineVersion = engineVersion;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1984810659, "SELECT * FROM DbMapGrid WHERE buildingId = ? AND floorId = ? AND mapId = ? AND spaceId = ? AND engineVersion =? LIMIT 1", 5, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl$GetMapGridQuery$execute$1
                final /* synthetic */ MapGridQueriesImpl.GetMapGridQuery<T> this$0;

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
                    executeQuery.z(3, this.this$0.getMapId());
                    executeQuery.z(4, this.this$0.getSpaceId());
                    executeQuery.z(5, this.this$0.getEngineVersion());
                }
            });
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final String getEngineVersion() {
            return this.engineVersion;
        }

        @NotNull
        public final String getFloorId() {
            return this.floorId;
        }

        @NotNull
        public final String getMapId() {
            return this.mapId;
        }

        @NotNull
        public final String getSpaceId() {
            return this.spaceId;
        }

        @NotNull
        public String toString() {
            return "MapGrid.sq:getMapGrid";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapGridQueriesImpl(@NotNull DataManagerSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getMapGrid = new CopyOnWriteArrayList();
        this.getExpiredMapGridFilePaths = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void clearMapGrid() {
        this.driver.t1(692488716, "DELETE FROM DbMapGrid", null);
        notifyQueries(692488716, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.clearMapGrid.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    @NotNull
    public Query<String> getExpiredMapGridFilePaths(long timestamp) {
        return new GetExpiredMapGridFilePathsQuery(this, timestamp, new Function1<SqlCursor, String>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.getExpiredMapGridFilePaths.1
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
    public final List<Query<?>> getGetExpiredMapGridFilePaths$internal_publishRelease() {
        return this.getExpiredMapGridFilePaths;
    }

    @NotNull
    public final List<Query<?>> getGetMapGrid$internal_publishRelease() {
        return this.getMapGrid;
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    @NotNull
    public <T> Query<T> getMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, @NotNull final Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super byte[], ? super byte[], ? super Long, ? super MapGridType, ? super Integer, ? super String, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(mapper, "mapper");
        return new GetMapGridQuery(this, buildingId, floorId, mapId, spaceId, engineVersion, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.getMapGrid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function13<String, String, String, String, String, Integer, String, byte[], byte[], Long, MapGridType, Integer, String, T> function13 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String strA2 = a.a(string2, cursor, 3);
                String string3 = cursor.getString(4);
                Intrinsics.e(string3);
                Long l = cursor.getLong(5);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string4 = cursor.getString(6);
                Intrinsics.e(string4);
                byte[] bytes = cursor.getBytes(7);
                Intrinsics.e(bytes);
                byte[] bytes2 = cursor.getBytes(8);
                Intrinsics.e(bytes2);
                Long l2 = cursor.getLong(9);
                Intrinsics.e(l2);
                ColumnAdapter<MapGridType, String> gridTypeAdapter = this.database.getDbMapGridAdapter().getGridTypeAdapter();
                String string5 = cursor.getString(10);
                Intrinsics.e(string5);
                Object objDecode = gridTypeAdapter.decode(string5);
                Long l3 = cursor.getLong(11);
                Intrinsics.e(l3);
                Integer numValueOf2 = Integer.valueOf((int) l3.longValue());
                String string6 = cursor.getString(12);
                Intrinsics.e(string6);
                return (T) function13.invoke(string, strA, string2, strA2, string3, numValueOf, string4, bytes, bytes2, l2, objDecode, numValueOf2, string6);
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void removeExpiredMapGrids(final long timestamp) {
        this.driver.t1(1040178843, "DELETE FROM DbMapGrid WHERE lastReadTimeStampMillis < ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeExpiredMapGrids.1
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
        notifyQueries(1040178843, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeExpiredMapGrids.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void removeMapGrid(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String mapId, @NotNull final String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        this.driver.t1(-1689431513, "DELETE FROM DbMapGrid WHERE buildingId = ? AND floorId = ? AND mapId = ? AND spaceId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeMapGrid.1
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
                execute.z(3, mapId);
                execute.z(4, spaceId);
            }
        });
        notifyQueries(-1689431513, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeMapGrid.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void removeMapGrids(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-832769236, "DELETE FROM DbMapGrid WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeMapGrids.1
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
        notifyQueries(-832769236, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.removeMapGrids.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void updateMapGridReadTimestamp(final long lastReadTimeStampMillis, @NotNull final String buildingId, @NotNull final String floorId, @NotNull final String mapId, @NotNull final String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        this.driver.t1(-635266818, "UPDATE DbMapGrid SET lastReadTimeStampMillis = ? WHERE buildingId = ? AND floorId = ? AND mapId = ? AND spaceId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.updateMapGridReadTimestamp.1
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
                execute.z(4, mapId);
                execute.z(5, spaceId);
            }
        });
        notifyQueries(-635266818, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.updateMapGridReadTimestamp.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    public void upsertMapGrid(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String mapId, @NotNull final String spaceId, @NotNull final String engineVersion, final int mapVersion, @NotNull final String filePath, @NotNull final byte[] tag, @NotNull final byte[] vector, final long lastReadTimeStampMillis, final int majorVersion, @NotNull final MapGridType gridType, @NotNull final String createdBy) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(filePath, "filePath");
        Intrinsics.h(tag, "tag");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(gridType, "gridType");
        Intrinsics.h(createdBy, "createdBy");
        this.driver.t1(1930832668, "INSERT OR REPLACE INTO DbMapGrid(\n    buildingId,\n    floorId,\n    mapId,\n    spaceId,\n    engineVersion,\n    mapVersion,\n    filePath,\n    tag,\n    vector,\n    lastReadTimeStampMillis,\n    majorVersion,\n    gridType,\n    createdBy\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.upsertMapGrid.1
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
                execute.z(3, mapId);
                execute.z(4, spaceId);
                execute.z(5, engineVersion);
                execute.c(6, Long.valueOf(mapVersion));
                execute.z(7, filePath);
                execute.e(8, tag);
                execute.e(9, vector);
                execute.c(10, Long.valueOf(lastReadTimeStampMillis));
                execute.c(11, Long.valueOf(majorVersion));
                execute.z(12, (String) this.database.getDbMapGridAdapter().getGridTypeAdapter().encode(gridType));
                execute.z(13, createdBy);
            }
        });
        notifyQueries(1930832668, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.upsertMapGrid.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(MapGridQueriesImpl.this.database.getMapGridQueries().getGetMapGrid$internal_publishRelease(), MapGridQueriesImpl.this.database.getMapGridQueries().getGetExpiredMapGridFilePaths$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.dataManager.database.MapGridQueries
    @NotNull
    public Query<DbMapGrid> getMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(engineVersion, "engineVersion");
        return getMapGrid(buildingId, floorId, mapId, spaceId, engineVersion, new Function13<String, String, String, String, String, Integer, String, byte[], byte[], Long, MapGridType, Integer, String, DbMapGrid>() { // from class: me.oriient.internal.services.dataManager.database.internal.MapGridQueriesImpl.getMapGrid.2
            @Override // kotlin.jvm.functions.Function13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7, (byte[]) obj8, (byte[]) obj9, ((Number) obj10).longValue(), (MapGridType) obj11, ((Number) obj12).intValue(), (String) obj13);
            }

            @NotNull
            public final DbMapGrid invoke(@NotNull String buildingId_, @NotNull String floorId_, @NotNull String mapId_, @NotNull String spaceId_, @NotNull String engineVersion_, int i, @NotNull String filePath, @NotNull byte[] tag, @NotNull byte[] vector, long j, @NotNull MapGridType gridType, int i2, @NotNull String createdBy) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId_, "floorId_");
                Intrinsics.h(mapId_, "mapId_");
                Intrinsics.h(spaceId_, "spaceId_");
                Intrinsics.h(engineVersion_, "engineVersion_");
                Intrinsics.h(filePath, "filePath");
                Intrinsics.h(tag, "tag");
                Intrinsics.h(vector, "vector");
                Intrinsics.h(gridType, "gridType");
                Intrinsics.h(createdBy, "createdBy");
                return new DbMapGrid(buildingId_, floorId_, mapId_, spaceId_, engineVersion_, i, filePath, tag, vector, j, gridType, i2, createdBy);
            }
        });
    }
}
