package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.dataManager.obstacles.C1332c;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesPriorityLoader;

/* renamed from: me.oriient.internal.services.dataManager.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1299j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1332c f25182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299j(C1332c c1332c) {
        super(0);
        this.f25182a = c1332c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.internal.services.dataManager.obstacles.z((ObstaclesPriorityLoader) InternalDiKt.getDi().get(Reflection.f24268a.b(ObstaclesPriorityLoader.class)), this.f25182a);
    }
}
