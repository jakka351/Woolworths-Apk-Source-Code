package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.ips.IPSCore;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientTrackingInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientTrackingInteractor;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OriientTrackingInteractorImpl implements OriientTrackingInteractor {
    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientTrackingInteractor
    public final void a(OriientAppEvent event) {
        Intrinsics.h(event, "event");
        Timber.f27013a.h(a.A("onTrackOriientAppEvent ", event.name()), new Object[0]);
        IPSCore.registerApplicationEvent(event.d);
    }
}
