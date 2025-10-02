package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopFeedItem;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.NavRoundelCardKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                HorizontalListData horizontalListData = (HorizontalListData) this.e;
                final au.com.woolworths.design.wx.component.searchbar.a aVar = (au.com.woolworths.design.wx.component.searchbar.a) this.f;
                final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) this.g;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                for (HorizontalListItem horizontalListItem : horizontalListData.e) {
                    if (horizontalListItem instanceof ContentCardData) {
                        final ContentCardData contentCardData = (ContentCardData) horizontalListItem;
                        LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHorizontalListKt$BrandedShopHorizontalList$2$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    ContentCardKt.a(contentCardData, aVar, null, sharedIntrinsicHeightState, BorderStrokeKt.a(ToneColors.i, 1), 0, null, null, null, false, composer, 199688, 964);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 951874732), 3);
                    } else if (horizontalListItem instanceof NavRoundelCardData) {
                        final NavRoundelCardData navRoundelCardData = (NavRoundelCardData) horizontalListItem;
                        LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHorizontalListKt$BrandedShopHorizontalList$2$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    NavRoundelCardKt.a(navRoundelCardData, aVar, ContentScale.Companion.b, null, composer, 392, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 752377749), 3);
                    }
                }
                break;
            default:
                Map map = (Map) this.e;
                BrandedShopFeedItem.BrandedShopTabHeader brandedShopTabHeader = (BrandedShopFeedItem.BrandedShopTabHeader) this.f;
                Function1 function1 = (Function1) this.g;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                LinkedHashMap linkedHashMapS = MapsKt.s(map);
                String str = brandedShopTabHeader.f6690a;
                linkedHashMapS.put(str, num);
                function1.invoke(new UiEvent.OnTabClick(str, (String) brandedShopTabHeader.b.get(iIntValue), linkedHashMapS));
                break;
        }
        return Unit.f24250a;
    }
}
