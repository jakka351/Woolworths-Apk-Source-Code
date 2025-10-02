package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.material.ModalBottomSheetState;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.brandedshop.ViewState;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopFeedItem;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                BuildersKt.c((CoroutineScope) this.e, null, null, new BrandedShopHomeKt$BrandedShopUi$4$1$1$1((ModalBottomSheetState) this.f, null), 3);
                break;
            case 1:
                ((Function1) this.e).invoke(new UiEvent.OnLinkClick(((BrandedShopFeedItem.BrandedShopLink) this.f).b));
                break;
            case 2:
                ((Function1) this.e).invoke(new UiEvent.OnErrorRetryClick(((ViewState) this.f).i.f6678a));
                break;
            default:
                HorizontalListData horizontalListData = (HorizontalListData) this.e;
                au.com.woolworths.design.wx.component.searchbar.a aVar = (au.com.woolworths.design.wx.component.searchbar.a) this.f;
                if (horizontalListData.d != null) {
                    aVar.invoke(horizontalListData);
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }
}
