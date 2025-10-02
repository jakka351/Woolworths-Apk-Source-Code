package me.oriient.positioningengine.common.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"assertionFailure", "", "message", "", "service-positioning-engine_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UtilsKt {
    public static final void assertionFailure(@NotNull String message) {
        Intrinsics.h(message, "message");
        if (((BuildData) DiKt.getDi().get(Reflection.f24268a.b(BuildData.class), null)).getDebug()) {
            throw new AssertionError(message);
        }
    }
}
