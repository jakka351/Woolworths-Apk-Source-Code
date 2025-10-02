package me.oriient.ipssdk.common.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.common.ofs.g0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"initializeLogger", "", "di", "Lme/oriient/internal/infra/di/DependencyInjection;", "me.oriient.sdk-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoggerDiKt {
    public static final void initializeLogger(@NotNull DependencyInjection di) {
        Intrinsics.h(di, "di");
        DependencyInjection.DefaultImpls.registerSingleton$default(di, Reflection.f24268a.b(Logger.class), null, g0.f25750a, 2, null);
    }
}
