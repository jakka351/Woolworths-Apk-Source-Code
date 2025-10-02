package me.oriient.ipssdk.common.services.database;

import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.common.services.database.sdkcommon.IpsCommonDatabaseImplKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/common/services/database/IpsCommonDatabase;", "Lcom/squareup/sqldelight/Transacter;", "dBBuildingQueries", "Lme/oriient/ipssdk/common/services/database/DBBuildingQueries;", "getDBBuildingQueries", "()Lme/oriient/ipssdk/common/services/database/DBBuildingQueries;", "dBEntranceQueries", "Lme/oriient/ipssdk/common/services/database/DBEntranceQueries;", "getDBEntranceQueries", "()Lme/oriient/ipssdk/common/services/database/DBEntranceQueries;", "dBExternalRegionPlacementQueries", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacementQueries;", "getDBExternalRegionPlacementQueries", "()Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacementQueries;", "dBExternalRegionQueries", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionQueries;", "getDBExternalRegionQueries", "()Lme/oriient/ipssdk/common/services/database/DBExternalRegionQueries;", "dBFloorQueries", "Lme/oriient/ipssdk/common/services/database/DBFloorQueries;", "getDBFloorQueries", "()Lme/oriient/ipssdk/common/services/database/DBFloorQueries;", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IpsCommonDatabase extends Transacter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/common/services/database/IpsCommonDatabase$Companion;", "", "()V", "Schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "getSchema", "()Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "invoke", "Lme/oriient/ipssdk/common/services/database/IpsCommonDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SqlDriver.Schema getSchema() {
            return IpsCommonDatabaseImplKt.getSchema(Reflection.f24268a.b(IpsCommonDatabase.class));
        }

        @NotNull
        public final IpsCommonDatabase invoke(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            return IpsCommonDatabaseImplKt.newInstance(Reflection.f24268a.b(IpsCommonDatabase.class), driver);
        }
    }

    @NotNull
    DBBuildingQueries getDBBuildingQueries();

    @NotNull
    DBEntranceQueries getDBEntranceQueries();

    @NotNull
    DBExternalRegionPlacementQueries getDBExternalRegionPlacementQueries();

    @NotNull
    DBExternalRegionQueries getDBExternalRegionQueries();

    @NotNull
    DBFloorQueries getDBFloorQueries();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);
}
