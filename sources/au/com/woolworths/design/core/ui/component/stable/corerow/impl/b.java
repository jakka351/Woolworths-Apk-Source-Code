package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryParagraphTextKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.ActionListTitleKt;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContentKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt;
import au.com.woolworths.shop.cart.ui.shared.AvailableLimitTextKt;
import au.com.woolworths.shop.cart.ui.shared.CartFooterKt;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ b(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                CoreRowImplKt.e(this.e, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                TitleTextItemUiKt.b(this.e, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                SummaryParagraphTextKt.a(this.e, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                ActionListTitleKt.a(this.e, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(1);
                VocSurveyCardKt.a(this.e, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                AddGiftCardContentKt.b(this.e, (Composer) obj, iA6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(1);
                WPayForOrderContentKt.c(this.e, (Composer) obj, iA7);
                break;
            case 7:
                GiftCardEdit.Linked value = (GiftCardEdit.Linked) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(value, "value");
                break;
            case 8:
                GiftCardEdit.Unlinked value2 = (GiftCardEdit.Unlinked) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(value2, "value");
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iA8 = RecomposeScopeImplKt.a(1);
                AvailableLimitTextKt.a(this.e, (Composer) obj, iA8);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iA9 = RecomposeScopeImplKt.a(1);
                CartFooterKt.c(this.e, (Composer) obj, iA9);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA10 = RecomposeScopeImplKt.a(1);
                SnapAListBottomSheetScreenKt.d(this.e, (Composer) obj, iA10);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(String str, int i, int i2) {
        this.d = i2;
        this.e = str;
    }
}
