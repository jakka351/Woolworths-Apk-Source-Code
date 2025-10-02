package me.oriient.navigation.common.util;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.IOError;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.OperationCanceled;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.infra.utils.core.ServerError;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public abstract class a {
    public static final NavigationError a(OriientError oriientError) {
        Intrinsics.h(oriientError, "<this>");
        return oriientError instanceof InternalError ? new NavigationError.InternalError(oriientError.getMessage()) : oriientError instanceof IOError ? NavigationError.IOError.INSTANCE : oriientError instanceof OperationCanceled ? NavigationError.OperationCanceled.INSTANCE : oriientError instanceof ServerError ? new NavigationError.ServerError(((ServerError) oriientError).getCode(), oriientError.getMessage()) : oriientError instanceof AuthError ? NavigationError.AuthError.INSTANCE : oriientError instanceof ParsingError ? new NavigationError.ParsingError(((ParsingError) oriientError).getToParse()) : new NavigationError.GeneralError(oriientError.getMessage());
    }
}
