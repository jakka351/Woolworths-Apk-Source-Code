package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountItemSeen;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.SubscribePlanItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                DeleteAccount deleteAccount = ConsentPageUiKt.f5695a;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                return unit;
            case 1:
                AccountItemSeen it = (AccountItemSeen) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 2:
                AccountHomeOption it2 = (AccountHomeOption) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 3:
                RewardsNotificationBannerApiData it3 = (RewardsNotificationBannerApiData) obj;
                Intrinsics.h(it3, "it");
                return unit;
            case 4:
                RewardsNotificationBannerApiData it4 = (RewardsNotificationBannerApiData) obj;
                Intrinsics.h(it4, "it");
                return unit;
            case 5:
                IconListItemAction it5 = (IconListItemAction) obj;
                Intrinsics.h(it5, "it");
                return unit;
            case 6:
                String it6 = (String) obj;
                Intrinsics.h(it6, "it");
                return unit;
            case 7:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                return ColumnScopeInstance.f948a.a(conditional, 1.0f, true);
            case 8:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                return AnimationModifierKt.a(conditional2, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            case 9:
                EverydayExtraChoosePlanContract.ViewState state = (EverydayExtraChoosePlanContract.ViewState) obj;
                Intrinsics.h(state, "state");
                return Integer.valueOf(state.a());
            case 10:
                EverydayExtrasChoosePlanContentItem.SubscribePlan it7 = (EverydayExtrasChoosePlanContentItem.SubscribePlan) obj;
                Intrinsics.h(it7, "it");
                return unit;
            case 11:
                EverydayExtrasButtonInterface it8 = (EverydayExtrasButtonInterface) obj;
                Intrinsics.h(it8, "it");
                return unit;
            case 12:
                String it9 = (String) obj;
                Intrinsics.h(it9, "it");
                return unit;
            case 13:
                EverydayExtrasChoosePlanContentItem.SubscribePlan it10 = (EverydayExtrasChoosePlanContentItem.SubscribePlan) obj;
                Intrinsics.h(it10, "it");
                return unit;
            case 14:
                EverydayExtrasButtonInterface it11 = (EverydayExtrasButtonInterface) obj;
                Intrinsics.h(it11, "it");
                return unit;
            case 15:
                String it12 = (String) obj;
                Intrinsics.h(it12, "it");
                return unit;
            case 16:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                int i2 = SubscribePlanItemUiKt.b;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 17:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                return unit;
            case 18:
                EverydayExtraLandingContract.ViewState state2 = (EverydayExtraLandingContract.ViewState) obj;
                Intrinsics.h(state2, "state");
                return Integer.valueOf(state2.a());
            case 19:
                EverydayExtrasTab it13 = (EverydayExtrasTab) obj;
                Intrinsics.h(it13, "it");
                return unit;
            case 20:
                EverydayExtraFaqsSectionItem.FaqsFaqUiItem it14 = (EverydayExtraFaqsSectionItem.FaqsFaqUiItem) obj;
                Intrinsics.h(it14, "it");
                return unit;
            case 21:
                EverydayExtrasLandingFooterItem.Button it15 = (EverydayExtrasLandingFooterItem.Button) obj;
                Intrinsics.h(it15, "it");
                return unit;
            case 22:
                EverydayExtrasAlertDialog it16 = (EverydayExtrasAlertDialog) obj;
                Intrinsics.h(it16, "it");
                return unit;
            case 23:
                EverydayExtrasTab it17 = (EverydayExtrasTab) obj;
                Intrinsics.h(it17, "it");
                return unit;
            case 24:
                EverydayExtraFaqsSectionItem.FaqsFaqUiItem it18 = (EverydayExtraFaqsSectionItem.FaqsFaqUiItem) obj;
                Intrinsics.h(it18, "it");
                return unit;
            case 25:
                EverydayExtrasLandingFooterItem.Button it19 = (EverydayExtrasLandingFooterItem.Button) obj;
                Intrinsics.h(it19, "it");
                return unit;
            case 26:
                EverydayExtrasAlertDialog it20 = (EverydayExtrasAlertDialog) obj;
                Intrinsics.h(it20, "it");
                return unit;
            case 27:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                return unit;
            case 28:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                return unit;
            default:
                EverydayExtraOnboardingContract.ViewState state3 = (EverydayExtraOnboardingContract.ViewState) obj;
                Intrinsics.h(state3, "state");
                return Integer.valueOf(state3.a());
        }
    }
}
