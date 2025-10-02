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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.services.database.DBExternalRegion;
import me.oriient.ipssdk.common.services.database.DBExternalRegionQueries;
import me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J|\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152b\u0010\u0016\u001a^\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0084\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122b\u0010\u0016\u001a^\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J*\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionQueries;", "database", "Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_common", "()Ljava/util/List;", "getForBuilding", "getGetForBuilding$me_oriient_sdk_common", "deleteForBuilding", "", "buildingId", "", "Lme/oriient/ipssdk/common/services/database/DBExternalRegion;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function4;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "metadata", "removeAll", "upsert", "GetForBuildingQuery", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DBExternalRegionQueriesImpl extends TransacterImpl implements DBExternalRegionQueries {

    @NotNull
    private final IpsCommonDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getForBuilding;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionQueriesImpl$GetForBuildingQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetForBuildingQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ DBExternalRegionQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetForBuildingQuery(@NotNull DBExternalRegionQueriesImpl dBExternalRegionQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBExternalRegionQueriesImpl.getGetForBuilding$me_oriient_sdk_common(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBExternalRegionQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(175949472, "SELECT * FROM DBExternalRegion WHERE buildingId LIKE ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl$GetForBuildingQuery$execute$1
                final /* synthetic */ DBExternalRegionQueriesImpl.GetForBuildingQuery<T> this$0;

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
            return "DBExternalRegion.sq:getForBuilding";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBExternalRegionQueriesImpl(@NotNull IpsCommonDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getForBuilding = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    public void deleteForBuilding(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-1806100455, "DELETE FROM DBExternalRegion WHERE buildingId LIKE ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.deleteForBuilding.1
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
        notifyQueries(-1806100455, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.deleteForBuilding.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function4<? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-1268070236, this.getAll, this.driver, "DBExternalRegion.sq", "getAll", "SELECT * FROM DBExternalRegion", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function4<String, String, String, String, T> function4 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String string3 = cursor.getString(3);
                Intrinsics.e(string3);
                return (T) function4.invoke(string, strA, string2, string3);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    @NotNull
    public <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull final Function4<? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetForBuildingQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.getForBuilding.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function4<String, String, String, String, T> function4 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String string3 = cursor.getString(3);
                Intrinsics.e(string3);
                return (T) function4.invoke(string, strA, string2, string3);
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

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    public void removeAll() {
        this.driver.t1(-1841719900, "DELETE FROM DBExternalRegion", null);
        notifyQueries(-1841719900, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.removeAll.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    public void upsert(@NotNull final String id, @NotNull final String name, @Nullable final String metadata, @NotNull final String buildingId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(-857098392, "INSERT OR REPLACE INTO DBExternalRegion(id, name, metadata, buildingId) VALUES (?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.upsert.1
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
                execute.z(3, metadata);
                execute.z(4, buildingId);
            }
        });
        notifyQueries(-857098392, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetForBuilding$me_oriient_sdk_common(), DBExternalRegionQueriesImpl.this.database.getDBExternalRegionQueries().getGetAll$me_oriient_sdk_common());
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    @NotNull
    public Query<DBExternalRegion> getForBuilding(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getForBuilding(buildingId, new Function4<String, String, String, String, DBExternalRegion>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.getForBuilding.2
            @Override // kotlin.jvm.functions.Function4
            @NotNull
            public final DBExternalRegion invoke(@NotNull String id, @NotNull String name, @Nullable String str, @NotNull String buildingId_) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(buildingId_, "buildingId_");
                return new DBExternalRegion(id, name, str, buildingId_);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBExternalRegionQueries
    @NotNull
    public Query<DBExternalRegion> getAll() {
        return getAll(new Function4<String, String, String, String, DBExternalRegion>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBExternalRegionQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function4
            @NotNull
            public final DBExternalRegion invoke(@NotNull String id, @NotNull String name, @Nullable String str, @NotNull String buildingId) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(buildingId, "buildingId");
                return new DBExternalRegion(id, name, str, buildingId);
            }
        });
    }
}
