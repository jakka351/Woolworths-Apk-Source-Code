package au.com.woolworths.feature.rewards.offers.listpage;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/offers/listpage/OfferListPageViewModelKt$createAnalyticsScreen$1", "Lau/com/woolworths/android/onesite/analytics/Screen;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferListPageViewModelKt$createAnalyticsScreen$1 implements Screen {
    public final /* synthetic */ OfferListPageType d;
    public final /* synthetic */ String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6356a;

        static {
            int[] iArr = new int[OfferListPageType.values().length];
            try {
                OfferListPageType offerListPageType = OfferListPageType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferListPageType offerListPageType2 = OfferListPageType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OfferListPageType offerListPageType3 = OfferListPageType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OfferListPageType offerListPageType4 = OfferListPageType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6356a = iArr;
        }
    }

    public OfferListPageViewModelKt$createAnalyticsScreen$1(OfferListPageType offerListPageType, String str) {
        this.d = offerListPageType;
        this.e = str;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    public final String a() {
        return "Boosters";
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    public final String b() {
        return WhenMappings.f6356a[this.d.ordinal()] == 3 ? "weekly_boosters_screen" : YU.a.g(this.e, "_screen");
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    public final String d() {
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            return "Offers";
        }
        if (iOrdinal == 1) {
            return "Ended offers";
        }
        if (iOrdinal == 2) {
            return "Weekly boosters";
        }
        if (iOrdinal == 3) {
            return "New to Woolworths";
        }
        throw new NoWhenBranchMatchedException();
    }
}
