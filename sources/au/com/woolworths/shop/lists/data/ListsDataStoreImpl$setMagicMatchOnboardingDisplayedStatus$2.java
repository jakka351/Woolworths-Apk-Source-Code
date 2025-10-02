package au.com.woolworths.shop.lists.data;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import au.com.woolworths.shop.lists.data.MagicMatchDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2", f = "ListsDataStoreImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2 listsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2 = new ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2(2, continuation);
        listsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2.p = obj;
        return listsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2 listsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2 = (ListsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        listsDataStoreImpl$setMagicMatchOnboardingDisplayedStatus$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        Preferences.Key key = MagicMatchDataStore.Keys.f12255a;
        mutablePreferences.e(MagicMatchDataStore.Keys.f12255a, Boolean.TRUE);
        return Unit.f24250a;
    }
}
