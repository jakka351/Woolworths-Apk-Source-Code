package au.com.woolworths.feature.shop.homepage.presentation.quicklinks;

import au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(QuickLinkHorizontalListData quickLinkHorizontalListData, Function1 function1) {
        this.f = quickLinkHorizontalListData;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        switch (i) {
            case 0:
                QuickLinkHorizontalListData quickLinkHorizontalListData = HorizontalQuickLinkListKt.f7253a;
                ((QuickLinkHorizontalListData) obj).getClass();
                break;
            default:
                QuickLinkHorizontalListData quickLinkHorizontalListData2 = HorizontalQuickLinkListKt.f7253a;
                this.e.invoke((QuickLinkCard) obj);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(QuickLinkCard quickLinkCard, Function1 function1) {
        this.e = function1;
        this.f = quickLinkCard;
    }
}
