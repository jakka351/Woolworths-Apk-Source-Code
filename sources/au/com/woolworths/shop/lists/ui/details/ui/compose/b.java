package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsProductsHeaderSection;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalDisclaimer;
import au.com.woolworths.shop.lists.ui.lists.compose.AddListItemKt;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchLoadingScreenKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetScreenKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.SortByViewScreenKt;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetScreenKt;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetType;
import au.com.woolworths.shop.lists.ui.substitutions.DisclaimerBottomSheetContentKt;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewContract;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewScreenKt;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.ui.ProductDetailsCoreRowUIKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import au.com.woolworths.shop.receipts.ui.ReceiptListItemUIKt;
import au.com.woolworths.shop.rewards.priming.data.CvpItem;
import au.com.woolworths.shop.rewards.priming.data.TitleItem;
import au.com.woolworths.shop.rewards.priming.ui.PrimingCvpTileUiKt;
import au.com.woolworths.shop.rewards.priming.ui.PrimingTitleUiKt;
import com.halilibo.richtext.markdown.RenderTableKt;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.CodeBlockKt;
import com.halilibo.richtext.ui.RichTextScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.g = obj;
        this.e = obj2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ListDetailsViewDisclaimerKt.a((ListDetailsTotalDisclaimer) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AddListItemKt.b((Painter) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                MagicMatchLoadingScreenKt.a((byte[]) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                SortByBottomSheetScreenKt.a((SortByBottomSheetContract.ViewState) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                SortByViewScreenKt.b((SortByViewContract.ViewState) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                SnapAListBottomSheetScreenKt.c((SnapAListBottomSheetType) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                DisclaimerBottomSheetContentKt.a((AlternativeProductsDisclaimer) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                SimilarProductsScreenKt.j((AlternativeProductsProductsHeaderSection) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                SimilarProductsScreenKt.c((ViewSimilarProductsContract.ViewState.Error) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                SimilarProductsScreenKt.b((AlternativeProductsCtaSection) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                WatchlistToggleViewScreenKt.a((WatchlistToggleViewContract.ViewState) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ProductDetailsCoreRowUIKt.a((CoreRowModel) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1), this.f);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ProductDetailsScreenKt.n((ArrayList) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                NutritionalInfoScreenKt.a((NutritionInfo) this.g, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ReceiptListItemUIKt.d((ReceiptListItem) this.g, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                PrimingCvpTileUiKt.a((CvpItem) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PrimingTitleUiKt.a((TitleItem) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1), this.f);
                break;
            case 17:
                ((Integer) obj2).intValue();
                RenderTableKt.a((RichTextScope) this.g, (AstNode) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                CodeBlockKt.b((RichTextScope) this.g, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, int i2, int i3) {
        this.d = i3;
        this.g = obj;
        this.e = obj2;
        this.f = i2;
    }
}
