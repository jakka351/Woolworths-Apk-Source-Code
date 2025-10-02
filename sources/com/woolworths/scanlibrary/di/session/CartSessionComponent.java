package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.CartSessionScope;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import dagger.Subcomponent;
import kotlin.Metadata;

@Subcomponent
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/di/session/CartSessionComponent;", "", "Builder", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CartSessionScope
/* loaded from: classes7.dex */
public interface CartSessionComponent {

    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/di/session/CartSessionComponent$Builder;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        Builder a(CartSessionModule cartSessionModule);

        CartSessionComponent build();
    }

    void a(CartSessionManager cartSessionManager);
}
