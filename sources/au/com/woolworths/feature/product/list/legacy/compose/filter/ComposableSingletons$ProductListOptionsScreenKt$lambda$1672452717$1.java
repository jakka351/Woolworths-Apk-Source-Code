package au.com.woolworths.feature.product.list.legacy.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.legacy.compose.filter.ComposableSingletons$ProductListOptionsScreenKt$lambda$-1672452717$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductListOptionsScreenKt$lambda$1672452717$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductListOptionsContract.ViewState viewState = new ProductListOptionsContract.ViewState(new ResText(R.string.product_list_filter), CollectionsKt.R(new ProductListOptionsItem.Header(R.string.product_list_sort_by), new ProductListOptionsItem.SortOptionsSection(CollectionsKt.R(new ProductListOptionsSortOptionItem.SortOptionItem(new SortOption("1", "Relevance", null, true)), new ProductListOptionsSortOptionItem.SortOptionItem(new SortOption("2", "Z-A", null, false)), new ProductListOptionsSortOptionItem.SortOptionItem(new SortOption("3", "Price", "Low to High", false)), new ProductListOptionsSortOptionItem.SortOptionItem(new SortOption("4", "Price", "High to Low", false)))), new ProductListOptionsItem.SortOptionsInsetBanner(new InsetBannerData(null, null, new PlainText("Products are sorted by unit price and may be by weight, volume or 'each'. Products sold by 'each' may be shown before weight and volume."), InlineErrorAction.None.d, InlineErrorType.f, InlineErrorCause.IconConfig.None.d)), new ProductListOptionsItem.Header(R.string.product_list_filter_by), ProductListOptionsItem.FilterCard.f5378a, new ProductListOptionsItem.FilterOptionItem("1", "Categories", 1), new ProductListOptionsItem.FilterOptionItem("2", "Brand", 0), new ProductListOptionsItem.FilterOptionItem("3", "Allergens", 0), new ProductListOptionsItem.MarketplaceSwitch(new ProductFilterSwitch("Show Everyday Market items", "Shop more brands you love with Everyday Market.", null, false, null))), null, 3050);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new a(0);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new a(1);
                composer.A(objE2);
            }
            Function1 function13 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new h(20);
                composer.A(objE3);
            }
            Function0 function0 = (Function0) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new h(20);
                composer.A(objE4);
            }
            Function0 function02 = (Function0) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new h(20);
                composer.A(objE5);
            }
            Function0 function03 = (Function0) objE5;
            Object objE6 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE6 == composer$Companion$Empty$1) {
                objE6 = new a(2);
                composer.A(objE6);
            }
            Function1 function14 = (Function1) objE6;
            Object objE7 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE7 == composer$Companion$Empty$1) {
                objE7 = new h(20);
                composer.A(objE7);
            }
            composer.l();
            ProductListOptionsScreenKt.a(viewState, function1, function12, function13, function0, function02, function03, function14, (Function0) objE7, composer, 115043760);
        }
        return Unit.f24250a;
    }
}
