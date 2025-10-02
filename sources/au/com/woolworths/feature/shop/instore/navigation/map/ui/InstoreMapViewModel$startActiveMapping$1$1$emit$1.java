package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.MapFocus;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$startActiveMapping$1$1", f = "InstoreMapViewModel.kt", l = {1048, 1049}, m = "emit")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$startActiveMapping$1$1$emit$1 extends ContinuationImpl {
    public MapFocus p;
    public InstoreMapContract.ViewState.MapData q;
    public /* synthetic */ Object r;
    public final /* synthetic */ InstoreMapViewModel$startActiveMapping$1.AnonymousClass1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$startActiveMapping$1$1$emit$1(InstoreMapViewModel$startActiveMapping$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.s = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.emit(null, this);
    }
}
