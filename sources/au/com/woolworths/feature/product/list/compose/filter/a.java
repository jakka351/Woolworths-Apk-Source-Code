package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.compose.productsearch.SearchTile;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 1:
                ProductsDisplayMode it2 = (ProductsDisplayMode) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 2:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.j(1.2f);
                return unit;
            case 3:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.j(1.2f);
                return unit;
            case 4:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 5:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 6:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 7:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 8:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 9:
                InsetBanner it3 = (InsetBanner) obj;
                Intrinsics.h(it3, "it");
                return unit;
            case 10:
                String it4 = (String) obj;
                Intrinsics.h(it4, "it");
                return unit;
            case 11:
                InsetBanner it5 = (InsetBanner) obj;
                Intrinsics.h(it5, "it");
                return unit;
            case 12:
                String it6 = (String) obj;
                Intrinsics.h(it6, "it");
                return unit;
            case 13:
                String it7 = (String) obj;
                Intrinsics.h(it7, "it");
                return unit;
            case 14:
                Intrinsics.h((SearchTile) obj, "<unused var>");
                return Boolean.TRUE;
            case 15:
                Intrinsics.h((SearchTile) obj, "<unused var>");
                return Boolean.TRUE;
            case 16:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.d(EnterExitTransitionKt.e(AnimationSpecKt.e(1000, 0, null, 6), 2), EnterExitTransitionKt.f(AnimationSpecKt.e(1000, 0, null, 6), 2));
            case 17:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 18:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                return unit;
            case 19:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                return unit;
            case 20:
                ProductCard it8 = (ProductCard) obj;
                int i2 = ComposeProductListActivity.H;
                Intrinsics.h(it8, "it");
                return unit;
            case 21:
                InsetBanner it9 = (InsetBanner) obj;
                Intrinsics.h(it9, "it");
                return unit;
            case 22:
                ProductListChip it10 = (ProductListChip) obj;
                Intrinsics.h(it10, "it");
                return it10.c.f5353a;
            case 23:
                NumericPageListing it11 = (NumericPageListing) obj;
                Intrinsics.h(it11, "it");
                return new ProductListViewModel.ProductListingEvent(it11);
            case 24:
                NumericPageListing it12 = (NumericPageListing) obj;
                Intrinsics.h(it12, "it");
                return it12.f9175a;
            case 25:
                ProductListChip it13 = (ProductListChip) obj;
                Intrinsics.h(it13, "it");
                return it13.c.f5353a;
            case 26:
                ProductCard it14 = (ProductCard) obj;
                Intrinsics.h(it14, "it");
                String source = it14.getSource();
                return source != null ? source : "";
            case 27:
                NumericPageListing it15 = (NumericPageListing) obj;
                Intrinsics.h(it15, "it");
                return it15.f9175a;
            case 28:
                NumericPageListing it16 = (NumericPageListing) obj;
                Intrinsics.h(it16, "it");
                return it16.c;
            default:
                NumericPageListing it17 = (NumericPageListing) obj;
                Intrinsics.h(it17, "it");
                return it17.b;
        }
    }
}
