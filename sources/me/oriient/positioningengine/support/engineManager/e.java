package me.oriient.positioningengine.support.engineManager;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e implements InterfaceC1845b {

    @NotNull
    private static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26532a = DiKt.getDi().inject(Reflection.f24268a.b(ELog.class));
    public Boolean b;
}
