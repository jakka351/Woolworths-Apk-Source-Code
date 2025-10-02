package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageView;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ y(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                NumericPageListing it = (NumericPageListing) obj;
                Intrinsics.h(it, "it");
                return it.f;
            case 1:
                NumericPageListing it2 = (NumericPageListing) obj;
                Intrinsics.h(it2, "it");
                return it2.e;
            case 2:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 3:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                return unit;
            case 4:
                SemanticsPropertyReceiver clearAndSetSemantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics3, "$this$clearAndSetSemantics");
                return unit;
            case 5:
                ContentDrawScope drawWithContent = (ContentDrawScope) obj;
                Intrinsics.h(drawWithContent, "$this$drawWithContent");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.h() >> 32));
                float fT1 = drawWithContent.T1(4) + Float.intBitsToFloat((int) (drawWithContent.h() & 4294967295L));
                CanvasDrawScope$drawContext$1 e = drawWithContent.getE();
                long jD = e.d();
                e.a().save();
                try {
                    e.f1798a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fT1, 1);
                    drawWithContent.Q0();
                    return unit;
                } finally {
                    androidx.camera.core.impl.b.C(e, jD);
                }
            case 6:
                Intrinsics.h((ProductCard) obj, "it");
                return unit;
            case 7:
                Intrinsics.h((ProductCard) obj, "it");
                return unit;
            case 8:
                int i2 = FullScreenMessageView.n;
                Intrinsics.h((Button) obj, "it");
                return unit;
            case 9:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 10:
                Intrinsics.h((ProductCategoryTileData) obj, "it");
                return unit;
            case 11:
                Intrinsics.h((HorizontalListData) obj, "it");
                return unit;
            case 12:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 13:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 14:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 15:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 16:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 17:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 18:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 19:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 20:
                Intrinsics.h((ProductCategoryTileData) obj, "it");
                return unit;
            case 21:
                Intrinsics.h((HorizontalListData) obj, "it");
                return unit;
            case 22:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 23:
                Intrinsics.h((ProductListChip) obj, "it");
                return unit;
            case 24:
                Intrinsics.h((ProductListChip) obj, "it");
                return unit;
            case 25:
                Intrinsics.h((ProductsDisplayMode) obj, "it");
                return unit;
            case 26:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 27:
                Intrinsics.h((String) obj, "it");
                return unit;
            case 28:
                Intrinsics.h((String) obj, "it");
                return unit;
            default:
                Intrinsics.h((String) obj, "it");
                return unit;
        }
    }
}
