package com.behaviosec.rl;

import android.text.Editable;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.SyncedJSONArray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ylylyly extends oddodoo {
    public static int h0068h00680068006800680068 = 1;
    public static int hh006800680068006800680068 = 2;
    public static int hhh00680068006800680068 = 35;
    public static int rr0072rrrrr;
    private int h006800680068hhh = 0;
    private final int hh00680068hhh;
    private static final String hhh0068hhh = uuxuuuu.pp0070p0070ppp("g{~\u0002\r\u000f\u0001\u000f\u0003\u0003m\u0010\u0010g\b\u000e\u001az\r!\u001e", (char) (yylylll.r0072r0072r00720072() ^ (-1349847042)), (char) (yllylll.r007200720072r00720072() ^ (-1146716673)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)));
    private static int h0068h0068hhh = 0;

    public ylylyly(String str, Boolean bool) {
        LogBridge.d(uuxuuuu.pppp0070ppp("Pbcdmm]i[YBb`6TXbAQc^", (char) (yllylll.r007200720072r00720072() ^ (-1146716789)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), uuxuuuu.pp0070p0070ppp("@PJLx>@;A8!3>5\t", (char) (yllylll.r007200720072r00720072() ^ (-1146716900)), (char) (yyyllll.rrrr007200720072() ^ 383821913), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + str + uuxuuuu.pppp0070ppp("\u0016\t", (char) (ylyylll.r0072rrr00720072() ^ (-1691741313)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + this);
        int i = h0068h0068hhh + 1;
        h0068h0068hhh = i;
        this.hh00680068hhh = i;
        this.fieldName = str;
        this.isMasked = bool.booleanValue();
        this.mUseCaretPos = bool.booleanValue();
    }

    public static int r00720072rrrrr() {
        return 2;
    }

    public static int r0072rrrrrr() {
        return 88;
    }

    public void b0062b00620062bb(String str, String str2) {
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u007f\u0014\u0017\u001a%'\u0019'\u001b\u001b\u0006((\u007f &2\u0013%96", (char) (yyyllll.rrrr007200720072() ^ 383821928), (char) (ylyylll.r0072rrr00720072() ^ (-1691741440)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pppp0070ppp("$\u0016*'v\u001d\u0017%\u001f\u001e\u001eZ\"&#+$\u000f#0)~", (char) (yllylll.r007200720072r00720072() ^ (-1146716833)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))) + this.fieldName + uuxuuuu.pp0070p0070ppp("#\u0018", (char) (yllylll.r007200720072r00720072() ^ (-1146716804)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))) + this);
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (i < length && i < length2 && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        while (length > i && length2 > i) {
            int i2 = hhh00680068006800680068;
            if (((h0068h00680068006800680068 + i2) * i2) % hh006800680068006800680068 != rr0072rrrrr) {
                hhh00680068006800680068 = r0072rrrrrr();
                rr0072rrrrr = r0072rrrrrr();
            }
            if (str.charAt(length - 1) != str2.charAt(length2 - 1)) {
                break;
            }
            length--;
            length2--;
        }
        int i3 = length - i;
        int i4 = length2 - i;
        beforeTextChanged(str, i, i3, i4);
        onTextChanged(str2, i, i3, i4);
        afterTextChanged(Editable.Factory.getInstance().newEditable(str2));
    }

    public Boolean getAnonymous() {
        int i = hhh00680068006800680068;
        if (((h0068h00680068006800680068 + i) * i) % hh006800680068006800680068 != rr0072rrrrr) {
            hhh00680068006800680068 = 17;
            rr0072rrrrr = r0072rrrrrr();
        }
        return Boolean.valueOf(this.isMasked);
    }

    @Override // com.behaviosec.rl.oddodoo
    public String getDTag() {
        return uuxuuuu.pppp0070ppp("\u0016*-0;=/=11\u001c>>\u00166<H);OL", (char) (yyyllll.rrrr007200720072() ^ 383822057), (char) (yllylll.r007200720072r00720072() ^ (-1146716787)));
    }

    public int getId() {
        int i = hhh00680068006800680068;
        if (((h0068h00680068006800680068 + i) * i) % hh006800680068006800680068 != 0) {
            hhh00680068006800680068 = r0072rrrrrr();
            h0068h00680068006800680068 = 25;
        }
        return this.hh00680068hhh;
    }

    public JSONArray getJSONArrayTimings() {
        SyncedJSONArray syncedJSONArray = this.editTextTimings;
        int i = hhh00680068006800680068;
        if (((h0068h00680068006800680068 + i) * i) % hh006800680068006800680068 != rr0072rrrrr) {
            hhh00680068006800680068 = r0072rrrrrr();
            rr0072rrrrr = 13;
        }
        return syncedJSONArray.getJSONArray();
    }

    public JSONObject getNonEditTextInputProperties() throws JSONException {
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741403));
        int iR007200720072r00720072 = yllylll.r007200720072r00720072() ^ (-1146716787);
        int i = hhh00680068006800680068;
        if (((h0068h00680068006800680068 + i) * i) % hh006800680068006800680068 != rr0072rrrrr) {
            hhh00680068006800680068 = 44;
            rr0072rrrrr = 73;
        }
        uuxuuuu.pppp0070ppp("43C\u00155;G(:NK(KIKAORHET\n\f", cR0072rrr00720072, (char) iR007200720072r00720072);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(uuxuuuu.pp0070p0070ppp("5<H*PH>", (char) (ylyylll.r0072rrr00720072() ^ (-1691741197)), (char) (yyyllll.rrrr007200720072() ^ 383821981), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), this.isMasked ? uuxuuuu.pp0070p0070ppp("Rg", (char) (ylyylll.r0072rrr00720072() ^ (-1691741315)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741317)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) : uuxuuuu.pppp0070ppp("h", (char) (yylylll.r0072r0072r00720072() ^ (-1349847281)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
            jSONObject.put(uuxuuuu.pppp0070ppp("7<F\u001b5", (char) (yllylll.r007200720072r00720072() ^ (-1146716893)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), getId());
        } catch (JSONException e) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp("}\u0010\u0011\u0012\u001b\u001b\u000b\u0017\t\u0007o\u0010\u000ec\u0002\u0006\u0010n~\u0011\f", (char) (yllylll.r007200720072r00720072() ^ (-1146716793)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741268)), (char) (yyyllll.rrrr007200720072() ^ 383821869)), uuxuuuu.pppp0070ppp("0\t(\u0016[\u0014xF\u0019--%\u001d\u001a\u0001\u0011qc.\u0010_]r", (char) (yyyllll.rrrr007200720072() ^ 383821923), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))), e);
        }
        this.h006800680068hhh++;
        return jSONObject;
    }

    public boolean shouldSendEditTextProperties() {
        int i = this.h006800680068hhh;
        int i2 = hhh00680068006800680068;
        if (((h0068h00680068006800680068 + i2) * i2) % r00720072rrrrr() != 0) {
            hhh00680068006800680068 = r0072rrrrrr();
            rr0072rrrrr = r0072rrrrrr();
        }
        return i <= 2;
    }
}
