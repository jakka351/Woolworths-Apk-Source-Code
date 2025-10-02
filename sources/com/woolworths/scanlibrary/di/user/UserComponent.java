package com.woolworths.scanlibrary.di.user;

import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepositoryImpl;
import com.woolworths.scanlibrary.di.scope.UserScope;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.GetProfileUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.transfertopos.RecallConfirmAtPosUC;
import dagger.Subcomponent;
import kotlin.Metadata;

@UserScope
@Subcomponent
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/di/user/UserComponent;", "", "Builder", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UserComponent {

    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/di/user/UserComponent$Builder;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        Builder a(UserModule userModule);

        UserComponent build();
    }

    AutoCompleteUC a();

    ProductSearchUC b();

    void c(UserManager userManager);

    SessionInfo d();

    CartSessionManager e();

    RecallConfirmAtPosUC f();

    GetReceiptWithCartIdUC g();

    GetProfileUC h();

    FireStoreDataRepositoryImpl i();
}
