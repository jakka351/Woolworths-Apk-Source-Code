package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/ServerErrorState;", "Lau/com/woolworths/feature/shop/login/LoginFullPageErrorState;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerErrorState extends LoginFullPageErrorState {
    public final Text d;
    public final Boolean e;

    public ServerErrorState(Text text, Boolean bool) {
        this.d = text;
        this.e = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getE() {
        return this.e;
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
    public final int getDrawableRes() {
        return com.woolworths.R.drawable.empty_server_error_old;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        Text text = this.d;
        return text == null ? new ResText(com.woolworths.R.string.login_generic_error_message) : text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        if (Intrinsics.c(this.e, Boolean.TRUE)) {
            return com.woolworths.R.string.try_again_button_text;
        }
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getTitle() {
        return new ResText(com.woolworths.R.string.server_error_heading);
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
