package au.com.woolworths.feature.shop.contentpage.data.infotile;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileCta;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoTileCta {

    /* renamed from: a, reason: collision with root package name */
    public final String f7025a;
    public final ActionData b;

    public InfoTileCta(String str, ActionData actionData) {
        this.f7025a = str;
        this.b = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileCta)) {
            return false;
        }
        InfoTileCta infoTileCta = (InfoTileCta) obj;
        return Intrinsics.c(this.f7025a, infoTileCta.f7025a) && Intrinsics.c(this.b, infoTileCta.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7025a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoTileCta(label=" + this.f7025a + ", action=" + this.b + ")";
    }
}
