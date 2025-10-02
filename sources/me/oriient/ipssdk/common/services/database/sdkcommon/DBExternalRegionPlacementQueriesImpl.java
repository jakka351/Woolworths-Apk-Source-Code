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
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.services.database.DBExternalRegionPlacement;
import me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries;
import me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J»\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152 \u0001\u0010\u0016\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JÃ\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122 \u0001\u0010\u0016\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J@\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006$"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionPlacementQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacementQueries;", "database", "Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_common", "()Ljava/util/List;", "getForBuilding", "getGetForBuilding$me_oriient_sdk_common", "deleteForBuilding", "", "buildingId", "", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "features", "vertices", "regionId", "", "shapeType", "entrancesIds", "removeAll", "upsert", "GetForBuildingQuery", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DBExternalRegionPlacementQueriesImpl extends TransacterImpl implements DBExternalRegionPlacementQueries {

    @NotNull
    private final IpsCommonDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getForBuilding;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionPlacementQueriesImpl$GetForBuildingQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionPlacementQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetForBuildingQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ DBExternalRegionPlacementQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetForBuildingQuery(@NotNull DBExternalRegionPlacementQueriesImpl dBExternalRegionPlacementQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBExternalRegionPlacementQueriesImpl.getGetForBuilding$me_oriient_sdk_common(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBExternalRegionPlacementQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1602846831, "SELECT * FROM DBExternalRegionPlacement WHERE buildingId LIKE ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl$GetForBuildingQuery$execute$1
                final /* synthetic */ DBExternalRegionPlacementQueriesImpl.GetForBuildingQuery<T> this$0;

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
            return "DBExternalRegionPlacement.sq:getForBuilding";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBExternalRegionPlacementQueriesImpl(@NotNull IpsCommonDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getForBuilding = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    public void deleteForBuilding(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-398206998, "DELETE FROM DBExternalRegionPlacement WHERE buildingId LIKE ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.deleteForBuilding.1
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
        notifyQueries(-398206998, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.deleteForBuilding.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-392576653, this.getAll, this.driver, "DBExternalRegionPlacement.sq", "getAll", "SELECT * FROM DBExternalRegionPlacement", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, String, String, String, Integer, String, T> function7 = mapper;
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
                return (T) function7.invoke(string, strA, string2, strA2, string3, numValueOf, string4);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    @NotNull
    public <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull final Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetForBuildingQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.getForBuilding.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, String, String, String, Integer, String, T> function7 = mapper;
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
                return (T) function7.invoke(string, strA, string2, strA2, string3, numValueOf, string4);
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

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    public void removeAll() {
        this.driver.t1(946189941, "DELETE FROM DBExternalRegionPlacement", null);
        notifyQueries(946189941, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.removeAll.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    public void upsert(@NotNull final String id, @NotNull final String features, @NotNull final String vertices, @NotNull final String buildingId, @NotNull final String regionId, final int shapeType, @NotNull final String entrancesIds) {
        Intrinsics.h(id, "id");
        Intrinsics.h(features, "features");
        Intrinsics.h(vertices, "vertices");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(regionId, "regionId");
        Intrinsics.h(entrancesIds, "entrancesIds");
        this.driver.t1(18395191, "INSERT OR REPLACE INTO DBExternalRegionPlacement(id, features, vertices, buildingId, regionId, shapeType, entrancesIds) VALUES (?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.upsert.1
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
                execute.z(2, features);
                execute.z(3, vertices);
                execute.z(4, buildingId);
                execute.z(5, regionId);
                execute.c(6, Long.valueOf(shapeType));
                execute.z(7, entrancesIds);
            }
        });
        notifyQueries(18395191, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionPlacementQueriesImpl.this.database.getDBExternalRegionPlacementQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    @NotNull
    public Query<DBExternalRegionPlacement> getForBuilding(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getForBuilding(buildingId, new Function7<String, String, String, String, String, Integer, String, DBExternalRegionPlacement>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.getForBuilding.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
            }

            @NotNull
            public final DBExternalRegionPlacement invoke(@NotNull String id, @NotNull String features, @NotNull String vertices, @NotNull String buildingId_, @NotNull String regionId, int i, @NotNull String entrancesIds) {
                Intrinsics.h(id, "id");
                Intrinsics.h(features, "features");
                Intrinsics.h(vertices, "vertices");
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(regionId, "regionId");
                Intrinsics.h(entrancesIds, "entrancesIds");
                return new DBExternalRegionPlacement(id, features, vertices, buildingId_, regionId, i, entrancesIds);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionPlacementQueries
    @NotNull
    public Query<DBExternalRegionPlacement> getAll() {
        return getAll(new Function7<String, String, String, String, String, Integer, String, DBExternalRegionPlacement>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionPlacementQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
            }

            @NotNull
            public final DBExternalRegionPlacement invoke(@NotNull String id, @NotNull String features, @NotNull String vertices, @NotNull String buildingId, @NotNull String regionId, int i, @NotNull String entrancesIds) {
                Intrinsics.h(id, "id");
                Intrinsics.h(features, "features");
                Intrinsics.h(vertices, "vertices");
                Intrinsics.h(buildingId, "buildingId");
                Intrinsics.h(regionId, "regionId");
                Intrinsics.h(entrancesIds, "entrancesIds");
                return new DBExternalRegionPlacement(id, features, vertices, buildingId, regionId, i, entrancesIds);
            }
        });
    }
}
