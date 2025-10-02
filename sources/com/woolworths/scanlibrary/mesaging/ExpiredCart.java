package com.woolworths.scanlibrary.mesaging;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.UserManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/mesaging/ExpiredCart;", "Lcom/woolworths/scanlibrary/mesaging/Message;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpiredCart extends Message {
    public final UserManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiredCart(Map map, UserManager userManager) {
        super(map);
        Intrinsics.h(userManager, "userManager");
        this.b = userManager;
    }

    @Override // com.woolworths.scanlibrary.mesaging.Message
    public final int a() {
        return 4;
    }

    @Override // com.woolworths.scanlibrary.mesaging.Message
    public final void b() {
        CartSessionManager cartSessionManagerE;
        UserComponent userComponent = this.b.k;
        if (userComponent == null || (cartSessionManagerE = userComponent.e()) == null) {
            return;
        }
        cartSessionManagerE.b();
    }

    @Override // com.woolworths.scanlibrary.mesaging.Message
    public final boolean c() {
        CartSessionManager cartSessionManagerE;
        UserManager userManager = this.b;
        UserComponent userComponent = userManager.k;
        String strC = (userComponent == null || (cartSessionManagerE = userComponent.e()) == null) ? null : cartSessionManagerE.c();
        if (strC == null) {
            strC = "";
        }
        if (userManager.a()) {
            return strC.length() == 0 || strC.equals(this.f21210a.get("cartid"));
        }
        return false;
    }
}
