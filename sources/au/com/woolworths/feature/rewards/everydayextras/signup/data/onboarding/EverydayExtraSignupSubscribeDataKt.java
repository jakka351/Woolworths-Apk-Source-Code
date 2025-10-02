package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import android.os.Parcelable;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeMutation;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtraSignupSubscribeNoPaymentMutation;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.AlertDialogAnalytics;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraSignupSubscribeDataKt {
    public static final EverydayExtraSignupSubscribeData a(EverydayExtraSignupSubscribeMutation.EverydayExtraSignupSubscribe everydayExtraSignupSubscribe) {
        Parcelable parcelableB;
        EverydayExtraSignupSubscribeMutation.OnEverydayExtraOnboarding onEverydayExtraOnboarding = everydayExtraSignupSubscribe.b;
        if (onEverydayExtraOnboarding == null) {
            EverydayExtraSignupSubscribeMutation.OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = everydayExtraSignupSubscribe.c;
            if (onEverydayExtraSubscribeAlertDialog == null) {
                return null;
            }
            SubscribeAlertDialogFragment subscribeAlertDialogFragment = onEverydayExtraSubscribeAlertDialog.b;
            String str = subscribeAlertDialogFragment.c;
            String str2 = subscribeAlertDialogFragment.d;
            SubscribeAlertDialogFragment.PrimaryCta primaryCta = subscribeAlertDialogFragment.e;
            ContentCta contentCta = new ContentCta(primaryCta.f6178a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
            SubscribeAlertDialogFragment.SecondaryCta secondaryCta = subscribeAlertDialogFragment.f;
            ContentCta contentCta2 = secondaryCta != null ? new ContentCta(secondaryCta.f6179a, secondaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null;
            SubscribeAlertDialogFragment.Analytics analytics = subscribeAlertDialogFragment.g;
            return new EverydayExtraSubscribeAlertDialog(str, str2, contentCta, contentCta2, analytics != null ? new AlertDialogAnalytics(analytics.f6177a, analytics.b) : null, subscribeAlertDialogFragment.b);
        }
        SubscribeOnboardingContentFragment subscribeOnboardingContentFragment = onEverydayExtraOnboarding.f5855a.b;
        String str3 = subscribeOnboardingContentFragment.b;
        ArrayList<SubscribeOnboardingContentFragment.ContentItem> arrayList = subscribeOnboardingContentFragment.c;
        ArrayList arrayList2 = new ArrayList();
        for (SubscribeOnboardingContentFragment.ContentItem contentItem : arrayList) {
            SubscribeOnboardingContentFragment.OnDownloadableAsset onDownloadableAsset = contentItem.b;
            if (onDownloadableAsset != null) {
                parcelableB = EverydayExtrasSubscribeContentKt.a(onDownloadableAsset);
            } else {
                SubscribeOnboardingContentFragment.OnTitleTextItem onTitleTextItem = contentItem.c;
                if (onTitleTextItem != null) {
                    parcelableB = new EverydayExtrasSubscribeContentItem.TitleTextItem(onTitleTextItem.b);
                } else {
                    SubscribeOnboardingContentFragment.OnParagraphTextItem onParagraphTextItem = contentItem.d;
                    if (onParagraphTextItem != null) {
                        parcelableB = SubscribeOnboardingContentFragmentOnParagraphTextItemExtKt.a(onParagraphTextItem);
                    } else {
                        SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems onIconListItemWithNestedItems = contentItem.e;
                        parcelableB = onIconListItemWithNestedItems != null ? EverydayExtrasSubscribeContentKt.b(onIconListItemWithNestedItems) : null;
                    }
                }
            }
            if (parcelableB != null) {
                arrayList2.add(parcelableB);
            }
        }
        EverydayExtrasSubscribeContent everydayExtrasSubscribeContent = new EverydayExtrasSubscribeContent(str3, arrayList2);
        SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment = onEverydayExtraOnboarding.c.b;
        String str4 = subscribeOnboardingFooterFragment.b;
        ArrayList arrayList3 = subscribeOnboardingFooterFragment.c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            SubscribeOnboardingFooterFragment.OnContentCta onContentCta = ((SubscribeOnboardingFooterFragment.FooterItem) it.next()).b;
            EverydayExtrasSubscribeFooterItem.SubscribeContentCta subscribeContentCtaA = onContentCta != null ? EverydayExtrasSubscribeFooterKt.a(onContentCta) : null;
            if (subscribeContentCtaA != null) {
                arrayList4.add(subscribeContentCtaA);
            }
        }
        return new EverydayExtrasOnBoarding(everydayExtrasSubscribeContent, new EverydayExtrasSubscribeFooter(str4, arrayList4), Boolean.valueOf(onEverydayExtraOnboarding.b));
    }

    public static final EverydayExtraSignupSubscribeData b(EverydayExtraSignupSubscribeNoPaymentMutation.EverydayExtraSignupSubscribeNoPayment everydayExtraSignupSubscribeNoPayment) {
        Parcelable parcelableB;
        EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraOnboarding onEverydayExtraOnboarding = everydayExtraSignupSubscribeNoPayment.b;
        if (onEverydayExtraOnboarding == null) {
            EverydayExtraSignupSubscribeNoPaymentMutation.OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = everydayExtraSignupSubscribeNoPayment.c;
            if (onEverydayExtraSubscribeAlertDialog == null) {
                return null;
            }
            SubscribeAlertDialogFragment subscribeAlertDialogFragment = onEverydayExtraSubscribeAlertDialog.b;
            String str = subscribeAlertDialogFragment.c;
            String str2 = subscribeAlertDialogFragment.d;
            SubscribeAlertDialogFragment.PrimaryCta primaryCta = subscribeAlertDialogFragment.e;
            ContentCta contentCta = new ContentCta(primaryCta.f6178a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
            SubscribeAlertDialogFragment.SecondaryCta secondaryCta = subscribeAlertDialogFragment.f;
            ContentCta contentCta2 = secondaryCta != null ? new ContentCta(secondaryCta.f6179a, secondaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null;
            SubscribeAlertDialogFragment.Analytics analytics = subscribeAlertDialogFragment.g;
            return new EverydayExtraSubscribeAlertDialog(str, str2, contentCta, contentCta2, analytics != null ? new AlertDialogAnalytics(analytics.f6177a, analytics.b) : null, subscribeAlertDialogFragment.b);
        }
        SubscribeOnboardingContentFragment subscribeOnboardingContentFragment = onEverydayExtraOnboarding.f5862a.b;
        String str3 = subscribeOnboardingContentFragment.b;
        ArrayList<SubscribeOnboardingContentFragment.ContentItem> arrayList = subscribeOnboardingContentFragment.c;
        ArrayList arrayList2 = new ArrayList();
        for (SubscribeOnboardingContentFragment.ContentItem contentItem : arrayList) {
            SubscribeOnboardingContentFragment.OnDownloadableAsset onDownloadableAsset = contentItem.b;
            if (onDownloadableAsset != null) {
                parcelableB = EverydayExtrasSubscribeContentKt.a(onDownloadableAsset);
            } else {
                SubscribeOnboardingContentFragment.OnTitleTextItem onTitleTextItem = contentItem.c;
                if (onTitleTextItem != null) {
                    parcelableB = new EverydayExtrasSubscribeContentItem.TitleTextItem(onTitleTextItem.b);
                } else {
                    SubscribeOnboardingContentFragment.OnParagraphTextItem onParagraphTextItem = contentItem.d;
                    if (onParagraphTextItem != null) {
                        parcelableB = SubscribeOnboardingContentFragmentOnParagraphTextItemExtKt.a(onParagraphTextItem);
                    } else {
                        SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems onIconListItemWithNestedItems = contentItem.e;
                        parcelableB = onIconListItemWithNestedItems != null ? EverydayExtrasSubscribeContentKt.b(onIconListItemWithNestedItems) : null;
                    }
                }
            }
            if (parcelableB != null) {
                arrayList2.add(parcelableB);
            }
        }
        EverydayExtrasSubscribeContent everydayExtrasSubscribeContent = new EverydayExtrasSubscribeContent(str3, arrayList2);
        SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment = onEverydayExtraOnboarding.c.b;
        String str4 = subscribeOnboardingFooterFragment.b;
        ArrayList arrayList3 = subscribeOnboardingFooterFragment.c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            SubscribeOnboardingFooterFragment.OnContentCta onContentCta = ((SubscribeOnboardingFooterFragment.FooterItem) it.next()).b;
            EverydayExtrasSubscribeFooterItem.SubscribeContentCta subscribeContentCtaA = onContentCta != null ? EverydayExtrasSubscribeFooterKt.a(onContentCta) : null;
            if (subscribeContentCtaA != null) {
                arrayList4.add(subscribeContentCtaA);
            }
        }
        return new EverydayExtrasOnBoarding(everydayExtrasSubscribeContent, new EverydayExtrasSubscribeFooter(str4, arrayList4), Boolean.valueOf(onEverydayExtraOnboarding.b));
    }
}
