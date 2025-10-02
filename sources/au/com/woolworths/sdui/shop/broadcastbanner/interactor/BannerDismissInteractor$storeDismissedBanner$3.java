package au.com.woolworths.sdui.shop.broadcastbanner.interactor;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$3", f = "BannerDismissInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BannerDismissInteractor$storeDismissedBanner$3 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ Preferences.Key q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerDismissInteractor$storeDismissedBanner$3(Preferences.Key key, Continuation continuation) {
        super(2, continuation);
        this.q = key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BannerDismissInteractor$storeDismissedBanner$3 bannerDismissInteractor$storeDismissedBanner$3 = new BannerDismissInteractor$storeDismissedBanner$3(this.q, continuation);
        bannerDismissInteractor$storeDismissedBanner$3.p = obj;
        return bannerDismissInteractor$storeDismissedBanner$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BannerDismissInteractor$storeDismissedBanner$3 bannerDismissInteractor$storeDismissedBanner$3 = (BannerDismissInteractor$storeDismissedBanner$3) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        bannerDismissInteractor$storeDismissedBanner$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((MutablePreferences) this.p).e(this.q, Boolean.TRUE);
        return Unit.f24250a;
    }
}
