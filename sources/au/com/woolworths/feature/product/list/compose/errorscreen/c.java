package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageUiEvent;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.gridlist.GridListItem;
import au.com.woolworths.shop.aem.components.model.gridlist.GridRowData;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ c(int i, int i2, Function1 function1) {
        this.d = i2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object list) {
        switch (this.d) {
            case 0:
                ((Integer) list).getClass();
                ZeroResultContentViewKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, this.e);
                break;
            case 1:
                ((Integer) list).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, this.e);
                break;
            case 2:
                ((Integer) list).getClass();
                au.com.woolworths.feature.product.list.v2.ui.ZeroResultContentViewKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, this.e);
                break;
            case 3:
                GridRowData list2 = (GridRowData) obj;
                GridListItem item = (GridListItem) list;
                Intrinsics.h(list2, "list");
                Intrinsics.h(item, "item");
                this.e.invoke(new ContentPageUiEvent.OnGridRowItemClick(list2, item));
                break;
            case 4:
                HorizontalListData item2 = (HorizontalListData) obj;
                Intrinsics.h(item2, "item");
                Intrinsics.h(list, "list");
                this.e.invoke(new ContentPageUiEvent.OnHorizontalListItemClick(item2, list));
                break;
            case 5:
                HorizontalListData data = (HorizontalListData) obj;
                QuickLinkCard card = (QuickLinkCard) list;
                Intrinsics.h(data, "data");
                Intrinsics.h(card, "card");
                this.e.invoke(new ContentPageUiEvent.OnQuickLinkClick(data, card));
                break;
            case 6:
                String link = (String) obj;
                String text = (String) list;
                Intrinsics.h(link, "link");
                Intrinsics.h(text, "text");
                this.e.invoke(new ContentPageUiEvent.OnLinkClick(link, text));
                break;
            case 7:
                ((Integer) list).getClass();
                VocSurveyCardKt.g(RecomposeScopeImplKt.a(1), (Composer) obj, this.e);
                break;
            default:
                this.e.invoke(new ProductDetailsEvent.OnSwipeImageGallery(((Integer) obj).intValue(), ((Integer) list).intValue()));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }
}
