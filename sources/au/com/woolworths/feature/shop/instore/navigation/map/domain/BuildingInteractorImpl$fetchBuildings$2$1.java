package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import au.com.woolworths.feature.shop.instore.navigation.map.data.BuildingSearchResult;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener;
import me.oriient.ipssdk.api.models.IPSBuildingsSearchResult;
import me.oriient.ipssdk.api.models.IPSError;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/instore/navigation/map/domain/BuildingInteractorImpl$fetchBuildings$2$1", "Lme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuildingInteractorImpl$fetchBuildings$2$1 implements IPSBuildingsSearchListener {
    @Override // me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener
    public final void onBuildingsSearchReceived(List buildings) {
        Intrinsics.h(buildings, "buildings");
        Timber.f27013a.b("fetchBuildings onBuildingsSearchReceived() called with: buildings = " + buildings, new Object[0]);
        List<IPSBuildingsSearchResult> list = buildings;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (IPSBuildingsSearchResult iPSBuildingsSearchResult : list) {
            Intrinsics.h(iPSBuildingsSearchResult, "<this>");
            String b = iPSBuildingsSearchResult.getB();
            Intrinsics.g(b, "getId(...)");
            String c = iPSBuildingsSearchResult.getC();
            Intrinsics.g(c, "getName(...)");
            arrayList.add(new BuildingSearchResult(b, c));
        }
        throw null;
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
    public final void onError(IPSError error) {
        Intrinsics.h(error, "error");
        Bark.Companion companion = Bark.f8483a;
        Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "fetchBuildings onError() called with: error = " + error, null);
        OriientErrorKt.a(error);
        throw null;
    }
}
