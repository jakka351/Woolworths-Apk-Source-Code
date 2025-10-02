package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static PreferenceDataStore a(ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, CoroutineScope coroutineScope, final Function0 function0) {
        Intrinsics.h(migrations, "migrations");
        return new PreferenceDataStore(new PreferenceDataStore(DataStoreFactory.b(new FileStorage(PreferencesFileSerializer.f2590a, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File file = (File) function0.invoke();
                if (FilesKt.c(file).equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.g(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }), replaceFileCorruptionHandler, migrations, coroutineScope)));
    }
}
