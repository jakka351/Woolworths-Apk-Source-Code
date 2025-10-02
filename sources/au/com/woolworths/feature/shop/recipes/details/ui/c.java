package au.com.woolworths.feature.shop.recipes.details.ui;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ HorizontalListData f;

    public /* synthetic */ c(Function1 function1, HorizontalListData horizontalListData, int i) {
        this.d = i;
        this.e = function1;
        this.f = horizontalListData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f);
                break;
            default:
                Function1 function1 = this.e;
                if (function1 != null) {
                    function1.invoke(this.f);
                }
                break;
        }
        return Unit.f24250a;
    }
}
