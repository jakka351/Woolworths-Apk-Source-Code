package au.com.woolworths.foundation.shop.app.region.data;

import androidx.datastore.preferences.core.MutablePreferences;
import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository$setUserRegion$2", f = "ShopAppRegionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopAppRegionRepository$setUserRegion$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShopAppRegionRepository q;
    public final /* synthetic */ Region r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppRegionRepository$setUserRegion$2(ShopAppRegionRepository shopAppRegionRepository, Region region, Continuation continuation) {
        super(2, continuation);
        this.q = shopAppRegionRepository;
        this.r = region;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShopAppRegionRepository$setUserRegion$2 shopAppRegionRepository$setUserRegion$2 = new ShopAppRegionRepository$setUserRegion$2(this.q, this.r, continuation);
        shopAppRegionRepository$setUserRegion$2.p = obj;
        return shopAppRegionRepository$setUserRegion$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShopAppRegionRepository$setUserRegion$2 shopAppRegionRepository$setUserRegion$2 = (ShopAppRegionRepository$setUserRegion$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        shopAppRegionRepository$setUserRegion$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((MutablePreferences) this.p).e(this.q.c, this.r.d);
        return Unit.f24250a;
    }
}
