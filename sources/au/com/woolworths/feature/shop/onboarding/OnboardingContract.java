package au.com.woolworths.feature.shop.onboarding;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.feature.shop.onboarding.OnboardingAdapter;
import au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract;", "", "ViewState", "NavigationActions", "CallToAction", "OnboardingData", "OnboardingDataNZ", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OnboardingContract {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$CallToAction;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallToAction {
        public static final CallToAction d;
        public static final CallToAction e;
        public static final CallToAction f;
        public static final /* synthetic */ CallToAction[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            CallToAction callToAction = new CallToAction("CREATE_ACCOUNT", 0);
            d = callToAction;
            CallToAction callToAction2 = new CallToAction("LOG_IN", 1);
            e = callToAction2;
            CallToAction callToAction3 = new CallToAction("CONTINUE_AS_GUEST", 2);
            f = callToAction3;
            CallToAction[] callToActionArr = {callToAction, callToAction2, callToAction3};
            g = callToActionArr;
            h = EnumEntriesKt.a(callToActionArr);
        }

        public static CallToAction valueOf(String str) {
            return (CallToAction) Enum.valueOf(CallToAction.class, str);
        }

        public static CallToAction[] values() {
            return (CallToAction[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "", "CreateAccount", "ContinueAsGuest", "LogIn", "NavigateToBranchLink", "NavigateToCollectionMode", "NavigateToHomePage", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$ContinueAsGuest;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$CreateAccount;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$LogIn;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToBranchLink;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToCollectionMode;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToHomePage;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NavigationActions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$ContinueAsGuest;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ContinueAsGuest extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f7953a;

            public ContinueAsGuest(boolean z) {
                this.f7953a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ContinueAsGuest) && this.f7953a == ((ContinueAsGuest) obj).f7953a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f7953a);
            }

            public final String toString() {
                return a.n("ContinueAsGuest(handleDeeplink=", ")", this.f7953a);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$CreateAccount;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CreateAccount extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public static final CreateAccount f7954a = new CreateAccount();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$LogIn;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LogIn extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public static final LogIn f7955a = new LogIn();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToBranchLink;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToBranchLink extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public final BranchReferringParams f7956a;

            public NavigateToBranchLink(BranchReferringParams branchReferringParams) {
                this.f7956a = branchReferringParams;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToBranchLink) && Intrinsics.c(this.f7956a, ((NavigateToBranchLink) obj).f7956a);
            }

            public final int hashCode() {
                BranchReferringParams branchReferringParams = this.f7956a;
                if (branchReferringParams == null) {
                    return 0;
                }
                return branchReferringParams.hashCode();
            }

            public final String toString() {
                return "NavigateToBranchLink(branchReferringParams=" + this.f7956a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToCollectionMode;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NavigateToCollectionMode extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToCollectionMode f7957a = new NavigateToCollectionMode();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions$NavigateToHomePage;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$NavigationActions;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NavigateToHomePage extends NavigationActions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToHomePage f7958a = new NavigateToHomePage();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingData;", "Lau/com/woolworths/feature/shop/onboarding/data/OnboardingCarouselData;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnboardingData implements OnboardingCarouselData {
        public static final /* synthetic */ OnboardingData[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OnboardingAdapter.PageStateType d = OnboardingAdapter.PageStateType.d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingData.LISTS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingData;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LISTS extends OnboardingData {
            public final int g;
            public final int h;
            public final int i;

            public LISTS() {
                super("LISTS", 2);
                this.g = com.woolworths.R.drawable.img_onboarding_lists;
                this.h = com.woolworths.R.string.lists_title_text;
                this.i = com.woolworths.R.string.lists_message_text;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingData.REWARDS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingData;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class REWARDS extends OnboardingData {
            public final int g;
            public final int h;
            public final int i;

            public REWARDS() {
                super("REWARDS", 3);
                this.g = com.woolworths.R.drawable.img_onboarding_rewards;
                this.h = com.woolworths.R.string.rewards_title_text;
                this.i = com.woolworths.R.string.rewards_message_text;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingData.SPECIALS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingData;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SPECIALS extends OnboardingData {
            public final int g;
            public final int h;
            public final int i;

            public SPECIALS() {
                super("SPECIALS", 1);
                this.g = com.woolworths.R.drawable.img_onboarding_specials;
                this.h = com.woolworths.R.string.specials_title_text;
                this.i = com.woolworths.R.string.specials_message_text;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingData.WELCOME", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingData;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class WELCOME extends OnboardingData {
            public final int g;
            public final int h;
            public final int i;

            public WELCOME() {
                super("WELCOME", 0);
                this.g = com.woolworths.R.drawable.img_onboarding_welcome;
                this.h = com.woolworths.R.string.welcome_title_text;
                this.i = com.woolworths.R.string.welcome_message_text;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        static {
            OnboardingData[] onboardingDataArr = {new WELCOME(), new SPECIALS(), new LISTS(), new REWARDS()};
            e = onboardingDataArr;
            f = EnumEntriesKt.a(onboardingDataArr);
        }

        public OnboardingData(String str, int i) {
        }

        public static OnboardingData valueOf(String str) {
            return (OnboardingData) Enum.valueOf(OnboardingData.class, str);
        }

        public static OnboardingData[] values() {
            return (OnboardingData[]) e.clone();
        }

        @Override // au.com.woolworths.feature.shop.onboarding.OnboardingAdapter.BasePageState
        /* renamed from: a, reason: from getter */
        public final OnboardingAdapter.PageStateType getD() {
            return this.d;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingDataNZ;", "Lau/com/woolworths/feature/shop/onboarding/data/OnboardingCarouselData;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnboardingDataNZ implements OnboardingCarouselData {
        public static final /* synthetic */ OnboardingDataNZ[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OnboardingAdapter.PageStateType d = OnboardingAdapter.PageStateType.d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingDataNZ.LISTS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingDataNZ;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LISTS extends OnboardingDataNZ {
            public final int g;
            public final int h;
            public final int i;

            public LISTS() {
                super("LISTS", 2);
                this.g = com.woolworths.R.drawable.img_onboarding_lists;
                this.h = com.woolworths.R.string.lists_title_text_nz;
                this.i = com.woolworths.R.string.lists_message_text_nz;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingDataNZ.REWARDS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingDataNZ;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class REWARDS extends OnboardingDataNZ {
            public final int g;
            public final int h;
            public final int i;

            public REWARDS() {
                super("REWARDS", 3);
                this.g = com.woolworths.R.drawable.img_onboarding_rewards;
                this.h = com.woolworths.R.string.rewards_title_text_nz;
                this.i = com.woolworths.R.string.rewards_message_text_nz;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingDataNZ.SPECIALS", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingDataNZ;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SPECIALS extends OnboardingDataNZ {
            public final int g;
            public final int h;
            public final int i;

            public SPECIALS() {
                super("SPECIALS", 1);
                this.g = com.woolworths.R.drawable.img_onboarding_specials;
                this.h = com.woolworths.R.string.specials_title_text_nz;
                this.i = com.woolworths.R.string.specials_message_text_nz;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingContract.OnboardingDataNZ.WELCOME", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$OnboardingDataNZ;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class WELCOME extends OnboardingDataNZ {
            public final int g;
            public final int h;
            public final int i;

            public WELCOME() {
                super("WELCOME", 0);
                this.g = com.woolworths.R.drawable.img_onboarding_welcome_nz;
                this.h = com.woolworths.R.string.welcome_title_text_nz;
                this.i = com.woolworths.R.string.welcome_message_text_nz;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: b, reason: from getter */
            public final int getH() {
                return this.h;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: c, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData
            /* renamed from: getImage, reason: from getter */
            public final int getG() {
                return this.g;
            }
        }

        static {
            OnboardingDataNZ[] onboardingDataNZArr = {new WELCOME(), new SPECIALS(), new LISTS(), new REWARDS()};
            e = onboardingDataNZArr;
            f = EnumEntriesKt.a(onboardingDataNZArr);
        }

        public OnboardingDataNZ(String str, int i) {
        }

        public static OnboardingDataNZ valueOf(String str) {
            return (OnboardingDataNZ) Enum.valueOf(OnboardingDataNZ.class, str);
        }

        public static OnboardingDataNZ[] values() {
            return (OnboardingDataNZ[]) e.clone();
        }

        @Override // au.com.woolworths.feature.shop.onboarding.OnboardingAdapter.BasePageState
        /* renamed from: a, reason: from getter */
        public final OnboardingAdapter.PageStateType getD() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$ViewState;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7959a;
        public final List b;
        public final List c;
        public final OnboardingErrorState d;

        public ViewState(boolean z, List list, List list2, OnboardingErrorState onboardingErrorState) {
            this.f7959a = z;
            this.b = list;
            this.c = list2;
            this.d = onboardingErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7959a == viewState.f7959a && this.b.equals(viewState.b) && this.c.equals(viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iD = b.d(b.d(Boolean.hashCode(this.f7959a) * 31, 31, this.b), 31, this.c);
            OnboardingErrorState onboardingErrorState = this.d;
            return iD + (onboardingErrorState == null ? 0 : onboardingErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7959a + ", carouselContent=" + this.b + ", callToActions=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
