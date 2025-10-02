package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderItem;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionOptionHeaderItem {

    /* renamed from: a, reason: collision with root package name */
    public final SectionOptionHeaderSelectionType f8394a;
    public final SectionOptionHeaderIconType b;
    public final String c;
    public final String d;
    public final Function0 e;

    public SectionOptionHeaderItem(SectionOptionHeaderSelectionType sectionOptionHeaderSelectionType, SectionOptionHeaderIconType sectionOptionHeaderIconType, String str, String str2, Function0 function0) {
        this.f8394a = sectionOptionHeaderSelectionType;
        this.b = sectionOptionHeaderIconType;
        this.c = str;
        this.d = str2;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionOptionHeaderItem)) {
            return false;
        }
        SectionOptionHeaderItem sectionOptionHeaderItem = (SectionOptionHeaderItem) obj;
        return Intrinsics.c(this.f8394a, sectionOptionHeaderItem.f8394a) && Intrinsics.c(this.b, sectionOptionHeaderItem.b) && Intrinsics.c(this.c, sectionOptionHeaderItem.c) && Intrinsics.c(this.d, sectionOptionHeaderItem.d) && Intrinsics.c(this.e, sectionOptionHeaderItem.e);
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c((this.b.hashCode() + (this.f8394a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Function0 function0 = this.e;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionOptionHeaderItem(sectionType=");
        sb.append(this.f8394a);
        sb.append(", iconType=");
        sb.append(this.b);
        sb.append(", title=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", subtitle=", this.d, ", onDeleteClicked=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
