package au.com.woolworths.shop.lists.data.repository;

import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {407, 408, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE}, m = "removeOrphanedProducts")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1 extends ContinuationImpl {
    public List p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$removeOrphanedProducts$1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shoppingListItemsLocalRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return ShoppingListItemsLocalRepositoryImpl.u(this.r, this);
    }
}
