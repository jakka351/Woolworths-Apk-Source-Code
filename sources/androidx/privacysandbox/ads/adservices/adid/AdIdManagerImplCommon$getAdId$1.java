package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", l = {40}, m = "getAdId$suspendImpl")
/* loaded from: classes2.dex */
public final class AdIdManagerImplCommon$getAdId$1 extends ContinuationImpl {
    public AdIdManagerImplCommon p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AdIdManagerImplCommon r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerImplCommon$getAdId$1(AdIdManagerImplCommon adIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.r = adIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return AdIdManagerImplCommon.b(this.r, this);
    }
}
