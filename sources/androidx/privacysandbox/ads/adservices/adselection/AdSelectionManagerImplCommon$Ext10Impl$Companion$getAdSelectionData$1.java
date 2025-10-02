package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", l = {231}, m = "getAdSelectionData")
/* loaded from: classes2.dex */
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation continuation) {
        super(continuation);
        this.r = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
