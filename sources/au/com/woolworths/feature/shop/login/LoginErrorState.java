package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginErrorState;", "Lau/com/woolworths/feature/shop/login/LoginFullPageErrorState;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LoginErrorState extends LoginFullPageErrorState {
    public final ResText d;

    public LoginErrorState(ResText resText) {
        this.d = resText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginErrorState) && Intrinsics.c(this.d, ((LoginErrorState) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        ResText resText = this.d;
        return resText != null ? resText : new ResText(com.woolworths.R.string.login_generic_error_message);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return com.woolworths.R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(com.woolworths.R.string.login_generic_error_title);
    }

    public final int hashCode() {
        ResText resText = this.d;
        if (resText == null) {
            return 0;
        }
        return resText.hashCode();
    }

    public final String toString() {
        return "LoginErrorState(messageResText=" + this.d + ")";
    }
}
