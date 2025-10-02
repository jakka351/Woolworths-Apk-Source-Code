package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.android.onesite.models.text.ResText;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageRefreshErrorState;", "Lau/com/woolworths/feature/shop/homepage/presentation/RefreshErrorCause;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HomePageRefreshErrorState implements RefreshErrorCause {
    public static final HomePageRefreshErrorState d;
    public static final HomePageRefreshErrorState e;
    public static final /* synthetic */ HomePageRefreshErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        HomePageRefreshErrorState homePageRefreshErrorState = new HomePageRefreshErrorState() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageRefreshErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.feature.shop.homepage.presentation.RefreshErrorCause
            public final ResText getMessage() {
                return new ResText(R.string.error_no_network);
            }
        };
        d = homePageRefreshErrorState;
        HomePageRefreshErrorState homePageRefreshErrorState2 = new HomePageRefreshErrorState() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageRefreshErrorState.SERVER_ERROR
            @Override // au.com.woolworths.feature.shop.homepage.presentation.RefreshErrorCause
            public final ResText getMessage() {
                return new ResText(R.string.home_page_server_error);
            }
        };
        e = homePageRefreshErrorState2;
        HomePageRefreshErrorState[] homePageRefreshErrorStateArr = {homePageRefreshErrorState, homePageRefreshErrorState2};
        f = homePageRefreshErrorStateArr;
        g = EnumEntriesKt.a(homePageRefreshErrorStateArr);
    }

    public static HomePageRefreshErrorState valueOf(String str) {
        return (HomePageRefreshErrorState) Enum.valueOf(HomePageRefreshErrorState.class, str);
    }

    public static HomePageRefreshErrorState[] values() {
        return (HomePageRefreshErrorState[]) f.clone();
    }
}
