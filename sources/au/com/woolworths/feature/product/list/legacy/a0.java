package au.com.woolworths.feature.product.list.legacy;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.core.graphics.Insets;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.product.list.legacy.compose.filter.LoadingScreenKt;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.CloseAccountScreenKt;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.AccountSettingsScreenKt;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ a0(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                break;
            case 1:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 2:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 3:
                ActionData action = (ActionData) obj;
                Intrinsics.h(action, "action");
                break;
            case 4:
                ((Integer) obj2).getClass();
                LoadingScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                break;
            case 6:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                break;
            case 7:
                Intrinsics.h((FilterMenuItem) obj, "<unused var>");
                Intrinsics.h((ToggleableState) obj2, "<unused var>");
                break;
            case 8:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                int i2 = RewardsAuthenticationActivity.J;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.bottomMargin = it.d;
                break;
            case 9:
                ((Integer) obj2).getClass();
                CloseAccountScreenKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                RewardsPreferenceDetailsContentKt.c((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AccountSettingsScreenKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 12:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i3 = RewardsMagicLinkActivity.F;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets2.bottomMargin = it2.d;
                break;
            case 13:
                break;
            case 14:
                ((Integer) obj2).getClass();
                LoadingUiKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 15:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 16:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 17:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 18:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 19:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 20:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 21:
                Intrinsics.h((RewardsOfferData) obj, "<unused var>");
                Intrinsics.h((ContentCta) obj2, "<unused var>");
                break;
            case 22:
                Intrinsics.h((RewardsOfferData) obj, "<unused var>");
                Intrinsics.h((ContentCta) obj2, "<unused var>");
                break;
            case 23:
                ((Integer) obj2).getClass();
                OfferSectionViewKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 24:
                Intrinsics.h((au.com.woolworths.sdui.rewards.model.ActionData) obj2, "<unused var>");
                break;
            case 25:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 26:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            case 27:
                Intrinsics.h((String) obj, "<unused var>");
                break;
            case 28:
                ((Boolean) obj).booleanValue();
                Intrinsics.h((String) obj2, "<unused var>");
                break;
            default:
                Intrinsics.h((UpdateFullScreenType) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                break;
        }
        return unit;
    }

    public /* synthetic */ a0(int i, int i2) {
        this.d = i2;
    }
}
