package au.com.woolworths.shop.aem.components.model.verticallist;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListActionData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VerticalListActionData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10185a;
    public final ActionData b;

    public VerticalListActionData(String str, ActionData actionData) {
        this.f10185a = str;
        this.b = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalListActionData)) {
            return false;
        }
        VerticalListActionData verticalListActionData = (VerticalListActionData) obj;
        return Intrinsics.c(this.f10185a, verticalListActionData.f10185a) && Intrinsics.c(this.b, verticalListActionData.b);
    }

    public final int hashCode() {
        String str = this.f10185a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "VerticalListActionData(actionTitle=" + this.f10185a + ", action=" + this.b + ")";
    }
}
