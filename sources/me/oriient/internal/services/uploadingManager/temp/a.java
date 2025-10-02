package me.oriient.internal.services.uploadingManager.temp;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.BuildData;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(String message) {
        Intrinsics.h(message, "message");
        if (((BuildData) InternalDiKt.getDi().get(Reflection.f24268a.b(BuildData.class))).getDebug()) {
            throw new AssertionError(message);
        }
    }
}
