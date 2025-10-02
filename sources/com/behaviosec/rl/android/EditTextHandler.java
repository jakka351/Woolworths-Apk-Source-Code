package com.behaviosec.rl.android;

import YU.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.oddoddo;
import com.behaviosec.rl.oddoodo;
import com.behaviosec.rl.odooddo;
import com.behaviosec.rl.oododoo;
import com.behaviosec.rl.ooodood;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyllyl;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.ylyylyl;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import com.behaviosec.rl.yyyllyl;
import com.google.android.gms.ads.RequestConfiguration;
import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class EditTextHandler implements ViewGroup.OnHierarchyChangeListener {
    private static final String e0065ee0065e0065;
    public static int v007600760076vvv0076 = 1;
    public static int v0076vv0076vv0076 = 0;
    public static int vvv00760076vv0076 = 8;
    public static int vvvv0076vv0076 = 2;
    private boolean e0065006500650065e0065;
    private ylyylyl e00650065e0065e0065;
    private oododoo e0065e00650065e0065;
    private String e0065eee00650065;
    private oddoodo ee006500650065e0065;
    private Context ee0065e0065e0065;
    private ylyllyl ee0065ee00650065;
    private View eee00650065e0065;
    private final SyncedWeakHashMap<EditText, odooddo> eeeee00650065 = new SyncedWeakHashMap<>();

    static {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716695));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821867);
        int i = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != 0) {
            vvv00760076vv0076 = 21;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        e0065ee0065e0065 = uuxuuuu.pppp0070ppp("\u0004\"&0\u000f\u001f1,~\u0017#\u0018\u001f\u0017#", cR007200720072r00720072, cRrrr007200720072);
    }

    public EditTextHandler(@NonNull Context context, @Nullable ylyylyl ylyylylVar, @NonNull View view, @NonNull oododoo oododooVar, @NonNull ylyllyl ylyllylVar, @NonNull oddoodo oddoodoVar) throws Exception {
        this.ee0065e0065e0065 = context;
        this.e00650065e0065e0065 = ylyylylVar;
        this.eee00650065e0065 = view;
        this.e0065e00650065e0065 = oododooVar;
        this.ee006500650065e0065 = oddoodoVar;
        this.e0065006500650065e0065 = !oddoodoVar.listenHierarchyChanges();
        this.e0065eee00650065 = context.getClass().getSimpleName();
        this.ee0065ee00650065 = ylyllylVar;
        addAll(view);
        ssssss0073();
    }

    public static /* synthetic */ String s00730073007300730073s(EditTextHandler editTextHandler) {
        int i = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i) * i) % v00760076v0076vv0076() != 0) {
            vvv00760076vv0076 = 64;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        return editTextHandler.e0065eee00650065;
    }

    private List<View> s0073007300730073s0073(Class cls, Object obj) throws Exception {
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        if ((vv00760076vvv0076() * (vv00760076vvv0076() + v007600760076vvv0076)) % vvvv0076vv0076 != v0076vv0076vv0076) {
            vvv00760076vv0076 = 80;
            v0076vv0076vv0076 = 71;
        }
        Field declaredField = cls.getDeclaredField(uuxuuuu.pppp0070ppp("iQc^wr", (char) (iR0072r0072r00720072 ^ (-1349847159)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        return obj2 instanceof List ? (List) declaredField.get(obj) : obj2 instanceof View[] ? Arrays.asList((View[]) declaredField.get(obj)) : new ArrayList();
    }

    private static boolean s007300730073ss0073(int i) {
        if (i != 18) {
            return false;
        }
        int i2 = 3;
        while (true) {
            try {
                i2 /= 0;
            } catch (Exception unused) {
                vvv00760076vv0076 = 49;
                return true;
            }
        }
    }

    private static boolean s00730073s0073s0073(int i) {
        if (i == 225) {
            return true;
        }
        int i2 = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i2) * i2) % vvvv0076vv0076 != 0) {
            vvv00760076vv0076 = 55;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String s00730073sss0073(@androidx.annotation.NonNull android.widget.EditText r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r4.getTag()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L30
            int r1 = com.behaviosec.rl.android.EditTextHandler.vvv00760076vv0076
            int r2 = com.behaviosec.rl.android.EditTextHandler.v007600760076vvv0076
            int r2 = r2 + r1
            int r2 = r2 * r1
            int r1 = v00760076v0076vv0076()
            int r2 = r2 % r1
            int r1 = v0076v00760076vv0076()
            if (r2 == r1) goto L26
            r1 = 18
            com.behaviosec.rl.android.EditTextHandler.vvv00760076vv0076 = r1
            r1 = 5
            com.behaviosec.rl.android.EditTextHandler.v0076vv0076vv0076 = r1
        L26:
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L41
        L30:
            java.lang.CharSequence r1 = r4.getContentDescription()
            if (r1 == 0) goto L41
            java.lang.CharSequence r4 = r4.getContentDescription()
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L41
            return r4
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.android.EditTextHandler.s00730073sss0073(android.widget.EditText):java.lang.String");
    }

    public static /* synthetic */ oddoodo s0073s007300730073s(EditTextHandler editTextHandler) {
        oddoodo oddoodoVar = editTextHandler.ee006500650065e0065;
        int i = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != v0076vv0076vv0076) {
            vvv00760076vv0076 = 29;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        return oddoodoVar;
    }

    private void s0073s00730073s0073(@NonNull EditText editText) {
        odooddo odooddoVar = this.eeeee00650065.get(editText);
        if (odooddoVar != null) {
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u001f=AK*:LG\u001a2>3:2>", (char) (yyyllll.rrrr007200720072() ^ 383821966), (char) (yyyllll.rrrr007200720072() ^ 383821868));
            StringBuilder sb = new StringBuilder();
            sb.append(uuxuuuu.pppp0070ppp("\u0004", (char) (yllylll.r007200720072r00720072() ^ (-1146716767)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
            sb.append(this.e0065eee00650065);
            int i = vvv00760076vv0076;
            if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != 0) {
                vvv00760076vv0076 = vv00760076vvv0076();
                v0076vv0076vv0076 = 7;
            }
            sb.append(uuxuuuu.pp0070p0070ppp("%h\u001c09<D8>8q\u00188>J+=QNzBOML\u007f7KH[\u001f\u0006", (char) (ylyylll.r0072rrr00720072() ^ (-1691741424)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847105)), (char) (yyyllll.rrrr007200720072() ^ 383821864)));
            sb.append(odooddoVar.getFieldName());
            LogBridge.v(strPppp0070ppp, sb.toString());
            ss007300730073s0073(odooddoVar, false);
        }
    }

    private List<View> s0073s0073ss0073() throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp(">", (char) (yllylll.r007200720072r00720072() ^ (-1146716878)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741431)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
        sb.append(this.e0065eee00650065);
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        int i = vvv00760076vv0076;
        if (((vv0076v0076vv0076() + i) * i) % vvvv0076vv0076 != 0) {
            vvv00760076vv0076 = vv00760076vvv0076();
            v0076vv0076vv0076 = 35;
        }
        sb.append(uuxuuuu.pppp0070ppp("P\u0014\\[kObh_ktK`nbihv[ol\u007f|24,", (char) (iR007200720072r00720072 ^ (-1146716808)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))));
        String string = sb.toString();
        try {
            Class<?> cls = Class.forName(uuxuuuu.pppp0070ppp("bncple_(oa\\m#K\\`U_f;NZLQNZ.RTFDN", (char) (yylylll.r0072r0072r00720072() ^ (-1349847080)), (char) (yyyllll.rrrr007200720072() ^ 383821865)));
            return s0073007300730073s0073(cls, cls.getMethod(uuxuuuu.pppp0070ppp("\u0012\u000f\u001dp\u0015\u0019\u0019\u0005\u0011\u0005\u0006", (char) (yllylll.r007200720072r00720072() ^ (-1146716832)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), null).invoke(null, null));
        } catch (Exception e) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp(":X\\fEUgb5MYNUMY", (char) (ylyylll.r0072rrr00720072() ^ (-1691741272)), (char) (yllylll.r007200720072r00720072() ^ (-1146716735)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), string, e);
            return new ArrayList();
        }
    }

    private boolean s0073ss0073s0073(int i) {
        int i2 = i & l3.b;
        int i3 = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i3) * i3) % vvvv0076vv0076 != 0) {
            vvv00760076vv0076 = 38;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        return ss0073s0073s0073(i2) || s00730073s0073s0073(i2) || s007300730073ss0073(i2);
    }

    @Nullable
    private Activity s0073ssss0073(@NonNull Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ SyncedWeakHashMap ss0073007300730073s(EditTextHandler editTextHandler) {
        int i = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != 0) {
            vvv00760076vv0076 = 35;
            v0076vv0076vv0076 = vv00760076vvv0076();
        }
        return editTextHandler.eeeee00650065;
    }

    private void ss007300730073s0073(@NonNull odooddo odooddoVar, boolean z) {
        LogBridge.i(uuxuuuu.pp0070p0070ppp("\t)/;\u001c.B?\u0014.<3<6D", (char) (ylyylll.r0072rrr00720072() ^ (-1691741262)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741300)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pp0070p0070ppp(RequestConfiguration.MAX_AD_CONTENT_RATING_T, (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)), (char) (yyyllll.rrrr007200720072() ^ 383821871), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + this.e0065eee00650065 + uuxuuuu.pppp0070ppp("'j\u001117C$6JGsG;DGO??\u0016|", (char) (yylylll.r0072r0072r00720072() ^ (-1349847279)), (char) (yyyllll.rrrr007200720072() ^ 383821859)) + odooddoVar.getFieldName());
        odooddoVar.remove();
        oddoddo oddoddoVarAaa00610061aa = odooddoVar.aaa00610061aa();
        if (z && oddoddoVarAaa00610061aa != null) {
            oddoddoVarAaa00610061aa.clear();
        }
        if ((vv00760076vvv0076() * (vv00760076vvv0076() + v007600760076vvv0076)) % vvvv0076vv0076 != v0076vv0076vv0076) {
            vvv00760076vv0076 = 76;
            v0076vv0076vv0076 = 74;
        }
        EditText editTextA006100610061aaa = odooddoVar.a006100610061aaa();
        if (editTextA006100610061aaa == null) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = editTextA006100610061aaa.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof BehavioFocusChangeListener) {
            editTextA006100610061aaa.setOnFocusChangeListener(((BehavioFocusChangeListener) onFocusChangeListener).a0061aaa0061a());
        }
    }

    private boolean ss00730073ss0073(@NonNull EditText editText) throws Exception {
        Boolean boolShouldBeMonitored;
        if (this.ee006500650065e0065.getFieldCallback() != null && (boolShouldBeMonitored = this.ee006500650065e0065.getFieldCallback().shouldBeMonitored(editText)) != null) {
            return !boolShouldBeMonitored.booleanValue();
        }
        try {
            try {
                try {
                    if (!this.ee006500650065e0065.getIgnoredFields().contains(editText.getResources().getResourceEntryName(editText.getId()))) {
                        return false;
                    }
                    int i = vvv00760076vv0076;
                    if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != 0) {
                        vvv00760076vv0076 = 51;
                        v0076vv0076vv0076 = vv00760076vvv0076();
                    }
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Resources.NotFoundException unused) {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private boolean ss0073s0073s0073(int i) {
        if (i != 129) {
            return false;
        }
        int i2 = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i2) * i2) % vvvv0076vv0076 != v0076v00760076vv0076()) {
            vvv00760076vv0076 = vv00760076vvv0076();
            v0076vv0076vv0076 = 96;
        }
        return true;
    }

    private String ss0073sss0073(@NonNull EditText editText) throws Resources.NotFoundException {
        String strS00730073sss0073;
        String strPp0070p0070ppp;
        if (this.ee006500650065e0065.getFieldCallback() != null) {
            strS00730073sss0073 = this.ee006500650065e0065.getFieldCallback().getFieldName(editText);
            if (strS00730073sss0073 != null && !strS00730073sss0073.trim().isEmpty()) {
                return strS00730073sss0073;
            }
        } else {
            strS00730073sss0073 = null;
        }
        if (ssss0073s0073(editText)) {
            if ((vv00760076vvv0076() * (vv00760076vvv0076() + v007600760076vvv0076)) % vvvv0076vv0076 != v0076vv0076vv0076) {
                vvv00760076vv0076 = 18;
                v0076vv0076vv0076 = vv00760076vvv0076();
            }
            strPp0070p0070ppp = uuxuuuu.pppp0070ppp("(\u0018)(+\"$\u0015R", (char) (yyyllll.rrrr007200720072() ^ 383821839), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054)));
        } else {
            strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("kz.J)", (char) (ylyylll.r0072rrr00720072() ^ (-1691741409)), (char) (yllylll.r007200720072r00720072() ^ (-1146716821)), (char) (yyyllll.rrrr007200720072() ^ 383821868));
        }
        try {
            strS00730073sss0073 = editText.getResources().getResourceEntryName(editText.getId());
        } catch (Resources.NotFoundException unused) {
        }
        if (strS00730073sss0073 == null || strS00730073sss0073.trim().isEmpty()) {
            strS00730073sss0073 = s00730073sss0073(editText);
        }
        if (strS00730073sss0073 == null || strS00730073sss0073.trim().isEmpty()) {
            strS00730073sss0073 = uuxuuuu.pppp0070ppp("A\b\u000e0c\f~_\u0016", (char) (ylyylll.r0072rrr00720072() ^ (-1691741325)), (char) (yyyllll.rrrr007200720072() ^ 383821869));
        }
        if (!this.ee006500650065e0065.removeSuffix()) {
            StringBuilder sbS = a.s(strS00730073sss0073);
            sbS.append(uuxuuuu.pp0070p0070ppp("n\u0017\u001d", (char) (yllylll.r007200720072r00720072() ^ (-1146716734)), (char) (yyyllll.rrrr007200720072() ^ 383822005), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
            sbS.append(editText.hashCode());
            strS00730073sss0073 = sbS.toString();
        }
        return a.g(strPp0070p0070ppp, strS00730073sss0073);
    }

    private void sss00730073s0073(@NonNull final EditText editText) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.behaviosec.rl.android.EditTextHandler.1
            public static int v00760076vv0076v0076 = 1;
            public static int vv0076vv0076v0076 = 36;

            public static int vvv0076v0076v0076() {
                return 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                odooddo odooddoVar;
                odooddo odooddoVar2;
                if (EditTextHandler.s0073s007300730073s(EditTextHandler.this).getFieldCallback() != null) {
                    String fieldName = EditTextHandler.s0073s007300730073s(EditTextHandler.this).getFieldCallback().getFieldName(editText);
                    if (fieldName != null && !fieldName.trim().isEmpty() && (odooddoVar2 = (odooddo) EditTextHandler.ss0073007300730073s(EditTextHandler.this).get(editText)) != null && !odooddoVar2.getFieldName().equals(fieldName)) {
                        LogBridge.v(uuxuuuu.pppp0070ppp("_\u007f\u0006\u0012r\u0005\u0019\u0016j\u0005\u0013\n\u0013\r\u001b", (char) (yyyllll.rrrr007200720072() ^ 383821991), (char) (yyyllll.rrrr007200720072() ^ 383821859)), uuxuuuu.pp0070p0070ppp("h", (char) (yyyllll.rrrr007200720072() ^ 383821913), (char) (yllylll.r007200720072r00720072() ^ (-1146716878)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))) + EditTextHandler.s00730073007300730073s(EditTextHandler.this) + uuxuuuu.pppp0070ppp("\\ FflxYk\u007f|)|pzn{tt1x\u0006\u0004\u00036", (char) (yllylll.r007200720072r00720072() ^ (-1146716873)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))) + odooddoVar2.getFieldName() + uuxuuuu.pp0070p0070ppp("mV06", (char) (yyyllll.rrrr007200720072() ^ 383822003), (char) (yyyllll.rrrr007200720072() ^ 383821883), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))) + fieldName);
                        odooddoVar2.setFieldName(fieldName);
                    }
                    String fieldType = EditTextHandler.s0073s007300730073s(EditTextHandler.this).getFieldCallback().getFieldType(editText);
                    if (fieldType != null) {
                        int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821948;
                        int i = vv0076vv0076v0076;
                        if (((v00760076vv0076v0076 + i) * i) % vvv0076v0076v0076() != 0) {
                            vv0076vv0076v0076 = 46;
                            v00760076vv0076v0076 = 56;
                        }
                        if ((!fieldType.equals(uuxuuuu.pp0070p0070ppp("\u001b#", (char) iRrrr007200720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847216)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))) && !fieldType.equals(uuxuuuu.pppp0070ppp("=", (char) (yllylll.r007200720072r00720072() ^ (-1146716768)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))))) || (odooddoVar = (odooddo) EditTextHandler.ss0073007300730073s(EditTextHandler.this).get(editText)) == null || odooddoVar.aaaa0061aa().equals(fieldType)) {
                            return;
                        }
                        LogBridge.v(uuxuuuu.pp0070p0070ppp("{\u001c\".\u000f!52\u0007!/&/)7", (char) (yllylll.r007200720072r00720072() ^ (-1146716777)), (char) (yllylll.r007200720072r00720072() ^ (-1146716898)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), uuxuuuu.pp0070p0070ppp(q2.c, (char) (yllylll.r007200720072r00720072() ^ (-1146716900)), (char) (yyyllll.rrrr007200720072() ^ 383822060), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))) + EditTextHandler.s00730073007300730073s(EditTextHandler.this) + uuxuuuu.pppp0070ppp("*k\u0010.2<\u001b+=8bi", (char) (yylylll.r0072r0072r00720072() ^ (-1349847103)), (char) ((-1691741330) ^ ylyylll.r0072rrr00720072())) + odooddoVar.getFieldName() + uuxuuuu.pp0070p0070ppp("M\u0018uVW\u001esA ,\u0003\u0016\u001foEW|\fU!", (char) (yyyllll.rrrr007200720072() ^ 383821936), (char) (yyyllll.rrrr007200720072() ^ 383821944), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + odooddoVar.aaaa0061aa() + uuxuuuu.pppp0070ppp("\u000b`\\\u000e", (char) (yyyllll.rrrr007200720072() ^ 383821907), (char) ((-1146716792) ^ yllylll.r007200720072r00720072())) + fieldType);
                        odooddoVar.a0061aaaaa(fieldType);
                    }
                }
            }
        }, 500L);
    }

    @Nullable
    private Window sss0073ss0073(@NonNull View view) throws Exception {
        String str = uuxuuuu.pp0070p0070ppp("e", (char) (yyyllll.rrrr007200720072() ^ 383822052), (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("^ fcqSdh]gn\u001e", (char) (yllylll.r007200720072r00720072() ^ (-1146716814)), (char) (yllylll.r007200720072r00720072() ^ (-1146716811)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + Build.VERSION.SDK_INT + uuxuuuu.pp0070p0070ppp("\u00176", (char) (ylyylll.r0072rrr00720072() ^ (-1691741317)), (char) (yllylll.r007200720072r00720072() ^ (-1146716686)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("6i\u001a\u0002M(io\u0018UN6! >L\u000f%?b_]+,\u0004YRSCW1\u001c\u0007Ux3(", (char) (yyyllll.rrrr007200720072() ^ 383822078), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)));
        String strPppp0070ppp2 = uuxuuuu.pppp0070ppp("P;NTKW`", (char) (yyyllll.rrrr007200720072() ^ 383821850), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046)));
        try {
            try {
                Class<?> cls = Class.forName(strPppp0070ppp);
                if (!cls.isInstance(view)) {
                    return null;
                }
                int i = vvv00760076vv0076;
                if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != 0) {
                    vvv00760076vv0076 = vv00760076vvv0076();
                    v0076vv0076vv0076 = vv00760076vvv0076();
                }
                try {
                    Field declaredField = cls.getDeclaredField(strPppp0070ppp2);
                    declaredField.setAccessible(true);
                    return (Window) declaredField.get(view);
                } catch (Exception e) {
                    throw e;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException e2) {
                LogBridge.d(uuxuuuu.pppp0070ppp("eT'\u001bz`O$>{\u000b\u001bmlm", (char) (ylyylll.r0072rrr00720072() ^ (-1691741305)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), str + e2.getMessage());
                return null;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private boolean ssss0073s0073(@NonNull EditText editText) throws Exception {
        String fieldType;
        if (this.ee006500650065e0065.getFieldCallback() != null && (fieldType = this.ee006500650065e0065.getFieldCallback().getFieldType(editText)) != null) {
            if (fieldType.equals(uuxuuuu.pp0070p0070ppp("\f\u0014", (char) (ylyylll.r0072rrr00720072() ^ (-1691741364)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847284)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))))) {
                return true;
            }
            if (fieldType.equals(uuxuuuu.pp0070p0070ppp("\"", (char) (ylyylll.r0072rrr00720072() ^ (-1691741395)), (char) (yllylll.r007200720072r00720072() ^ (-1146716689)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))))) {
                return false;
            }
        }
        try {
            try {
                String resourceEntryName = editText.getResources().getResourceEntryName(editText.getId());
                if (!resourceEntryName.isEmpty()) {
                    if (this.ee006500650065e0065.getMaskedFields().contains(resourceEntryName)) {
                        return true;
                    }
                    try {
                        if (this.ee006500650065e0065.getNormalFields().contains(resourceEntryName)) {
                            return false;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused) {
                        vvv00760076vv0076 = vv00760076vvv0076();
                        while (true) {
                            try {
                                int[] iArr2 = new int[-1];
                            } catch (Exception unused2) {
                                vvv00760076vv0076 = vv00760076vvv0076();
                                if (this.ee006500650065e0065.isAnonymousMaskedCollection()) {
                                    return true;
                                }
                                return s0073ss0073s0073(editText.getInputType());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Resources.NotFoundException unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ssssss0073() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.android.EditTextHandler.ssssss0073():void");
    }

    public static int v00760076v0076vv0076() {
        return 2;
    }

    public static int v0076v00760076vv0076() {
        return 0;
    }

    public static int vv00760076vvv0076() {
        return 66;
    }

    public static int vv0076v0076vv0076() {
        return 1;
    }

    public void add(@NonNull EditText editText) throws Resources.NotFoundException {
        LogBridge.d(uuxuuuu.pppp0070ppp("\u001759C\"2D?\u0012*6+2*6", (char) (ylyylll.r0072rrr00720072() ^ (-1691741369)), (char) (yyyllll.rrrr007200720072() ^ 383821868)), uuxuuuu.pppp0070ppp("7", (char) (yyyllll.rrrr007200720072() ^ 383821984), (char) (yyyllll.rrrr007200720072() ^ 383821865)) + this.e0065eee00650065 + uuxuuuu.pppp0070ppp("0s6:;w\u001e>DP1CWT\u001b\u0002", (char) (ylyylll.r0072rrr00720072() ^ (-1691741376)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))) + editText);
        if (editText.getOnFocusChangeListener() instanceof BehavioFocusChangeListener) {
            odooddo odooddoVar = this.eeeee00650065.get(editText);
            if (odooddoVar != null) {
                LogBridge.i(uuxuuuu.pp0070p0070ppp("\u0011iB\u0017J6\u001bb\b\\<{W*\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716734)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741401)), (char) (383821868 ^ yyyllll.rrrr007200720072())), uuxuuuu.pp0070p0070ppp("#", (char) (ylyylll.r0072rrr00720072() ^ (-1691741244)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847190)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("\u0011Rv\u0015\u0019#\u0002\u0012$\u001fI\u000f\u0017\u001c\u0014\tC\u0004\u000e\u0013\u0005\u007f\u0002\u0016;\r~\u007f\u0001\n\ny\u0006wu0\u0007w\u0002ttx)|ok%efvjvhrv6\u001b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741371)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741194)), (char) (383821869 ^ yyyllll.rrrr007200720072())) + odooddoVar.getFieldName());
            }
            int iVv00760076vvv0076 = vv00760076vvv0076();
            if (((v007600760076vvv0076 + iVv00760076vvv0076) * iVv00760076vvv0076) % vvvv0076vv0076 != 0) {
                v007600760076vvv0076 = vv00760076vvv0076();
                return;
            }
            return;
        }
        if (ss00730073ss0073(editText)) {
            LogBridge.i(uuxuuuu.pppp0070ppp("?]eoRbxs:RbWbZj", (char) (yllylll.r007200720072r00720072() ^ (-1146716785)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))), uuxuuuu.pp0070p0070ppp("1", (char) (yylylll.r0072r0072r00720072() ^ (-1349847080)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847089)), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072())) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("mA9:\u0017\u0011\u0019NW$\tWd.u\u001a$U# ", (char) (yyyllll.rrrr007200720072() ^ 383821883), (char) (yylylll.r0072r0072r00720072() ^ (-1349847220)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))) + ss0073sss0073(editText));
            return;
        }
        String strSs0073sss0073 = ss0073sss0073(editText);
        LogBridge.i(uuxuuuu.pp0070p0070ppp("/MQ[:J\\W*BNCJBN", (char) (ylyylll.r0072rrr00720072() ^ (-1691741366)), (char) (yllylll.r007200720072r00720072() ^ (-1146716796)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("[", (char) (yllylll.r007200720072r00720072() ^ (-1146716809)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("\u0012[k\u0012y\fVnuX\u000f<H59\u0017_L", (char) (yllylll.r007200720072r00720072() ^ (-1146716861)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800)), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072())) + strSs0073sss0073);
        odooddo odooddoVarAa0061aaaa = odooddo.aa0061aaaa(this.ee0065e0065e0065, editText, ssss0073s0073(editText) ? uuxuuuu.pp0070p0070ppp("\u0002\b", (char) (yylylll.r0072r0072r00720072() ^ (-1349847114)), (char) (yllylll.r007200720072r00720072() ^ (-1146716759)), (char) (383821869 ^ yyyllll.rrrr007200720072())) : uuxuuuu.pppp0070ppp("t", (char) (yllylll.r007200720072r00720072() ^ (-1146716793)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))));
        if (odooddoVarAa0061aaaa == null) {
            return;
        }
        odooddoVarAa0061aaaa.setFieldName(strSs0073sss0073);
        odooddoVarAa0061aaaa.setRegistered();
        editText.setOnFocusChangeListener(new BehavioFocusChangeListener(this.e0065e00650065e0065, odooddoVarAa0061aaaa, editText.getOnFocusChangeListener()));
        if (editText.hasFocus()) {
            LogBridge.v(uuxuuuu.pppp0070ppp("3SYeFXli>Xf]f`n", (char) (yyyllll.rrrr007200720072() ^ 383821906), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), uuxuuuu.pppp0070ppp("\n", (char) (yllylll.r007200720072r00720072() ^ (-1146716761)), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("6yJJ#MBUT%KESMLL\u0011^]aR\u0017\u000fV`d\u0013hZnk\u0018_c`ha\u001e", (char) (yllylll.r007200720072r00720072() ^ (-1146716828)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847068)), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + strSs0073sss0073);
            odooddoVarAa0061aaaa.aa006100610061aa(true, -1, new Rect());
        }
        this.eeeee00650065.put(editText, odooddoVarAa0061aaaa);
        if (this.ee006500650065e0065.getFieldCallback() != null) {
            sss00730073s0073(editText);
        }
    }

    public void addAll(@NonNull View view) throws Resources.NotFoundException {
        LogBridge.d(uuxuuuu.pppp0070ppp("u\u0016\u001c(\t\u001b/,\u0001\u001b) )#1", (char) (ylyylll.r0072rrr00720072() ^ (-1691741327)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), uuxuuuu.pp0070p0070ppp("HJI%ON\u0001", (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (yllylll.r007200720072r00720072() ^ (-1146716882)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + view);
        for (View view2 : yyyllyl.r0072rr00720072r(view)) {
            if ((view2 instanceof ViewGroup) && !this.e0065006500650065e0065) {
                ((ViewGroup) view2).setOnHierarchyChangeListener(this);
            }
            if (view2 instanceof EditText) {
                LogBridge.d(uuxuuuu.pp0070p0070ppp("\u001b;AM.@TQ&@NENHV", (char) (yllylll.r007200720072r00720072() ^ (-1146716709)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847287)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), uuxuuuu.pp0070p0070ppp("}jT\u001dv\u0016+\u000ebQ\u00156-\t\"", (char) (yllylll.r007200720072r00720072() ^ (-1146716818)), (char) (yyyllll.rrrr007200720072() ^ 383821896), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + view2);
                add((EditText) view2);
            } else if (view2 instanceof WebView) {
                String strPppp0070ppp = uuxuuuu.pppp0070ppp("yKB*aEh|\u0015\u0003\u000ee:\u0006\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821976), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)));
                StringBuilder sb = new StringBuilder();
                sb.append(uuxuuuu.pppp0070ppp("/\u0013+?UL{Y\u0004+$:\u001af", (char) (yylylll.r0072r0072r00720072() ^ (-1349847243)), (char) ((-1146716790) ^ yllylll.r007200720072r00720072())));
                if ((vv00760076vvv0076() * (vv0076v0076vv0076() + vv00760076vvv0076())) % v00760076v0076vv0076() != v0076vv0076vv0076) {
                    v0076vv0076vv0076 = vv00760076vvv0076();
                }
                sb.append(view2);
                LogBridge.d(strPppp0070ppp, sb.toString());
                ylyllyl ylyllylVar = this.ee0065ee00650065;
                if (ylyllylVar != null) {
                    ylyllylVar.add((WebView) view2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) throws Resources.NotFoundException {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741232));
        int i = vvv00760076vv0076;
        if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != v0076vv0076vv0076) {
            vvv00760076vv0076 = vv00760076vvv0076();
            v0076vv0076vv0076 = 62;
        }
        LogBridge.v(uuxuuuu.pp0070p0070ppp("Pf-iKi,w60.0\u0018j=", cR0072rrr00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741352)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), uuxuuuu.pp0070p0070ppp("-", (char) (yylylll.r0072r0072r00720072() ^ (-1349847133)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741274)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("YD7i:^\tYVK|\u0007\u001b\bM$@\u0003\nR", (char) (ylyylll.r0072rrr00720072() ^ (-1691741422)), (char) (yllylll.r007200720072r00720072() ^ (-1146716838)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + view2.toString());
        addAll(view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        LogBridge.v(uuxuuuu.pp0070p0070ppp("DbfpO_ql?WcX_Wc", (char) (yllylll.r007200720072r00720072() ^ (-1146716870)), (char) (yyyllll.rrrr007200720072() ^ 383821977), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pppp0070ppp("\f", (char) (yylylll.r0072r0072r00720072() ^ (-1349847107)), (char) (yyyllll.rrrr007200720072() ^ 383821858)) + this.e0065eee00650065 + uuxuuuu.pp0070p0070ppp("\u0007\u007f8@>lVb\u0003m\n/J\u000e*\\gg\u007f\bF5", (char) (yylylll.r0072r0072r00720072() ^ (-1349847206)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741282)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + view2.toString());
        for (View view3 : yyyllyl.r0072rr00720072r(view2)) {
            if (view3 instanceof EditText) {
                s0073s00730073s0073((EditText) view3);
                this.eeeee00650065.remove((EditText) view3);
                ooodood.s0073ss0073ss((EditText) view3);
            } else if ((view3 instanceof WebView) && this.ee0065ee00650065 != null) {
                int i = vvv00760076vv0076;
                if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != v0076v00760076vv0076()) {
                    vvv00760076vv0076 = 1;
                    v0076vv0076vv0076 = vv00760076vvv0076();
                }
                this.ee0065ee00650065.remove((WebView) view3);
            }
        }
    }

    public void onWindowFocusChanged(boolean z) throws Exception {
        for (EditText editText : this.eeeee00650065.keySet()) {
            if (editText == null) {
                int i = vvv00760076vv0076;
                if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != v0076vv0076vv0076) {
                    vvv00760076vv0076 = vv00760076vvv0076();
                    v0076vv0076vv0076 = vv00760076vvv0076();
                }
            } else {
                odooddo odooddoVar = this.eeeee00650065.get(editText);
                if (odooddoVar != null) {
                    odooddoVar.a0061006100610061aa(z);
                }
            }
        }
        if (!z) {
            ssssss0073();
            return;
        }
        LinkedList<EditText> linkedList = new LinkedList();
        for (EditText editText2 : this.eeeee00650065.keySet()) {
            if (editText2.getWindowToken() == null) {
                linkedList.add(editText2);
            }
        }
        for (EditText editText3 : linkedList) {
            s0073s00730073s0073(editText3);
            this.eeeee00650065.remove(editText3);
        }
    }

    public void removeAll() {
        odooddo odooddoVar;
        for (EditText editText : this.eeeee00650065.keySet()) {
            int i = vvv00760076vv0076;
            if (((v007600760076vvv0076 + i) * i) % vvvv0076vv0076 != v0076vv0076vv0076) {
                vvv00760076vv0076 = vv00760076vvv0076();
                v0076vv0076vv0076 = 83;
            }
            if (editText != null && (odooddoVar = this.eeeee00650065.get(editText)) != null) {
                ss007300730073s0073(odooddoVar, true);
            }
        }
        this.eeeee00650065.clear();
    }
}
