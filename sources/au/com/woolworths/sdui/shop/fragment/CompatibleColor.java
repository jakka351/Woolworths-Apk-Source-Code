package au.com.woolworths.sdui.shop.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/CompatibleColor;", "Lcom/apollographql/apollo/api/Fragment$Data;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompatibleColor implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10042a;

    public CompatibleColor(String str) {
        this.f10042a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompatibleColor) && Intrinsics.c(this.f10042a, ((CompatibleColor) obj).f10042a);
    }

    public final int hashCode() {
        return this.f10042a.hashCode();
    }

    public final String toString() {
        return a.h("CompatibleColor(lightHexCode=", this.f10042a, ")");
    }
}
