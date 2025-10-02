package au.com.woolworths.android.onesite.modules.rewards.data;

import au.com.woolworths.android.onesite.modules.common.Region;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCardDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4395a;

        static {
            int[] iArr = new int[RewardsCardMode.values().length];
            try {
                RewardsCardMode rewardsCardMode = RewardsCardMode.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4395a = iArr;
        }
    }

    public static final Region a(RewardsCardData rewardsCardData) {
        String regionData;
        if (rewardsCardData != null && (regionData = rewardsCardData.getRegionData()) != null) {
            Region.h.getClass();
            Region regionA = Region.Companion.a(regionData);
            return regionA == null ? Region.i : regionA;
        }
        if (rewardsCardData == null) {
            return Region.i;
        }
        String modeData = rewardsCardData.getModeData();
        RewardsCardMode rewardsCardMode = null;
        if (modeData != null) {
            String upperCase = modeData.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            if (upperCase.equals("DEFAULT")) {
                rewardsCardMode = RewardsCardMode.d;
            } else if (upperCase.equals("LIMITED")) {
                rewardsCardMode = RewardsCardMode.e;
            }
        }
        if (rewardsCardMode == null) {
            rewardsCardMode = RewardsCardMode.d;
        }
        return WhenMappings.f4395a[rewardsCardMode.ordinal()] == 1 ? Region.j : Region.i;
    }

    public static final RewardsCardData b(RewardsCardData rewardsCardData, RewardsCardUpdate update) {
        Intrinsics.h(update, "update");
        return RewardsCardData.a(rewardsCardData, update.getNumber(), update.getDisplayCardNumber(), update.getDisplayName(), null, update.getCcv(), 104);
    }
}
