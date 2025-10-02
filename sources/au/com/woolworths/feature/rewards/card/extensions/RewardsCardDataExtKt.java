package au.com.woolworths.feature.rewards.card.extensions;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"card_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardDataExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5821a;

        static {
            int[] iArr = new int[RewardsCardTypeData.values().length];
            try {
                iArr[RewardsCardTypeData.STAFF_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsCardTypeData.LOYALTY_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5821a = iArr;
        }
    }
}
