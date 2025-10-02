package au.com.woolworths.feature.shop.modeselector;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel", f = "ModeSelectorViewModel.kt", l = {144, 148, 154, ModuleDescriptor.MODULE_VERSION, 164}, m = "setCollectionMode")
/* loaded from: classes3.dex */
final class ModeSelectorViewModel$setCollectionMode$1 extends ContinuationImpl {
    public CollectionMode p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ModeSelectorViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorViewModel$setCollectionMode$1(ModeSelectorViewModel modeSelectorViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = modeSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return ModeSelectorViewModel.r6(this.r, null, this);
    }
}
