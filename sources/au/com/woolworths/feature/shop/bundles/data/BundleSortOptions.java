package au.com.woolworths.feature.shop.bundles.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleSortOptions;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleSortOptions {

    /* renamed from: a, reason: collision with root package name */
    public final String f6761a;
    public final ArrayList b;

    public BundleSortOptions(String str, ArrayList arrayList) {
        this.f6761a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleSortOptions)) {
            return false;
        }
        BundleSortOptions bundleSortOptions = (BundleSortOptions) obj;
        return this.f6761a.equals(bundleSortOptions.f6761a) && this.b.equals(bundleSortOptions.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6761a.hashCode() * 31);
    }

    public final String toString() {
        return d.q("BundleSortOptions(title=", this.f6761a, ", options=", ")", this.b);
    }
}
