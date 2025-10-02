package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Storage;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Serializer f2564a;
    public final Function1 b;
    public final Function0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1<File, InterProcessCoordinator> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            File it = (File) obj;
            Intrinsics.h(it, "it");
            String absolutePath = it.getCanonicalFile().getAbsolutePath();
            Intrinsics.g(absolutePath, "file.canonicalFile.absolutePath");
            return new SingleProcessCoordinator(absolutePath);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public FileStorage(Serializer serializer, Function1 function1, Function0 function0) {
        Intrinsics.h(serializer, "serializer");
        this.f2564a = serializer;
        this.b = function1;
        this.c = function0;
    }

    @Override // androidx.datastore.core.Storage
    public final StorageConnection a() throws IOException {
        final File canonicalFile = ((File) this.c.invoke()).getCanonicalFile();
        synchronized (e) {
            String path = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = d;
            if (linkedHashSet.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.g(path, "path");
            linkedHashSet.add(path);
        }
        return new FileStorageConnection(canonicalFile, this.f2564a, (InterProcessCoordinator) this.b.invoke(canonicalFile), new Function0<Unit>() { // from class: androidx.datastore.core.FileStorage$createConnection$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = FileStorage.e;
                File file = canonicalFile;
                synchronized (obj) {
                    FileStorage.d.remove(file.getAbsolutePath());
                }
                return Unit.f24250a;
            }
        });
    }

    public /* synthetic */ FileStorage(Serializer serializer, Function0 function0) {
        this(serializer, AnonymousClass1.h, function0);
    }
}
