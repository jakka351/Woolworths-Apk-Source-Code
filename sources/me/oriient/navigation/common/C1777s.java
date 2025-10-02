package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.navigation.ondevice.navgraph.C1797c;

/* renamed from: me.oriient.navigation.common.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1777s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1797c f26264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1777s(C1797c c1797c) {
        super(0);
        this.f26264a = c1797c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.navigation.ondevice.navgraph.z(new DataRepositoryImpl("NavGraphRepository", "NavGraph", this.f26264a, new me.oriient.navigation.ondevice.navgraph.Q()));
    }
}
