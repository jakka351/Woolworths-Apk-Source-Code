package au.com.woolworths.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetContract;", "", "ViewState", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HealthierBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetContract$ViewState;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f9286a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public ViewState(String title, String content, String str, ArrayList arrayList) {
            Intrinsics.h(title, "title");
            Intrinsics.h(content, "content");
            this.f9286a = title;
            this.b = content;
            this.c = str;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f9286a, viewState.f9286a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d.equals(viewState.d);
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(this.f9286a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ViewState(title=", this.f9286a, ", content=", this.b, ", markdownContent=");
            sbV.append(this.c);
            sbV.append(", links=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
