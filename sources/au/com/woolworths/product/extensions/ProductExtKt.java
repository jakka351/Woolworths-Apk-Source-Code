package au.com.woolworths.product.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.a;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.models.MemberPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductExtKt {
    public static final void a(ComposeView composeView, final MemberPriceInfo memberPriceInfo, final ProductMemberPriceLabelStyling memberPriceLabelStyle) {
        Intrinsics.h(composeView, "<this>");
        Intrinsics.h(memberPriceLabelStyle, "memberPriceLabelStyle");
        if (memberPriceInfo != null) {
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.extensions.ProductExtKt$tryAddMemberPricingLabel$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        composer.o(1849434622);
                        Object objG = composer.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new a(23);
                            composer.A(objG);
                        }
                        composer.l();
                        ProductMemberPriceLabelKt.a(memberPriceInfo, SemanticsModifierKt.a(Modifier.Companion.d, (Function1) objG), memberPriceLabelStyle, composer, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 1415789347));
            composeView.setContentDescription(androidx.constraintlayout.core.state.a.j(memberPriceInfo.getHeader(), ", ", memberPriceInfo.getTitle(), ", ", StringExtKt.a(memberPriceInfo.getSubtitle())));
        }
    }
}
