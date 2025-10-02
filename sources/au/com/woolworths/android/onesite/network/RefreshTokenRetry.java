package au.com.woolworths.android.onesite.network;

import androidx.navigation.compose.h;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0001¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/RefreshTokenRetry;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Observable;", "", "Lio/reactivex/ObservableSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshTokenRetry implements Function<Observable<Throwable>, ObservableSource<?>> {
    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public final Object mo0apply(Object obj) {
        Observable throwableObservable = (Observable) obj;
        Intrinsics.h(throwableObservable, "throwableObservable");
        return Observable.m(throwableObservable, Observable.e(1), new e(new h(this), 11)).c(new e(new androidx.navigation.a(29), 12), Integer.MAX_VALUE);
    }
}
