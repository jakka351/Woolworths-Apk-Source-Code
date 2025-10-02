package com.woolworths.scanlibrary.ui.stores;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/stores/AvailableStoreViewModel$trackError$1", "Lau/com/woolworths/android/onesite/analytics/Action;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AvailableStoreViewModel$trackError$1 implements Action {
    public final Screens d = Screens.p;
    public final Category e = Category.v;
    public final String f = "Try again. Check your internet connection";

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
