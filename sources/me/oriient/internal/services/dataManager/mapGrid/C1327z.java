package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1327z implements InterfaceC1325x {

    @NotNull
    private static final C1326y Companion = new C1326y();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25228a = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
}
