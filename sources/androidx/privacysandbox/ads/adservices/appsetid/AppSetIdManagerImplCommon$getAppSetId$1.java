package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
/* loaded from: classes2.dex */
public final class AppSetIdManagerImplCommon$getAppSetId$1 extends ContinuationImpl {
    public AppSetIdManagerImplCommon p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AppSetIdManagerImplCommon r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManagerImplCommon$getAppSetId$1(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.r = appSetIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return AppSetIdManagerImplCommon.b(this.r, this);
    }
}
