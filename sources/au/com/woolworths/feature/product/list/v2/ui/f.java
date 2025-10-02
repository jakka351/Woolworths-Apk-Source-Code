package au.com.woolworths.feature.product.list.v2.ui;

import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapErrorState;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiEvent;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ f(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(ProductListUiEvent.OnNavigateBackClick.f5515a);
                break;
            case 1:
                this.e.invoke(ProductListUiEvent.OnSearchBarClick.f5517a);
                break;
            case 2:
                this.e.invoke(ProductListUiEvent.OnClearSearchClick.f5513a);
                break;
            case 3:
                this.e.invoke(ProductListUiEvent.OnVoiceSearchClick.f5519a);
                break;
            case 4:
                this.e.invoke(ProductListUiEvent.OnSearchButtonClick.f5518a);
                break;
            case 5:
                this.e.invoke(ProductListUiEvent.OnCartClick.f5511a);
                break;
            case 6:
                this.e.invoke(null);
                break;
            case 7:
                this.e.invoke(BundlesUiEvent.RetryPaginationClick.f6730a);
                break;
            case 8:
                this.e.invoke(BundlesUiEvent.OpenSortBottomSheetModal.f6727a);
                break;
            case 9:
                this.e.invoke(BundlesUiEvent.CartIconClick.f6723a);
                break;
            case 10:
                this.e.invoke(BundlesUiEvent.CloseSortBottomSheetModal.f6724a);
                break;
            case 11:
                this.e.invoke(ContentPageUiEvent.OnShareClick.f7009a);
                break;
            case 12:
                this.e.invoke(ContentPageUiEvent.OnLoginButtonClick.f7003a);
                break;
            case 13:
                this.e.invoke(CmoReviewContract.UserEvent.NavigateToCart.f7092a);
                break;
            case 14:
                this.e.invoke(CmoReviewContract.UserEvent.ConfirmDialog.f7089a);
                break;
            case 15:
                this.e.invoke(CmoReviewContract.UserEvent.DismissDialog.f7090a);
                break;
            case 16:
                this.e.invoke(CmoReviewContract.UserEvent.CancelCmo.f7088a);
                break;
            case 17:
                this.e.invoke(CmoReviewContract.UserEvent.NavigateToCheckout.f7093a);
                break;
            case 18:
                this.e.invoke(CmoReviewContract.UserEvent.NavigateBack.f7091a);
                break;
            case 19:
                this.e.invoke(CmoReviewContract.UserEvent.Retry.f7094a);
                break;
            case 20:
                this.e.invoke(InboxUiEvent.ClickMessageUsBanner.f7269a);
                break;
            case 21:
                this.e.invoke(InboxUiEvent.ClickMessageUsBanner.f7269a);
                break;
            case 22:
                this.e.invoke(InboxUiEvent.Refresh.f7275a);
                break;
            case 23:
                this.e.invoke(InboxUiEvent.Refresh.f7275a);
                break;
            case 24:
                this.e.invoke(InstoreMapErrorState.d);
                break;
            case 25:
                this.e.invoke(ProductAvailabilityUiEvent.Refresh.f7987a);
                break;
            case 26:
                this.e.invoke("");
                break;
            case 27:
                this.e.invoke(ProductDetailsEvent.OnShareClick.f12585a);
                break;
            default:
                this.e.invoke(ProductDetailsEvent.OnCartClick.f12570a);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(Function1 function1) {
        this.d = 24;
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        this.e = function1;
    }
}
