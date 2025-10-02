package au.com.woolworths.shop.aem.components.model.bottomsheet;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/bottomsheet/StaticBottomSheetData;", "Lau/com/woolworths/shop/aem/components/model/bottomsheet/GenericPageBottomSheetItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StaticBottomSheetData implements GenericPageBottomSheetItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10143a;
    public final String b;
    public final List c;

    public StaticBottomSheetData(String str, String str2, List list) {
        this.f10143a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticBottomSheetData)) {
            return false;
        }
        StaticBottomSheetData staticBottomSheetData = (StaticBottomSheetData) obj;
        return Intrinsics.c(this.f10143a, staticBottomSheetData.f10143a) && Intrinsics.c(this.b, staticBottomSheetData.b) && Intrinsics.c(this.c, staticBottomSheetData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f10143a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.t(YU.a.v("StaticBottomSheetData(id=", this.f10143a, ", title=", this.b, ", staticBottomSheetItems="), this.c, ")");
    }
}
