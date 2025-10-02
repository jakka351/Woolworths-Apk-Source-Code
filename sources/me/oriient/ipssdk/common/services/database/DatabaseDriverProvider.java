package me.oriient.ipssdk.common.services.database;

import androidx.annotation.Keep;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DatabaseDriverProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "getDriver", "()Lcom/squareup/sqldelight/db/SqlDriver;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DatabaseDriverProvider extends DiProvidable {
    @NotNull
    SqlDriver getDriver();
}
