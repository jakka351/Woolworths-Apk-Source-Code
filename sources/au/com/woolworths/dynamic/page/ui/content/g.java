package au.com.woolworths.dynamic.page.ui.content;

import au.com.woolworths.dynamic.page.data.CategoryTileData;
import au.com.woolworths.dynamic.page.data.ContentListItemData;
import au.com.woolworths.dynamic.page.data.DynamicPageActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                float f = CategoryTileListUiKt.f5199a;
                ((Function1) obj2).invoke((CategoryTileData) obj);
                break;
            default:
                Function2 function2 = (Function2) obj;
                DynamicPageActionData dynamicPageActionData = ((ContentListItemData) obj2).e;
                if (dynamicPageActionData != null && (str = dynamicPageActionData.b) != null) {
                    function2.invoke(str, dynamicPageActionData.c);
                    break;
                }
                break;
        }
        return unit;
    }
}
