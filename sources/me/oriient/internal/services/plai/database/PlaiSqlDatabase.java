package me.oriient.internal.services.plai.database;

import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.plai.database.DbPlaiProducts;
import me.oriient.internal.services.plai.database.internal.PlaiSqlDatabaseImplKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiSqlDatabase;", "Lcom/squareup/sqldelight/Transacter;", "plaiCategoriesQueries", "Lme/oriient/internal/services/plai/database/PlaiCategoriesQueries;", "getPlaiCategoriesQueries", "()Lme/oriient/internal/services/plai/database/PlaiCategoriesQueries;", "plaiCategoriesStatisticsQueries", "Lme/oriient/internal/services/plai/database/PlaiCategoriesStatisticsQueries;", "getPlaiCategoriesStatisticsQueries", "()Lme/oriient/internal/services/plai/database/PlaiCategoriesStatisticsQueries;", "plaiProductsQueries", "Lme/oriient/internal/services/plai/database/PlaiProductsQueries;", "getPlaiProductsQueries", "()Lme/oriient/internal/services/plai/database/PlaiProductsQueries;", "plaiStatisticsQueries", "Lme/oriient/internal/services/plai/database/PlaiStatisticsQueries;", "getPlaiStatisticsQueries", "()Lme/oriient/internal/services/plai/database/PlaiStatisticsQueries;", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiSqlDatabase extends Transacter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiSqlDatabase$Companion;", "", "()V", "Schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "getSchema", "()Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "invoke", "Lme/oriient/internal/services/plai/database/PlaiSqlDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "DbPlaiProductsAdapter", "Lme/oriient/internal/services/plai/database/DbPlaiProducts$Adapter;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SqlDriver.Schema getSchema() {
            return PlaiSqlDatabaseImplKt.getSchema(Reflection.f24268a.b(PlaiSqlDatabase.class));
        }

        @NotNull
        public final PlaiSqlDatabase invoke(@NotNull SqlDriver driver, @NotNull DbPlaiProducts.Adapter DbPlaiProductsAdapter) {
            Intrinsics.h(driver, "driver");
            Intrinsics.h(DbPlaiProductsAdapter, "DbPlaiProductsAdapter");
            return PlaiSqlDatabaseImplKt.newInstance(Reflection.f24268a.b(PlaiSqlDatabase.class), driver, DbPlaiProductsAdapter);
        }
    }

    @NotNull
    PlaiCategoriesQueries getPlaiCategoriesQueries();

    @NotNull
    PlaiCategoriesStatisticsQueries getPlaiCategoriesStatisticsQueries();

    @NotNull
    PlaiProductsQueries getPlaiProductsQueries();

    @NotNull
    PlaiStatisticsQueries getPlaiStatisticsQueries();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);
}
