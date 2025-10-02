package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageFooterData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DynamicPageFooterData {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicPageActionData f5186a;

    public DynamicPageFooterData(DynamicPageActionData dynamicPageActionData) {
        this.f5186a = dynamicPageActionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicPageFooterData) && Intrinsics.c(this.f5186a, ((DynamicPageFooterData) obj).f5186a);
    }

    public final int hashCode() {
        return this.f5186a.hashCode();
    }

    public final String toString() {
        return "DynamicPageFooterData(action=" + this.f5186a + ")";
    }
}
