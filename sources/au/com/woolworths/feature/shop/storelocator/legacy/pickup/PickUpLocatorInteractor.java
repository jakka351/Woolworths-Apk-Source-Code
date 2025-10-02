package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorInteractor;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpLocatorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PickUpLocatorRepository f8185a;
    public final CollectionModeInteractor b;

    public PickUpLocatorInteractor(PickUpLocatorRepository pickUpLocatorRepository, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f8185a = pickUpLocatorRepository;
        this.b = collectionModeInteractor;
    }
}
