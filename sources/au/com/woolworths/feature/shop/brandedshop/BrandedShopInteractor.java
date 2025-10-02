package au.com.woolworths.feature.shop.brandedshop;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/BrandedShopInteractor;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandedShopInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BrandedShopRepository f6654a;
    public final CollectionModeInteractor b;
    public final SupportedLinksHelper c;

    public BrandedShopInteractor(BrandedShopRepository brandedShopRepository, CollectionModeInteractor collectionModeInteractor, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f6654a = brandedShopRepository;
        this.b = collectionModeInteractor;
        this.c = supportedLinksHelper;
    }

    public final Object a(String str, Continuation continuation) {
        CollectionModeInteractor collectionModeInteractor = this.b;
        return this.f6654a.a(str, collectionModeInteractor.a(), ShoppingModeTypeDataKt.a(collectionModeInteractor.w()), this.c.a(), (ContinuationImpl) continuation);
    }
}
