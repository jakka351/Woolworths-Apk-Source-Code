package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ FreshMagSummaryData f;

    public /* synthetic */ a(FreshMagSummaryData freshMagSummaryData, Function1 function1) {
        this.f = freshMagSummaryData;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                String str = this.f.c;
                if (str != null) {
                    this.e.invoke(str);
                }
                break;
            default:
                this.e.invoke(this.f.c);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function1 function1, FreshMagSummaryData freshMagSummaryData) {
        this.e = function1;
        this.f = freshMagSummaryData;
    }
}
