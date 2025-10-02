package au.com.woolworths.feature.shop.wpay.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor", f = "ProvideFingerprintInteractor.kt", l = {35}, m = "invoke")
/* loaded from: classes3.dex */
final class ProvideFingerprintInteractor$invoke$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProvideFingerprintInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvideFingerprintInteractor$invoke$1(ProvideFingerprintInteractor provideFingerprintInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = provideFingerprintInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, this);
    }
}
