package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f2582a;
    public final ReplaceFileCorruptionHandler b;
    public final Function1 c;
    public final CoroutineScope d;
    public final Object e;
    public volatile PreferenceDataStore f;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        Intrinsics.h(name, "name");
        this.f2582a = name;
        this.b = replaceFileCorruptionHandler;
        this.c = function1;
        this.d = coroutineScope;
        this.e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        PreferenceDataStore preferenceDataStore;
        Context thisRef = (Context) obj;
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        PreferenceDataStore preferenceDataStore2 = this.f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.b;
                    Function1 function1 = this.c;
                    Intrinsics.g(applicationContext, "applicationContext");
                    this.f = PreferenceDataStoreFactory.a(replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.d, new Function0<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Context applicationContext2 = applicationContext;
                            Intrinsics.g(applicationContext2, "applicationContext");
                            String name = this.f2582a;
                            Intrinsics.h(name, "name");
                            return DataStoreFile.a(applicationContext2, name.concat(".preferences_pb"));
                        }
                    });
                }
                preferenceDataStore = this.f;
                Intrinsics.e(preferenceDataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }
}
