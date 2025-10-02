package com.woolworths.scanlibrary.ui.productsearch;

import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchActivity e;

    public /* synthetic */ a(SearchActivity searchActivity, int i) {
        this.d = i;
        this.e = searchActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        SearchActivity searchActivity = this.e;
        switch (i) {
            case 0:
                int i2 = SearchActivity.M;
                return searchActivity.Q4();
            default:
                int i3 = SearchActivity.M;
                MediatorLiveData mediatorLiveData = searchActivity.V4().q;
                NumericPageListing numericPageListing = mediatorLiveData != null ? (NumericPageListing) mediatorLiveData.e() : null;
                if (numericPageListing != null) {
                    PageListingKt.a(numericPageListing);
                }
                return Unit.f24250a;
        }
    }
}
