package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.dataManager.mapGrid.C1305c;
import me.oriient.internal.services.dataManager.mapGrid.C1323v;
import me.oriient.internal.services.dataManager.mapGrid.MapGridPriorityLoader;

/* renamed from: me.oriient.internal.services.dataManager.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1297h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1305c f25180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1297h(C1305c c1305c) {
        super(0);
        this.f25180a = c1305c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.internal.services.dataManager.mapGrid.G(new C1323v(), (MapGridPriorityLoader) InternalDiKt.getDi().get(Reflection.f24268a.b(MapGridPriorityLoader.class)), this.f25180a);
    }
}
