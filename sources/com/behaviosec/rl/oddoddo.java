package com.behaviosec.rl;

import android.widget.EditText;
import com.behaviosec.rl.android.LogBridge;

/* loaded from: classes4.dex */
public class oddoddo extends oddoddd {
    public static int a00610061aaa0061a = 2;
    public static int aa00610061aa0061a = 0;
    public static int aa0061aaa0061a = 1;
    public static int aaa0061aa0061a = 13;

    public oddoddo(String str, String str2, EditText editText) {
        super(str2, editText);
        LogBridge.d(oddoddd.TAG, uuxuuuu.pp0070p0070ppp("GYUY\bOSPXQBh`V,\u001a", (char) (yllylll.r007200720072r00720072() ^ (-1146716765)), (char) (yyyllll.rrrr007200720072() ^ 383821971), (char) (yyyllll.rrrr007200720072() ^ 383821864)) + str + uuxuuuu.pppp0070ppp("wo5728/\u0018*5,\u007fk", (char) (yyyllll.rrrr007200720072() ^ 383822052), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + str2 + uuxuuuu.pp0070p0070ppp("\u000f\u0007KIMW6FXS\u0018", (char) (yyyllll.rrrr007200720072() ^ 383822036), (char) (yylylll.r0072r0072r00720072() ^ (-1349847275)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))) + editText + uuxuuuu.pppp0070ppp("\u0004", (char) (ylyylll.r0072rrr00720072() ^ (-1691741368)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))) + this);
        oddoddd.TAG = uuxuuuu.pppp0070ppp("`\u0005\t\u0003\u0019\r\u0014j\u000b\u0011\u001d}\u0010$!\u0005\u0010$\u0014\u001a\u0018&", (char) (ylyylll.r0072rrr00720072() ^ (-1691741338)), (char) (yllylll.r007200720072r00720072() ^ (-1146716799)));
        this.isMasked = uuxuuuu.pppp0070ppp("\u0011\u0019", (char) (ylyylll.r0072rrr00720072() ^ (-1691741187)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))).equals(str);
        this.mUseCaretPos = canUseCaretPos(editText);
    }

    public static int a0061a0061aa0061a() {
        return 1;
    }

    public static int a0061aaaa0061a() {
        return 90;
    }

    @Override // com.behaviosec.rl.oddoddd, com.behaviosec.rl.oddodoo
    public void addKeyEvent(int i, int i2, long j, int i3, double d, yllllyy yllllyyVar, yllllyy yllllyyVar2) {
        if (this.mEditText == null) {
            return;
        }
        LogBridge.d(oddoddd.TAG, uuxuuuu.pppp0070ppp("9;: 9L\u0017G5=Bl@D:.\u0002", (char) (ylyylll.r0072rrr00720072() ^ (-1691741429)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))) + i + uuxuuuu.pp0070p0070ppp("_R&\u001a\u001d\u0014g", (char) (yyyllll.rrrr007200720072() ^ 383822021), (char) (yylylll.r0072r0072r00720072() ^ (-1349847216)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))) + j + uuxuuuu.pp0070p0070ppp("E", (char) (yylylll.r0072r0072r00720072() ^ (-1349847128)), (char) (yyyllll.rrrr007200720072() ^ 383821925), (char) (yyyllll.rrrr007200720072() ^ 383821867)) + this);
        super.addKeyEvent(i, i2, j, i3, d, yllllyyVar, yllllyyVar2);
        int i4 = aaa0061aa0061a;
        if (((a0061a0061aa0061a() + i4) * i4) % a00610061aaa0061a != 0) {
            aaa0061aa0061a = 15;
            aa0061aaa0061a = 55;
        }
    }

    public void changeFieldType(String str) {
        clear();
        if (this.mEditText == null) {
            return;
        }
        this.isMasked = uuxuuuu.pp0070p0070ppp("$,", (char) (yyyllll.rrrr007200720072() ^ 383822058), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))).equals(str);
        EditText editText = this.mEditText;
        int iA0061aaaa0061a = a0061aaaa0061a();
        if (((aa0061aaa0061a + iA0061aaaa0061a) * iA0061aaaa0061a) % a00610061aaa0061a != 0) {
            aa0061aaa0061a = 30;
        }
        this.mUseCaretPos = canUseCaretPos(editText);
    }

    @Override // com.behaviosec.rl.oddoddd, com.behaviosec.rl.oddodoo
    public final String getDTag() {
        return oddoddd.TAG;
    }

    public void removeEditTextRef() {
        if ((a0061aaaa0061a() * (a0061aaaa0061a() + aa0061aaa0061a)) % a00610061aaa0061a != aa00610061aa0061a) {
            aaa0061aa0061a = 84;
            aa00610061aa0061a = 40;
        }
        this.mEditText = null;
    }
}
