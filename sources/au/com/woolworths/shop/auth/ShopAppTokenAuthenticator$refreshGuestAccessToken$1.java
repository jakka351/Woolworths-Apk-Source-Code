package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.models.authentication.RefreshResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/android/onesite/models/authentication/RefreshResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$refreshGuestAccessToken$1", f = "ShopAppTokenAuthenticator.kt", l = {242, 248}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShopAppTokenAuthenticator$refreshGuestAccessToken$1 extends SuspendLambda implements Function2<FlowCollector<? super RefreshResult>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShopAppTokenAuthenticator r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppTokenAuthenticator$refreshGuestAccessToken$1(ShopAppTokenAuthenticator shopAppTokenAuthenticator, String str, Continuation continuation) {
        super(2, continuation);
        this.r = shopAppTokenAuthenticator;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAppTokenAuthenticator$refreshGuestAccessToken$1 shopAppTokenAuthenticator$refreshGuestAccessToken$1 = new ShopAppTokenAuthenticator$refreshGuestAccessToken$1(this.r, this.s, continuation);
        shopAppTokenAuthenticator$refreshGuestAccessToken$1.q = obj;
        return shopAppTokenAuthenticator$refreshGuestAccessToken$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppTokenAuthenticator$refreshGuestAccessToken$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r12.emit((au.com.woolworths.android.onesite.models.authentication.RefreshResult) r0, r11) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.c(r0, r11.s, r12, r11) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        return r3;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$refreshGuestAccessToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
