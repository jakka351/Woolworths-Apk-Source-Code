package au.com.woolworths.foundation.force.upgrade.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl", f = "AppConfigRepository.kt", l = {70}, m = "getStoredAppConfigNextFetchAt")
/* loaded from: classes4.dex */
final class AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AppConfigRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$getStoredAppConfigNextFetchAt$1(AppConfigRepositoryImpl appConfigRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = appConfigRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
