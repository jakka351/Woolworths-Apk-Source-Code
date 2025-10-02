package au.com.woolworths.sdui.legacy.banner;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.aem.components.ui.CatalogueCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                InsetBanner it2 = (InsetBanner) obj;
                Intrinsics.h(it2, "it");
                break;
            case 2:
                InsetBanner it3 = (InsetBanner) obj;
                Intrinsics.h(it3, "it");
                break;
            case 3:
                BroadcastBannerData it4 = (BroadcastBannerData) obj;
                Intrinsics.h(it4, "it");
                break;
            case 4:
                BroadcastBannerData it5 = (BroadcastBannerData) obj;
                Intrinsics.h(it5, "it");
                break;
            case 5:
                BroadcastBannerData it6 = (BroadcastBannerData) obj;
                Intrinsics.h(it6, "it");
                break;
            case 6:
                BroadcastBannerData it7 = (BroadcastBannerData) obj;
                Intrinsics.h(it7, "it");
                break;
            case 7:
                BroadcastBannerData it8 = (BroadcastBannerData) obj;
                Intrinsics.h(it8, "it");
                break;
            case 8:
                BroadcastBannerData it9 = (BroadcastBannerData) obj;
                Intrinsics.h(it9, "it");
                break;
            case 9:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                break;
            case 10:
                break;
            case 11:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                break;
            case 12:
                String it10 = (String) obj;
                Intrinsics.h(it10, "it");
                break;
            case 13:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                break;
            case 14:
                DynamicSizeCardData it11 = (DynamicSizeCardData) obj;
                Intrinsics.h(it11, "it");
                break;
            case 15:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                break;
            case 16:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                DrawScope.j0(Canvas, AccentColors.c, BitmapDescriptorFactory.HUE_RED, 0L, null, 0, 126);
                break;
            case 17:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 18:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 19:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.g(semantics5);
                break;
            case 20:
                ActionData it12 = (ActionData) obj;
                Intrinsics.h(it12, "it");
                break;
            case 21:
                CatalogueCard it13 = (CatalogueCard) obj;
                float f = CatalogueCardKt.f10209a;
                Intrinsics.h(it13, "it");
                break;
            case 22:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.m(graphicsLayer.T1(6));
                graphicsLayer.c(graphicsLayer.T1(24));
                graphicsLayer.g(-18.0f);
                break;
            case 23:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.m(graphicsLayer2.T1(18));
                graphicsLayer2.c(graphicsLayer2.T1(24));
                graphicsLayer2.g(-7.0f);
                break;
            case 24:
                CatalogueCard it14 = (CatalogueCard) obj;
                Intrinsics.h(it14, "it");
                break;
            case 25:
                CatalogueCard it15 = (CatalogueCard) obj;
                Intrinsics.h(it15, "it");
                break;
            case 26:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 27:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                break;
            case 28:
                ButtonData it16 = (ButtonData) obj;
                Intrinsics.h(it16, "it");
                break;
            default:
                ProductCategoryTileData it17 = (ProductCategoryTileData) obj;
                Intrinsics.h(it17, "it");
                break;
        }
        return unit;
    }
}
