package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtrasSubscribeContentKt {
    public static final EverydayExtrasSubscribeContentItem.HeaderImage a(SubscribeOnboardingContentFragment.OnDownloadableAsset onDownloadableAsset) {
        DownloadableAssetFit downloadableAssetFit;
        Intrinsics.h(onDownloadableAsset, "<this>");
        DownloadableAssetType downloadableAssetType = onDownloadableAsset.b;
        Intrinsics.h(downloadableAssetType, "<this>");
        int iOrdinal = downloadableAssetType.ordinal();
        au.com.woolworths.android.onesite.data.DownloadableAssetType downloadableAssetType2 = iOrdinal != 0 ? iOrdinal != 1 ? au.com.woolworths.android.onesite.data.DownloadableAssetType.d : au.com.woolworths.android.onesite.data.DownloadableAssetType.IMAGE : au.com.woolworths.android.onesite.data.DownloadableAssetType.LOTTIE_ANIMATION;
        String str = onDownloadableAsset.c;
        int i = onDownloadableAsset.d;
        int i2 = onDownloadableAsset.e;
        au.com.woolworths.rewards.graphql.type.DownloadableAssetFit downloadableAssetFit2 = onDownloadableAsset.f;
        if (downloadableAssetFit2 != null) {
            int iOrdinal2 = downloadableAssetFit2.ordinal();
            downloadableAssetFit = (iOrdinal2 == 0 || iOrdinal2 != 1) ? DownloadableAssetFit.ASPECT_FILL : DownloadableAssetFit.CENTER;
        } else {
            downloadableAssetFit = null;
        }
        return new EverydayExtrasSubscribeContentItem.HeaderImage(new DownloadableAsset(downloadableAssetType2, str, i, i2, downloadableAssetFit, onDownloadableAsset.g));
    }

    public static final EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems b(SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems onIconListItemWithNestedItems) {
        Intrinsics.h(onIconListItemWithNestedItems, "<this>");
        String str = onIconListItemWithNestedItems.b;
        ArrayList arrayList = onIconListItemWithNestedItems.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscribeOnboardingContentFragment.OnNestedMarkdownContent onNestedMarkdownContent = ((SubscribeOnboardingContentFragment.NestedItem) it.next()).b;
            EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems.NestedItem.NestedMarkdownContentItem nestedMarkdownContentItem = onNestedMarkdownContent != null ? new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems.NestedItem.NestedMarkdownContentItem(onNestedMarkdownContent.b) : null;
            if (nestedMarkdownContentItem != null) {
                arrayList2.add(nestedMarkdownContentItem);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SubscribeOnboardingContentFragment.OnNestedMarkdownContent onNestedMarkdownContent2 = ((SubscribeOnboardingContentFragment.NestedItem) it2.next()).b;
            String str2 = onNestedMarkdownContent2 != null ? onNestedMarkdownContent2.b : null;
            if (str2 != null) {
                arrayList3.add(str2);
            }
        }
        return new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems(str, arrayList2, CollectionsKt.M(arrayList3, "\n\n", null, null, null, 62));
    }
}
