package au.com.woolworths.pagingutils;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/pagingutils/PageKeyedPagingSourceFactory;", "", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class PageKeyedPagingSourceFactory<K, T> {

    /* renamed from: a, reason: collision with root package name */
    public PageData f9176a;
    public final SuspendLambda b;
    public final MutableLiveData c = new MutableLiveData();

    /* JADX WARN: Multi-variable type inference failed */
    public PageKeyedPagingSourceFactory(PageData pageData, Function3 function3) {
        this.f9176a = pageData;
        this.b = (SuspendLambda) function3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    public final PageKeyedPagingSource a() {
        PageKeyedPagingSource pageKeyedPagingSource = new PageKeyedPagingSource(this.f9176a, this.b);
        pageKeyedPagingSource.f3581a.b(new a(this, 23));
        this.c.j(pageKeyedPagingSource);
        return pageKeyedPagingSource;
    }
}
