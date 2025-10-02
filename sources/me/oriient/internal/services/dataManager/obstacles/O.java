package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class O extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25240a;
    public final /* synthetic */ C1349u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, C1349u c1349u) {
        super(1);
        this.f25240a = str;
        this.b = c1349u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Obstacles obstacles = (Obstacles) obj;
        Intrinsics.h(obstacles, "obstacles");
        String str = this.f25240a;
        C1349u c1349u = this.b;
        return new w(str, c1349u.f25263a, c1349u.b, obstacles);
    }
}
