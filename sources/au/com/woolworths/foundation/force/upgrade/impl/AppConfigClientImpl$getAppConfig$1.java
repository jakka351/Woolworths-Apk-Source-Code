package au.com.woolworths.foundation.force.upgrade.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl", f = "AppConfigClientImpl.kt", l = {55, 61, 64, 75, 80, 82, 87, 95, 101, 106, 109, 111}, m = "getAppConfig")
/* loaded from: classes4.dex */
final class AppConfigClientImpl$getAppConfig$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AppConfigClientImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigClientImpl$getAppConfig$1(AppConfigClientImpl appConfigClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = appConfigClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, null, this);
    }
}
