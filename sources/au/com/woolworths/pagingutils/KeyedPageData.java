package au.com.woolworths.pagingutils;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/pagingutils/KeyedPageData;", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class KeyedPageData<K, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9173a;
    public final PageData b;

    public KeyedPageData(Object obj, PageData pageData) {
        Intrinsics.h(pageData, "pageData");
        this.f9173a = obj;
        this.b = pageData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyedPageData)) {
            return false;
        }
        KeyedPageData keyedPageData = (KeyedPageData) obj;
        return Intrinsics.c(this.f9173a, keyedPageData.f9173a) && Intrinsics.c(this.b, keyedPageData.b);
    }

    public final int hashCode() {
        Object obj = this.f9173a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "KeyedPageData(pageKey=" + this.f9173a + ", pageData=" + this.b + ")";
    }
}
