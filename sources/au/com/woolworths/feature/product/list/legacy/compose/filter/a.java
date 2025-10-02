package au.com.woolworths.feature.product.list.legacy.compose.filter;

import android.webkit.WebView;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                break;
            case 2:
                ProductsDisplayMode it3 = (ProductsDisplayMode) obj;
                Intrinsics.h(it3, "it");
                break;
            case 3:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.j(1.2f);
                break;
            case 4:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.j(1.2f);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                InsetBanner it4 = (InsetBanner) obj;
                Intrinsics.h(it4, "it");
                break;
            case 11:
                String it5 = (String) obj;
                Intrinsics.h(it5, "it");
                break;
            case 12:
                InsetBanner it6 = (InsetBanner) obj;
                Intrinsics.h(it6, "it");
                break;
            case 13:
                String it7 = (String) obj;
                Intrinsics.h(it7, "it");
                break;
            case 14:
                String it8 = (String) obj;
                Intrinsics.h(it8, "it");
                break;
            case 15:
                Intrinsics.h((SearchTile) obj, "<unused var>");
                break;
            case 16:
                Intrinsics.h((SearchTile) obj, "<unused var>");
                break;
            case 17:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 18:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                break;
            case 19:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                break;
            case 20:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 21:
                Component it9 = (Component) obj;
                Intrinsics.h(it9, "it");
                break;
            case 22:
                break;
            case 23:
                WebView webView = (WebView) obj;
                Intrinsics.h(webView, "webView");
                webView.destroy();
                break;
            case 24:
                CloseAccountContract.ViewState state = (CloseAccountContract.ViewState) obj;
                Intrinsics.h(state, "state");
                break;
            case 25:
                ContentCta it10 = (ContentCta) obj;
                Intrinsics.h(it10, "it");
                break;
            case 26:
                ContentCta it11 = (ContentCta) obj;
                Intrinsics.h(it11, "it");
                break;
            case 27:
                ContentCta it12 = (ContentCta) obj;
                Intrinsics.h(it12, "it");
                break;
            case 28:
                ContentCta it13 = (ContentCta) obj;
                Intrinsics.h(it13, "it");
                break;
            default:
                ContentCta it14 = (ContentCta) obj;
                Intrinsics.h(it14, "it");
                break;
        }
        return Unit.f24250a;
    }
}
