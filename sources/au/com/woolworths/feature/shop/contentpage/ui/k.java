package au.com.woolworths.feature.shop.contentpage.ui;

import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.PillData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ HorizontalListData f;

    public /* synthetic */ k(Function2 function2, HorizontalListData horizontalListData, int i) {
        this.d = i;
        this.e = function2;
        this.f = horizontalListData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                NavRoundelCardData it = (NavRoundelCardData) obj;
                Intrinsics.h(it, "it");
                Function2 function2 = this.e;
                if (function2 != null) {
                    function2.invoke(this.f, it);
                }
                break;
            case 1:
                OfferCardData it2 = (OfferCardData) obj;
                Intrinsics.h(it2, "it");
                Function2 function22 = this.e;
                if (function22 != null) {
                    function22.invoke(this.f, it2);
                }
                break;
            case 2:
                PillData it3 = (PillData) obj;
                Intrinsics.h(it3, "it");
                Function2 function23 = this.e;
                if (function23 != null) {
                    function23.invoke(this.f, it3);
                }
                break;
            case 3:
                ContentCardData it4 = (ContentCardData) obj;
                Intrinsics.h(it4, "it");
                Function2 function24 = this.e;
                if (function24 != null) {
                    function24.invoke(this.f, it4);
                }
                break;
            default:
                ProductCategoryTileData it5 = (ProductCategoryTileData) obj;
                Intrinsics.h(it5, "it");
                Function2 function25 = this.e;
                if (function25 != null) {
                    function25.invoke(this.f, it5);
                }
                break;
        }
        return Unit.f24250a;
    }
}
