package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/ConnectionErrorState;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageErrorState;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConnectionErrorState extends HomePageErrorState {
    public static final ConnectionErrorState d = new ConnectionErrorState();

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageErrorState
    public final void a(HomePageViewModel homePageViewModel) {
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageErrorState
    public final void b(HomePageViewModel homePageViewModel) {
        homePageViewModel.y6();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConnectionErrorState);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getDrawableRes */
    public final int getG() {
        return R.drawable.empty_connection_error_old;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getMessage */
    public final Text getE() {
        return new ResText(R.string.home_page_connection_error);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getSecondaryActionRes */
    public final int getF() {
        return R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getTitle */
    public final Text getD() {
        return new ResText(R.string.no_network_heading);
    }

    public final int hashCode() {
        return -907520626;
    }

    public final String toString() {
        return "ConnectionErrorState";
    }
}
