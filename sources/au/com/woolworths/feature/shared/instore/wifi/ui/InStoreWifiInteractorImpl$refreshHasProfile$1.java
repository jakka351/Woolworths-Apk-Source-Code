package au.com.woolworths.feature.shared.instore.wifi.ui;

import com.cisco.or.sdk.enums.SigningState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl", f = "InStoreWifiInteractorImpl.kt", l = {130, 131}, m = "refreshHasProfile")
/* loaded from: classes.dex */
final class InStoreWifiInteractorImpl$refreshHasProfile$1 extends ContinuationImpl {
    public SigningState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InStoreWifiInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InStoreWifiInteractorImpl$refreshHasProfile$1(InStoreWifiInteractorImpl inStoreWifiInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = inStoreWifiInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(this);
    }
}
