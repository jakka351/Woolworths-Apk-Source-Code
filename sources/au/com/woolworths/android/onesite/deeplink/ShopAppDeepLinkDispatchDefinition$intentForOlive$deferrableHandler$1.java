package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ShopAppDeepLinkDispatchDefinition$intentForOlive$deferrableHandler$1 extends FunctionReferenceImpl implements Function2<Bundle, Function0<? extends Intent>, Intent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle p0 = (Bundle) obj;
        Function0 p1 = (Function0) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((ShopAppDeepLinkDispatchDefinition) this.receiver).getClass();
        return ShopAppDeepLinkDispatchDefinition.a(p0, p1);
    }
}
