package au.com.woolworths.pagingutils;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.LivePagedList;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/pagingutils/NumericPageListing;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lau/com/woolworths/pagingutils/PageListing;", "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NumericPageListing<T> implements PageListing<Integer, T> {

    /* renamed from: a, reason: collision with root package name */
    public final LivePagedList f9175a;
    public final MediatorLiveData b;
    public final MediatorLiveData c;
    public final Function0 d;
    public final MutableLiveData e;
    public final MutableLiveData f;

    public NumericPageListing(LivePagedList livePagedList, MediatorLiveData mediatorLiveData, MediatorLiveData mediatorLiveData2, Function0 function0, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2) {
        this.f9175a = livePagedList;
        this.b = mediatorLiveData;
        this.c = mediatorLiveData2;
        this.d = function0;
        this.e = mutableLiveData;
        this.f = mutableLiveData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumericPageListing)) {
            return false;
        }
        NumericPageListing numericPageListing = (NumericPageListing) obj;
        return this.f9175a.equals(numericPageListing.f9175a) && this.b.equals(numericPageListing.b) && this.c.equals(numericPageListing.c) && Intrinsics.c(this.d, numericPageListing.d) && this.e.equals(numericPageListing.e) && this.f.equals(numericPageListing.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f9175a.hashCode() * 31)) * 31)) * 31;
        Function0 function0 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "NumericPageListing(pagedList=" + this.f9175a + ", networkState=" + this.b + ", initialLoad=" + this.c + ", refresh=" + this.d + ", totalCount=" + this.e + ", lastLoadedPage=" + this.f + ")";
    }
}
