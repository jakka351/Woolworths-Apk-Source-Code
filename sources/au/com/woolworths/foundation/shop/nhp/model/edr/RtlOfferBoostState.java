package au.com.woolworths.foundation.shop.nhp.model.edr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/RtlOfferBoostState;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RtlOfferBoostState {
    public static final RtlOfferBoostState d;
    public static final RtlOfferBoostState e;
    public static final /* synthetic */ RtlOfferBoostState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RtlOfferBoostState rtlOfferBoostState = new RtlOfferBoostState("BOOSTED", 0);
        d = rtlOfferBoostState;
        RtlOfferBoostState rtlOfferBoostState2 = new RtlOfferBoostState("NOT_BOOSTED", 1);
        e = rtlOfferBoostState2;
        RtlOfferBoostState[] rtlOfferBoostStateArr = {rtlOfferBoostState, rtlOfferBoostState2};
        f = rtlOfferBoostStateArr;
        g = EnumEntriesKt.a(rtlOfferBoostStateArr);
    }

    public static RtlOfferBoostState valueOf(String str) {
        return (RtlOfferBoostState) Enum.valueOf(RtlOfferBoostState.class, str);
    }

    public static RtlOfferBoostState[] values() {
        return (RtlOfferBoostState[]) f.clone();
    }
}
