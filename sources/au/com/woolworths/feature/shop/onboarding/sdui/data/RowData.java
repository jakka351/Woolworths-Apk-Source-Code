package au.com.woolworths.feature.shop.onboarding.sdui.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/RowData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RowData {

    /* renamed from: a, reason: collision with root package name */
    public final IconAsset f7981a;
    public final String b;
    public final String c;

    public RowData(IconAsset iconAsset, String title, String str) {
        Intrinsics.h(title, "title");
        this.f7981a = iconAsset;
        this.b = title;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowData)) {
            return false;
        }
        RowData rowData = (RowData) obj;
        return Intrinsics.c(this.f7981a, rowData.f7981a) && Intrinsics.c(this.b, rowData.b) && Intrinsics.c(this.c, rowData.c);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.f7981a;
        return this.c.hashCode() + b.c((iconAsset == null ? 0 : iconAsset.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowData(icon=");
        sb.append(this.f7981a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return a.o(sb, this.c, ")");
    }
}
