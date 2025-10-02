package au.com.woolworths.sdui.legacy.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/legacy/banner/BannerAction;", "", "legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BannerAction {

    /* renamed from: a, reason: collision with root package name */
    public final InlineErrorAction f10000a;
    public final boolean b;
    public final ActionPlacement c;
    public final Function0 d;
    public final boolean e;
    public final boolean f;

    public BannerAction(InlineErrorAction action, boolean z, ActionPlacement actionPlacement, Function0 onActionClick) {
        Intrinsics.h(action, "action");
        Intrinsics.h(onActionClick, "onActionClick");
        this.f10000a = action;
        this.b = z;
        this.c = actionPlacement;
        this.d = onActionClick;
        boolean z2 = false;
        this.e = z && actionPlacement == ActionPlacement.BOTTOM;
        if (z && actionPlacement == ActionPlacement.RIGHT) {
            z2 = true;
        }
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAction)) {
            return false;
        }
        BannerAction bannerAction = (BannerAction) obj;
        return Intrinsics.c(this.f10000a, bannerAction.f10000a) && this.b == bannerAction.b && this.c == bannerAction.c && Intrinsics.c(this.d, bannerAction.d);
    }

    public final int hashCode() {
        int iE = androidx.camera.core.impl.b.e(this.f10000a.hashCode() * 31, 31, this.b);
        ActionPlacement actionPlacement = this.c;
        return this.d.hashCode() + ((iE + (actionPlacement == null ? 0 : actionPlacement.hashCode())) * 31);
    }

    public final String toString() {
        return "BannerAction(action=" + this.f10000a + ", showAction=" + this.b + ", placement=" + this.c + ", onActionClick=" + this.d + ")";
    }
}
