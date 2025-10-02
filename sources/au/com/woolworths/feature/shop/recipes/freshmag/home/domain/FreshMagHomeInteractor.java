package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeRepositoryImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/FreshMagHomeInteractor;", "", "NoContentException", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagHomeInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final FreshMagHomeRepositoryImpl f8055a;
    public final DispatcherProvider b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/FreshMagHomeInteractor$NoContentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoContentException extends Exception {
        public static final NoContentException d = new NoContentException();
    }

    public FreshMagHomeInteractor(FreshMagHomeRepositoryImpl freshMagHomeRepositoryImpl, DispatcherProvider dispatcher) {
        Intrinsics.h(dispatcher, "dispatcher");
        this.f8055a = freshMagHomeRepositoryImpl;
        this.b = dispatcher;
    }

    public final Object a(Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new FreshMagHomeInteractor$getFreshMagHome$2(this, null), continuation);
    }
}
