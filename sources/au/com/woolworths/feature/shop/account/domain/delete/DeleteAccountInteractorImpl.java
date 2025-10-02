package au.com.woolworths.feature.shop.account.domain.delete;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.login.LogOutInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/domain/delete/DeleteAccountInteractorImpl;", "Lau/com/woolworths/feature/shop/account/domain/delete/DeleteAccountInteractor;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountInteractorImpl implements DeleteAccountInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DeleteAccountRepository f6568a;
    public final GuestLoginInteractorImpl b;
    public final LogOutInteractorImpl c;
    public final InStoreWifiInteractor d;
    public final ShoppingListSyncInteractor e;
    public final OkHttpClient f;

    public DeleteAccountInteractorImpl(DeleteAccountRepository deleteAccountRepository, GuestLoginInteractorImpl guestLoginInteractorImpl, LogOutInteractorImpl logOutInteractorImpl, InStoreWifiInteractor inStoreWifiInteractor, ShoppingListSyncInteractor shoppingListSyncInteractor, OkHttpClient okHttpClient) {
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(okHttpClient, "okHttpClient");
        this.f6568a = deleteAccountRepository;
        this.b = guestLoginInteractorImpl;
        this.c = logOutInteractorImpl;
        this.d = inStoreWifiInteractor;
        this.e = shoppingListSyncInteractor;
        this.f = okHttpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r6.c.a(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl$logout$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl$logout$1 r0 = (au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl$logout$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl$logout$1 r0 = new au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl$logout$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L61
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.b(r7)
            goto L56
        L39:
            kotlin.ResultKt.b(r7)
            goto L4b
        L3d:
            kotlin.ResultKt.b(r7)
            r0.r = r5
            au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor r7 = r6.d
            java.lang.Object r7 = r7.h(r0)
            if (r7 != r1) goto L4b
            goto L60
        L4b:
            r0.r = r4
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r7 = r6.e
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L56
            goto L60
        L56:
            r0.r = r3
            au.com.woolworths.feature.shop.login.LogOutInteractorImpl r7 = r6.c
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
