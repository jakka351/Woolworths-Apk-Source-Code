package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.feature.product.list.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$lambda$2$lambda$1$$inlined$onDispose$1;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.rewards.base.points.RewardsBalanceCircleIndicator;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.skydoves.balloon.Balloon;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ j(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intent;
        Activities.RecipeDetails.Result result;
        int i = this.d;
        Unit unit = Unit.f24250a;
        final Function0 function0 = this.e;
        switch (i) {
            case 0:
                ((Double) obj).doubleValue();
                function0.invoke();
                return unit;
            case 1:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                function0.invoke();
                return new ZeroResultContentViewKt$ZeroResultContentView$lambda$2$lambda$1$$inlined$onDispose$1();
            case 2:
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                function0.invoke();
                return new au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$lambda$2$lambda$1$$inlined$onDispose$1();
            case 3:
                ((Double) obj).doubleValue();
                function0.invoke();
                return unit;
            case 4:
                ActivityResult result2 = (ActivityResult) obj;
                Intrinsics.h(result2, "result");
                if (result2.d == -1 && function0 != null) {
                    function0.invoke();
                }
                return unit;
            case 5:
                ActivityResult result3 = (ActivityResult) obj;
                Intrinsics.h(result3, "result");
                if (result3.d == -1 && (intent = result3.e) != null && (result = (Activities.RecipeDetails.Result) intent.getParcelableExtra("RESULT_KEY")) != null && result.d && function0 != null) {
                    function0.invoke();
                }
                return unit;
            case 6:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.h(semantics, "copy number", new k(1, function0));
                return unit;
            case 7:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.h(layoutCoordinates, "layoutCoordinates");
                Rect rectB = LayoutCoordinatesKt.b(layoutCoordinates);
                if (Float.intBitsToFloat((int) (rectB.e() >> 32)) > BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) (rectB.e() & 4294967295L)) > BitmapDescriptorFactory.HUE_RED && function0 != null) {
                    function0.invoke();
                }
                return unit;
            case 8:
                function0.invoke();
                return unit;
            case 9:
                Button it = (Button) obj;
                Intrinsics.h(it, "it");
                function0.invoke();
                return unit;
            case 10:
                Button it2 = (Button) obj;
                Intrinsics.h(it2, "it");
                function0.invoke();
                return unit;
            case 11:
                function0.invoke();
                return unit;
            case 12:
                Button it3 = (Button) obj;
                Intrinsics.h(it3, "it");
                function0.invoke();
                return unit;
            case 13:
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                function0.invoke();
                return unit;
            case 14:
                function0.invoke();
                return unit;
            case 15:
                function0.invoke();
                return unit;
            case 16:
                function0.invoke();
                return unit;
            case 17:
                Balloon.Builder it4 = (Balloon.Builder) obj;
                int i2 = ShoppingListDetailsActivity.R;
                Intrinsics.h(it4, "it");
                it4.d = 1.0f;
                Context context = it4.f19012a;
                it4.g = context.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                it4.f = context.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                function0.invoke();
                return unit;
            case 18:
                NutritionInfo linkData = (NutritionInfo) obj;
                Intrinsics.h(linkData, "linkData");
                function0.invoke();
                return unit;
            case 19:
                ProductDetailsRowLink linkData2 = (ProductDetailsRowLink) obj;
                Intrinsics.h(linkData2, "linkData");
                function0.invoke();
                return unit;
            case 20:
                InsetBanner it5 = (InsetBanner) obj;
                float f = ReceiptListScreenKt.f12881a;
                Intrinsics.h(it5, "it");
                function0.invoke();
                return unit;
            case 21:
                Context context2 = (Context) obj;
                Intrinsics.h(context2, "context");
                RewardsBalanceCircleIndicator rewardsBalanceCircleIndicator = new RewardsBalanceCircleIndicator(context2);
                rewardsBalanceCircleIndicator.setOnClickListener(new au.com.woolworths.feature.shop.homepage.presentation.f(1, function0));
                return rewardsBalanceCircleIndicator;
            case 22:
                function0.invoke();
                return unit;
            default:
                DisposableEffectScope DisposableEffect3 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect3, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: com.woolworths.shop.product.ui.boost.BoostingAnimationKt$BoostingAnimation$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        function0.invoke();
                    }
                };
        }
    }
}
