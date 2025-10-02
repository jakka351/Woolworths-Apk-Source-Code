package me.oriient.internal.services.dataManager.region;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.building.BuildingId;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j implements RegionRest {

    @NotNull
    private static final h Companion = new h();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25399a;
    public final Lazy b;

    public j() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25399a = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }

    @Override // me.oriient.internal.services.dataManager.region.RegionRest
    public final Object fetchRegions(BuildingId buildingId, Continuation continuation) {
        return RestHelper.DefaultImpls.getStringData$default((RestHelper) this.b.getD(), "RegionRest", ((OriientApiProvider) this.f25399a.getD()).getOriientApi().getApiUrl() + "/v5/buildings/" + buildingId.getValue() + "/regions?regionUseMapPresentation=true", false, new i(buildingId), continuation, 4, null);
    }
}
