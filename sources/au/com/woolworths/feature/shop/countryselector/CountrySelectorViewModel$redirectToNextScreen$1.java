package au.com.woolworths.feature.shop.countryselector;

import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel", f = "CountrySelectorViewModel.kt", l = {108, 109, 110}, m = "redirectToNextScreen")
/* loaded from: classes3.dex */
final class CountrySelectorViewModel$redirectToNextScreen$1 extends ContinuationImpl {
    public Region p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CountrySelectorViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$redirectToNextScreen$1(CountrySelectorViewModel countrySelectorViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = countrySelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return CountrySelectorViewModel.p6(this.r, null, this);
    }
}
