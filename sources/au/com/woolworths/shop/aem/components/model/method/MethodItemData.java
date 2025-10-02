package au.com.woolworths.shop.aem.components.model.method;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/method/MethodItemData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MethodItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10175a;
    public final String b;
    public final String c;

    public MethodItemData(String str, String str2, String str3) {
        this.f10175a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodItemData)) {
            return false;
        }
        MethodItemData methodItemData = (MethodItemData) obj;
        return Intrinsics.c(this.f10175a, methodItemData.f10175a) && Intrinsics.c(this.b, methodItemData.b) && Intrinsics.c(this.c, methodItemData.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f10175a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("MethodItemData(title=", this.f10175a, ", content=", this.b, ", image="), this.c, ")");
    }
}
