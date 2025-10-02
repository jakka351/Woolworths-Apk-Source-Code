package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/ServerErrorState;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageErrorState;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerErrorState extends HomePageErrorState {
    public final Text d;
    public final Boolean e;

    public ServerErrorState(Text text, Boolean bool) {
        this.d = text;
        this.e = bool;
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageErrorState
    public final void a(HomePageViewModel homePageViewModel) {
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageErrorState
    public final void b(HomePageViewModel homePageViewModel) {
        homePageViewModel.y6();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerErrorState)) {
            return false;
        }
        ServerErrorState serverErrorState = (ServerErrorState) obj;
        return Intrinsics.c(this.d, serverErrorState.d) && Intrinsics.c(this.e, serverErrorState.e);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getDrawableRes */
    public final int getG() {
        return R.drawable.empty_server_error_old;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getMessage */
    public final Text getE() {
        Text text = this.d;
        return text == null ? new ResText(R.string.home_page_server_error) : text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getSecondaryActionRes */
    public final int getF() {
        if (Intrinsics.c(this.e, Boolean.TRUE)) {
            return R.string.try_again_button_text;
        }
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getTitle */
    public final Text getD() {
        return new ResText(R.string.server_error_heading);
    }

    public final int hashCode() {
        Text text = this.d;
        int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
        Boolean bool = this.e;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ServerErrorState(messageText=" + this.d + ", canBeRetried=" + this.e + ")";
    }
}
