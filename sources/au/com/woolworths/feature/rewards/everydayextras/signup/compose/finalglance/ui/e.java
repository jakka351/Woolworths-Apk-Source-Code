package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionScreenKt;
import au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ e(int i, int i2, List list) {
        this.d = i2;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                TimelineBreakdownUiKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                HelpAndSupportScreenKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                OrderHorizontalListItemKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                EditOrderConditionScreenKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ChatEntryCardUiKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
