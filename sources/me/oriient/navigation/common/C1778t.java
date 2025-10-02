package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.navigation.ondevice.navgraph.C1797c;
import me.oriient.navigation.ondevice.navgraph.NavGraphPriorityLoader;

/* renamed from: me.oriient.navigation.common.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1778t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1797c f26266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1778t(C1797c c1797c) {
        super(0);
        this.f26266a = c1797c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.navigation.ondevice.navgraph.A((NavGraphPriorityLoader) DiKt.a().get(Reflection.f24268a.b(NavGraphPriorityLoader.class), null), this.f26266a);
    }
}
