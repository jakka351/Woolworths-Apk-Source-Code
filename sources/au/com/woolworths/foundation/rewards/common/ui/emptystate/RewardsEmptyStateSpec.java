package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/emptystate/RewardsEmptyStateSpec;", "", "Companion", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsEmptyStateSpec {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8580a;
    public final IconAsset b;
    public final Dp c;
    public final String d;
    public final String e;
    public final ImageVector f;
    public final String g;
    public final EmptyStateButtonData h;
    public final RewardsEmptyStateStyle i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/emptystate/RewardsEmptyStateSpec$Companion;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static RewardsEmptyStateSpec a(IconAsset iconAsset, String str, String str2, ImageVector imageVector, EmptyStateButtonData emptyStateButtonData, int i) {
            return new RewardsEmptyStateSpec(null, iconAsset, str, str2, (i & 16) != 0 ? null : imageVector, (i & 64) != 0 ? null : emptyStateButtonData, RewardsEmptyStateStyle.d, 1);
        }

        public static RewardsEmptyStateSpec b(RewardsEmptyStateData data, RewardsEmptyStateStyle rewardsEmptyStateStyle) {
            Intrinsics.h(data, "data");
            Integer numValueOf = Integer.valueOf(data.getIcon());
            String iconUrl = data.getIconUrl();
            return new RewardsEmptyStateSpec(numValueOf, iconUrl != null ? new IconAsset.HostedIcon(iconUrl) : null, data.getTitle(), data.getMessage(), null, data.getButton(), rewardsEmptyStateStyle, 100);
        }
    }

    public RewardsEmptyStateSpec(Integer num, IconAsset iconAsset, String str, String str2, ImageVector imageVector, EmptyStateButtonData emptyStateButtonData, RewardsEmptyStateStyle rewardsEmptyStateStyle, int i) {
        num = (i & 1) != 0 ? null : num;
        imageVector = (i & 32) != 0 ? null : imageVector;
        this.f8580a = num;
        this.b = iconAsset;
        this.c = null;
        this.d = str;
        this.e = str2;
        this.f = imageVector;
        this.g = null;
        this.h = emptyStateButtonData;
        this.i = rewardsEmptyStateStyle;
    }
}
