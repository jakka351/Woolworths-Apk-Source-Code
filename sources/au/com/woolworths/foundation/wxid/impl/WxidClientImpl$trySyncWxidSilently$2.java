package au.com.woolworths.foundation.wxid.impl;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import au.com.woolworths.foundation.wxid.impl.data.WxidDataStore;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.wxid.impl.WxidClientImpl$trySyncWxidSilently$2", f = "WxidClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WxidClientImpl$trySyncWxidSilently$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    public WxidClientImpl$trySyncWxidSilently$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WxidClientImpl$trySyncWxidSilently$2 wxidClientImpl$trySyncWxidSilently$2 = new WxidClientImpl$trySyncWxidSilently$2(2, continuation);
        wxidClientImpl$trySyncWxidSilently$2.p = obj;
        return wxidClientImpl$trySyncWxidSilently$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WxidClientImpl$trySyncWxidSilently$2 wxidClientImpl$trySyncWxidSilently$2 = (WxidClientImpl$trySyncWxidSilently$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        wxidClientImpl$trySyncWxidSilently$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        Preferences.Key key = WxidDataStore.Keys.f8937a;
        mutablePreferences.e(WxidDataStore.Keys.b, new Long(TimeUnit.HOURS.toMillis(24L) + System.currentTimeMillis()));
        return Unit.f24250a;
    }
}
