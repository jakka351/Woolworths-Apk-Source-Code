package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.services.dataManager.building.Building;

/* renamed from: me.oriient.ipssdk.realtime.ofs.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1630d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OriientError f26057a;
    public final /* synthetic */ Building b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630d(OriientError oriientError, Building building) {
        super(0);
        this.f26057a = oriientError;
        this.b = building;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f26057a.getMessage()), new Pair("buildingId", this.b.getId()));
    }
}
