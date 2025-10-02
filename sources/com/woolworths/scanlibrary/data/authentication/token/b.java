package com.woolworths.scanlibrary.data.authentication.token;

import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.data.cart.CartImp;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.exit.GetFireStoreAccessUC;
import com.woolworths.scanlibrary.domain.login.RewardSignInPreAuthUC;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.Store;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function, BiFunction, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((i) this.e).invoke(obj);
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 0:
                a aVar = (a) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) aVar.invoke(p0);
            case 1:
                i iVar = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) iVar.invoke(p0);
            case 2:
            case 10:
            default:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar2 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar2.invoke(p0);
            case 3:
                i iVar2 = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) iVar2.invoke(p0);
            case 4:
                i iVar3 = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) iVar3.invoke(p0);
            case 5:
                i iVar4 = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) iVar4.invoke(p0);
            case 6:
                l lVar = (l) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) lVar.invoke(p0);
            case 7:
                l lVar2 = (l) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) lVar2.invoke(p0);
            case 8:
                l lVar3 = (l) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) lVar3.invoke(p0);
            case 9:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar3 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetFireStoreAccessUC.ResponseValue) aVar3.invoke(p0);
            case 11:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar4 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Token) aVar4.invoke(p0);
            case 12:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar5 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar5.invoke(p0);
            case 13:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar6 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar6.invoke(p0);
            case 14:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar7 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar7.invoke(p0);
            case 15:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar8 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (RewardSignInPreAuthUC.ResponseValue) aVar8.invoke(p0);
            case 16:
                com.woolworths.scanlibrary.domain.login.b bVar = (com.woolworths.scanlibrary.domain.login.b) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) bVar.invoke(p0);
            case 17:
                com.woolworths.scanlibrary.domain.login.a aVar9 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar9.invoke(p0);
            case 18:
                com.woolworths.scanlibrary.domain.login.a aVar10 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar10.invoke(p0);
            case 19:
                com.woolworths.scanlibrary.domain.login.a aVar11 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar11.invoke(p0);
            case 20:
                com.woolworths.scanlibrary.domain.login.b bVar2 = (com.woolworths.scanlibrary.domain.login.b) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) bVar2.invoke(p0);
            case 21:
                com.woolworths.scanlibrary.domain.login.a aVar12 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar12.invoke(p0);
            case 22:
                com.woolworths.scanlibrary.domain.login.a aVar13 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar13.invoke(p0);
            case 23:
                au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b bVar3 = (au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) bVar3.invoke(p0);
            case 24:
                com.woolworths.scanlibrary.domain.login.b bVar4 = (com.woolworths.scanlibrary.domain.login.b) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) bVar4.invoke(p0);
            case 25:
                com.woolworths.scanlibrary.domain.login.a aVar14 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar14.invoke(p0);
            case 26:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar15 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (AuthResponse) aVar15.invoke(p0);
            case 27:
                com.woolworths.scanlibrary.domain.login.a aVar16 = (com.woolworths.scanlibrary.domain.login.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar16.invoke(p0);
            case 28:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar17 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar17.invoke(p0);
        }
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        CartSessionManager cartSessionManager = (CartSessionManager) this.e;
        Store storeDetailsResponse = (Store) obj;
        CartResponse getCartResponse = (CartResponse) obj2;
        Intrinsics.h(storeDetailsResponse, "storeDetailsResponse");
        Intrinsics.h(getCartResponse, "getCartResponse");
        SessionInfo sessionInfo = cartSessionManager.f;
        sessionInfo.f21155a.setValue(sessionInfo, SessionInfo.k[0], Integer.valueOf(storeDetailsResponse.getNo()));
        sessionInfo.c(storeDetailsResponse.getName());
        CartImp cartImp = new CartImp();
        Iterator<T> it = getCartResponse.getItems().iterator();
        while (it.hasNext()) {
            cartImp.I((Item) it.next(), false);
        }
        cartImp.F(getCartResponse);
        cartSessionManager.d(storeDetailsResponse, cartImp);
        return storeDetailsResponse;
    }
}
