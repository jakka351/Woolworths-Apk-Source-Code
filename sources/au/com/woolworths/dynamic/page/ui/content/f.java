package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.BottomSheetFeedItemData;
import au.com.woolworths.dynamic.page.data.CampaignCardCopyData;
import au.com.woolworths.dynamic.page.data.CampaignCardListData;
import au.com.woolworths.dynamic.page.data.CampaignTermsAndConditionsData;
import au.com.woolworths.dynamic.page.data.CategoryTileData;
import au.com.woolworths.dynamic.page.data.CategoryTileListData;
import au.com.woolworths.dynamic.page.data.ContentListData;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.data.QuickLinkListData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.ui.QuickLinkCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(Object obj, Function2 function2, int i) {
        this.d = i;
        this.f = obj;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        final Function2 function2 = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                LazyListScope LazyRow = (LazyListScope) obj;
                float f = CategoryTileListUiKt.f5199a;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                for (final CategoryTileData categoryTileData : ((CategoryTileListData) obj2).b) {
                    LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.CategoryTileListUiKt$CategoryTileListUi$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            LazyItemScope item = (LazyItemScope) obj3;
                            Composer composer = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                composer.o(5004770);
                                Function2 function22 = function2;
                                boolean zN = composer.n(function22);
                                Object objG = composer.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new i(0, function22);
                                    composer.A(objG);
                                }
                                composer.l();
                                CategoryTileListUiKt.b(categoryTileData, (Function1) objG, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, true, -940421959), 3);
                }
                break;
            case 1:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                for (final BottomSheetFeedItemData bottomSheetFeedItemData : (List) obj2) {
                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.DynamicPageScreenKt$BottomSheetContent$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            LazyItemScope item = (LazyItemScope) obj3;
                            Composer composer = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                BottomSheetFeedItemData bottomSheetFeedItemData2 = bottomSheetFeedItemData;
                                if (bottomSheetFeedItemData2 instanceof ContentListData) {
                                    composer.o(-1341428772);
                                    ContentListUiKt.b((ContentListData) bottomSheetFeedItemData2, null, function2, composer, 0);
                                    composer.l();
                                } else if (bottomSheetFeedItemData2 instanceof CampaignTermsAndConditionsData) {
                                    composer.o(-1341425304);
                                    TermsAndConditionsUiKt.a((CampaignTermsAndConditionsData) bottomSheetFeedItemData2, null, composer, 0, 2);
                                    composer.l();
                                } else if (bottomSheetFeedItemData2 instanceof CampaignCardListData) {
                                    composer.o(-1341422759);
                                    CardListUiKt.b((CampaignCardListData) bottomSheetFeedItemData2, null, function2, composer, 0, 2);
                                    composer.l();
                                } else if (bottomSheetFeedItemData2 instanceof CampaignCardCopyData) {
                                    composer.o(-1341419714);
                                    CardCopyUiKt.a((CampaignCardCopyData) bottomSheetFeedItemData2, null, composer, 0);
                                    composer.l();
                                } else {
                                    composer.o(1365699865);
                                    composer.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, true, -2119829271), 3);
                }
                break;
            case 2:
                LazyListScope LazyRow2 = (LazyListScope) obj;
                Intrinsics.h(LazyRow2, "$this$LazyRow");
                for (final QuickLinkCard quickLinkCard : ((QuickLinkListData) obj2).f5188a) {
                    LazyListScope.i(LazyRow2, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.QuickLinkListUiKt$QuickLinkListUi$2$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            LazyItemScope item = (LazyItemScope) obj3;
                            Composer composer = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                composer.o(5004770);
                                Function2 function22 = function2;
                                boolean zN = composer.n(function22);
                                Object objG = composer.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new i(1, function22);
                                    composer.A(objG);
                                }
                                composer.l();
                                QuickLinkCardKt.a(quickLinkCard, (Function1) objG, null, WxTheme.a(composer).a(), TintColors.e, 8, 2, composer, 1769480, 4);
                            }
                            return Unit.f24250a;
                        }
                    }, true, 1124015805), 3);
                }
                break;
            default:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.h(LazyColumn2, "$this$LazyColumn");
                ScreenContentKt.c(LazyColumn2, (DynamicPageFeedData) obj2, function2);
                break;
        }
        return unit;
    }
}
