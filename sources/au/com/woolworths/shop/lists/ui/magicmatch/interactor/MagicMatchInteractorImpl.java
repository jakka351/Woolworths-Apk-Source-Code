package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/interactor/MagicMatchInteractorImpl;", "Lau/com/woolworths/shop/lists/ui/magicmatch/interactor/MagicMatchInteractor;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MagicMatchInteractorImpl implements MagicMatchInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final MagicMatchRepository f12359a;

    public MagicMatchInteractorImpl(MagicMatchRepository magicMatchRepository) {
        Intrinsics.h(magicMatchRepository, "magicMatchRepository");
        this.f12359a = magicMatchRepository;
    }

    @Override // au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractor
    public final Serializable a(List list, Continuation continuation) {
        return this.f12359a.a(list, (ContinuationImpl) continuation);
    }
}
