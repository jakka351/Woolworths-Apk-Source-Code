package me.oriient.ipssdk.common.database;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.ipssdk.common.services.database.DatabaseDriverProvider;
import me.oriient.ipssdk.common.services.database.IpsCommonDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/common/database/CommonDatabaseDriverProviderImpl;", "Lme/oriient/ipssdk/common/services/database/DatabaseDriverProvider;", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider", "<init>", "(Lme/oriient/internal/infra/utils/android/ContextProvider;)V", "Lcom/squareup/sqldelight/db/SqlDriver;", "a", "Lcom/squareup/sqldelight/db/SqlDriver;", "getDriver", "()Lcom/squareup/sqldelight/db/SqlDriver;", "driver", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonDatabaseDriverProviderImpl implements DatabaseDriverProvider {

    /* renamed from: a, reason: collision with root package name */
    private final AndroidSqliteDriver f25712a;

    public CommonDatabaseDriverProviderImpl(@NotNull ContextProvider contextProvider) {
        Intrinsics.h(contextProvider, "contextProvider");
        this.f25712a = new AndroidSqliteDriver(IpsCommonDatabase.INSTANCE.getSchema(), contextProvider.getContext(), "me.oriient.ipssdk.common.services.database");
    }

    @Override // me.oriient.ipssdk.common.services.database.DatabaseDriverProvider
    @NotNull
    public SqlDriver getDriver() {
        return this.f25712a;
    }
}
