package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasSpacerSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/ui/ChoosePlanFeedProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/ui/ChoosePlanFeedProviderItem;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChoosePlanFeedProvider implements PreviewParameterProvider<ChoosePlanFeedProviderItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final EverydayExtrasChoosePlanFeed f6076a;
    public static final ChoosePlanFeedProviderItem b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/ui/ChoosePlanFeedProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EverydayExtrasChoosePlanContentItem.TitleTextItem titleTextItem = new EverydayExtrasChoosePlanContentItem.TitleTextItem("Select your payment frequency");
        EverydayExtrasChoosePlanContentItem.SmallIconListItem smallIconListItem = new EverydayExtrasChoosePlanContentItem.SmallIconListItem("", "Free for the first 30 days");
        EverydayExtrasChoosePlanContentItem.SmallIconListItem smallIconListItem2 = new EverydayExtrasChoosePlanContentItem.SmallIconListItem("", "Cancel auto-renewal anytime");
        EverydayExtrasChoosePlanContentItem.SmallIconListItem smallIconListItem3 = new EverydayExtrasChoosePlanContentItem.SmallIconListItem("", "By paying annually you pay $14 less");
        EverydayExtrasChoosePlanContentItem.Spacer spacer = new EverydayExtrasChoosePlanContentItem.Spacer(EverydayExtrasSpacerSize.f);
        EverydayExtrasChoosePlanContentItem.SubscribePlan.EverydayExtrasSubscribePlanBadgeType everydayExtrasSubscribePlanBadgeType = EverydayExtrasChoosePlanContentItem.SubscribePlan.EverydayExtrasSubscribePlanBadgeType.d;
        List listR = CollectionsKt.R(titleTextItem, smallIconListItem, smallIconListItem2, smallIconListItem3, spacer, new EverydayExtrasChoosePlanContentItem.SubscribePlan("72", "Annual", "Billed yearly, save $14", 7000, new EverydayExtrasChoosePlanContentItem.SubscribePlan.EverydayExtrasSubscribePlanBadge("SAVE 16%", everydayExtrasSubscribePlanBadgeType)), new EverydayExtrasChoosePlanContentItem.SubscribePlan("71", "Monthly", "Billed each month", 700, null));
        EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent = new EverydayExtrasChoosePlanContent("", listR);
        EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
        EverydayExtrasButtonStyle everydayExtrasButtonStyle = EverydayExtrasButtonStyle.d;
        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed = new EverydayExtrasChoosePlanFeed("Choose a plan", everydayExtrasChoosePlanContent, new EverydayExtrasChoosePlanFooter("", CollectionsKt.R(new EverydayExtrasChoosePlanFooterItem.Button("Add payment details", everydayExtrasButtonActionType, null, everydayExtrasButtonStyle), new EverydayExtrasChoosePlanFooterItem.NoteTextItem("*Free trial only available for new subscribers"))));
        f6076a = everydayExtrasChoosePlanFeed;
        Screen screen = Screen.d;
        b = new ChoosePlanFeedProviderItem(Screen.e, new EverydayExtrasChoosePlanFeed("Summary", new EverydayExtrasChoosePlanContent("", CollectionsKt.R(new EverydayExtrasChoosePlanContentItem.TitleTextItem("Change my plan"), new EverydayExtrasChoosePlanContentItem.SubscribePlan("72", "Annual", "Billed yearly, save $14", 7000, new EverydayExtrasChoosePlanContentItem.SubscribePlan.EverydayExtrasSubscribePlanBadge("SAVE 16%", everydayExtrasSubscribePlanBadgeType)), new EverydayExtrasChoosePlanContentItem.SubscribePlan("71", "Monthly", "Billed each month", 700, null), new EverydayExtrasChoosePlanContentItem.Button("Done", everydayExtrasButtonActionType, "", everydayExtrasButtonStyle), new EverydayExtrasChoosePlanContentItem.Button("Cancel", EverydayExtrasButtonActionType.e, "", EverydayExtrasButtonStyle.e))), null), false);
        List<Object> list = listR;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object objA : list) {
            if (objA instanceof EverydayExtrasChoosePlanContentItem.SubscribePlan) {
                EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = (EverydayExtrasChoosePlanContentItem.SubscribePlan) objA;
                objA = EverydayExtrasChoosePlanContentItem.SubscribePlan.a(subscribePlan, subscribePlan.g + 50);
            }
            arrayList.add(objA);
        }
        EverydayExtrasChoosePlanFeed.a(everydayExtrasChoosePlanFeed, new EverydayExtrasChoosePlanContent(everydayExtrasChoosePlanContent.f6145a, arrayList), null, 5);
        Screen screen2 = Screen.d;
        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed2 = b.b;
        EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent2 = everydayExtrasChoosePlanFeed2.b;
        List<Object> list2 = everydayExtrasChoosePlanContent2.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        for (Object objA2 : list2) {
            if (objA2 instanceof EverydayExtrasChoosePlanContentItem.SubscribePlan) {
                EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan2 = (EverydayExtrasChoosePlanContentItem.SubscribePlan) objA2;
                objA2 = EverydayExtrasChoosePlanContentItem.SubscribePlan.a(subscribePlan2, subscribePlan2.g + 50);
            }
            arrayList2.add(objA2);
        }
        EverydayExtrasChoosePlanFeed.a(everydayExtrasChoosePlanFeed2, new EverydayExtrasChoosePlanContent(everydayExtrasChoosePlanContent2.f6145a, arrayList2), null, 5);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
