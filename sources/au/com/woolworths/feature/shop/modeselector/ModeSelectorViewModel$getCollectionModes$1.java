package au.com.woolworths.feature.shop.modeselector;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel", f = "ModeSelectorViewModel.kt", l = {124, 126}, m = "getCollectionModes")
/* loaded from: classes3.dex */
final class ModeSelectorViewModel$getCollectionModes$1 extends ContinuationImpl {
    public CollectionMode p;
    public String q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ModeSelectorViewModel t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorViewModel$getCollectionModes$1(ModeSelectorViewModel modeSelectorViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = modeSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return ModeSelectorViewModel.p6(this.t, null, this);
    }
}
