package androidx.datastore.preferences;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {
    public static PreferenceDataStoreSingletonDelegate a(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, d dVar, int i) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        Function1 function1 = dVar;
        if ((i & 4) != 0) {
            function1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.h;
        }
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        CompletableJob completableJobB = SupervisorKt.b();
        defaultIoScheduler.getClass();
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, completableJobB));
        Intrinsics.h(name, "name");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, function1, contextScopeA);
    }
}
