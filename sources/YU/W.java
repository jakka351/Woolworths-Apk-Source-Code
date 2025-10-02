package YU;

import YU.Up;
import android.os.Handler;
import android.os.Looper;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class W {
    public static String d = CircleProgressBar.a("Z\\YAH][DPJsztRK@OmYDE");
    public static String e = CircleProgressBar.a("\\}|j]]EDL\u001b");

    /* renamed from: a, reason: collision with root package name */
    public final Up.Ud f35a;
    public final ExecutorService b = Executors.newSingleThreadExecutor();
    public final Handler c = new Handler(Looper.getMainLooper());

    class AY implements Runnable {
        public final /* synthetic */ JSONObject d;

        static {
            CircleProgressBar.a("_dvcHM\f_M\u0001Gzr\u0004fB^X");
        }

        public AY(JSONObject jSONObject) {
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Up.Ud ud = W.this.f35a;
            JSONObject jSONObject = this.d;
            if (jSONObject != null) {
                ud.e(jSONObject);
            } else {
                ud.c();
            }
        }
    }

    class l implements Runnable {
        public static String f = CircleProgressBar.a("\\}|j]]EDL\u001b");
        public static String g = CircleProgressBar.a("_dvcHM\f_M\u0001Gzr\u0004rL}\u0019hV\\\\QH\u001e\u0011x{be\u0014A\u007fZxhSZi+and[\u001e!");
        public static String h = CircleProgressBar.a("^@K");
        public static String i = CircleProgressBar.a("Z\\YAH][DPJsztRK@OmYDE");
        public static String j = CircleProgressBar.a("SVPAhQONRUIph\u001e");
        public static String k = CircleProgressBar.a("Lvz}\u0000hKNLU");
        public final /* synthetic */ URL d;

        public l(URL url) {
            this.d = url;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[PHI: r3
  0x00b5: PHI (r3v6 java.net.HttpURLConnection) = (r3v5 java.net.HttpURLConnection), (r3v7 java.net.HttpURLConnection) binds: [B:29:0x00b3, B:33:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: YU.W.l.run():void");
        }
    }

    public W(Up.Ud ud) {
        this.f35a = ud;
    }

    public final void a(JSONObject jSONObject) {
        this.c.post(new AY(jSONObject));
    }
}
