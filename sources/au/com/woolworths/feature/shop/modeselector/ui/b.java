package au.com.woolworths.feature.shop.modeselector.ui;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.core.graphics.Insets;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesLoadingViewKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt;
import au.com.woolworths.feature.shop.weblink.WebLinkActivity;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.AudioPermissionLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionDescContentKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 1:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 2:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 3:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 4:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 5:
                ((Integer) obj2).getClass();
                LoadingScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                int i2 = OrderCancellationPromptActivity.C;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.bottomMargin = it.d;
                break;
            case 7:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 8:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 9:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 10:
                ((Integer) obj2).getClass();
                YourGroceriesLoadingViewKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                YourGroceriesPaymentSummaryScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                YourGroceriesProductItemKt.d((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                YourGroceriesProductItemKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 14:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 15:
                ((Boolean) obj2).booleanValue();
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 16:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i3 = EditDriverInstructionActivity.A;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets2.bottomMargin = it2.d;
                break;
            case 17:
                ((Integer) obj2).getClass();
                SavedRecipesScreenKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                Integer num = (Integer) obj;
                num.intValue();
                Intrinsics.h((RecipeCardSummaryData) obj2, "<unused var>");
                break;
            case 19:
                break;
            case 20:
                ((Integer) obj2).getClass();
                StoreDetailsScreenKt.f((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                StoreDetailsScreenKt.h((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.f((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.h((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                ViewGroup.MarginLayoutParams applyInsets3 = (ViewGroup.MarginLayoutParams) obj;
                Insets insets = (Insets) obj2;
                int i4 = WebLinkActivity.z;
                Intrinsics.h(applyInsets3, "$this$applyInsets");
                Intrinsics.h(insets, "insets");
                applyInsets3.bottomMargin = insets.d;
                break;
            case 25:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((ContentCta) obj2, "<unused var>");
                break;
            case 26:
                ((Integer) obj2).getClass();
                au.com.woolworths.foundation.shop.deeplink.resolver.ui.LoadingScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                EdrOfferBannerKt.g((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AudioPermissionLottieKt.a((Composer) obj, RecomposeScopeImplKt.a(7));
                break;
            default:
                ((Integer) obj2).getClass();
                PermissionDescContentKt.d((Composer) obj, RecomposeScopeImplKt.a(7));
                break;
        }
        return unit;
    }

    public /* synthetic */ b(int i, int i2) {
        this.d = i2;
    }
}
