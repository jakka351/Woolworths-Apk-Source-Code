package au.com.woolworths.shared.ui.compose.brandlabel;

import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shared/ui/compose/brandlabel/RewardsBrandLabelStyle;", "Lau/com/woolworths/shared/ui/compose/brandlabel/BrandLabelSpec;", "", "shared-ui-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RewardsBrandLabelStyle implements BrandLabelSpec {
    public static final RewardsBrandLabelStyle d;
    public static final RewardsBrandLabelStyle e;
    public static final RewardsBrandLabelStyle f;
    public static final RewardsBrandLabelStyle g;
    public static final /* synthetic */ RewardsBrandLabelStyle[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        RewardsBrandLabelStyle rewardsBrandLabelStyle = new RewardsBrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.RewardsBrandLabelStyle.ACCENT_TINT
            public final long j = ToneColors.b;
            public final long k;
            public final long l;

            {
                long j = TintColors.e;
                this.k = j;
                this.l = j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getK() {
                return this.k;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getL() {
                return this.l;
            }
        };
        d = rewardsBrandLabelStyle;
        RewardsBrandLabelStyle rewardsBrandLabelStyle2 = new RewardsBrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.RewardsBrandLabelStyle.ALWAYS_TINT
            public final long j = ToneColors.b;
            public final long k;
            public final long l;

            {
                long j = TintColors.f5161a;
                this.k = j;
                this.l = j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getK() {
                return this.k;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getL() {
                return this.l;
            }
        };
        e = rewardsBrandLabelStyle2;
        RewardsBrandLabelStyle rewardsBrandLabelStyle3 = new RewardsBrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.RewardsBrandLabelStyle.INFO_TINT
            public final long j = ToneColors.c;
            public final long k;
            public final long l;

            {
                long j = TintColors.b;
                this.k = j;
                this.l = j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getK() {
                return this.k;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getL() {
                return this.l;
            }
        };
        f = rewardsBrandLabelStyle3;
        RewardsBrandLabelStyle rewardsBrandLabelStyle4 = new RewardsBrandLabelStyle() { // from class: au.com.woolworths.shared.ui.compose.brandlabel.RewardsBrandLabelStyle.STATUS_BACKGROUND_POSITIVE
            public final long j = ToneColors.c;
            public final long k;
            public final long l;

            {
                long j = RewardsBrandLabelStyleKt.f10092a;
                this.k = j;
                this.l = j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: a, reason: from getter */
            public final long getK() {
                return this.k;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: b, reason: from getter */
            public final long getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelSpec
            /* renamed from: c, reason: from getter */
            public final long getL() {
                return this.l;
            }
        };
        g = rewardsBrandLabelStyle4;
        RewardsBrandLabelStyle[] rewardsBrandLabelStyleArr = {rewardsBrandLabelStyle, rewardsBrandLabelStyle2, rewardsBrandLabelStyle3, rewardsBrandLabelStyle4};
        h = rewardsBrandLabelStyleArr;
        i = EnumEntriesKt.a(rewardsBrandLabelStyleArr);
    }

    public static RewardsBrandLabelStyle valueOf(String str) {
        return (RewardsBrandLabelStyle) Enum.valueOf(RewardsBrandLabelStyle.class, str);
    }

    public static RewardsBrandLabelStyle[] values() {
        return (RewardsBrandLabelStyle[]) h.clone();
    }
}
