package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingFooterButtonAction;
import au.com.woolworths.feature.shop.onboarding.sdui.data.RowData;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/ui/OnboardingViewStateContentParam;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingViewStateContentParam {
    public static final /* synthetic */ OnboardingViewStateContentParam[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        new IconAsset.HostedIcon("testUrl");
        ListBuilder listBuilderV = CollectionsKt.v();
        for (int i = 0; i < 3; i++) {
            listBuilderV.add(new RowData(new IconAsset.HostedIcon("testUrl"), YU.a.d(i, "Save time and money "), "Plan your perfect shop, saving time and more with access to sales and specials."));
        }
        CollectionsKt.q(listBuilderV);
        OnboardingFooterButtonAction onboardingFooterButtonAction = OnboardingFooterButtonAction.d;
        ActionType actionType = ActionType.d;
        ButtonStyleApiData buttonStyleApiData = ButtonStyleApiData.PRIMARY;
        OnboardingFooterButtonAction onboardingFooterButtonAction2 = OnboardingFooterButtonAction.d;
        ButtonStyleApiData buttonStyleApiData2 = ButtonStyleApiData.PRIMARY;
        OnboardingFooterButtonAction onboardingFooterButtonAction3 = OnboardingFooterButtonAction.d;
        ButtonStyleApiData buttonStyleApiData3 = ButtonStyleApiData.PRIMARY;
        OnboardingViewStateContentParam[] onboardingViewStateContentParamArr = {new OnboardingViewStateContentParam("Full", 0), new OnboardingViewStateContentParam("NoHeader", 1), new OnboardingViewStateContentParam("SingleButton", 2), new OnboardingViewStateContentParam("NoGuestButton", 3), new OnboardingViewStateContentParam("NoSignupButton", 4), new OnboardingViewStateContentParam("NoHeaderSingleButton", 5)};
        d = onboardingViewStateContentParamArr;
        e = EnumEntriesKt.a(onboardingViewStateContentParamArr);
    }

    public static OnboardingViewStateContentParam valueOf(String str) {
        return (OnboardingViewStateContentParam) Enum.valueOf(OnboardingViewStateContentParam.class, str);
    }

    public static OnboardingViewStateContentParam[] values() {
        return (OnboardingViewStateContentParam[]) d.clone();
    }
}
