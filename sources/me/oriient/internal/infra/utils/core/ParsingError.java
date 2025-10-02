package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/infra/utils/core/ParsingError;", "Lme/oriient/internal/infra/utils/core/OriientError;", "toParse", "", "(Ljava/lang/String;)V", "getToParse", "()Ljava/lang/String;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ParsingError extends OriientError {

    @NotNull
    private final String toParse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParsingError(@NotNull String toParse) {
        super(null, "Failed to parse - ".concat(toParse), 1, null);
        Intrinsics.h(toParse, "toParse");
        this.toParse = toParse;
    }

    @NotNull
    public final String getToParse() {
        return this.toParse;
    }
}
