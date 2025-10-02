package au.com.woolworths.feature.shop.modeselector.ui;

import android.content.Context;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.PreferencesFactory;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemData;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingDataStoreKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.product.models.ProductCard;
import com.skydoves.balloon.Balloon;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
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
                ButtonApiData it = (ButtonApiData) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 1:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = FeaturesSectionKt.f7547a;
                Intrinsics.h(semantics, "$this$semantics");
                return unit;
            case 2:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                return unit;
            case 3:
                Balloon.Builder builder = (Balloon.Builder) obj;
                builder.d = 1.0f;
                Context context = builder.f19012a;
                builder.g = context.getResources().getDimensionPixelSize(R.dimen.default_margin);
                builder.f = context.getResources().getDimensionPixelSize(R.dimen.default_margin);
                return unit;
            case 4:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 5:
                ProductCard it3 = (ProductCard) obj;
                Intrinsics.h(it3, "it");
                return unit;
            case 6:
                Balloon.Builder it4 = (Balloon.Builder) obj;
                int i2 = OrderDetailsActivity.N;
                Intrinsics.h(it4, "it");
                it4.d = 1.0f;
                Context context2 = it4.f19012a;
                it4.g = context2.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                it4.f = context2.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                return unit;
            case 7:
                InsetBanner it5 = (InsetBanner) obj;
                Intrinsics.h(it5, "it");
                return unit;
            case 8:
                BroadcastBannerData it6 = (BroadcastBannerData) obj;
                Intrinsics.h(it6, "it");
                return unit;
            case 9:
                BroadcastBannerData it7 = (BroadcastBannerData) obj;
                Intrinsics.h(it7, "it");
                return unit;
            case 10:
                YourGroceriesProductItem it8 = (YourGroceriesProductItem) obj;
                Intrinsics.h(it8, "it");
                throw null;
            case 11:
                YourGroceriesSubstitutedProduct it9 = (YourGroceriesSubstitutedProduct) obj;
                Intrinsics.h(it9, "it");
                throw null;
            case 12:
                OrderHelpItemData it10 = (OrderHelpItemData) obj;
                Intrinsics.h(it10, "it");
                return unit;
            case 13:
                ButtonApiData it11 = (ButtonApiData) obj;
                Intrinsics.h(it11, "it");
                return unit;
            case 14:
                CorruptionException it12 = (CorruptionException) obj;
                KProperty[] kPropertyArr = SubstitutionRatingDataStoreKt.f7789a;
                Intrinsics.h(it12, "it");
                return PreferencesFactory.a();
            case 15:
                InsetBanner it13 = (InsetBanner) obj;
                Intrinsics.h(it13, "it");
                return unit;
            case 16:
                Intrinsics.h((InsetBannerApiData) obj, "<unused var>");
                return unit;
            case 17:
                return unit;
            case 18:
                ButtonApiData it14 = (ButtonApiData) obj;
                Intrinsics.h(it14, "it");
                return unit;
            case 19:
                ButtonApiData it15 = (ButtonApiData) obj;
                Intrinsics.h(it15, "it");
                return unit;
            case 20:
                Intrinsics.h((StarCount) obj, "<unused var>");
                return unit;
            case 21:
                Intrinsics.h((DriverRatingSurveyInput) obj, "<unused var>");
                return unit;
            case 22:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 23:
                Intrinsics.h((String) obj, "<unused var>");
                return unit;
            case 24:
                Intrinsics.h((DriverRatingSurveyInput) obj, "<unused var>");
                return unit;
            case 25:
                String it16 = (String) obj;
                Intrinsics.h(it16, "it");
                return unit;
            case 26:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                return unit;
            case 27:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                return unit;
            case 28:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.g(semantics5);
                return unit;
            default:
                InsetBanner it17 = (InsetBanner) obj;
                Intrinsics.h(it17, "it");
                return unit;
        }
    }
}
