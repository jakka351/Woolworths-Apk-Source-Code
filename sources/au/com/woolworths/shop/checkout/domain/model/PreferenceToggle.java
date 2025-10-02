package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PreferenceToggle;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PreferenceToggle {

    /* renamed from: a, reason: collision with root package name */
    public final PreferenceId f10631a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final InlineMessage g;

    public PreferenceToggle(PreferenceId preferenceId, boolean z, String str, String str2, String str3, boolean z2, InlineMessage inlineMessage) {
        this.f10631a = preferenceId;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceToggle)) {
            return false;
        }
        PreferenceToggle preferenceToggle = (PreferenceToggle) obj;
        return this.f10631a == preferenceToggle.f10631a && this.b == preferenceToggle.b && Intrinsics.c(this.c, preferenceToggle.c) && Intrinsics.c(this.d, preferenceToggle.d) && Intrinsics.c(this.e, preferenceToggle.e) && this.f == preferenceToggle.f && Intrinsics.c(this.g, preferenceToggle.g);
    }

    public final int hashCode() {
        int iE = b.e(b.c(b.c(b.c(b.e(this.f10631a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        InlineMessage inlineMessage = this.g;
        return iE + (inlineMessage == null ? 0 : inlineMessage.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferenceToggle(preferenceId=");
        sb.append(this.f10631a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", title=");
        a.B(sb, this.c, ", subtitle=", this.d, ", label=");
        d.A(this.e, ", value=", ", message=", sb, this.f);
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
