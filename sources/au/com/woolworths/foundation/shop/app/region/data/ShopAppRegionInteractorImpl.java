package au.com.woolworths.foundation.shop.app.region.data;

import au.com.woolworths.android.onesite.modules.common.Region;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/app/region/data/ShopAppRegionInteractorImpl;", "Lau/com/woolworths/foundation/shop/app/region/data/ShopAppRegionInteractor;", "app-region_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppRegionInteractorImpl implements ShopAppRegionInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAppRegionRepository f8660a;
    public final StateFlow b;

    public ShopAppRegionInteractorImpl(ShopAppRegionRepository shopAppRegionRepository) {
        this.f8660a = shopAppRegionRepository;
        this.b = shopAppRegionRepository.e;
    }

    @Override // au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor
    /* renamed from: a, reason: from getter */
    public final StateFlow getB() {
        return this.b;
    }

    @Override // au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor
    public final Region b() {
        Region region = (Region) this.f8660a.e.getValue();
        return region == null ? Region.i : region;
    }

    @Override // au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor
    public final Region c() {
        Region region = (Region) this.f8660a.e.getValue();
        if (region != null) {
            return region;
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (Intrinsics.c(timeZone.getID(), "Pacific/Auckland") || Intrinsics.c(timeZone.getID(), "Pacific/Chatham")) {
            return Region.j;
        }
        String id = timeZone.getID();
        Intrinsics.g(id, "getID(...)");
        if (StringsKt.W(id, "Australia", false)) {
            return Region.i;
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor
    public final Object d(Region region, Continuation continuation) {
        Object objA = this.f8660a.a(region, (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
