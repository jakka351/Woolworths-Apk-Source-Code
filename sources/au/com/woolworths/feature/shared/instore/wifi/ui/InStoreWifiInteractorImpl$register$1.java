package au.com.woolworths.feature.shared.instore.wifi.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl", f = "InStoreWifiInteractorImpl.kt", l = {89, 93}, m = "register")
/* loaded from: classes3.dex */
final class InStoreWifiInteractorImpl$register$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InStoreWifiInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreWifiInteractorImpl$register$1(InStoreWifiInteractorImpl inStoreWifiInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = inStoreWifiInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.e(this);
    }
}
