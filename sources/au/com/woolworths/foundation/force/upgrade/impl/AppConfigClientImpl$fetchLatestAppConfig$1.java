package au.com.woolworths.foundation.force.upgrade.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl", f = "AppConfigClientImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "fetchLatestAppConfig")
/* loaded from: classes4.dex */
final class AppConfigClientImpl$fetchLatestAppConfig$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AppConfigClientImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigClientImpl$fetchLatestAppConfig$1(AppConfigClientImpl appConfigClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = appConfigClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
