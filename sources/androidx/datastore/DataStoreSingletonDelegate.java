package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioStorage;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¨\u0006\u0005"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f2557a;
    public final OkioSerializerWrapper b;
    public final ReplaceFileCorruptionHandler c;
    public final Function1 d;
    public final CoroutineScope e;
    public final Object f = new Object();
    public volatile DataStoreImpl g;

    public DataStoreSingletonDelegate(String str, OkioSerializerWrapper okioSerializerWrapper, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        this.f2557a = str;
        this.b = okioSerializerWrapper;
        this.c = replaceFileCorruptionHandler;
        this.d = function1;
        this.e = coroutineScope;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        DataStoreImpl dataStoreImpl;
        Context thisRef = (Context) obj;
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        DataStoreImpl dataStoreImpl2 = this.g;
        if (dataStoreImpl2 != null) {
            return dataStoreImpl2;
        }
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    OkioStorage okioStorage = new OkioStorage(FileSystem.d, this.b, new Function0<Path>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str = Path.e;
                            Context applicationContext2 = applicationContext;
                            Intrinsics.g(applicationContext2, "applicationContext");
                            String absolutePath = DataStoreFile.a(applicationContext2, this.f2557a).getAbsolutePath();
                            Intrinsics.g(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
                            return Path.Companion.a(absolutePath, false);
                        }
                    });
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.c;
                    Function1 function1 = this.d;
                    Intrinsics.g(applicationContext, "applicationContext");
                    this.g = DataStoreFactory.b(okioStorage, replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.e);
                }
                dataStoreImpl = this.g;
                Intrinsics.e(dataStoreImpl);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStoreImpl;
    }
}
