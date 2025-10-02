package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class BuiltInsResourceLoader {
    public static InputStream a(String path) throws IOException {
        Intrinsics.h(path, "path");
        ClassLoader classLoader = BuiltInsResourceLoader.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
        uRLConnection.setUseCaches(false);
        return Callback.b(uRLConnection);
    }
}
