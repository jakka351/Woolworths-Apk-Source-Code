package au.com.woolworths.feature.shop.onboarding;

import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/CallToActionEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/shop/onboarding/OnboardingContract$CallToAction;", "clickHandler", "Lau/com/woolworths/feature/shop/onboarding/OnboardingClickHandler;", "<init>", "(Lau/com/woolworths/feature/shop/onboarding/OnboardingClickHandler;)V", "getClickHandler", "()Lau/com/woolworths/feature/shop/onboarding/OnboardingClickHandler;", "buildModels", "", "actions", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CallToActionEpoxyController extends TypedEpoxyController<List<? extends OnboardingContract.CallToAction>> {

    @NotNull
    private final OnboardingClickHandler clickHandler;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OnboardingContract.CallToAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OnboardingContract.CallToAction callToAction = OnboardingContract.CallToAction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OnboardingContract.CallToAction callToAction2 = OnboardingContract.CallToAction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CallToActionEpoxyController(@NotNull OnboardingClickHandler clickHandler) {
        Intrinsics.h(clickHandler, "clickHandler");
        this.clickHandler = clickHandler;
    }

    @NotNull
    public final OnboardingClickHandler getClickHandler() {
        return this.clickHandler;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends OnboardingContract.CallToAction> actions) {
        Intrinsics.h(actions, "actions");
        Iterator<? extends OnboardingContract.CallToAction> it = actions.iterator();
        while (it.hasNext()) {
            int iOrdinal = it.next().ordinal();
            if (iOrdinal == 0) {
                ItemCreateAccountActionBindingModel_ itemCreateAccountActionBindingModel_ = new ItemCreateAccountActionBindingModel_();
                itemCreateAccountActionBindingModel_.M();
                OnboardingClickHandler onboardingClickHandler = this.clickHandler;
                itemCreateAccountActionBindingModel_.t();
                itemCreateAccountActionBindingModel_.n = onboardingClickHandler;
                add(itemCreateAccountActionBindingModel_);
            } else if (iOrdinal == 1) {
                ItemLoginActionBindingModel_ itemLoginActionBindingModel_ = new ItemLoginActionBindingModel_();
                itemLoginActionBindingModel_.M();
                OnboardingClickHandler onboardingClickHandler2 = this.clickHandler;
                itemLoginActionBindingModel_.t();
                itemLoginActionBindingModel_.n = onboardingClickHandler2;
                add(itemLoginActionBindingModel_);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ItemContinueAsGuestActionBindingModel_ itemContinueAsGuestActionBindingModel_ = new ItemContinueAsGuestActionBindingModel_();
                itemContinueAsGuestActionBindingModel_.M();
                OnboardingClickHandler onboardingClickHandler3 = this.clickHandler;
                itemContinueAsGuestActionBindingModel_.t();
                itemContinueAsGuestActionBindingModel_.n = onboardingClickHandler3;
                add(itemContinueAsGuestActionBindingModel_);
            }
        }
    }
}
