package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.mapGrid.C1305c;

/* renamed from: me.oriient.internal.services.dataManager.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1296g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1305c f25179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296g(C1305c c1305c) {
        super(0);
        this.f25179a = c1305c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.internal.services.dataManager.mapGrid.A(new DataRepositoryImpl("MapGridRepository", "MapGrid", this.f25179a, new me.oriient.internal.services.dataManager.mapGrid.U()));
    }
}
