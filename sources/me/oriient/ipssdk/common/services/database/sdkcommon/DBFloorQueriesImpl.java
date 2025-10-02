package me.oriient.ipssdk.common.services.database.sdkcommon;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.QueryKt;
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
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.services.database.DBFloor;
import me.oriient.ipssdk.common.services.database.DBFloorQueries;
import me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J\u0080\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152å\u0001\u0010\u0016\u001aà\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0088\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122å\u0001\u0010\u0016\u001aà\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010!¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016Jc\u0010%\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006("}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBFloorQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/DBFloorQueries;", "database", "Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_common", "()Ljava/util/List;", "getForBuilding", "getGetForBuilding$me_oriient_sdk_common", "deleteForBuilding", "", "buildingId", "", "Lme/oriient/ipssdk/common/services/database/DBFloor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function10;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "shortName", "", "floorOrder", "mapId", "mapName", "mapUsage", "", "height", "rotation", "removeAll", "upsert", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "GetForBuildingQuery", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DBFloorQueriesImpl extends TransacterImpl implements DBFloorQueries {

    @NotNull
    private final IpsCommonDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getForBuilding;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBFloorQueriesImpl$GetForBuildingQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBFloorQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetForBuildingQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ DBFloorQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetForBuildingQuery(@NotNull DBFloorQueriesImpl dBFloorQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBFloorQueriesImpl.getGetForBuilding$me_oriient_sdk_common(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBFloorQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(44636405, "SELECT * FROM DBFloor WHERE buildingId LIKE ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl$GetForBuildingQuery$execute$1
                final /* synthetic */ DBFloorQueriesImpl.GetForBuildingQuery<T> this$0;

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
            return "DBFloor.sq:getForBuilding";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBFloorQueriesImpl(@NotNull IpsCommonDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getForBuilding = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    public void deleteForBuilding(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-1038472796, "DELETE FROM DBFloor WHERE buildingId LIKE ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.deleteForBuilding.1
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
        notifyQueries(-1038472796, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.deleteForBuilding.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetAll$me_oriient_sdk_common(), DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetForBuilding$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function10<? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(474300409, this.getAll, this.driver, "DBFloor.sq", "getAll", "SELECT * FROM DBFloor", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function10<String, String, String, Integer, String, String, String, String, Double, Double, T> function10 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string3 = cursor.getString(4);
                String strA2 = a.a(string3, cursor, 5);
                String string4 = cursor.getString(6);
                return (T) function10.invoke(string, strA, string2, numValueOf, string3, strA2, string4, a.a(string4, cursor, 7), cursor.getDouble(8), cursor.getDouble(9));
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    @NotNull
    public <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull final Function10<? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetForBuildingQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.getForBuilding.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function10<String, String, String, Integer, String, String, String, String, Double, Double, T> function10 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string3 = cursor.getString(4);
                String strA2 = a.a(string3, cursor, 5);
                String string4 = cursor.getString(6);
                return (T) function10.invoke(string, strA, string2, numValueOf, string3, strA2, string4, a.a(string4, cursor, 7), cursor.getDouble(8), cursor.getDouble(9));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetAll$me_oriient_sdk_common() {
        return this.getAll;
    }

    @NotNull
    public final List<Query<?>> getGetForBuilding$me_oriient_sdk_common() {
        return this.getForBuilding;
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    public void removeAll() {
        this.driver.t1(442393135, "DELETE FROM DBFloor", null);
        notifyQueries(442393135, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.removeAll.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetAll$me_oriient_sdk_common(), DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetForBuilding$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    public void upsert(@NotNull final String id, @NotNull final String name, @Nullable final String shortName, final int floorOrder, @NotNull final String buildingId, @NotNull final String mapId, @NotNull final String mapName, @NotNull final String mapUsage, @Nullable final Double height, @Nullable final Double rotation) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(mapName, "mapName");
        Intrinsics.h(mapUsage, "mapUsage");
        this.driver.t1(885272253, "INSERT OR REPLACE INTO DBFloor(id, name, shortName, floorOrder, buildingId, mapId, mapName, mapUsage, height, rotation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.upsert.1
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
                execute.z(2, name);
                execute.z(3, shortName);
                execute.c(4, Long.valueOf(floorOrder));
                execute.z(5, buildingId);
                execute.z(6, mapId);
                execute.z(7, mapName);
                execute.z(8, mapUsage);
                execute.b(9, height);
                execute.b(10, rotation);
            }
        });
        notifyQueries(885272253, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetAll$me_oriient_sdk_common(), DBFloorQueriesImpl.this.database.getDBFloorQueries().getGetForBuilding$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    @NotNull
    public Query<DBFloor> getForBuilding(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getForBuilding(buildingId, new Function10<String, String, String, Integer, String, String, String, String, Double, Double, DBFloor>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.getForBuilding.2
            @Override // kotlin.jvm.functions.Function10
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Number) obj4).intValue(), (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Double) obj9, (Double) obj10);
            }

            @NotNull
            public final DBFloor invoke(@NotNull String id, @NotNull String name, @Nullable String str, int i, @NotNull String buildingId_, @NotNull String mapId, @NotNull String mapName, @NotNull String mapUsage, @Nullable Double d, @Nullable Double d2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(mapId, "mapId");
                Intrinsics.h(mapName, "mapName");
                Intrinsics.h(mapUsage, "mapUsage");
                return new DBFloor(id, name, str, i, buildingId_, mapId, mapName, mapUsage, d, d2);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBFloorQueries
    @NotNull
    public Query<DBFloor> getAll() {
        return getAll(new Function10<String, String, String, Integer, String, String, String, String, Double, Double, DBFloor>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBFloorQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function10
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Number) obj4).intValue(), (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Double) obj9, (Double) obj10);
            }

            @NotNull
            public final DBFloor invoke(@NotNull String id, @NotNull String name, @Nullable String str, int i, @NotNull String buildingId, @NotNull String mapId, @NotNull String mapName, @NotNull String mapUsage, @Nullable Double d, @Nullable Double d2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(buildingId, "buildingId");
                Intrinsics.h(mapId, "mapId");
                Intrinsics.h(mapName, "mapName");
                Intrinsics.h(mapUsage, "mapUsage");
                return new DBFloor(id, name, str, i, buildingId, mapId, mapName, mapUsage, d, d2);
            }
        });
    }
}
