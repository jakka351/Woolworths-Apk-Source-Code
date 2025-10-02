package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class DataStoreDelegateKt {
    public static DataStoreSingletonDelegate a(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        CompletableJob completableJobB = SupervisorKt.b();
        defaultIoScheduler.getClass();
        return new DataStoreSingletonDelegate(str, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, DataStoreDelegateKt$dataStore$1.h, CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, completableJobB)));
    }
}
