package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SortByView e;

    public /* synthetic */ a(SortByView sortByView, int i) {
        this.d = i;
        this.e = sortByView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        SortByView sortByView = this.e;
        switch (i) {
            case 0:
                SortByView.c(sortByView);
                break;
            case 1:
                SortByView.e(sortByView);
                break;
            case 2:
                int i2 = SortByView.l;
                break;
            case 3:
                SortByView.b(sortByView);
                break;
            case 4:
                SortByView.a(sortByView);
                break;
            default:
                SortByView.d(sortByView);
                break;
        }
        return unit;
    }
}
