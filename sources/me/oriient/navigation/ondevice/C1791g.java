package me.oriient.navigation.ondevice;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.obstacles.Obstacles;

/* renamed from: me.oriient.navigation.ondevice.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1791g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26286a;
    public final /* synthetic */ Floor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791g(String str, Floor floor) {
        super(1);
        this.f26286a = str;
        this.b = floor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Obstacles it = (Obstacles) obj;
        Intrinsics.h(it, "it");
        return new ObstaclesNavigationRecord(this.f26286a, this.b.getId(), it);
    }
}
