package com.behaviosec.rl;

import YU.a;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.SyncedJSONArray;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class oddodoo implements TextWatcher {
    private static final int g006700670067ggg = 2;
    private static final int g0067g0067ggg = 0;
    private static final int gg00670067ggg = 1;
    private static final int gggg0067gg = 3;
    public static int p00700070ppp00700070 = 1;
    public static int p0070p0070pp00700070 = 0;
    public static int p0070pppp00700070 = 2;
    public static int pp0070ppp00700070 = 61;
    public String fieldName;
    private int g0067ggggg;
    public boolean isMasked;
    public boolean mUseCaretPos;
    public int numberOfChars;
    public int oldTextPosition;
    public String oldTextString;
    private boolean p0070p0070007000700070;
    private boolean ppp0070007000700070;
    public long registeredTimestamp;
    public ArrayList<String> oldTextStrings = new ArrayList<>();
    private int pp00700070007000700070 = 0;
    public SyncedJSONArray editTextTimings = new SyncedJSONArray();
    private int gg0067gggg = -1;
    private int g00670067gggg = -1;
    private long ggg0067ggg = -1;
    public yyylyyy filteredValues = new yyylyyy();
    private final oooddoo[] g0067gg0067gg = new oooddoo[3];

    public static class oooddoo {
        public static int p0070007000700070p00700070 = 2;
        public static int p0070p00700070p00700070 = 76;
        public static int pp007000700070p00700070 = 1;
        private int g0067006700670067gg;
        private String g00670067g0067gg;
        private int g0067g00670067gg;
        private int gg006700670067gg;
        private long gg0067g0067gg;
        private int ggg00670067gg;

        public oooddoo(long j, String str, int i, int i2, int i3, int i4) {
            set(j, str, i, i2, i3, i4);
        }

        public static int p0070ppp007000700070() {
            return 1;
        }

        public static int ppppp007000700070() {
            return 72;
        }

        public void set(long j, String str, int i, int i2, int i3, int i4) {
            this.gg0067g0067gg = j;
            this.g00670067g0067gg = str;
            this.ggg00670067gg = i;
            this.g0067g00670067gg = i2;
            this.gg006700670067gg = i3;
            this.g0067006700670067gg = i4;
            int i5 = p0070p00700070p00700070;
            if (((pp007000700070p00700070 + i5) * i5) % p0070007000700070p00700070 != 0) {
                p0070p00700070p00700070 = 26;
                pp007000700070p00700070 = ppppp007000700070();
            }
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pp0070p0070ppp("z{k5\u007f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741313)), (char) (yllylll.r007200720072r00720072() ^ (-1146716749)), (char) (yyyllll.rrrr007200720072() ^ 383821865)));
            sb.append(this.gg0067g0067gg);
            sb.append(uuxuuuu.pppp0070ppp("la7)=:\u0001n", (char) (yllylll.r007200720072r00720072() ^ (-1146716701)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
            sb.append(this.g00670067g0067gg);
            sb.append(uuxuuuu.pppp0070ppp("HNC\b\u0015\u001c\u0016\u001dc", (char) (ylyylll.r0072rrr00720072() ^ (-1691741239)), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
            sb.append(this.g0067g00670067gg);
            sb.append(uuxuuuu.pp0070p0070ppp("IS(y\rl\u0002C*", (char) (yyyllll.rrrr007200720072() ^ 383821878), (char) (ylyylll.r0072rrr00720072() ^ (-1691741242)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
            sb.append(this.gg006700670067gg);
            int i = p0070p00700070p00700070;
            if (((pp007000700070p00700070 + i) * i) % p0070007000700070p00700070 != 0) {
                p0070p00700070p00700070 = 39;
                pp007000700070p00700070 = 97;
            }
            sb.append(uuxuuuu.pp0070p0070ppp("}r5;J<J\u0013", (char) (yllylll.r007200720072r00720072() ^ (-1146716788)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741350)), (char) ((-1349847053) ^ yylylll.r0072r0072r00720072())));
            sb.append(this.g0067006700670067gg);
            return sb.toString();
        }

        public boolean vvv00760076vv(long j, String str, int i, int i2, int i3, int i4) {
            if (this.gg0067g0067gg != j || !Objects.equals(this.g00670067g0067gg, str) || this.ggg00670067gg != i) {
                return false;
            }
            int i5 = p0070p00700070p00700070;
            if (((p0070ppp007000700070() + i5) * i5) % p0070007000700070p00700070 != 0) {
                p0070p00700070p00700070 = ppppp007000700070();
                pp007000700070p00700070 = 83;
            }
            return this.g0067g00670067gg == i2 && this.gg006700670067gg == i3 && this.g0067006700670067gg == i4;
        }
    }

    public static int p00700070007000700070p0070() {
        return 73;
    }

    public static int ppp00700070p00700070() {
        return 0;
    }

    public static int ppp0070pp00700070() {
        return 2;
    }

    public static int pppppp00700070() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v0076007600760076vv(org.json.JSONArray r25, com.behaviosec.rl.yllllyy r26, com.behaviosec.rl.yyylyyy r27) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.oddodoo.v0076007600760076vv(org.json.JSONArray, com.behaviosec.rl.yllllyy, com.behaviosec.rl.yyylyyy):void");
    }

    private synchronized boolean v0076v00760076vv(String str, int i, CharSequence charSequence, int i2, int i3, int i4, int i5) {
        try {
            long lastDown = ooodood.getLastDown();
            try {
                oooddoo oooddooVar = this.g0067gg0067gg[i];
                if (oooddooVar == null) {
                    this.g0067gg0067gg[i] = new oooddoo(lastDown, charSequence.toString(), i2, i3, i4, i5);
                    return false;
                }
                boolean zVvv00760076vv = oooddooVar.vvv00760076vv(lastDown, charSequence.toString(), i2, i3, i4, i5);
                if (zVvv00760076vv) {
                    String dTag = getDTag();
                    StringBuilder sb = new StringBuilder();
                    sb.append(uuxuuuu.pppp0070ppp("GIKRBN/?QL\u001a>6B:75\u0015E3;@>qqg()9-20z", (char) (yylylll.r0072r0072r00720072() ^ (-1349847059)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))));
                    sb.append(str);
                    sb.append(uuxuuuu.pp0070p0070ppp("\u001c+", (char) (yllylll.r007200720072r00720072() ^ (-1146716823)), (char) (yllylll.r007200720072r00720072() ^ (-1146716727)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
                    sb.append(oooddooVar);
                    char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383822046);
                    int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
                    int iP00700070007000700070p0070 = p00700070007000700070p0070();
                    if (((pppppp00700070() + iP00700070007000700070p0070) * iP00700070007000700070p0070) % p0070pppp00700070 != 0) {
                        p0070pppp00700070 = p00700070007000700070p0070();
                    }
                    sb.append(uuxuuuu.pppp0070ppp("\u0005NH[\tLW[PYTT\u0011f[Y\u0015[m]gn'\u001c_cbavuh$wkk}wnlz\u0002", cRrrr007200720072, (char) (iR0072r0072r00720072 ^ (-1349847053))));
                    LogBridge.d(dTag, sb.toString());
                } else {
                    oooddooVar.set(lastDown, charSequence.toString(), i2, i3, i4, i5);
                }
                return zVvv00760076vv;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void v0076vvv0076v(JSONArray jSONArray, double d) throws JSONException {
        if (d <= 0.0d || ooodood.ignoreFeaturesSet.contains(uuxuuuu.pppp0070ppp("\n9", (char) (yylylll.r0072r0072r00720072() ^ (-1349847232)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))))) {
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        if (ooodood.useCompactSensorFormat) {
            jSONArray2.put(0);
            if ((p00700070007000700070p0070() * (pppppp00700070() + p00700070007000700070p0070())) % p0070pppp00700070 != p0070p0070pp00700070) {
                pp0070ppp00700070 = 8;
                p0070p0070pp00700070 = p00700070007000700070p0070();
            }
        } else {
            jSONArray2.put(uuxuuuu.pp0070p0070ppp("$'", (char) (ylyylll.r0072rrr00720072() ^ (-1691741292)), (char) (yllylll.r007200720072r00720072() ^ (-1146716870)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
        }
        jSONArray2.put(d);
        jSONArray.put(jSONArray2);
    }

    private double vv007600760076vv(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return 0.0d;
        }
        BigDecimal scale = BigDecimal.valueOf(d).setScale(4, RoundingMode.HALF_UP);
        int i = pp0070ppp00700070;
        if (((p00700070ppp00700070 + i) * i) % p0070pppp00700070 != ppp00700070p00700070()) {
            pp0070ppp00700070 = p00700070007000700070p0070();
            p0070p0070pp00700070 = p00700070007000700070p0070();
        }
        return scale.doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void vvvvv0076v(org.json.JSONArray r27, com.behaviosec.rl.yllllyy r28, com.behaviosec.rl.yyylyyy r29) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.oddodoo.vvvvv0076v(org.json.JSONArray, com.behaviosec.rl.yllllyy, com.behaviosec.rl.yyylyyy):void");
    }

    public void addKeyEvent(int i, int i2, long j, int i3, double d, yllllyy yllllyyVar, yllllyy yllllyyVar2) {
        if (this.isMasked) {
            if (i3 < 0 || !this.mUseCaretPos) {
                i3 = this.pp00700070007000700070;
            }
            int i4 = (i3 + 1) * (-1);
            if (i2 >= 32) {
                i2 = i4;
            }
            if (i == 1) {
                this.pp00700070007000700070 = i2 == 8 ? this.pp00700070007000700070 - 1 : this.pp00700070007000700070 + 1;
            }
        }
        if (ooodood.monitoringEnabled) {
            String str = uuxuuuu.pp0070p0070ppp("hjiOh{Fvdlq$", (char) (yyyllll.rrrr007200720072() ^ 383821939), (char) (yylylll.r0072r0072r00720072() ^ (-1349847252)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + i + uuxuuuu.pppp0070ppp("K", (char) (yyyllll.rrrr007200720072() ^ 383821940), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))) + i2 + uuxuuuu.pppp0070ppp("RH", (char) (yyyllll.rrrr007200720072() ^ 383822061), (char) (yyyllll.rrrr007200720072() ^ 383821865));
            String dTag = getDTag();
            StringBuilder sbS = a.s(str);
            sbS.append(uuxuuuu.pppp0070ppp("_UZS)\u0010", (char) (ylyylll.r0072rrr00720072() ^ (-1691741423)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))));
            sbS.append(j);
            LogBridge.d(dTag, sbS.toString());
            if (this.editTextTimings != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(i);
                    jSONArray.put(i2);
                    jSONArray.put(j);
                    v0076vvv0076v(jSONArray, d);
                    if (!ooodood.noAccSensor.get()) {
                        v0076007600760076vv(jSONArray, yllllyyVar, this.filteredValues);
                    }
                    if (!ooodood.noGyroSensor.get()) {
                        vvvvv0076v(jSONArray, yllllyyVar2, this.filteredValues);
                    }
                    this.editTextTimings.put(jSONArray);
                } catch (JSONException e) {
                    LogBridge.e(getDTag(), str, e);
                }
                if (i == 1) {
                    if (this.g00670067gggg == i2 && this.gg0067gggg == 0) {
                        int i5 = 4;
                        while (true) {
                            try {
                                i5 /= 0;
                            } catch (Exception unused) {
                                pp0070ppp00700070 = p00700070007000700070p0070();
                                long j2 = j - this.ggg0067ggg;
                                LogBridge.i(getDTag(), this.fieldName + uuxuuuu.pppp0070ppp("Xy:\u001d~6a:t", (char) (ylyylll.r0072rrr00720072() ^ (-1691741373)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))) + j2);
                            }
                        }
                    }
                    LogBridge.d(getDTag(), this.fieldName + uuxuuuu.pppp0070ppp("J1", (char) (yylylll.r0072r0072r00720072() ^ (-1349847128)), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + this.editTextTimings.toString());
                }
                this.gg0067gggg = i;
                this.g00670067gggg = i2;
                this.ggg0067ggg = j;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void afterTextChanged(android.text.Editable r15) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.oddodoo.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str = uuxuuuu.pppp0070ppp("-13=A5%7KH\u0018>8F@??\u0004\u0006}\u0006", (char) (yllylll.r007200720072r00720072() ^ (-1146716756)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))) + this.fieldName + uuxuuuu.pppp0070ppp("%", (char) (yllylll.r007200720072r00720072() ^ (-1146716812)), (char) (yyyllll.rrrr007200720072() ^ 383821859));
        if ((p00700070007000700070p0070() * (p00700070007000700070p0070() + p00700070ppp00700070)) % p0070pppp00700070 != p0070p0070pp00700070) {
            pp0070ppp00700070 = p00700070007000700070p0070();
            p0070p0070pp00700070 = 61;
        }
        if (v0076v00760076vv(str, 0, charSequence, i, i2, 0, i3)) {
            return;
        }
        String dTag = getDTag();
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pp0070p0070ppp("dI", (char) (yllylll.r007200720072r00720072() ^ (-1146716872)), (char) (yllylll.r007200720072r00720072() ^ (-1146716885)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
        sbS.append((Object) charSequence);
        LogBridge.d(dTag, sbS.toString());
        this.oldTextString = charSequence.toString();
        if (i == 0 && i2 == charSequence.length()) {
            this.oldTextPosition = i3 - 1;
        } else {
            this.oldTextPosition = i;
        }
        this.ppp0070007000700070 = i3 == 0 || (i == 0 && i2 == charSequence.length() && i3 < i2);
        this.oldTextStrings.add(this.oldTextString);
    }

    public void clear() {
        this.editTextTimings.clear();
        this.numberOfChars = 0;
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                pp0070ppp00700070 = p00700070007000700070p0070();
                int i = 0;
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        pp0070ppp00700070 = 97;
                        while (true) {
                            try {
                                i /= 0;
                            } catch (Exception unused3) {
                                pp0070ppp00700070 = p00700070007000700070p0070();
                                this.filteredValues = new yyylyyy();
                                this.oldTextStrings.clear();
                                this.pp00700070007000700070 = 0;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public abstract String getDTag();

    public final JSONObject getDataIntegrityTarget() throws JSONException {
        uuxuuuu.pppp0070ppp("nm}Nl\u0001nW}\u0005vy\u0006}\n\u0010ky\f\u0002\u0001\u0011EG", (char) (yylylll.r0072r0072r00720072() ^ (-1349847119)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343)));
        JSONObject jSONObject = new JSONObject();
        if ((p00700070007000700070p0070() * (p00700070007000700070p0070() + p00700070ppp00700070)) % ppp0070pp00700070() != p0070p0070pp00700070) {
            pp0070ppp00700070 = 86;
            p0070p0070pp00700070 = 85;
        }
        try {
            jSONObject.put(this.fieldName, this.numberOfChars);
            return jSONObject;
        } catch (JSONException e) {
            LogBridge.e(getDTag(), uuxuuuu.pppp0070ppp("~}\u000e^|\u0011~g\u000e\u0015\u0007\n\u0016\u000e\u001a {\n\u001c\u0012\u0011!UW", (char) (ylyylll.r0072rrr00720072() ^ (-1691741277)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))), e);
            return jSONObject;
        }
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public final JSONArray getJSONArrayEditTextTimings() {
        int i = pp0070ppp00700070;
        if (((p00700070ppp00700070 + i) * i) % p0070pppp00700070 != p0070p0070pp00700070) {
            pp0070ppp00700070 = 55;
            p0070p0070pp00700070 = p00700070007000700070p0070();
        }
        return this.editTextTimings.getJSONArray();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        String str = uuxuuuu.pppp0070ppp("Kw\u000e@e'cR#=:T\u001fZ}\u0010D", (char) (yylylll.r0072r0072r00720072() ^ (-1349847072)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))) + this.fieldName + uuxuuuu.pp0070p0070ppp("K", (char) (yllylll.r007200720072r00720072() ^ (-1146716726)), (char) (yyyllll.rrrr007200720072() ^ 383821899), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)));
        if (v0076v00760076vv(str, 1, charSequence, i, i3, i2, 0)) {
            return;
        }
        String dTag = getDTag();
        StringBuilder sbS = a.s(str);
        sbS.append(uuxuuuu.pp0070p0070ppp(")\u000e", (char) (yyyllll.rrrr007200720072() ^ 383822022), (char) (yllylll.r007200720072r00720072() ^ (-1146716843)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        sbS.append((Object) charSequence);
        LogBridge.d(dTag, sbS.toString());
        this.numberOfChars = charSequence.length();
        this.g0067ggggg = i;
        if (i3 == 0 && i2 == 0) {
            if ((p00700070007000700070p0070() * (p00700070007000700070p0070() + p00700070ppp00700070)) % p0070pppp00700070 != p0070p0070pp00700070) {
                pp0070ppp00700070 = p00700070007000700070p0070();
                p0070p0070pp00700070 = 17;
            }
            z = true;
        } else {
            z = false;
        }
        this.p0070p0070007000700070 = z;
    }
}
