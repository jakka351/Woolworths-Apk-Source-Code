package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.obstacles.C1332c;

/* renamed from: me.oriient.internal.services.dataManager.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1298i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1332c f25181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1298i(C1332c c1332c) {
        super(0);
        this.f25181a = c1332c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.internal.services.dataManager.obstacles.v(new DataRepositoryImpl("ObstaclesRepository", "Obstacles", this.f25181a, new me.oriient.internal.services.dataManager.obstacles.U()));
    }
}
