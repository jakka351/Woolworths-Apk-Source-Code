package au.com.woolworths.feature.shop.modeselector;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel", f = "ModeSelectorViewModel.kt", l = {114, 116}, m = "bestEffortLocation")
/* loaded from: classes3.dex */
final class ModeSelectorViewModel$bestEffortLocation$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ModeSelectorViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorViewModel$bestEffortLocation$1(ModeSelectorViewModel modeSelectorViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = modeSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.s6(this);
    }
}
