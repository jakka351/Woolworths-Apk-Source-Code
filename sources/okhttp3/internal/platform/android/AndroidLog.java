package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidLog {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLog f26755a = new AndroidLog();
    public static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = MapsKt.q(linkedHashMap);
    }

    private AndroidLog() {
    }

    public static void a(int i, String str, String str2, Throwable th) {
        int iMin;
        String strF0 = (String) c.get(str);
        if (strF0 == null) {
            strF0 = StringsKt.f0(23, str);
        }
        if (Log.isLoggable(strF0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iB = StringsKt.B(str2, '\n', i2, 4);
                if (iB == -1) {
                    iB = length;
                }
                while (true) {
                    iMin = Math.min(iB, i2 + 4000);
                    String strSubstring = str2.substring(i2, iMin);
                    Intrinsics.g(strSubstring, "substring(...)");
                    Log.println(i, strF0, strSubstring);
                    if (iMin >= iB) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
