package au.com.woolworths.feature.shop.marketplace.ui.categories;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPageRationale;
import au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ d(List list, int i) {
        this.d = i;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return ((MarketplaceCategory) this.e.get(((Integer) obj).intValue())).f7472a;
            case 1:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                final List list = this.e;
                LazyColumn.b(list.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogBody$lambda$5$lambda$4$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogBody$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            LocationTrackingPrimingPageRationale locationTrackingPrimingPageRationale = (LocationTrackingPrimingPageRationale) list.get(iIntValue);
                            composer.o(-1564405125);
                            RequestLocationPermissionPrimingDialogContentKt.a(locationTrackingPrimingPageRationale.c, locationTrackingPrimingPageRationale.b, locationTrackingPrimingPageRationale.f7761a, composer, 0);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1091073711));
                return Unit.f24250a;
            case 2:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, "Products shown: " + CollectionsKt.M(this.e, ", ", null, null, new au.com.woolworths.foundation.shop.nhp.ui.edr.c(3), 30));
                return Unit.f24250a;
            default:
                ImageCarouselItem image = (ImageCarouselItem) obj;
                Intrinsics.h(image, "image");
                return Integer.valueOf(this.e.indexOf(image));
        }
    }
}
