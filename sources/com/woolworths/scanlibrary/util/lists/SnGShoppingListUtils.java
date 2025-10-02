package com.woolworths.scanlibrary.util.lists;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/lists/SnGShoppingListUtils;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnGShoppingListUtils {

    /* renamed from: a, reason: collision with root package name */
    public final ScanNGoRepository f21370a;
    public final UserConfigurations b;
    public final ListsInMemoryRepository c;
    public final ShoppingListLocalRepository d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/util/lists/SnGShoppingListUtils$Companion;", "", "", "MAX_ALLOWED_API_RETURN_TIME_MS", "J", "", "EMPTY_ID", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SnGShoppingListUtils(ScanNGoRepository scanNGoRepository, UserConfigurations userConfigurations, ListsInMemoryRepository listsInMemoryRepository, ShoppingListLocalRepository shoppingListLocalRepository) {
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        this.f21370a = scanNGoRepository;
        this.b = userConfigurations;
        this.c = listsInMemoryRepository;
        this.d = shoppingListLocalRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Integer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$1 r0 = (com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$1 r0 = new com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            kotlin.ResultKt.b(r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            return r7
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            kotlin.ResultKt.b(r7)
            if (r6 == 0) goto L52
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$2 r2 = new com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getCartResponse$2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            r2.<init>(r5, r6, r4)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            r0.r = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L48
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        L48:
            timber.log.Timber$Forest r6 = timber.log.Timber.f27013a
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "Unable to fetch S&G cart items : It took more than 20000ms to fetch"
            r6.o(r0, r7)
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils.a(java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getListScreenIntent$1
            if (r0 == 0) goto L13
            r0 = r8
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getListScreenIntent$1 r0 = (com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getListScreenIntent$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getListScreenIntent$1 r0 = new com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getListScreenIntent$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.b(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L4b
        L38:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r8 = r6.c
            r0.p = r8
            r0.s = r3
            java.lang.Object r7 = r6.c(r7, r0)
            if (r7 != r1) goto L48
            goto L62
        L48:
            r5 = r8
            r8 = r7
            r7 = r5
        L4b:
            au.com.woolworths.android.onesite.products.models.ListExtras r8 = (au.com.woolworths.android.onesite.products.models.ListExtras) r8
            r7.getClass()
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.h(r8, r2)
            r7.e = r8
            r7 = 0
            r0.p = r7
            r0.s = r4
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            java.lang.String r8 = (java.lang.String) r8
            int r7 = r8.length()
            if (r7 != 0) goto L74
            au.com.woolworths.android.onesite.navigation.Activities$SngListsActivity r7 = au.com.woolworths.android.onesite.navigation.Activities.SngListsActivity.f4538a
            au.com.woolworths.android.onesite.navigation.ApplicationType r8 = au.com.woolworths.android.onesite.navigation.ApplicationType.e
            android.content.Intent r7 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r7, r8)
            return r7
        L74:
            au.com.woolworths.android.onesite.navigation.Activities$ShoppingListDetails r7 = au.com.woolworths.android.onesite.navigation.Activities.ShoppingListDetails.f4535a
            r0 = 0
            android.content.Intent r7 = r7.b(r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils.b(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils.c(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getValidSngListId$1
            if (r0 == 0) goto L13
            r0 = r9
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getValidSngListId$1 r0 = (com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getValidSngListId$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getValidSngListId$1 r0 = new com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils$getValidSngListId$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r3 = r8.c
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.lang.String r0 = r0.p
            kotlin.ResultKt.b(r9)
            goto L5c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository r9 = r3.c
            au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1 r2 = r9.h
            kotlin.reflect.KProperty[] r5 = au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository.j
            r6 = 6
            r5 = r5[r6]
            java.lang.Object r9 = r2.getValue(r9, r5)
            java.lang.String r9 = (java.lang.String) r9
            int r2 = r9.length()
            if (r2 != 0) goto L4c
            return r9
        L4c:
            r0.p = r9
            r0.s = r4
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r2 = r8.d
            java.lang.Object r0 = r2.f(r9, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r7 = r0
            r0 = r9
            r9 = r7
        L5c:
            if (r9 == 0) goto L5f
            return r0
        L5f:
            java.lang.String r9 = ""
            r3.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
