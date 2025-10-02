package au.com.woolworths.foundation.rewards.common.ui.info.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData;", "", "IconSpecs", "RemoteIconSpecs", "LocalIconSpecs", "MessageData", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsInfoBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final IconSpecs f8593a;
    public final String b;
    public final MessageData c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$IconSpecs;", "", "Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$LocalIconSpecs;", "Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$RemoteIconSpecs;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class IconSpecs {

        /* renamed from: a, reason: collision with root package name */
        public final float f8594a;
        public final float b;

        public IconSpecs(float f, float f2) {
            this.f8594a = f;
            this.b = f2;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$LocalIconSpecs;", "Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$IconSpecs;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalIconSpecs extends IconSpecs {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$MessageData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageData {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8595a;

        public MessageData(Integer num) {
            this.f8595a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageData) && Intrinsics.c(this.f8595a, ((MessageData) obj).f8595a);
        }

        public final int hashCode() {
            Integer num = this.f8595a;
            return 973045312 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "MessageData(message=This is the content to display This is the content to display This is the content to display This is the content to display , messageIconRes=" + this.f8595a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$RemoteIconSpecs;", "Lau/com/woolworths/foundation/rewards/common/ui/info/banner/RewardsInfoBannerData$IconSpecs;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteIconSpecs extends IconSpecs {
    }

    public RewardsInfoBannerData(IconSpecs iconSpecs, String str, MessageData messageData) {
        this.f8593a = iconSpecs;
        this.b = str;
        this.c = messageData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsInfoBannerData)) {
            return false;
        }
        RewardsInfoBannerData rewardsInfoBannerData = (RewardsInfoBannerData) obj;
        return Intrinsics.c(this.f8593a, rewardsInfoBannerData.f8593a) && Intrinsics.c(this.b, rewardsInfoBannerData.b) && Intrinsics.c(this.c, rewardsInfoBannerData.c);
    }

    public final int hashCode() {
        IconSpecs iconSpecs = this.f8593a;
        int iHashCode = (iconSpecs == null ? 0 : iconSpecs.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MessageData messageData = this.c;
        return (iHashCode2 + (messageData != null ? messageData.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "RewardsInfoBannerData(iconSpec=" + this.f8593a + ", title=" + this.b + ", messageData=" + this.c + ", altText=null, onClick=null)";
    }
}
