package au.com.woolworths.shop.specials;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/ServerErrorState;", "Lau/com/woolworths/shop/specials/SpecialsHomePageErrorState;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServerErrorState extends SpecialsHomePageErrorState {
    public final Text d;
    public final Boolean e;

    public ServerErrorState(Text text, Boolean bool) {
        this.d = text;
        this.e = bool;
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
        return com.woolworths.R.drawable.empty_server_error;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final Text getMessage() {
        Text text = this.d;
        return text == null ? new ResText(com.woolworths.R.string.specials_server_error) : text;
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
