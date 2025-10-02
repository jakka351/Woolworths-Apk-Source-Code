package au.com.woolworths.product.details.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ui/CollapsibleContentUiModel;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollapsibleContentUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9315a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public CollapsibleContentUiModel(String title, String content, String str, boolean z, boolean z2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        this.f9315a = title;
        this.b = content;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollapsibleContentUiModel)) {
            return false;
        }
        CollapsibleContentUiModel collapsibleContentUiModel = (CollapsibleContentUiModel) obj;
        return Intrinsics.c(this.f9315a, collapsibleContentUiModel.f9315a) && Intrinsics.c(this.b, collapsibleContentUiModel.b) && Intrinsics.c(this.c, collapsibleContentUiModel.c) && this.d == collapsibleContentUiModel.d && this.e == collapsibleContentUiModel.e;
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.f9315a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CollapsibleContentUiModel(title=", this.f9315a, ", content=", this.b, ", framedContent=");
        d.A(this.c, ", isCollapsable=", ", isCollapsed=", sbV, this.d);
        return YU.a.k(")", sbV, this.e);
    }
}
