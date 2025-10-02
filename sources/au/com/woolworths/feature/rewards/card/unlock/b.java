package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.MapFeatureHighlightKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.LocationFoundCardKt;
import au.com.woolworths.feature.shop.product.availability.ui.NearbyStoresSectionUiKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoDeviceLevelPermissionDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoSpeechRecognitionAvailableDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveStateKt;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerFunctionsKt;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import au.com.woolworths.shop.lists.ui.lists.banner.ListsBannerKt;
import au.com.woolworths.shop.lists.ui.lists.compose.BoostedOfferItemKt;
import au.com.woolworths.shop.lists.ui.lists.compose.BuyAgainItemKt;
import au.com.woolworths.shop.lists.ui.lists.compose.PastShopItemKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.AddNewListItemUiKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.compose.SpecialsBannerKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.SortByViewScreenKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListItemUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ b(Modifier modifier, Function0 function0, int i, int i2) {
        this.d = i2;
        this.f = modifier;
        this.e = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                UnlockChristmasFundBottomSheetKt.c(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 1:
                MapFeatureHighlightKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 2:
                MapFeatureHighlightKt.d(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 3:
                LocationFoundCardKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 4:
                NearbyStoresSectionUiKt.c(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 5:
                NoDeviceLevelPermissionDialogKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 6:
                NoSpeechRecognitionAvailableDialogKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 7:
                OliveStateKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 8:
                OliveStateKt.b(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 9:
                VideoAdPlayerFunctionsKt.c(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 10:
                ProductCardButtonsKt.d(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 11:
                ProductCardButtonsKt.e(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 12:
                ListsBannerKt.b(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 13:
                BoostedOfferItemKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 14:
                BuyAgainItemKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 15:
                PastShopItemKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 16:
                AddNewListItemUiKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 17:
                SpecialsBannerKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 18:
                SortByViewScreenKt.a(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 19:
                SortByViewScreenKt.e(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            case 20:
                SortByViewScreenKt.c(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
            default:
                ReceiptListItemUIKt.c(RecomposeScopeImplKt.a(this.g | 1), composer, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = modifier;
        this.g = i;
    }
}
