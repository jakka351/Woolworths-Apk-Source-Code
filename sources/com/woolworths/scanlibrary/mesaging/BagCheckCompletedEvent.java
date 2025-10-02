package com.woolworths.scanlibrary.mesaging;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.UserManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/mesaging/BagCheckCompletedEvent;", "Lcom/woolworths/scanlibrary/mesaging/Message;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BagCheckCompletedEvent extends Message {
    public final UserManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BagCheckCompletedEvent(Map map, UserManager userManager) {
        super(map);
        Intrinsics.h(userManager, "userManager");
        this.b = userManager;
    }

    @Override // com.woolworths.scanlibrary.mesaging.Message
    public final int a() {
        return 16;
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
        return true;
    }
}
