package me.oriient.positioningengine.common.util;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.IOError;
import me.oriient.internal.infra.utils.core.OperationCanceled;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.infra.utils.core.ServerError;
import me.oriient.positioningengine.common.util.PositioningEngineError;

/* loaded from: classes8.dex */
public abstract class b {
    public static final PositioningEngineError a(OriientError oriientError) {
        Intrinsics.h(oriientError, "<this>");
        return oriientError instanceof ParsingError ? new PositioningEngineError.ParsingError(((ParsingError) oriientError).getToParse()) : oriientError instanceof ServerError ? new PositioningEngineError.ServerError(((ServerError) oriientError).getCode(), oriientError.getMessage()) : oriientError instanceof OperationCanceled ? PositioningEngineError.OperationCanceled.INSTANCE : oriientError instanceof AuthError ? PositioningEngineError.AuthError.INSTANCE : oriientError instanceof IOError ? PositioningEngineError.IOError.INSTANCE : new PositioningEngineError.General(oriientError.getMessage());
    }
}
