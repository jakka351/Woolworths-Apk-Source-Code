package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract;", "", "Action", "ViewState", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraChoosePlanContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$Action;", "", "OpenUrl", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$Action$OpenUrl;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenUrl);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenUrl(url=null)";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "", "Content", "Loading", "Error", "ServiceMessage", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$ServiceMessage;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasChoosePlanFeed f6068a;
            public final boolean b;
            public final RewardsServiceMessage c;
            public final EverydayExtrasChoosePlanContentItem.SubscribePlan d;

            public Content(EverydayExtrasChoosePlanFeed choosePlanFeed, boolean z, RewardsServiceMessage rewardsServiceMessage, EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan) {
                Intrinsics.h(choosePlanFeed, "choosePlanFeed");
                this.f6068a = choosePlanFeed;
                this.b = z;
                this.c = rewardsServiceMessage;
                this.d = subscribePlan;
            }

            public static Content c(Content content, EverydayExtrasChoosePlanFeed choosePlanFeed, RewardsServiceMessage rewardsServiceMessage, EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan, int i) {
                if ((i & 1) != 0) {
                    choosePlanFeed = content.f6068a;
                }
                boolean z = content.b;
                if ((i & 4) != 0) {
                    rewardsServiceMessage = content.c;
                }
                if ((i & 8) != 0) {
                    subscribePlan = content.d;
                }
                Intrinsics.h(choosePlanFeed, "choosePlanFeed");
                return new Content(choosePlanFeed, z, rewardsServiceMessage, subscribePlan);
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract.ViewState
            public final int a() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f6068a, content.f6068a) && this.b == content.b && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d);
            }

            public final int hashCode() {
                int iE = b.e(this.f6068a.hashCode() * 31, 31, this.b);
                RewardsServiceMessage rewardsServiceMessage = this.c;
                int iHashCode = (iE + (rewardsServiceMessage == null ? 0 : rewardsServiceMessage.hashCode())) * 31;
                EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = this.d;
                return iHashCode + (subscribePlan != null ? subscribePlan.hashCode() : 0);
            }

            public final String toString() {
                return "Content(choosePlanFeed=" + this.f6068a + ", showPriceCents=" + this.b + ", partialServiceMessage=" + this.c + ", selectedSubscribePlan=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageError f6069a;

            public Error(FullPageError fullPageError) {
                this.f6069a = fullPageError;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract.ViewState
            public final int a() {
                return 2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6069a, ((Error) obj).f6069a);
            }

            public final int hashCode() {
                return this.f6069a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6069a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6070a = new Loading();

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract.ViewState
            public final int a() {
                return 1;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1785325078;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState$ServiceMessage;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/EverydayExtraChoosePlanContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ServiceMessage implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsServiceMessage f6071a;

            static {
                RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
            }

            public ServiceMessage(RewardsServiceMessage serviceMessage) {
                Intrinsics.h(serviceMessage, "serviceMessage");
                this.f6071a = serviceMessage;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract.ViewState
            public final int a() {
                return 3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServiceMessage) && Intrinsics.c(this.f6071a, ((ServiceMessage) obj).f6071a);
            }

            public final int hashCode() {
                return this.f6071a.hashCode();
            }

            public final String toString() {
                return "ServiceMessage(serviceMessage=" + this.f6071a + ")";
            }
        }

        int a();

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }
    }
}
