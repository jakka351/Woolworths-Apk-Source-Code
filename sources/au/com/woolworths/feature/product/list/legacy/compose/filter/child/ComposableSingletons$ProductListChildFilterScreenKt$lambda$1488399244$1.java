package au.com.woolworths.feature.product.list.legacy.compose.filter.child;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductListChildFilterScreenKt$lambda$1488399244$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FilterInsetBannerData filterInsetBannerData = new FilterInsetBannerData(InlineErrorType.f, new PlainText("This filter is provided as a guide only"), new PlainText("Please always check the product label or enquire with the manufacturer before consuming. In Partnership with Spoon Guru. Find out more."), ActionPlacement.BOTTOM, new InlineErrorAction.Link(new PlainText("FIND OUT MORE"), "https://www.woolworths.com.au/shop/discover/healthy-eating/allergies-and-intolerances/filters"), "Allergens");
            ToggleableState toggleableState = ToggleableState.d;
            ProductListOptionsContract.ViewState viewState = new ProductListOptionsContract.ViewState(new PlainText("Page Title"), EmptyList.d, CollectionsKt.R(filterInsetBannerData, new FilterMenuItem("1", "Title", " Title 1 (10)", "", true, toggleableState, 5, "", ""), new FilterMenuItem("2", "Title", " Title 2 (10)", "", true, ToggleableState.e, 5, "", ""), new FilterMenuItem("3", "Title", " Title 3 (10)", "", true, ToggleableState.f, 5, "", ""), new FilterMenuItem("4", "Title", " Title 4 (10)", "", true, toggleableState, 5, "", ""), new FilterMenuItem("5", "Title", " Title 5 (10)", "", false, toggleableState, 5, "", "")), 2986);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(11);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a0(5);
                composer.A(objE);
            }
            Function2 function2 = (Function2) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(12);
                composer.A(objE2);
            }
            Function1 function12 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new h(20);
                composer.A(objE3);
            }
            composer.l();
            ProductListChildFilterScreenKt.a(viewState, function1, function2, function12, (Function0) objE3, composer, 28080);
        }
        return Unit.f24250a;
    }
}
