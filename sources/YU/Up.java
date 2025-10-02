package YU;

import YU.W.l;
import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Up {

    /* loaded from: classes2.dex */
    class As implements Runnable {
        public final /* synthetic */ String d;
        public final /* synthetic */ Ud e;

        public As(String str, Ud ud) {
            this.d = str;
            this.e = ud;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.d;
            Ud ud = this.e;
            if (str != null) {
                ud.c();
            } else {
                ud.d();
            }
        }
    }

    public interface Ud {
        void c();

        void d();

        void e(JSONObject jSONObject);
    }

    public static String a(Application application, String str, int i) {
        String str2;
        String strA;
        X x = new X(application, null);
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendPath(CircleProgressBar.a("Fgr"));
        builderBuildUpon.appendPath(CircleProgressBar.a("~`kP]H^JOR"));
        StringBuilder sb = new StringBuilder();
        sb.append(CircleProgressBar.a("m|oj\u0010"));
        if (i != 0) {
            if (i == 1) {
                str2 = "jat\"NJM";
            } else if (i == 2) {
                str2 = "jat\"IJE";
            } else if (i == 3) {
                str2 = "jat\"]F[\u0007QEK2bGK";
            } else {
                if (i == 4) {
                    str2 = "jat\"NJM\u0007QEK2bGK";
                }
                strA = CircleProgressBar.a("jat\"]F[");
            }
            strA = CircleProgressBar.a(str2);
        } else {
            strA = CircleProgressBar.a("jat\"]F[");
        }
        sb.append(strA);
        builderBuildUpon.encodedQuery(sb.toString());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("jq~}Y]EFG"), x.startTime());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("j|l{HDzNPRIph"), x.systemVersion());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("tj{jA"), x.model());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("}`ifNLdJPEW~tAvZZ\\"), x.hardWareType());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("xuoFILB_KGIzt"), x.appIdentifier());
        builderBuildUpon.appendQueryParameter(CircleProgressBar.a("}`ifNLeO"), x.androidId());
        return builderBuildUpon.toString();
    }

    public static void b(Application application, String str, int i, Ud ud) {
        try {
            if (N.a().booleanValue()) {
                String strA = a(application, str, i);
                W w = new W(ud);
                try {
                    w.b.execute(w.new l(new URL(strA)));
                } catch (Exception e) {
                    O.a(W.d, W.e + e, new Throwable[0]);
                    w.a(null);
                }
            } else {
                new Handler(Looper.getMainLooper()).post(new As(null, ud));
            }
        } catch (Exception unused) {
            new Handler(Looper.getMainLooper()).post(new As(CircleProgressBar.a("PkinA@H\u000bpDQjcWV"), ud));
        }
    }
}
