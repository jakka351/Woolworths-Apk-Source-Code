package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.SampleRewardsIconListActionProvider;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.SampleRewardsIconListMarkdownContentProvider;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.SampleRewardsIconListOrderedProvider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/SampleRewardsIconListContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/SampleRewardsIconListContentData;", "Companion", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SampleRewardsIconListContentProvider implements PreviewParameterProvider<SampleRewardsIconListContentData> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/SampleRewardsIconListContentProvider$Companion;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsIconListModel.Item.MarkdownContent markdownContent = SampleRewardsIconListMarkdownContentProvider.f8591a;
        RewardsIconListModel.Item.Ordered ordered = SampleRewardsIconListOrderedProvider.f8592a;
        RewardsIconListModel.Item.Ordered ordered2 = SampleRewardsIconListOrderedProvider.b;
        RewardsIconListModel.Item.Ordered ordered3 = SampleRewardsIconListOrderedProvider.c;
        RewardsIconListModel.Item.Ordered ordered4 = SampleRewardsIconListOrderedProvider.d;
        RewardsIconListModel.Item.Action action = SampleRewardsIconListActionProvider.f8590a;
        RewardsIconListModel.Item.Ordered ordered5 = SampleRewardsIconListOrderedProvider.e;
        new RewardsIconListModel.Content(null, CollectionsKt.R(markdownContent, ordered, ordered2, ordered3, markdownContent, ordered4, action, ordered5));
        new RewardsIconListModel.Content("", CollectionsKt.R(markdownContent, ordered, ordered2, ordered3, markdownContent, ordered4, action, ordered5));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
