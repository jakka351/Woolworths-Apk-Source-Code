package me.oriient.ipssdk.common.services.database.sdkcommon;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
import me.oriient.ipssdk.common.services.database.DBEntrance;
import me.oriient.ipssdk.common.services.database.DBEntranceQueries;
import me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J»\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152 \u0001\u0010\u0016\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JÃ\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122 \u0001\u0010\u0016\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J@\u0010#\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006%"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBEntranceQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/DBEntranceQueries;", "database", "Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_common", "()Ljava/util/List;", "getForBuilding", "getGetForBuilding$me_oriient_sdk_common", "deleteForBuilding", "", "buildingId", "", "Lme/oriient/ipssdk/common/services/database/DBEntrance;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", lqlqqlq.mmm006Dm006Dm, "", "isMain", "floorId", "", "x", "y", "removeAll", "upsert", "GetForBuildingQuery", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DBEntranceQueriesImpl extends TransacterImpl implements DBEntranceQueries {

    @NotNull
    private final IpsCommonDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getForBuilding;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBEntranceQueriesImpl$GetForBuildingQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBEntranceQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetForBuildingQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ DBEntranceQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetForBuildingQuery(@NotNull DBEntranceQueriesImpl dBEntranceQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBEntranceQueriesImpl.getGetForBuilding$me_oriient_sdk_common(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBEntranceQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1930426359, "SELECT * FROM DBEntrance WHERE buildingId LIKE ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl$GetForBuildingQuery$execute$1
                final /* synthetic */ DBEntranceQueriesImpl.GetForBuildingQuery<T> this$0;

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
            return "DBEntrance.sq:getForBuilding";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBEntranceQueriesImpl(@NotNull IpsCommonDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getForBuilding = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    public void deleteForBuilding(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(357815138, "DELETE FROM DBEntrance WHERE buildingId LIKE ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.deleteForBuilding.1
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
        notifyQueries(357815138, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.deleteForBuilding.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetForBuilding$me_oriient_sdk_common(), DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function7<? super String, ? super String, ? super Integer, ? super String, ? super String, ? super Double, ? super Double, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-21741317, this.getAll, this.driver, "DBEntrance.sq", "getAll", "SELECT * FROM DBEntrance", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Integer, String, String, Double, Double, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string2 = cursor.getString(3);
                String strA2 = a.a(string2, cursor, 4);
                Double d = cursor.getDouble(5);
                return (T) function7.invoke(string, strA, numValueOf, string2, strA2, d, kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 6));
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    @NotNull
    public <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull final Function7<? super String, ? super String, ? super Integer, ? super String, ? super String, ? super Double, ? super Double, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetForBuildingQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.getForBuilding.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function7<String, String, Integer, String, String, Double, Double, T> function7 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Long l = cursor.getLong(2);
                Intrinsics.e(l);
                Integer numValueOf = Integer.valueOf((int) l.longValue());
                String string2 = cursor.getString(3);
                String strA2 = a.a(string2, cursor, 4);
                Double d = cursor.getDouble(5);
                return (T) function7.invoke(string, strA, numValueOf, string2, strA2, d, kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 6));
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

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    public void removeAll() {
        this.driver.t1(1845799405, "DELETE FROM DBEntrance", null);
        notifyQueries(1845799405, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.removeAll.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetForBuilding$me_oriient_sdk_common(), DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    public void upsert(@NotNull final String id, @NotNull final String description, final int isMain, @NotNull final String buildingId, @NotNull final String floorId, final double x, final double y) {
        Intrinsics.h(id, "id");
        Intrinsics.h(description, "description");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.driver.t1(389230527, "INSERT OR REPLACE INTO DBEntrance(id, description, isMain, buildingId, floorId, x, y) VALUES (?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.upsert.1
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
                execute.z(2, description);
                execute.c(3, Long.valueOf(isMain));
                execute.z(4, buildingId);
                execute.z(5, floorId);
                execute.b(6, Double.valueOf(x));
                execute.b(7, Double.valueOf(y));
            }
        });
        notifyQueries(389230527, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetForBuilding$me_oriient_sdk_common(), DBEntranceQueriesImpl.this.database.getDBEntranceQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    @NotNull
    public Query<DBEntrance> getForBuilding(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getForBuilding(buildingId, new Function7<String, String, Integer, String, String, Double, Double, DBEntrance>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.getForBuilding.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).intValue(), (String) obj4, (String) obj5, ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue());
            }

            @NotNull
            public final DBEntrance invoke(@NotNull String id, @NotNull String description, int i, @NotNull String buildingId_, @NotNull String floorId, double d, double d2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(description, "description");
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId, "floorId");
                return new DBEntrance(id, description, i, buildingId_, floorId, d, d2);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBEntranceQueries
    @NotNull
    public Query<DBEntrance> getAll() {
        return getAll(new Function7<String, String, Integer, String, String, Double, Double, DBEntrance>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBEntranceQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).intValue(), (String) obj4, (String) obj5, ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue());
            }

            @NotNull
            public final DBEntrance invoke(@NotNull String id, @NotNull String description, int i, @NotNull String buildingId, @NotNull String floorId, double d, double d2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(description, "description");
                Intrinsics.h(buildingId, "buildingId");
                Intrinsics.h(floorId, "floorId");
                return new DBEntrance(id, description, i, buildingId, floorId, d, d2);
            }
        });
    }
}
