package au.com.woolworths.feature.shop.countryselector;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl", f = "CountrySelectorInteractorImpl.kt", l = {53}, m = "syncShoppingList")
/* loaded from: classes3.dex */
final class CountrySelectorInteractorImpl$syncShoppingList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CountrySelectorInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectorInteractorImpl$syncShoppingList$1(CountrySelectorInteractorImpl countrySelectorInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = countrySelectorInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(this);
    }
}
