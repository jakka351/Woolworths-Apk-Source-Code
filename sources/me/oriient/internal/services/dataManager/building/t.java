package me.oriient.internal.services.dataManager.building;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WorldCoordinate f25116a;
    public final /* synthetic */ BuildingsSearchResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WorldCoordinate worldCoordinate, BuildingsSearchResult buildingsSearchResult) {
        super(0);
        this.f25116a = worldCoordinate;
        this.b = buildingsSearchResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("locationLatitude", Double.valueOf(this.f25116a.getLatitude())), new Pair("locationLongitude", Double.valueOf(this.f25116a.getLongitude())), new Pair("numResults", Integer.valueOf(this.b.getResults().size())));
    }
}
