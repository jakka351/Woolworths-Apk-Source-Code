package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/RoutingInteractor;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RoutingInteractor {
    StateFlow a();

    Object b(Continuation continuation);

    Object c(Continuation continuation);

    Object d(PinContent pinContent, Continuation continuation);

    void e();
}
