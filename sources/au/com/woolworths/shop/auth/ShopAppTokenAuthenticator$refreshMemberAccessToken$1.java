package au.com.woolworths.shop.auth;

import au.com.woolworths.shop.auth.data.MemberData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/shop/auth/data/MemberData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$refreshMemberAccessToken$1", f = "ShopAppTokenAuthenticator.kt", l = {262, 274, 276, 277, 278}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAppTokenAuthenticator$refreshMemberAccessToken$1 extends SuspendLambda implements Function2<FlowCollector<? super MemberData>, Continuation<? super Unit>, Object> {
    public Object p;
    public String q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ShopAppTokenAuthenticator t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppTokenAuthenticator$refreshMemberAccessToken$1(ShopAppTokenAuthenticator shopAppTokenAuthenticator, String str, Continuation continuation) {
        super(2, continuation);
        this.t = shopAppTokenAuthenticator;
        this.u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAppTokenAuthenticator$refreshMemberAccessToken$1 shopAppTokenAuthenticator$refreshMemberAccessToken$1 = new ShopAppTokenAuthenticator$refreshMemberAccessToken$1(this.t, this.u, continuation);
        shopAppTokenAuthenticator$refreshMemberAccessToken$1.s = obj;
        return shopAppTokenAuthenticator$refreshMemberAccessToken$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppTokenAuthenticator$refreshMemberAccessToken$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r2.emit(r13, r12) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.c(r7, r1, r13, r12) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.c(r7, r6, r13, r12) == r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$refreshMemberAccessToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
