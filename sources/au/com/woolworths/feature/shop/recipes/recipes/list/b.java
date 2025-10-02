package au.com.woolworths.feature.shop.recipes.recipes.list;

import android.webkit.WebView;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.CorruptionException;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchDataStoreKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionItemProvider;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore.LastChatbotMessageDataStoreKt;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveContentParserKt;
import au.com.woolworths.foundation.rewards.common.ui.InterceptComposeView;
import au.com.woolworths.foundation.rewards.common.ui.banners.RewardsNotificationBannerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                CorruptionException it = (CorruptionException) obj;
                KProperty[] kPropertyArr = RecipeSearchDataStoreKt.f8086a;
                Intrinsics.h(it, "it");
                break;
            case 4:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                break;
            case 5:
                StoreDetailsContract.Action it3 = (StoreDetailsContract.Action) obj;
                Intrinsics.h(it3, "it");
                break;
            case 6:
                StoreDetailsContract.ViewAction it4 = (StoreDetailsContract.ViewAction) obj;
                Intrinsics.h(it4, "it");
                break;
            case 7:
                StoreDetailsContract.Action it5 = (StoreDetailsContract.Action) obj;
                Intrinsics.h(it5, "it");
                break;
            case 8:
                StoreDetailsContract.ViewAction it6 = (StoreDetailsContract.ViewAction) obj;
                Intrinsics.h(it6, "it");
                break;
            case 9:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 10:
                String it7 = (String) obj;
                Intrinsics.h(it7, "it");
                break;
            case 11:
                String it8 = (String) obj;
                Intrinsics.h(it8, "it");
                break;
            case 12:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.u(semantics2);
                break;
            case 13:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 14:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 15:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                break;
            case 16:
                WebView it9 = (WebView) obj;
                Intrinsics.h(it9, "it");
                break;
            case 17:
                String it10 = (String) obj;
                Intrinsics.h(it10, "it");
                break;
            case 18:
                String it11 = (String) obj;
                Intrinsics.h(it11, "it");
                break;
            case 19:
                WPayForOrderContract.UiEvent.PaymentMethod.GooglePay it12 = (WPayForOrderContract.UiEvent.PaymentMethod.GooglePay) obj;
                Intrinsics.h(it12, "it");
                break;
            case 20:
                ((Boolean) obj).getClass();
                SectionOptionItemProvider.TestCase[] testCaseArr = SectionOptionItemProvider.TestCase.e;
                break;
            case 21:
                CorruptionException it13 = (CorruptionException) obj;
                KProperty[] kPropertyArr2 = LastChatbotMessageDataStoreKt.f8420a;
                Intrinsics.h(it13, "it");
                break;
            case 22:
                JsonBuilder Json2 = (JsonBuilder) obj;
                Json json = SwrveContentParserKt.f8432a;
                Intrinsics.h(Json2, "$this$Json");
                Json2.b = true;
                Json2.f24839a = false;
                break;
            case 23:
                Intrinsics.h((AnimatedContentTransitionScope) obj, "<this>");
                break;
            case 24:
                RuntimeException it14 = (RuntimeException) obj;
                int i2 = InterceptComposeView.g;
                Intrinsics.h(it14, "it");
                break;
            case 25:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 26:
                String it15 = (String) obj;
                Intrinsics.h(it15, "it");
                break;
            case 27:
                int i3 = RewardsNotificationBannerKt.f8572a;
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 28:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            default:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
        }
        return unit;
    }
}
