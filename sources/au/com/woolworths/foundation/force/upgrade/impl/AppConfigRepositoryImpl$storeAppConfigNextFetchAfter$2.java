package au.com.woolworths.foundation.force.upgrade.impl;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.AppConfigDataStoreKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2", f = "AppConfigRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ AppConfigRepositoryImpl q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2(AppConfigRepositoryImpl appConfigRepositoryImpl, long j, Continuation continuation) {
        super(2, continuation);
        this.q = appConfigRepositoryImpl;
        this.r = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2 appConfigRepositoryImpl$storeAppConfigNextFetchAfter$2 = new AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2(this.q, this.r, continuation);
        appConfigRepositoryImpl$storeAppConfigNextFetchAfter$2.p = obj;
        return appConfigRepositoryImpl$storeAppConfigNextFetchAfter$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2 appConfigRepositoryImpl$storeAppConfigNextFetchAfter$2 = (AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        appConfigRepositoryImpl$storeAppConfigNextFetchAfter$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        Preferences.Key key = AppConfigDataStoreKeys.f8509a;
        mutablePreferences.e(AppConfigDataStoreKeys.f8509a, new Long(this.q.d.instant().getEpochSecond() + this.r));
        return Unit.f24250a;
    }
}
