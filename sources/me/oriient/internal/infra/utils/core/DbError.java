package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/infra/utils/core/DbError;", "Lme/oriient/internal/infra/utils/core/OriientError;", lqlqqlq.mmm006Dm006Dm, "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DbError extends OriientError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DbError(@NotNull String description) {
        super(null, "Error: DB operation failed - ".concat(description), 1, null);
        Intrinsics.h(description, "description");
    }
}
