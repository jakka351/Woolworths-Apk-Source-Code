package me.oriient.internal.services.dataManager.building;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WorldCoordinate f25117a;
    public final /* synthetic */ OriientError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(WorldCoordinate worldCoordinate, OriientError oriientError) {
        super(0);
        this.f25117a = worldCoordinate;
        this.b = oriientError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("locationLatitude", Double.valueOf(this.f25117a.getLatitude())), new Pair("locationLongitude", Double.valueOf(this.f25117a.getLongitude())), new Pair("errorMessage", this.b.getMessage()));
    }
}
