package au.com.woolworths.feature.shop.recipes.freshmag.home.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/data/FreshMagHomeData;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FreshMagHomeData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8052a;

    public FreshMagHomeData(ArrayList arrayList) {
        this.f8052a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreshMagHomeData) && this.f8052a.equals(((FreshMagHomeData) obj).f8052a);
    }

    public final int hashCode() {
        return this.f8052a.hashCode();
    }

    public final String toString() {
        return a.k("FreshMagHomeData(items=", ")", this.f8052a);
    }
}
