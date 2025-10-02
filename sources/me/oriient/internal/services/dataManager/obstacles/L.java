package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class L implements I {

    @NotNull
    private static final J Companion = new J();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25238a = InternalDiKt.getDi().inject(Reflection.f24268a.b(RestHelper.class));
}
