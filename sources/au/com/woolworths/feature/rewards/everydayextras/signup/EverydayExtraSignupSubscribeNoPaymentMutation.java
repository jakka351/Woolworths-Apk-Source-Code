package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeAlertDialogFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionNoPaymentInput;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraSubscribeFeatureFlags_InputAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraSubscriptionNoPaymentInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Data;", "Data", "EverydayExtraSignupSubscribeNoPayment", "OnEverydayExtraOnboarding", "Content", "Footer", "OnEverydayExtraSubscribeAlertDialog", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtraSignupSubscribeNoPaymentMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtraSubscriptionNoPaymentInput f5857a;
    public final EverydayExtraSubscribeFeatureFlags b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Content;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f5858a;
        public final SubscribeOnboardingContentFragment b;

        public Content(String str, SubscribeOnboardingContentFragment subscribeOnboardingContentFragment) {
            this.f5858a = str;
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
            return Intrinsics.c(this.f5858a, content.f5858a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5858a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(__typename=" + this.f5858a + ", subscribeOnboardingContentFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraSignupSubscribeNoPayment f5859a;

        public Data(EverydayExtraSignupSubscribeNoPayment everydayExtraSignupSubscribeNoPayment) {
            this.f5859a = everydayExtraSignupSubscribeNoPayment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5859a, ((Data) obj).f5859a);
        }

        public final int hashCode() {
            return this.f5859a.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraSignupSubscribeNoPayment=" + this.f5859a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$EverydayExtraSignupSubscribeNoPayment;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraSignupSubscribeNoPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f5860a;
        public final OnEverydayExtraOnboarding b;
        public final OnEverydayExtraSubscribeAlertDialog c;

        public EverydayExtraSignupSubscribeNoPayment(String __typename, OnEverydayExtraOnboarding onEverydayExtraOnboarding, OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog) {
            Intrinsics.h(__typename, "__typename");
            this.f5860a = __typename;
            this.b = onEverydayExtraOnboarding;
            this.c = onEverydayExtraSubscribeAlertDialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraSignupSubscribeNoPayment)) {
                return false;
            }
            EverydayExtraSignupSubscribeNoPayment everydayExtraSignupSubscribeNoPayment = (EverydayExtraSignupSubscribeNoPayment) obj;
            return Intrinsics.c(this.f5860a, everydayExtraSignupSubscribeNoPayment.f5860a) && Intrinsics.c(this.b, everydayExtraSignupSubscribeNoPayment.b) && Intrinsics.c(this.c, everydayExtraSignupSubscribeNoPayment.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5860a.hashCode() * 31;
            OnEverydayExtraOnboarding onEverydayExtraOnboarding = this.b;
            int iHashCode2 = (iHashCode + (onEverydayExtraOnboarding == null ? 0 : onEverydayExtraOnboarding.hashCode())) * 31;
            OnEverydayExtraSubscribeAlertDialog onEverydayExtraSubscribeAlertDialog = this.c;
            return iHashCode2 + (onEverydayExtraSubscribeAlertDialog != null ? onEverydayExtraSubscribeAlertDialog.hashCode() : 0);
        }

        public final String toString() {
            return "EverydayExtraSignupSubscribeNoPayment(__typename=" + this.f5860a + ", onEverydayExtraOnboarding=" + this.b + ", onEverydayExtraSubscribeAlertDialog=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5861a;
        public final SubscribeOnboardingFooterFragment b;

        public Footer(String str, SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment) {
            this.f5861a = str;
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
            return Intrinsics.c(this.f5861a, footer.f5861a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5861a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(__typename=" + this.f5861a + ", subscribeOnboardingFooterFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$OnEverydayExtraOnboarding;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraOnboarding {

        /* renamed from: a, reason: collision with root package name */
        public final Content f5862a;
        public final boolean b;
        public final Footer c;

        public OnEverydayExtraOnboarding(Content content, boolean z, Footer footer) {
            this.f5862a = content;
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
            return Intrinsics.c(this.f5862a, onEverydayExtraOnboarding.f5862a) && this.b == onEverydayExtraOnboarding.b && Intrinsics.c(this.c, onEverydayExtraOnboarding.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f5862a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OnEverydayExtraOnboarding(content=" + this.f5862a + ", showConfetti=" + this.b + ", footer=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtraSignupSubscribeNoPaymentMutation$OnEverydayExtraSubscribeAlertDialog;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraSubscribeAlertDialog {

        /* renamed from: a, reason: collision with root package name */
        public final String f5863a;
        public final SubscribeAlertDialogFragment b;

        public OnEverydayExtraSubscribeAlertDialog(String str, SubscribeAlertDialogFragment subscribeAlertDialogFragment) {
            this.f5863a = str;
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
            return Intrinsics.c(this.f5863a, onEverydayExtraSubscribeAlertDialog.f5863a) && Intrinsics.c(this.b, onEverydayExtraSubscribeAlertDialog.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5863a.hashCode() * 31);
        }

        public final String toString() {
            return "OnEverydayExtraSubscribeAlertDialog(__typename=" + this.f5863a + ", subscribeAlertDialogFragment=" + this.b + ")";
        }
    }

    public EverydayExtraSignupSubscribeNoPaymentMutation(EverydayExtraSubscriptionNoPaymentInput subscriptionInput, EverydayExtraSubscribeFeatureFlags featureFlags) {
        Intrinsics.h(subscriptionInput, "subscriptionInput");
        Intrinsics.h(featureFlags, "featureFlags");
        this.f5857a = subscriptionInput;
        this.b = featureFlags;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtraSignupSubscribeNoPaymentMutation_ResponseAdapter.Data.f5979a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation EverydayExtraSignupSubscribeNoPayment($subscriptionInput: EverydayExtraSubscriptionNoPaymentInput!, $featureFlags: EverydayExtraSubscribeFeatureFlags!) { everydayExtraSignupSubscribeNoPayment(subscriptionInput: $subscriptionInput, featureFlags: $featureFlags) { __typename ... on EverydayExtraOnboarding { content { __typename ...SubscribeOnboardingContentFragment } showConfetti footer { __typename ...SubscribeOnboardingFooterFragment } } ... on EverydayExtraSubscribeAlertDialog { __typename ...SubscribeAlertDialogFragment } } }  fragment SubscribeOnboardingContentFragment on EverydayExtraOnboardingContent { __typename id contentItems: items { __typename ... on DownloadableAsset { __typename assetType assetUrl assetWidth assetHeight fit altText } ... on TitleTextItem { __typename content } ... on ParagraphTextItem { __typename content alignment } ... on IconListItemWithNestedItems { __typename iconUrl nestedItems: items { __typename ... on NestedMarkdownContent { __typename content } } } } }  fragment SubscribeOnboardingFooterFragment on EverydayExtraOnboardingFooter { __typename id footerItems: items { __typename ... on ContentCta { __typename label url } } }  fragment SubscribeAlertDialogFragment on EverydayExtraSubscribeAlertDialog { __typename resetPaymentForm title message primaryCta { label url } secondaryCta { label url } analytics { eventCategory eventDescription } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtraSignupSubscribeNoPaymentMutation)) {
            return false;
        }
        EverydayExtraSignupSubscribeNoPaymentMutation everydayExtraSignupSubscribeNoPaymentMutation = (EverydayExtraSignupSubscribeNoPaymentMutation) obj;
        return Intrinsics.c(this.f5857a, everydayExtraSignupSubscribeNoPaymentMutation.f5857a) && Intrinsics.c(this.b, everydayExtraSignupSubscribeNoPaymentMutation.b);
    }

    public final int hashCode() {
        return this.b.f9552a.hashCode() + (this.f5857a.f9556a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6afdfd1f8f5ef9f8654d0ee01c23b308d2c92fa70df2b58b6eb9945c01011429";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtraSignupSubscribeNoPayment";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("subscriptionInput");
        Adapters.c(EverydayExtraSubscriptionNoPaymentInput_InputAdapter.f9954a, false).toJson(jsonWriter, customScalarAdapters, this.f5857a);
        jsonWriter.F1("featureFlags");
        Adapters.c(EverydayExtraSubscribeFeatureFlags_InputAdapter.f9952a, false).toJson(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return "EverydayExtraSignupSubscribeNoPaymentMutation(subscriptionInput=" + this.f5857a + ", featureFlags=" + this.b + ")";
    }
}
