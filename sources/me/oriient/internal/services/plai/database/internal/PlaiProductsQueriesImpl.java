package me.oriient.internal.services.plai.database.internal;

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
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.internal.a;
import me.oriient.internal.services.plai.database.DbPlaiProducts;
import me.oriient.internal.services.plai.database.PlaiProductsQueries;
import me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002'(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0081\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00150\n\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132Ö\u0001\u0010\u0017\u001aÑ\u0001\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\"¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\"¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u00150\u0018H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016Jù\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00150\n\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132Ö\u0001\u0010\u0017\u001aÑ\u0001\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\"¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\"¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u00150\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\\\u0010&\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006)"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/plai/database/PlaiProductsQueries;", "database", "Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getCustomerTagProducts", "", "Lcom/squareup/sqldelight/Query;", "getGetCustomerTagProducts$internal_publishRelease", "()Ljava/util/List;", "getProducts", "getGetProducts$internal_publishRelease", "clearProducts", "", "Lme/oriient/internal/services/plai/database/DbPlaiProducts;", "buildingId", "", "customerTagId", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function9;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "floorId", "", "x", "y", "confidence", "", "lastUsedScanTimeMillis", "", "regionIds", "regionNames", "removeBuildingProducts", "upsertProducts", "GetCustomerTagProductsQuery", "GetProductsQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaiProductsQueriesImpl extends TransacterImpl implements PlaiProductsQueries {

    @NotNull
    private final PlaiSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getCustomerTagProducts;

    @NotNull
    private final List<Query<?>> getProducts;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl$GetCustomerTagProductsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "customerTagId", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "getCustomerTagId", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetCustomerTagProductsQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;

        @NotNull
        private final String customerTagId;
        final /* synthetic */ PlaiProductsQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerTagProductsQuery(@NotNull PlaiProductsQueriesImpl plaiProductsQueriesImpl, @NotNull String buildingId, @NotNull String customerTagId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiProductsQueriesImpl.getGetCustomerTagProducts$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(customerTagId, "customerTagId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiProductsQueriesImpl;
            this.buildingId = buildingId;
            this.customerTagId = customerTagId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(350097488, "SELECT * FROM DbPlaiProducts WHERE buildingId = ? AND customerTagId = ?", 2, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl$GetCustomerTagProductsQuery$execute$1
                final /* synthetic */ PlaiProductsQueriesImpl.GetCustomerTagProductsQuery<T> this$0;

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
                    executeQuery.z(2, this.this$0.getCustomerTagId());
                }
            });
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final String getCustomerTagId() {
            return this.customerTagId;
        }

        @NotNull
        public String toString() {
            return "PlaiProducts.sq:getCustomerTagProducts";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl$GetProductsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetProductsQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ PlaiProductsQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProductsQuery(@NotNull PlaiProductsQueriesImpl plaiProductsQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiProductsQueriesImpl.getGetProducts$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiProductsQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-520043660, "SELECT * FROM DbPlaiProducts WHERE buildingId = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl$GetProductsQuery$execute$1
                final /* synthetic */ PlaiProductsQueriesImpl.GetProductsQuery<T> this$0;

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
            return "PlaiProducts.sq:getProducts";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaiProductsQueriesImpl(@NotNull PlaiSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getProducts = new CopyOnWriteArrayList();
        this.getCustomerTagProducts = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    public void clearProducts() {
        this.driver.t1(-448051989, "DELETE FROM DbPlaiProducts", null);
        notifyQueries(-448051989, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.clearProducts.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetCustomerTagProducts$internal_publishRelease(), PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetProducts$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    @NotNull
    public <T> Query<T> getCustomerTagProducts(@NotNull String buildingId, @NotNull String customerTagId, @NotNull final Function9<? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Long, ? super List<String>, ? super List<String>, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(mapper, "mapper");
        return new GetCustomerTagProductsQuery(this, buildingId, customerTagId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.getCustomerTagProducts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function9<String, String, String, Double, Double, Double, Long, List<String>, List<String>, T> function9 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Double d = cursor.getDouble(3);
                Intrinsics.e(d);
                Double d2 = cursor.getDouble(4);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 5);
                Long l = cursor.getLong(6);
                Intrinsics.e(l);
                ColumnAdapter<List<String>, String> regionIdsAdapter = this.database.getDbPlaiProductsAdapter().getRegionIdsAdapter();
                String string3 = cursor.getString(7);
                Intrinsics.e(string3);
                Object objDecode = regionIdsAdapter.decode(string3);
                ColumnAdapter<List<String>, String> regionNamesAdapter = this.database.getDbPlaiProductsAdapter().getRegionNamesAdapter();
                String string4 = cursor.getString(8);
                Intrinsics.e(string4);
                return (T) function9.invoke(string, strA, string2, d, d2, dC, l, objDecode, regionNamesAdapter.decode(string4));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetCustomerTagProducts$internal_publishRelease() {
        return this.getCustomerTagProducts;
    }

    @NotNull
    public final List<Query<?>> getGetProducts$internal_publishRelease() {
        return this.getProducts;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    @NotNull
    public <T> Query<T> getProducts(@NotNull String buildingId, @NotNull final Function9<? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Long, ? super List<String>, ? super List<String>, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetProductsQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.getProducts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function9<String, String, String, Double, Double, Double, Long, List<String>, List<String>, T> function9 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Double d = cursor.getDouble(3);
                Intrinsics.e(d);
                Double d2 = cursor.getDouble(4);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 5);
                Long l = cursor.getLong(6);
                Intrinsics.e(l);
                ColumnAdapter<List<String>, String> regionIdsAdapter = this.database.getDbPlaiProductsAdapter().getRegionIdsAdapter();
                String string3 = cursor.getString(7);
                Intrinsics.e(string3);
                Object objDecode = regionIdsAdapter.decode(string3);
                ColumnAdapter<List<String>, String> regionNamesAdapter = this.database.getDbPlaiProductsAdapter().getRegionNamesAdapter();
                String string4 = cursor.getString(8);
                Intrinsics.e(string4);
                return (T) function9.invoke(string, strA, string2, d, d2, dC, l, objDecode, regionNamesAdapter.decode(string4));
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    public void removeBuildingProducts(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(2035044354, "DELETE FROM DbPlaiProducts WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.removeBuildingProducts.1
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
        notifyQueries(2035044354, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.removeBuildingProducts.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetCustomerTagProducts$internal_publishRelease(), PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetProducts$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    public void upsertProducts(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String customerTagId, final double x, final double y, final double confidence, final long lastUsedScanTimeMillis, @NotNull final List<String> regionIds, @NotNull final List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        this.driver.t1(-581731111, "INSERT OR REPLACE INTO DbPlaiProducts(buildingId, floorId, customerTagId, x, y, confidence, lastUsedScanTimeMillis, regionIds, regionNames)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.upsertProducts.1
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
                execute.z(3, customerTagId);
                execute.b(4, Double.valueOf(x));
                execute.b(5, Double.valueOf(y));
                execute.b(6, Double.valueOf(confidence));
                execute.c(7, Long.valueOf(lastUsedScanTimeMillis));
                execute.z(8, (String) this.database.getDbPlaiProductsAdapter().getRegionIdsAdapter().encode(regionIds));
                execute.z(9, (String) this.database.getDbPlaiProductsAdapter().getRegionNamesAdapter().encode(regionNames));
            }
        });
        notifyQueries(-581731111, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.upsertProducts.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetCustomerTagProducts$internal_publishRelease(), PlaiProductsQueriesImpl.this.database.getPlaiProductsQueries().getGetProducts$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    @NotNull
    public Query<DbPlaiProducts> getCustomerTagProducts(@NotNull String buildingId, @NotNull String customerTagId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagId, "customerTagId");
        return getCustomerTagProducts(buildingId, customerTagId, new Function9<String, String, String, Double, Double, Double, Long, List<? extends String>, List<? extends String>, DbPlaiProducts>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.getCustomerTagProducts.2
            @Override // kotlin.jvm.functions.Function9
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).longValue(), (List<String>) obj8, (List<String>) obj9);
            }

            @NotNull
            public final DbPlaiProducts invoke(@NotNull String buildingId_, @NotNull String floorId, @NotNull String customerTagId_, double d, double d2, double d3, long j, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId, "floorId");
                Intrinsics.h(customerTagId_, "customerTagId_");
                Intrinsics.h(regionIds, "regionIds");
                Intrinsics.h(regionNames, "regionNames");
                return new DbPlaiProducts(buildingId_, floorId, customerTagId_, d, d2, d3, j, regionIds, regionNames);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiProductsQueries
    @NotNull
    public Query<DbPlaiProducts> getProducts(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getProducts(buildingId, new Function9<String, String, String, Double, Double, Double, Long, List<? extends String>, List<? extends String>, DbPlaiProducts>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiProductsQueriesImpl.getProducts.2
            @Override // kotlin.jvm.functions.Function9
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).longValue(), (List<String>) obj8, (List<String>) obj9);
            }

            @NotNull
            public final DbPlaiProducts invoke(@NotNull String buildingId_, @NotNull String floorId, @NotNull String customerTagId, double d, double d2, double d3, long j, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId, "floorId");
                Intrinsics.h(customerTagId, "customerTagId");
                Intrinsics.h(regionIds, "regionIds");
                Intrinsics.h(regionNames, "regionNames");
                return new DbPlaiProducts(buildingId_, floorId, customerTagId, d, d2, d3, j, regionIds, regionNames);
            }
        });
    }
}
