package coil.request;

import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/OneShotDisposable;", "Lcoil/request/Disposable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OneShotDisposable implements Disposable {

    /* renamed from: a, reason: collision with root package name */
    public final Deferred f13020a;

    public OneShotDisposable(Deferred deferred) {
        this.f13020a = deferred;
    }
}
