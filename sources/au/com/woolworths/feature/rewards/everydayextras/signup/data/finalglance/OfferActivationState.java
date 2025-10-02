package au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/finalglance/OfferActivationState;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferActivationState {
    public static final OfferActivationState d;
    public static final OfferActivationState e;
    public static final OfferActivationState f;
    public static final OfferActivationState g;
    public static final /* synthetic */ OfferActivationState[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        OfferActivationState offerActivationState = new OfferActivationState("NOT_ACTIVATED", 0);
        d = offerActivationState;
        OfferActivationState offerActivationState2 = new OfferActivationState("ACTIVATING", 1);
        e = offerActivationState2;
        OfferActivationState offerActivationState3 = new OfferActivationState("ACTIVATED", 2);
        f = offerActivationState3;
        OfferActivationState offerActivationState4 = new OfferActivationState("ACTIVATION_ERROR", 3);
        g = offerActivationState4;
        OfferActivationState[] offerActivationStateArr = {offerActivationState, offerActivationState2, offerActivationState3, offerActivationState4};
        h = offerActivationStateArr;
        i = EnumEntriesKt.a(offerActivationStateArr);
    }

    public static OfferActivationState valueOf(String str) {
        return (OfferActivationState) Enum.valueOf(OfferActivationState.class, str);
    }

    public static OfferActivationState[] values() {
        return (OfferActivationState[]) h.clone();
    }
}
