package au.com.woolworths.dynamic.page.ui.content;

import au.com.woolworths.dynamic.page.data.CategoryTileData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ i(int i, Function2 function2) {
        this.d = i;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                CategoryTileData it = (CategoryTileData) obj;
                Intrinsics.h(it, "it");
                this.e.invoke(it.d, null);
                break;
            case 1:
                QuickLinkCard it2 = (QuickLinkCard) obj;
                Intrinsics.h(it2, "it");
                this.e.invoke(it2.getAction().getAction(), null);
                break;
            case 2:
                String actionLabel = (String) obj;
                Intrinsics.h(actionLabel, "actionLabel");
                this.e.invoke(Boolean.TRUE, actionLabel);
                break;
            default:
                String actionLabel2 = (String) obj;
                Intrinsics.h(actionLabel2, "actionLabel");
                this.e.invoke(Boolean.TRUE, actionLabel2);
                break;
        }
        return Unit.f24250a;
    }
}
