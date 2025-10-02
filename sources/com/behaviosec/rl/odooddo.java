package com.behaviosec.rl;

import YU.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.EditText;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.ooodood;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class odooddo {
    public static int a00610061a0061aaa = 22;
    public static int a00610061aa0061aa = 0;
    public static int a0061a00610061aaa = 2;
    public static int aaa00610061aaa = 1;
    public int w0077007700770077w0077;
    public String w00770077w0077w0077;
    public int w0077w00770077w0077;
    public final Context w0077ww0077w0077;
    private int w0077www00770077;
    public int ww007700770077w0077;
    public EditText ww0077w0077w0077;
    public oddoddo www00770077w0077;
    private static final String ww00770077ww0077 = uuxuuuu.pp0070p0070ppp("_sO!A(\u0001i\u000eF% U\u0013UauK\u0018YHII", (char) (yllylll.r007200720072r00720072() ^ (-1146716780)), (char) (yyyllll.rrrr007200720072() ^ 383821854), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
    public static final String DEFAULT_FIELD_NAME = uuxuuuu.pp0070p0070ppp("\u0018Q]e/|\u00184*H%\u0012\u001di|d", (char) (yylylll.r0072r0072r00720072() ^ (-1349847084)), (char) (yyyllll.rrrr007200720072() ^ 383821863), (char) (yyyllll.rrrr007200720072() ^ 383821871));
    private static int w007700770077ww0077 = 0;
    private int wwww0077w0077 = 0;
    private String wwwww00770077 = uuxuuuu.pppp0070ppp("E\u0016\u00197[(\b9 ;8Z\u0014)%B", (char) (yyyllll.rrrr007200720072() ^ 383821924), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)));
    private boolean ww0077ww00770077 = true;
    private int w00770077ww00770077 = -1;

    private odooddo(Context context, EditText editText, String str, int i) {
        this.w0077ww0077w0077 = context;
        this.ww0077w0077w0077 = editText;
        this.w00770077w0077w0077 = str;
        this.w0077www00770077 = i;
        this.www00770077w0077 = new oddoddo(str, this.wwwww00770077, editText);
        init(editText);
        nn006E006E006E006E006E();
    }

    private static Context a00610061aaaa(Context context) {
        int i = 5;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    a00610061a0061aaa = aa006100610061aaa();
                }
            }
        }
        return context;
    }

    private boolean a0061a00610061aa(KeyEvent keyEvent) {
        String str = uuxuuuu.pppp0070ppp("<G(E=L$?T>L?QD\t", (char) (yylylll.r0072r0072r00720072() ^ (-1349847077)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))) + getFieldName() + uuxuuuu.pp0070p0070ppp(":0", (char) (yyyllll.rrrr007200720072() ^ 383822016), (char) (yylylll.r0072r0072r00720072() ^ (-1349847153)), (char) (yyyllll.rrrr007200720072() ^ 383821870));
        boolean z = this.ww0077ww00770077;
        if (keyEvent != null) {
            z |= keyEvent.getDeviceId() <= -1;
        }
        String strAa00610061aaa = aa00610061aaa();
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pp0070p0070ppp("mxYvn}Up\u0006o}p\u0003uL3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741288)), (char) (yyyllll.rrrr007200720072() ^ 383821893), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
        sbS.append(z);
        LogBridge.d(strAa00610061aaa, sbS.toString());
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % aa00610061a0061aa() != a0061aaa0061aa()) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = 1;
        }
        return z;
    }

    public static int a0061aaa0061aa() {
        return 0;
    }

    public static int aa006100610061aaa() {
        return 92;
    }

    public static int aa00610061a0061aa() {
        return 2;
    }

    public static int aa0061aa0061aa() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.behaviosec.rl.odooddo aa0061aaaa(android.content.Context r6, android.widget.EditText r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.odooddo.aa0061aaaa(android.content.Context, android.widget.EditText, java.lang.String):com.behaviosec.rl.odooddo");
    }

    private void nn006E006E006E006E006E() {
        EditText editTextA006100610061aaa = a006100610061aaa();
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = 31;
            a00610061aa0061aa = 75;
        }
        if (editTextA006100610061aaa == null) {
            return;
        }
        this.w0077w00770077w0077 = editTextA006100610061aaa.getInputType();
        this.ww007700770077w0077 = editTextA006100610061aaa.getImeOptions();
        this.w0077007700770077w0077 = editTextA006100610061aaa.getAutofillType();
    }

    public void a0061006100610061aa(boolean z) {
        if (!ooodood.monitoringEnabled) {
            return;
        }
        LogBridge.d(aa00610061aaa(), uuxuuuu.pp0070p0070ppp("\u001b\u0019\u0001\u0012\u0016\u000b\u0015\u001ci\u0012\u0005\u0016\u0013a\u0006}\n\u0002~|?", (char) (ylyylll.r0072rrr00720072() ^ (-1691741245)), (char) (yllylll.r007200720072r00720072() ^ (-1146716895)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + getFieldName() + uuxuuuu.pp0070p0070ppp("#", (char) (yyyllll.rrrr007200720072() ^ 383821917), (char) (yllylll.r007200720072r00720072() ^ (-1146716811)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))) + z + uuxuuuu.pppp0070ppp("2(", (char) (yllylll.r007200720072r00720072() ^ (-1146716804)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
        try {
            throw null;
        } catch (Exception unused) {
            a00610061a0061aaa = 74;
            int i = 1;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused2) {
                    a00610061a0061aaa = 44;
                    if (!z) {
                        ooodood.removeViewListener();
                        return;
                    }
                    EditText editTextA006100610061aaa = a006100610061aaa();
                    if (editTextA006100610061aaa != null && editTextA006100610061aaa.hasWindowFocus() && editTextA006100610061aaa.hasFocus()) {
                        addViewListener();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public synchronized EditText a006100610061aaa() {
        if (((a00610061a0061aaa + aa0061aa0061aa()) * a00610061a0061aaa) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = 53;
            a00610061aa0061aa = aa006100610061aaa();
        }
        try {
        } catch (Exception e) {
            throw e;
        }
        return this.ww0077w0077w0077;
    }

    public JSONArray a00610061a0061aa() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % aa00610061a0061aa() != a00610061aa0061aa) {
            a00610061a0061aaa = 13;
            a00610061aa0061aa = 78;
        }
        return this.www00770077w0077.getJSONArrayEditTextTimings();
    }

    public Context a0061a0061aaa() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % aa00610061a0061aa() != 0) {
            a00610061a0061aaa = 71;
            a00610061aa0061aa = aa006100610061aaa();
        }
        return this.w0077ww0077w0077;
    }

    public int a0061aa0061aa() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = aa006100610061aaa();
        }
        EditText editTextA006100610061aaa = a006100610061aaa();
        return editTextA006100610061aaa != null ? editTextA006100610061aaa.getImeOptions() : this.ww007700770077w0077;
    }

    public void a0061aaaaa(String str) {
        if (!this.w00770077w0077w0077.equals(str)) {
            if (this.ww0077w0077w0077 == null) {
                return;
            }
            this.www00770077w0077.changeFieldType(str);
        } else {
            int i = a00610061a0061aaa;
            if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
                a00610061a0061aaa = aa006100610061aaa();
                a00610061aa0061aa = 81;
            }
        }
    }

    public void aa006100610061aa(boolean z, int i, Rect rect) {
        String str = uuxuuuu.pp0070p0070ppp("\u000f\u000fg\u0012\u0007\u001a\u0019i\u0010\n\u0018\u0012\u0011\u0011U", (char) (yllylll.r007200720072r00720072() ^ (-1146716859)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847133)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))) + getFieldName() + uuxuuuu.pp0070p0070ppp("c", (char) (yyyllll.rrrr007200720072() ^ 383821839), (char) (yylylll.r0072r0072r00720072() ^ (-1349847153)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + z + uuxuuuu.pppp0070ppp("M", (char) (yyyllll.rrrr007200720072() ^ 383821963), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + i + uuxuuuu.pp0070p0070ppp("ib", (char) (yllylll.r007200720072r00720072() ^ (-1146716727)), (char) (yllylll.r007200720072r00720072() ^ (-1146716920)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)));
        String strAa00610061aaa = aa00610061aaa();
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pppp0070ppp("~ST\u0012\u0015eK\u0012ct;\u000bO_EY\u001fzfxB4\u0004", (char) (yyyllll.rrrr007200720072() ^ 383821990), (char) (yyyllll.rrrr007200720072() ^ 383821864)));
        sbS.append(rect);
        LogBridge.d(strAa00610061aaa, sbS.toString());
        if (ooodood.monitoringEnabled) {
            if (z) {
                ooodood.addField(this, a0061a0061aaa());
                addViewListener();
                ooodood.sensorCollector.startGatherSensorData();
            } else {
                ooodood.removeViewListener();
                int i2 = a00610061a0061aaa;
                if (((aaa00610061aaa + i2) * i2) % a0061a00610061aaa != 0) {
                    a00610061a0061aaa = aa006100610061aaa();
                    a00610061aa0061aa = 99;
                }
                ooodood.sensorCollector.stopGatherSensorData();
            }
        }
    }

    public String aa00610061aaa() {
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821831);
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847176));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741336);
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != 0) {
            a00610061a0061aaa = 88;
            a00610061aa0061aa = aa006100610061aaa();
        }
        return uuxuuuu.pp0070p0070ppp("c\b\f\u0006\u001c\u0010\u0017m\u000e\u0014 \u0001\u0013'$t\u0017\u001f\u0019\u001c\u0017+\u001d", cRrrr007200720072, cR0072r0072r00720072, (char) iR0072rrr00720072);
    }

    public int aa0061a0061aa() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != 0) {
            a00610061a0061aaa = 19;
            a00610061aa0061aa = 25;
        }
        EditText editTextA006100610061aaa = a006100610061aaa();
        return editTextA006100610061aaa != null ? editTextA006100610061aaa.getInputType() : this.w0077w00770077w0077;
    }

    public oddoddo aaa00610061aa() {
        return this.www00770077w0077;
    }

    public int aaa0061aaa() {
        EditText editTextA006100610061aaa = a006100610061aaa();
        if (editTextA006100610061aaa != null) {
            return editTextA006100610061aaa.getAutofillType();
        }
        int i = this.w0077007700770077w0077;
        int i2 = a00610061a0061aaa;
        if (((aaa00610061aaa + i2) * i2) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = 88;
            a00610061aa0061aa = aa006100610061aaa();
        }
        return i;
    }

    public String aaaa0061aa() {
        String str = this.w00770077w0077w0077;
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != 0) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = 70;
        }
        return str;
    }

    public synchronized void aaaaa0061a() {
        try {
            int i = a00610061a0061aaa;
            if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
                a00610061a0061aaa = aa006100610061aaa();
                a00610061aa0061aa = 1;
            }
            nn006E006E006E006E006E();
            oddoddo oddoddoVar = this.www00770077w0077;
            if (oddoddoVar != null) {
                oddoddoVar.removeEditTextRef();
            }
            this.ww0077w0077w0077 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void addViewListener() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != 0) {
            a00610061a0061aaa = 40;
            a00610061aa0061aa = 10;
        }
        EditText editTextA006100610061aaa = a006100610061aaa();
        if (editTextA006100610061aaa == null) {
            return;
        }
        ooodood.addViewListener(0, 0, -1, -1, editTextA006100610061aaa);
    }

    public void clearText() {
        EditText editTextA006100610061aaa = a006100610061aaa();
        if (editTextA006100610061aaa != null) {
            if (((aa0061aa0061aa() + a00610061a0061aaa) * a00610061a0061aaa) % a0061a00610061aaa != a0061aaa0061aa()) {
                a00610061a0061aaa = 3;
                aaa00610061aaa = 40;
            }
            editTextA006100610061aaa.setText("");
        }
        this.www00770077w0077.clear();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof odooddo)) {
            return false;
        }
        if (((aa0061aa0061aa() + a00610061a0061aaa) * a00610061a0061aaa) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = aa006100610061aaa();
        }
        return ((odooddo) obj).a006100610061aaa() == a006100610061aaa();
    }

    public JSONObject getEditTextProperties() throws Exception {
        uuxuuuu.pp0070p0070ppp("Q@S\u000f\u0013s`%\u0012!Mm\bNwIg?0x2\\:", (char) (yyyllll.rrrr007200720072() ^ 383821985), (char) (yylylll.r0072r0072r00720072() ^ (-1349847097)), (char) (yyyllll.rrrr007200720072() ^ 383821871));
        JSONObject jSONObject = new JSONObject();
        try {
            try {
            } catch (JSONException e) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("r\u0015\u0017\u000f#\u0015\u001an\r\u0011\u001by\n\u001c\u0017e\u0006\f\u0004\u0005}\u0010\u007f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847143)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847280)), (char) ((-1691741329) ^ ylyylll.r0072rrr00720072())), uuxuuuu.pppp0070ppp("ZWe5SWa@Pb]8YUUIUVJER\u0006\u0006", (char) (yyyllll.rrrr007200720072() ^ 383821938), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), e);
            }
            try {
                jSONObject.put(uuxuuuu.pppp0070ppp(";BN0VND", (char) (yylylll.r0072r0072r00720072() ^ (-1349847293)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), aaaa0061aa());
                jSONObject.put(uuxuuuu.pp0070p0070ppp("7Q +\n", (char) (yyyllll.rrrr007200720072() ^ 383821953), (char) (yylylll.r0072r0072r00720072() ^ (-1349847090)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))), getId());
                jSONObject.put(uuxuuuu.pp0070p0070ppp("swx|zY}sg", (char) (yylylll.r0072r0072r00720072() ^ (-1349847207)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847238)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), aa0061a0061aa());
                int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
                int i = a00610061a0061aaa;
                if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
                    a00610061a0061aaa = aa006100610061aaa();
                    a00610061aa0061aa = aa006100610061aaa();
                }
                jSONObject.put(uuxuuuu.pp0070p0070ppp("nslWy~t{{\u0002", (char) (iR0072rrr00720072 ^ (-1691741326)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741313)), (char) ((-1349847053) ^ yylylll.r0072r0072r00720072())), a0061aa0061aa());
                jSONObject.put(uuxuuuu.pp0070p0070ppp("Ob`ZPRTS:^TH", (char) (yyyllll.rrrr007200720072() ^ 383821946), (char) (yllylll.r007200720072r00720072() ^ (-1146716874)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), aaa0061aaa());
                this.wwww0077w0077++;
                return jSONObject;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public String getFieldName() {
        String str = this.wwwww00770077;
        if (((aa0061aa0061aa() + a00610061a0061aaa) * a00610061a0061aaa) % a0061a00610061aaa != a00610061aa0061aa) {
            a00610061a0061aaa = 82;
            a00610061aa0061aa = 62;
        }
        return str;
    }

    public int getId() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a0061aaa0061aa()) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = aa006100610061aaa();
        }
        return this.w0077www00770077;
    }

    public int hashCode() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a0061aaa0061aa()) {
            a00610061a0061aaa = 61;
            a00610061aa0061aa = 0;
        }
        EditText editTextA006100610061aaa = a006100610061aaa();
        if (editTextA006100610061aaa != null) {
            return editTextA006100610061aaa.hashCode();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(final android.widget.EditText r6) {
        /*
            r5 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L2
        L2:
            r1 = -1
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L6
            goto L2
        L6:
            throw r0     // Catch: java.lang.Exception -> L7
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = com.behaviosec.rl.yllylll.r007200720072r00720072()
            r2 = -1146716686(0xffffffffbba67df2, float:-0.005080932)
            r1 = r1 ^ r2
            char r1 = (char) r1
            int r2 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r3 = 383822059(0x16e0a8eb, float:3.6295754E-25)
            r2 = r2 ^ r3
            char r2 = (char) r2
            int r3 = com.behaviosec.rl.yllylll.r007200720072r00720072()
            r4 = -1146716785(0xffffffffbba67d8f, float:-0.0050808857)
            r3 = r3 ^ r4
            char r3 = (char) r3
            java.lang.String r4 = ",0*4f"
            java.lang.String r1 = com.behaviosec.rl.uuxuuuu.pp0070p0070ppp(r4, r1, r2, r3)
            r0.append(r1)
            java.lang.String r1 = r5.getFieldName()
            r0.append(r1)
            int r1 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r2 = -1349847128(0xffffffffaf8af7a8, float:-2.5278024E-10)
            r1 = r1 ^ r2
            char r1 = (char) r1
            int r2 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r3 = 383821868(0x16e0a82c, float:3.6295283E-25)
            r2 = r2 ^ r3
            char r2 = (char) r2
            java.lang.String r3 = "ND"
            java.lang.String r1 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r3, r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.aa00610061aaa()
            com.behaviosec.rl.android.LogBridge.d(r1, r0)
            android.content.Context r0 = r5.w0077ww0077w0077
            com.behaviosec.rl.ooodood.addField(r5, r0)
            int r0 = com.behaviosec.rl.yyyllll.rrrr007200720072()
            r1 = 383821971(0x16e0a893, float:3.6295537E-25)
            r0 = r0 ^ r1
            char r0 = (char) r0
            int r1 = com.behaviosec.rl.ylyylll.r0072rrr00720072()
            r2 = -1691741336(0xffffffff9b2a1368, float:-1.4068341E-22)
            r1 = r1 ^ r2
            char r1 = (char) r1
            java.lang.String r3 = "n\u0013\u0017\u0011'\u001b\"x\u0019\u001f+\f\u001e2/\u007f\"*$'\"6("
            java.lang.String r0 = com.behaviosec.rl.uuxuuuu.pppp0070ppp(r3, r0, r1)
            int r1 = com.behaviosec.rl.yylylll.r0072r0072r00720072()
            r3 = -1349847173(0xffffffffaf8af77b, float:-2.52779E-10)
            r1 = r1 ^ r3
            char r1 = (char) r1
            int r3 = com.behaviosec.rl.ylyylll.r0072rrr00720072()
            r4 = -1691741401(0xffffffff9b2a1327, float:-1.4068259E-22)
            r3 = r3 ^ r4
            char r3 = (char) r3
            int r4 = com.behaviosec.rl.ylyylll.r0072rrr00720072()
            r2 = r2 ^ r4
            char r2 = (char) r2
            java.lang.String r4 = "0/7^260b%)*\u001b-A>\u000e4.<655\u001e<GI;E=K"
            java.lang.String r1 = com.behaviosec.rl.uuxuuuu.pp0070p0070ppp(r4, r1, r3, r2)
            com.behaviosec.rl.android.LogBridge.d(r0, r1)
            if (r6 == 0) goto La5
            com.behaviosec.rl.odooddo$1 r0 = new com.behaviosec.rl.odooddo$1
            r0.<init>()
            r6.post(r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.odooddo.init(android.widget.EditText):void");
    }

    public void onKeyDown(int i, KeyEvent keyEvent) {
        String str = uuxuuuu.pppp0070ppp("\u0004\u0004a|\nU\u0002\u000b\u000bE", (char) (yyyllll.rrrr007200720072() ^ 383821887), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + getFieldName() + uuxuuuu.pp0070p0070ppp("9", (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741415)), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + i + uuxuuuu.pppp0070ppp("kc", (char) (yylylll.r0072r0072r00720072() ^ (-1349847085)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046)));
        String strAa00610061aaa = aa00610061aaa();
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pppp0070ppp(",>.8?\u0006l", (char) (yylylll.r0072r0072r00720072() ^ (-1349847116)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
        sbS.append(keyEvent);
        LogBridge.d(strAa00610061aaa, sbS.toString());
        if (!ooodood.monitoringEnabled || keyEvent == null) {
            return;
        }
        boolean zA0061a00610061aa = a0061a00610061aa(keyEvent);
        if (ooodood.isUseDefaultInputConnection() && this.w00770077ww00770077 != i) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long eventTime = keyEvent.getEventTime();
            String strAa00610061aaa2 = aa00610061aaa();
            StringBuilder sbS2 = a.s(str);
            sbS2.append(uuxuuuu.pppp0070ppp("yotmC*", (char) (yylylll.r0072r0072r00720072() ^ (-1349847178)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))));
            sbS2.append(eventTime);
            LogBridge.d(strAa00610061aaa2, sbS2.toString());
            if (zA0061a00610061aa) {
                jUptimeMillis = ooodood.getLastDown();
            }
            oddoddo oddoddoVar = this.www00770077w0077;
            if (oddoddoVar != null) {
                eventTime = oddoddoVar.getStartTime();
            }
            long j = jUptimeMillis - eventTime;
            String strAa00610061aaa3 = aa00610061aaa();
            StringBuilder sbS3 = a.s(str);
            int i2 = a00610061a0061aaa;
            if (((aaa00610061aaa + i2) * i2) % a0061a00610061aaa != a00610061aa0061aa) {
                a00610061a0061aaa = aa006100610061aaa();
                a00610061aa0061aa = aa006100610061aaa();
            }
            sbS3.append(uuxuuuu.pp0070p0070ppp("jZlgIRdRVR^%\n", (char) (yyyllll.rrrr007200720072() ^ 383821959), (char) (ylyylll.r0072rrr00720072() ^ (-1691741237)), (char) (383821870 ^ yyyllll.rrrr007200720072())));
            sbS3.append(this.www00770077w0077);
            LogBridge.d(strAa00610061aaa3, sbS3.toString());
            oddoddo oddoddoVar2 = this.www00770077w0077;
            int unicodeChar = keyEvent.getUnicodeChar();
            double lastPressure = ooodood.getLastPressure();
            ooodood.SensorCollector sensorCollector = ooodood.sensorCollector;
            oddoddoVar2.addKeyEvent(0, unicodeChar, j, -1, lastPressure, sensorCollector.keyFlightAcc, sensorCollector.keyFlightGyro);
            sensorCollector.resetKeyFlightStatistics();
        }
        this.w00770077ww00770077 = i;
    }

    public void onKeyPreIme(KeyEvent keyEvent) {
        String str = uuxuuuu.pppp0070ppp("kiE^qGhZ=`W\u0019", (char) (yllylll.r007200720072r00720072() ^ (-1146716836)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + getFieldName() + uuxuuuu.pppp0070ppp("NF", (char) (yylylll.r0072r0072r00720072() ^ (-1349847253)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)));
        String strAa00610061aaa = aa00610061aaa();
        StringBuilder sbS = a.s(str);
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741353));
        char cR0072rrr007200722 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741308));
        int iR0072rrr00720072 = ylyylll.r0072rrr00720072() ^ (-1691741332);
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % aa00610061a0061aa() != a00610061aa0061aa) {
            a00610061a0061aaa = aa006100610061aaa();
            a00610061aa0061aa = aa006100610061aaa();
        }
        sbS.append(uuxuuuu.pp0070p0070ppp("jO", cR0072rrr00720072, cR0072rrr007200722, (char) iR0072rrr00720072));
        sbS.append(keyEvent);
        LogBridge.d(strAa00610061aaa, sbS.toString());
        this.ww0077ww00770077 = false;
    }

    public void onKeyUp(int i, KeyEvent keyEvent) {
        String str = uuxuuuu.pppp0070ppp("r7(h7?&t", (char) (ylyylll.r0072rrr00720072() ^ (-1691741228)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + getFieldName() + uuxuuuu.pppp0070ppp("\t", (char) (yllylll.r007200720072r00720072() ^ (-1146716885)), (char) (yyyllll.rrrr007200720072() ^ 383821858)) + i + uuxuuuu.pp0070p0070ppp("&\u001f", (char) (yllylll.r007200720072r00720072() ^ (-1146716728)), (char) (yllylll.r007200720072r00720072() ^ (-1146716763)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)));
        LogBridge.d(aa00610061aaa(), str + uuxuuuu.pp0070p0070ppp("\u0006%,'\u001fH\u001e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847086)), (char) (yyyllll.rrrr007200720072() ^ 383822070), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + keyEvent);
        if (!ooodood.monitoringEnabled || keyEvent == null) {
            return;
        }
        if (ooodood.isUseDefaultInputConnection() || !a0061a00610061aa(keyEvent)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long eventTime = keyEvent.getEventTime();
            LogBridge.d(aa00610061aaa(), str + uuxuuuu.pppp0070ppp("zpunD+", (char) (yylylll.r0072r0072r00720072() ^ (-1349847177)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + eventTime);
            oddoddo oddoddoVar = this.www00770077w0077;
            if (oddoddoVar != null) {
                eventTime = oddoddoVar.getStartTime();
            }
            long j = jUptimeMillis - eventTime;
            LogBridge.d(aa00610061aaa(), str + uuxuuuu.pppp0070ppp("B2D?!*<*.*6|a", (char) (yylylll.r0072r0072r00720072() ^ (-1349847190)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + this.www00770077w0077);
            oddoddo oddoddoVar2 = this.www00770077w0077;
            if (oddoddoVar2 != null) {
                int i2 = a00610061a0061aaa;
                if (((aaa00610061aaa + i2) * i2) % a0061a00610061aaa != a00610061aa0061aa) {
                    a00610061a0061aaa = aa006100610061aaa();
                    a00610061aa0061aa = 71;
                }
                int unicodeChar = keyEvent.getUnicodeChar();
                ooodood.SensorCollector sensorCollector = ooodood.sensorCollector;
                oddoddoVar2.addKeyEvent(1, unicodeChar, j, -1, -1.0d, sensorCollector.keyPressAcc, sensorCollector.keyPressGyro);
                sensorCollector.resetKeyPressStatistics();
            }
        }
        this.w00770077ww00770077 = -2;
    }

    public void remove() {
        oddoddo oddoddoVar = this.www00770077w0077;
        if (oddoddoVar != null) {
            int i = a00610061a0061aaa;
            if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != a00610061aa0061aa) {
                a00610061a0061aaa = 39;
                a00610061aa0061aa = 37;
            }
            oddoddoVar.removeEditTextRef();
        }
    }

    public void setFieldName(String str) {
        this.wwwww00770077 = str;
        this.www00770077w0077.setFieldName(str);
        int i = 5;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                a00610061a0061aaa = aa006100610061aaa();
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        a00610061a0061aaa = aa006100610061aaa();
                        return;
                    }
                }
            }
        }
    }

    public void setRegistered() {
        oddoddo oddoddoVar = this.www00770077w0077;
        if (oddoddoVar != null) {
            oddoddoVar.setRegistered();
        }
    }

    public boolean shouldSendEditTextProperties() {
        int i = a00610061a0061aaa;
        if (((aaa00610061aaa + i) * i) % a0061a00610061aaa != 0) {
            a00610061a0061aaa = 14;
            a00610061aa0061aa = 85;
        }
        return this.wwww0077w0077 <= 2;
    }
}
