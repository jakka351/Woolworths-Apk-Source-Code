package au.com.woolworths.android.onesite.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.repository.ConfigManagerImpl", f = "ConfigManagerImpl.kt", l = {31}, m = "checkCurrentVersion")
/* loaded from: classes.dex */
final class ConfigManagerImpl$checkCurrentVersion$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConfigManagerImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigManagerImpl$checkCurrentVersion$1(ConfigManagerImpl configManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = configManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, this);
    }
}
