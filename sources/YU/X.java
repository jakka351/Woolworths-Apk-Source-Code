package YU;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public final Application f36a;
    public final v c;
    public String b = null;
    public Integer d = 0;
    public Boolean e = Boolean.TRUE;

    public interface v {
        void a();
    }

    public X(Application application, v vVar) {
        this.f36a = application;
        this.c = vVar;
    }

    public static String a(String str) throws InterruptedException, IOException {
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line + "\n");
            }
        } catch (Exception e) {
            UB.a(e);
            return null;
        }
    }

    @JavascriptInterface
    public String adbStatus() {
        try {
            Application application = this.f36a;
            int i = Y.f37a;
            return String.valueOf(Settings.Global.getInt(application.getContentResolver(), Y.s, 0));
        } catch (Exception e) {
            UB.a(e);
            return CircleProgressBar.a("44");
        }
    }

    @JavascriptInterface
    public String androidId() {
        int i = Y.f37a;
        return Settings.Secure.getString(this.f36a.getContentResolver(), Y.c);
    }

    @JavascriptInterface
    public String appIdentifier() {
        return this.f36a.getPackageName();
    }

    @JavascriptInterface
    public String buildId() {
        return Build.ID;
    }

    @JavascriptInterface
    public String carrierName() {
        return CircleProgressBar.a("44");
    }

    @JavascriptInterface
    public String cpuABI() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr.length > 0 ? strArr[0] : CircleProgressBar.a("]`ynXEXtcci");
    }

    @JavascriptInterface
    public String defaultBuildFingerPrintProperties() throws InterruptedException, IOException {
        String strA = a(CircleProgressBar.a("~`k\u007f_F\\\u000bPN\u000e}sMNG\u0004_QYIXNK@X^["));
        return strA == null ? CircleProgressBar.a("}`ynXEX\u0006@TIsb\tDJD^]E^OUUF") : strA;
    }

    @JavascriptInterface
    public String deviceProperties() throws InterruptedException, IOException {
        String strA = a(CircleProgressBar.a("~`k\u007f_F\\"));
        return strA == null ? CircleProgressBar.a("}`ynXEX\u0006@TIsb\tDJD^]E^OUUF") : strA;
    }

    @JavascriptInterface
    public void done() {
        this.c.a();
    }

    @JavascriptInterface
    public String getServerSignals() {
        return Q.f15a + CircleProgressBar.a("5%") + sdkVersion() + CircleProgressBar.a("5%") + androidId() + CircleProgressBar.a("5%") + buildId() + CircleProgressBar.a("5%") + systemVersion() + CircleProgressBar.a("5%") + model() + CircleProgressBar.a("5%") + host();
    }

    @JavascriptInterface
    public String hardWareType() {
        CircleProgressBar.a("44");
        return M.a(Build.HARDWARE);
    }

    @JavascriptInterface
    public String host() {
        return Build.HOST;
    }

    @JavascriptInterface
    public String isDebugEnabled() {
        try {
            return Settings.Secure.getInt(this.f36a.getContentResolver(), CircleProgressBar.a("xa}PHGMINDD"), 0) == 1 ? CircleProgressBar.a("mwjj") : CircleProgressBar.a("\u007fds|H");
        } catch (Exception e) {
            UB.a(e);
            return CircleProgressBar.a("}`}zJ");
        }
    }

    @JavascriptInterface
    public String model() {
        return Build.MODEL;
    }

    @JavascriptInterface
    public String mountFileProperties() throws InterruptedException, IOException {
        String strA = a(CircleProgressBar.a("zdk/\u0002Y^DA\u000eMpsJVP"));
        return strA == null ? CircleProgressBar.a("}`ynXEX\u0006@TIsb\tDJD^]E^OUUF") : strA;
    }

    @JavascriptInterface
    public String qemuProperties() throws InterruptedException, IOException {
        String strA = a(CircleProgressBar.a("~`k\u007f_F\\\u000bPN\u000etcVLFF\u0017IRCH"));
        return strA == null ? CircleProgressBar.a("}`ynXEX\u0006SDMj") : strA;
    }

    @JavascriptInterface
    public String screenHeight() {
        return String.valueOf(this.f36a.getResources().getDisplayMetrics().heightPixels);
    }

    @JavascriptInterface
    public String screenWidth() {
        return String.valueOf(this.f36a.getResources().getDisplayMetrics().widthPixels);
    }

    @JavascriptInterface
    public String sdkVersion() {
        return CircleProgressBar.a("-+/!\u0019");
    }

    @JavascriptInterface
    public void setDCIDisabled(Boolean bool) {
        this.e = Boolean.valueOf(!bool.booleanValue());
    }

    @JavascriptInterface
    public void setOrder(String str) {
        if (str != null) {
            try {
                if (str.contains(",")) {
                    str.split(",");
                }
            } catch (Exception e) {
                UB.a(e);
            }
        }
    }

    @JavascriptInterface
    public void setRefreshInterval(String str) {
        try {
            this.d = Integer.getInteger(str);
        } catch (Exception unused) {
            this.d = 0;
        }
    }

    @JavascriptInterface
    public void setSignal(String str) {
        this.b = str;
        done();
    }

    @JavascriptInterface
    public String startTime() {
        return Long.toString(Q.f15a);
    }

    @JavascriptInterface
    public String systemVersion() {
        return Build.VERSION.RELEASE;
    }
}
