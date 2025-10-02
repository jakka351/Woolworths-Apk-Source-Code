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
import kotlin.jvm.functions.Function12;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.internal.a;
import me.oriient.internal.services.plai.database.DbPlaiCategories;
import me.oriient.internal.services.plai.database.PlaiCategoriesQueries;
import me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J¬\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0089\u0002\u0010\u0016\u001a\u0084\u0002\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J´\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0089\u0002\u0010\u0016\u001a\u0084\u0002\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016Jh\u0010*\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006-"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/plai/database/PlaiCategoriesQueries;", "database", "Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getCategories", "", "Lcom/squareup/sqldelight/Query;", "getGetCategories$internal_publishRelease", "()Ljava/util/List;", "getCategoryById", "getGetCategoryById$internal_publishRelease", "clearCategories", "", "Lme/oriient/internal/services/plai/database/DbPlaiCategories;", "buildingId", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function12;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "floorId", "categoryName", "categoryId", "", "bottomLeftX", "bottomLeftY", "topRightX", "topRightY", "categoryArea", "", "isAppropriateSize", "", "numberOfProductsWithinArea", "", "lastUsedScanTimeMillis", "removeBuildingCategories", "upsertCategories", "GetCategoriesQuery", "GetCategoryByIdQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaiCategoriesQueriesImpl extends TransacterImpl implements PlaiCategoriesQueries {

    @NotNull
    private final PlaiSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getCategories;

    @NotNull
    private final List<Query<?>> getCategoryById;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl$GetCategoriesQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetCategoriesQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;
        final /* synthetic */ PlaiCategoriesQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCategoriesQuery(@NotNull PlaiCategoriesQueriesImpl plaiCategoriesQueriesImpl, @NotNull String buildingId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiCategoriesQueriesImpl.getGetCategories$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiCategoriesQueriesImpl;
            this.buildingId = buildingId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-2052228236, "SELECT * FROM DbPlaiCategories WHERE buildingId = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl$GetCategoriesQuery$execute$1
                final /* synthetic */ PlaiCategoriesQueriesImpl.GetCategoriesQuery<T> this$0;

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
            return "PlaiCategories.sq:getCategories";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl$GetCategoryByIdQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "buildingId", "", "categoryId", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBuildingId", "()Ljava/lang/String;", "getCategoryId", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetCategoryByIdQuery<T> extends Query<T> {

        @NotNull
        private final String buildingId;

        @NotNull
        private final String categoryId;
        final /* synthetic */ PlaiCategoriesQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCategoryByIdQuery(@NotNull PlaiCategoriesQueriesImpl plaiCategoriesQueriesImpl, @NotNull String buildingId, @NotNull String categoryId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(plaiCategoriesQueriesImpl.getGetCategoryById$internal_publishRelease(), mapper);
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(categoryId, "categoryId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = plaiCategoriesQueriesImpl;
            this.buildingId = buildingId;
            this.categoryId = categoryId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-787604152, "SELECT * FROM DbPlaiCategories WHERE buildingId = ? AND categoryId = ?", 2, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl$GetCategoryByIdQuery$execute$1
                final /* synthetic */ PlaiCategoriesQueriesImpl.GetCategoryByIdQuery<T> this$0;

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
                    executeQuery.z(2, this.this$0.getCategoryId());
                }
            });
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final String getCategoryId() {
            return this.categoryId;
        }

        @NotNull
        public String toString() {
            return "PlaiCategories.sq:getCategoryById";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaiCategoriesQueriesImpl(@NotNull PlaiSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getCategories = new CopyOnWriteArrayList();
        this.getCategoryById = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    public void clearCategories() {
        this.driver.t1(1981335851, "DELETE FROM DbPlaiCategories", null);
        notifyQueries(1981335851, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.clearCategories.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategoryById$internal_publishRelease(), PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategories$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    @NotNull
    public <T> Query<T> getCategories(@NotNull String buildingId, @NotNull final Function12<? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Boolean, ? super Integer, ? super Long, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(mapper, "mapper");
        return new GetCategoriesQuery(this, buildingId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.getCategories.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function12<String, String, String, String, Double, Double, Double, Double, Double, Boolean, Integer, Long, T> function12 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String strA2 = a.a(string2, cursor, 3);
                Double d = cursor.getDouble(4);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 5);
                Double d2 = cursor.getDouble(6);
                Double dC2 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 7);
                Double d3 = cursor.getDouble(8);
                Intrinsics.e(d3);
                Long l = cursor.getLong(9);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                Long l2 = cursor.getLong(10);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(11);
                Intrinsics.e(l3);
                return (T) function12.invoke(string, strA, string2, strA2, d, dC, d2, dC2, d3, boolValueOf, numValueOf, l3);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    @NotNull
    public <T> Query<T> getCategoryById(@NotNull String buildingId, @NotNull String categoryId, @NotNull final Function12<? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Boolean, ? super Integer, ? super Long, ? extends T> mapper) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(mapper, "mapper");
        return new GetCategoryByIdQuery(this, buildingId, categoryId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.getCategoryById.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function12<String, String, String, String, Double, Double, Double, Double, Double, Boolean, Integer, Long, T> function12 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                String strA2 = a.a(string2, cursor, 3);
                Double d = cursor.getDouble(4);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 5);
                Double d2 = cursor.getDouble(6);
                Double dC2 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 7);
                Double d3 = cursor.getDouble(8);
                Intrinsics.e(d3);
                Long l = cursor.getLong(9);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                Long l2 = cursor.getLong(10);
                Intrinsics.e(l2);
                Integer numValueOf = Integer.valueOf((int) l2.longValue());
                Long l3 = cursor.getLong(11);
                Intrinsics.e(l3);
                return (T) function12.invoke(string, strA, string2, strA2, d, dC, d2, dC2, d3, boolValueOf, numValueOf, l3);
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetCategories$internal_publishRelease() {
        return this.getCategories;
    }

    @NotNull
    public final List<Query<?>> getGetCategoryById$internal_publishRelease() {
        return this.getCategoryById;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    public void removeBuildingCategories(@NotNull final String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.driver.t1(843657458, "DELETE FROM DbPlaiCategories WHERE buildingId = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.removeBuildingCategories.1
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
        notifyQueries(843657458, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.removeBuildingCategories.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategoryById$internal_publishRelease(), PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategories$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    public void upsertCategories(@NotNull final String buildingId, @NotNull final String floorId, @NotNull final String categoryName, @NotNull final String categoryId, final double bottomLeftX, final double bottomLeftY, final double topRightX, final double topRightY, final double categoryArea, final boolean isAppropriateSize, final int numberOfProductsWithinArea, final long lastUsedScanTimeMillis) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(categoryName, "categoryName");
        Intrinsics.h(categoryId, "categoryId");
        this.driver.t1(562805769, "INSERT OR REPLACE INTO DbPlaiCategories(\nbuildingId,\nfloorId,\ncategoryName,\ncategoryId,\nbottomLeftX,\nbottomLeftY,\ntopRightX,\ntopRightY,\ncategoryArea,\nisAppropriateSize,\nnumberOfProductsWithinArea,\nlastUsedScanTimeMillis) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.upsertCategories.1
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
                execute.z(3, categoryName);
                execute.z(4, categoryId);
                execute.b(5, Double.valueOf(bottomLeftX));
                execute.b(6, Double.valueOf(bottomLeftY));
                execute.b(7, Double.valueOf(topRightX));
                execute.b(8, Double.valueOf(topRightY));
                execute.b(9, Double.valueOf(categoryArea));
                execute.c(10, Long.valueOf(isAppropriateSize ? 1L : 0L));
                execute.c(11, Long.valueOf(numberOfProductsWithinArea));
                execute.c(12, Long.valueOf(lastUsedScanTimeMillis));
            }
        });
        notifyQueries(562805769, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.upsertCategories.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategoryById$internal_publishRelease(), PlaiCategoriesQueriesImpl.this.database.getPlaiCategoriesQueries().getGetCategories$internal_publishRelease());
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    @NotNull
    public Query<DbPlaiCategories> getCategories(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        return getCategories(buildingId, new Function12<String, String, String, String, Double, Double, Double, Double, Double, Boolean, Integer, Long, DbPlaiCategories>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.getCategories.2
            @Override // kotlin.jvm.functions.Function12
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue(), ((Number) obj8).doubleValue(), ((Number) obj9).doubleValue(), ((Boolean) obj10).booleanValue(), ((Number) obj11).intValue(), ((Number) obj12).longValue());
            }

            @NotNull
            public final DbPlaiCategories invoke(@NotNull String buildingId_, @NotNull String floorId, @NotNull String categoryName, @NotNull String categoryId, double d, double d2, double d3, double d4, double d5, boolean z, int i, long j) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId, "floorId");
                Intrinsics.h(categoryName, "categoryName");
                Intrinsics.h(categoryId, "categoryId");
                return new DbPlaiCategories(buildingId_, floorId, categoryName, categoryId, d, d2, d3, d4, d5, z, i, j);
            }
        });
    }

    @Override // me.oriient.internal.services.plai.database.PlaiCategoriesQueries
    @NotNull
    public Query<DbPlaiCategories> getCategoryById(@NotNull String buildingId, @NotNull String categoryId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        return getCategoryById(buildingId, categoryId, new Function12<String, String, String, String, Double, Double, Double, Double, Double, Boolean, Integer, Long, DbPlaiCategories>() { // from class: me.oriient.internal.services.plai.database.internal.PlaiCategoriesQueriesImpl.getCategoryById.2
            @Override // kotlin.jvm.functions.Function12
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                return invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue(), ((Number) obj8).doubleValue(), ((Number) obj9).doubleValue(), ((Boolean) obj10).booleanValue(), ((Number) obj11).intValue(), ((Number) obj12).longValue());
            }

            @NotNull
            public final DbPlaiCategories invoke(@NotNull String buildingId_, @NotNull String floorId, @NotNull String categoryName, @NotNull String categoryId_, double d, double d2, double d3, double d4, double d5, boolean z, int i, long j) {
                Intrinsics.h(buildingId_, "buildingId_");
                Intrinsics.h(floorId, "floorId");
                Intrinsics.h(categoryName, "categoryName");
                Intrinsics.h(categoryId_, "categoryId_");
                return new DbPlaiCategories(buildingId_, floorId, categoryName, categoryId_, d, d2, d3, d4, d5, z, i, j);
            }
        });
    }
}
