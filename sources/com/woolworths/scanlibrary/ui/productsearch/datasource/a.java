package com.woolworths.scanlibrary.ui.productsearch.datasource;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.Status;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PagedKeyProductSearchDataSource e;

    public /* synthetic */ a(PagedKeyProductSearchDataSource pagedKeyProductSearchDataSource, Object obj, Object obj2, int i) {
        this.d = i;
        this.e = pagedKeyProductSearchDataSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        PagedKeyProductSearchDataSource pagedKeyProductSearchDataSource = this.e;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                MutableLiveData mutableLiveData = pagedKeyProductSearchDataSource.g;
                NetworkState networkState = NetworkState.d;
                Intrinsics.e(th);
                mutableLiveData.j(new NetworkState(Status.f, pagedKeyProductSearchDataSource.f.getString(R.string.sng_product_search_load_error), th));
                break;
            default:
                NetworkState networkState2 = NetworkState.d;
                Intrinsics.e(th);
                NetworkState networkState3 = new NetworkState(Status.f, pagedKeyProductSearchDataSource.f.getString(R.string.sng_product_search_load_error), th);
                pagedKeyProductSearchDataSource.g.j(networkState3);
                pagedKeyProductSearchDataSource.h.j(networkState3);
                break;
        }
        return unit;
    }
}
