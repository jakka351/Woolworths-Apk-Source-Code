package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel", f = "YourGroceriesViewModel.kt", l = {228}, m = "getRatingUpMap")
/* loaded from: classes3.dex */
final class YourGroceriesViewModel$getRatingUpMap$1 extends ContinuationImpl {
    public Map p;
    public Iterator q;
    public Map r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ YourGroceriesViewModel u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesViewModel$getRatingUpMap$1(YourGroceriesViewModel yourGroceriesViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = yourGroceriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.t6(null, this);
    }
}
