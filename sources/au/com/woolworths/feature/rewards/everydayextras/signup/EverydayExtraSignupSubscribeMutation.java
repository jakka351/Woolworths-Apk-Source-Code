package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtraSignupSubscribeMutation_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionInput;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraSubscribeFeatureFlags_InputAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraSubscriptionInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$Data;", "Data", "EverydayExtraSignupSubscribe", "OnEverydayExtraOnboarding", "Content", "Footer", "OnEverydayExtraSubscribeAlertDialog", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtraSignupSubscribeMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtraSubscriptionInput f5850a;
    public final EverydayExtraSubscribeFeatureFlags b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$Content;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f5851a;
        public final SubscribeOnboardingContentFragment b;

        public Content(String str, SubscribeOnboardingContentFragment subscribeOnboardingContentFragment) {
            this.f5851a = str;
            this.b = subscribeOnboardingContentFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f5851a, content.f5851a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5851a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(__typename=" + this.f5851a + ", subscribeOnboardingContentFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraSignupSubscribe f5852a;

        public Data(EverydayExtraSignupSubscribe everydayExtraSignupSubscribe) {
            this.f5852a = everydayExtraSignupSubscribe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5852a, ((Data) obj).f5852a);
        }

        public final int hashCode() {
            return this.f5852a.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraSignupSubscribe=" + this.f5852a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$EverydayExtraSignupSubscribe;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraSignupSubscribe {

        /* renamed from: a, reason: collision with root package name */
        public final String f5853a;
        public final OnEverydayExtraOnboarding b;
        public final OnEverydayExtraSubscribeAlertDialog c;

        public EverydayExtraSignupSubscribe(String __typename, OnEverydayExtraOnboarding onEverydayExtraOnboarding, OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog) {
            Intrinsics.h(__typename, "__typename");
            this.f5853a = __typename;
            this.b = onEverydayExtraOnboarding;
            this.c = onEverydayExtraSubscribeAlertDialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraSignupSubscribe)) {
                return false;
            }
            EverydayExtraSignupSubscribe everydayExtraSignupSubscribe = (EverydayExtraSignupSubscribe) obj;
            return Intrinsics.c(this.f5853a, everydayExtraSignupSubscribe.f5853a) && Intrinsics.c(this.b, everydayExtraSignupSubscribe.b) && Intrinsics.c(this.c, everydayExtraSignupSubscribe.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5853a.hashCode() * 31;
            OnEverydayExtraOnboarding onEverydayExtraOnboarding = this.b;
            int iHashCode2 = (iHashCode + (onEverydayExtraOnboarding == null ? 0 : onEverydayExtraOnboarding.hashCode())) * 31;
            OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = this.c;
            return iHashCode2 + (onEverydayExtraSubscribeAlertDialog != null ? onEverydayExtraSubscribeAlertDialog.hashCode() : 0);
        }

        public final String toString() {
            return "EverydayExtraSignupSubscribe(__typename=" + this.f5853a + ", onEverydayExtraOnboarding=" + this.b + ", onEverydayExtraSubscribeAlertDialog=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5854a;
        public final SubscribeOnboardingFooterFragment b;

        public Footer(String str, SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment) {
            this.f5854a = str;
            this.b = subscribeOnboardingFooterFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f5854a, footer.f5854a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5854a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(__typename=" + this.f5854a + ", subscribeOnboardingFooterFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$OnEverydayExtraOnboarding;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraOnboarding {

        /* renamed from: a, reason: collision with root package name */
        public final Content f5855a;
        public final boolean b;
        public final Footer c;

        public OnEverydayExtraOnboarding(Content content, boolean z, Footer footer) {
            this.f5855a = content;
            this.b = z;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraOnboarding)) {
                return false;
            }
            OnEverydayExtraOnboarding onEverydayExtraOnboarding = (OnEverydayExtraOnboarding) obj;
            return Intrinsics.c(this.f5855a, onEverydayExtraOnboarding.f5855a) && this.b == onEverydayExtraOnboarding.b && Intrinsics.c(this.c, onEverydayExtraOnboarding.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f5855a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OnEverydayExtraOnboarding(content=" + this.f5855a + ", showConfetti=" + this.b + ", footer=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeMutation$OnEverydayExtraSubscribeAlertDialog;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraSubscribeAlertDialog {

        /* renamed from: a, reason: collision with root package name */
        public final String f5856a;
        public final SubscribeAlertDialogFragment b;

        public OnEverydayExtraSubscribeAlertDialog(String str, SubscribeAlertDialogFragment subscribeAlertDialogFragment) {
            this.f5856a = str;
            this.b = subscribeAlertDialogFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraSubscribeAlertDialog)) {
                return false;
            }
            OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = (OnEverydayExtraSubscribeAlertDialog) obj;
            return Intrinsics.c(this.f5856a, onEverydayExtraSubscribeAlertDialog.f5856a) && Intrinsics.c(this.b, onEverydayExtraSubscribeAlertDialog.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5856a.hashCode() * 31);
        }

        public final String toString() {
            return "OnEverydayExtraSubscribeAlertDialog(__typename=" + this.f5856a + ", subscribeAlertDialogFragment=" + this.b + ")";
        }
    }

    public EverydayExtraSignupSubscribeMutation(EverydayExtraSubscriptionInput subscriptionInput, EverydayExtraSubscribeFeatureFlags featureFlags) {
        Intrinsics.h(subscriptionInput, "subscriptionInput");
        Intrinsics.h(featureFlags, "featureFlags");
        this.f5850a = subscriptionInput;
        this.b = featureFlags;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtraSignupSubscribeMutation_ResponseAdapter.Data.f5973a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation EverydayExtraSignupSubscribe($subscriptionInput: EverydayExtraSubscriptionInput!, $featureFlags: EverydayExtraSubscribeFeatureFlags!) { everydayExtraSignupSubscribe(subscriptionInput: $subscriptionInput, featureFlags: $featureFlags) { __typename ... on EverydayExtraOnboarding { content { __typename ...SubscribeOnboardingContentFragment } showConfetti footer { __typename ...SubscribeOnboardingFooterFragment } } ... on EverydayExtraSubscribeAlertDialog { __typename ...SubscribeAlertDialogFragment } } }  fragment SubscribeOnboardingContentFragment on EverydayExtraOnboardingContent { __typename id contentItems: items { __typename ... on DownloadableAsset { __typename assetType assetUrl assetWidth assetHeight fit altText } ... on TitleTextItem { __typename content } ... on ParagraphTextItem { __typename content alignment } ... on IconListItemWithNestedItems { __typename iconUrl nestedItems: items { __typename ... on NestedMarkdownContent { __typename content } } } } }  fragment SubscribeOnboardingFooterFragment on EverydayExtraOnboardingFooter { __typename id footerItems: items { __typename ... on ContentCta { __typename label url } } }  fragment SubscribeAlertDialogFragment on EverydayExtraSubscribeAlertDialog { __typename resetPaymentForm title message primaryCta { label url } secondaryCta { label url } analytics { eventCategory eventDescription } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtraSignupSubscribeMutation)) {
            return false;
        }
        EverydayExtraSignupSubscribeMutation everydayExtraSignupSubscribeMutation = (EverydayExtraSignupSubscribeMutation) obj;
        return Intrinsics.c(this.f5850a, everydayExtraSignupSubscribeMutation.f5850a) && Intrinsics.c(this.b, everydayExtraSignupSubscribeMutation.b);
    }

    public final int hashCode() {
        return this.b.f9552a.hashCode() + (this.f5850a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "315109ada9761286e7d1cfbe959ad46710255bad97929802af25e3055040f78d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtraSignupSubscribe";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("subscriptionInput");
        Adapters.c(EverydayExtraSubscriptionInput_InputAdapter.f9953a, false).toJson(jsonWriter, customScalarAdapters, this.f5850a);
        jsonWriter.F1("featureFlags");
        Adapters.c(EverydayExtraSubscribeFeatureFlags_InputAdapter.f9952a, false).toJson(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return "EverydayExtraSignupSubscribeMutation(subscriptionInput=" + this.f5850a + ", featureFlags=" + this.b + ")";
    }
}
