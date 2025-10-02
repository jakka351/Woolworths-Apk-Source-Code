package androidx.datastore.core.okio;

import androidx.datastore.OkioSerializerWrapper;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.SingleProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import com.google.android.gms.ads.RequestConfiguration;
import com.salesforce.marketingcloud.config.a;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Storage;", "Companion", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final LinkedHashSet f = new LinkedHashSet();
    public static final Synchronizer g = new Synchronizer();

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f2577a;
    public final OkioSerializerWrapper b;
    public final Function2 c;
    public final Function0 d;
    public final Lazy e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, a.j, "Lokio/Path;", "<anonymous parameter 1>", "Lokio/FileSystem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.datastore.core.okio.OkioStorage$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function2<Path, FileSystem, InterProcessCoordinator> {
        public static final AnonymousClass1 h = new AnonymousClass1(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Path path = (Path) obj;
            Intrinsics.h(path, "path");
            Intrinsics.h((FileSystem) obj2, "<anonymous parameter 1>");
            return new SingleProcessCoordinator(Path.Companion.a(path.d.y(), true).d.y());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public OkioStorage(FileSystem fileSystem, OkioSerializerWrapper okioSerializerWrapper, Function0 function0) {
        Intrinsics.h(fileSystem, "fileSystem");
        this.f2577a = fileSystem;
        this.b = okioSerializerWrapper;
        this.c = AnonymousClass1.h;
        this.d = function0;
        this.e = LazyKt.b(new Function0<Path>() { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Function0 function02 = this.h.d;
                Path path = (Path) function02.invoke();
                path.getClass();
                if (okio.internal.Path.a(path) != -1) {
                    return Path.Companion.a(path.d.y(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + function02 + ", instead got " + path).toString());
            }
        });
    }

    @Override // androidx.datastore.core.Storage
    public final StorageConnection a() {
        String strY = ((Path) this.e.getD()).d.y();
        synchronized (g) {
            LinkedHashSet linkedHashSet = f;
            if (linkedHashSet.contains(strY)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strY + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(strY);
        }
        return new OkioStorageConnection(this.f2577a, (Path) this.e.getD(), this.b, (InterProcessCoordinator) this.c.invoke((Path) this.e.getD(), this.f2577a), new OkioStorage$createConnection$2(this));
    }
}
