package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/ConnectionErrorState;", "Lau/com/woolworths/feature/shop/login/LoginFullPageErrorState;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConnectionErrorState extends LoginFullPageErrorState {
    public static final ConnectionErrorState d = new ConnectionErrorState();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConnectionErrorState);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return com.woolworths.R.drawable.empty_connection_error_old;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        return new ResText(com.woolworths.R.string.login_connection_error_message);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return com.woolworths.R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(com.woolworths.R.string.no_network_heading);
    }

    public final int hashCode() {
        return -426299233;
    }

    public final String toString() {
        return "ConnectionErrorState";
    }
}
