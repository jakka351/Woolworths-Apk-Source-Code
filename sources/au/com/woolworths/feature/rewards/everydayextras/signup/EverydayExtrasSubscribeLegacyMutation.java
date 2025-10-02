package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtrasSubscribeLegacyMutation_ResponseAdapter;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraSubscriptionInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Data;", "Data", "EverydayExtraSubscribe", "Content", "Footer", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasSubscribeLegacyMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Content;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f5945a;
        public final SubscribeOnboardingContentFragment b;

        public Content(String str, SubscribeOnboardingContentFragment subscribeOnboardingContentFragment) {
            this.f5945a = str;
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
            return Intrinsics.c(this.f5945a, content.f5945a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5945a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(__typename=" + this.f5945a + ", subscribeOnboardingContentFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraSubscribe f5946a;

        public Data(EverydayExtraSubscribe everydayExtraSubscribe) {
            this.f5946a = everydayExtraSubscribe;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5946a, ((Data) obj).f5946a);
        }

        public final int hashCode() {
            return this.f5946a.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraSubscribe=" + this.f5946a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$EverydayExtraSubscribe;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraSubscribe {

        /* renamed from: a, reason: collision with root package name */
        public final Content f5947a;
        public final Footer b;

        public EverydayExtraSubscribe(Content content, Footer footer) {
            this.f5947a = content;
            this.b = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraSubscribe)) {
                return false;
            }
            EverydayExtraSubscribe everydayExtraSubscribe = (EverydayExtraSubscribe) obj;
            return Intrinsics.c(this.f5947a, everydayExtraSubscribe.f5947a) && Intrinsics.c(this.b, everydayExtraSubscribe.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5947a.hashCode() * 31);
        }

        public final String toString() {
            return "EverydayExtraSubscribe(content=" + this.f5947a + ", footer=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSubscribeLegacyMutation$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5948a;
        public final SubscribeOnboardingFooterFragment b;

        public Footer(String str, SubscribeOnboardingFooterFragment subscribeOnboardingFooterFragment) {
            this.f5948a = str;
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
            return Intrinsics.c(this.f5948a, footer.f5948a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5948a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(__typename=" + this.f5948a + ", subscribeOnboardingFooterFragment=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtrasSubscribeLegacyMutation_ResponseAdapter.Data.f6045a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation EverydayExtrasSubscribeLegacy($subscriptionInput: EverydayExtraSubscriptionInput!) { everydayExtraSubscribe(subscriptionInput: $subscriptionInput) { content { __typename ...SubscribeOnboardingContentFragment } footer { __typename ...SubscribeOnboardingFooterFragment } } }  fragment SubscribeOnboardingContentFragment on EverydayExtraOnboardingContent { __typename id contentItems: items { __typename ... on DownloadableAsset { __typename assetType assetUrl assetWidth assetHeight fit altText } ... on TitleTextItem { __typename content } ... on ParagraphTextItem { __typename content alignment } ... on IconListItemWithNestedItems { __typename iconUrl nestedItems: items { __typename ... on NestedMarkdownContent { __typename content } } } } }  fragment SubscribeOnboardingFooterFragment on EverydayExtraOnboardingFooter { __typename id footerItems: items { __typename ... on ContentCta { __typename label url } } }";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof EverydayExtrasSubscribeLegacyMutation);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "252f80b22611abc7cdf2c57ac29b20a2c485046a862641043777ce63a65a0684";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtrasSubscribeLegacy";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("subscriptionInput");
        Adapters.c(EverydayExtraSubscriptionInput_InputAdapter.f9953a, false).toJson(jsonWriter, customScalarAdapters, null);
    }

    public final String toString() {
        return "EverydayExtrasSubscribeLegacyMutation(subscriptionInput=null)";
    }
}
