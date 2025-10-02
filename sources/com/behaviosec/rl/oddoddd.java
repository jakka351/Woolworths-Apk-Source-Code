package com.behaviosec.rl;

import android.os.SystemClock;
import android.text.Editable;
import android.widget.EditText;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes4.dex */
public abstract class oddoddd extends oddodoo {
    public static String TAG = uuxuuuu.pp0070p0070ppp("\u007f\u001e\",\u000b\u001b-(\n\u0013%\u0013\u0017\u0013\u001f", (char) (yyyllll.rrrr007200720072() ^ 383821855), (char) (yylylll.r0072r0072r00720072() ^ (-1349847140)), (char) (yyyllll.rrrr007200720072() ^ 383821870));
    public static int v007600760076v0076v0076 = 1;
    public static int v0076v0076v0076v0076 = 97;
    public static int vv00760076v0076v0076 = 0;
    public static int vvvv00760076v0076 = 2;
    public EditText mEditText;
    public final long startTime = SystemClock.uptimeMillis();

    public oddoddd(String str, EditText editText) {
        this.fieldName = str;
        this.mEditText = editText;
    }

    private boolean s00730073ss00730073(int i) {
        if (i != 145) {
            return false;
        }
        int i2 = v0076v0076v0076v0076;
        if (((vvvvvv00760076() + i2) * i2) % vvvv00760076v0076 != 0) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        return true;
    }

    private boolean s0073sss00730073(int i) {
        int i2 = i & l3.b;
        if (ss0073ss00730073(i2) || s00730073ss00730073(i2) || sss0073s00730073(i2)) {
            return true;
        }
        int i3 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i3) * i3) % vvvv00760076v0076 != 0) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        return sssss00730073(i2);
    }

    private boolean ss0073ss00730073(int i) {
        return i == 129;
    }

    private static boolean sss0073s00730073(int i) {
        if (i != 225) {
            return false;
        }
        int i2 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i2) * i2) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = 48;
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        return true;
    }

    private static boolean sssss00730073(int i) {
        if (i != 18) {
            return false;
        }
        int i2 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i2) * i2) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            vv00760076v0076v0076 = 69;
        }
        return true;
    }

    public static int v0076vv00760076v0076() {
        return 43;
    }

    public static int vvvvvv00760076() {
        return 1;
    }

    @Override // com.behaviosec.rl.oddodoo
    public void addKeyEvent(int i, int i2, long j, int i3, double d, yllllyy yllllyyVar, yllllyy yllllyyVar2) {
        if (this.mEditText == null) {
            return;
        }
        int i4 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i4) * i4) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = 38;
            vv00760076v0076v0076 = 48;
        }
        super.addKeyEvent(i, i2, j, i3, d, yllllyyVar, yllllyyVar2);
    }

    @Override // com.behaviosec.rl.oddodoo, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.mEditText != null) {
            super.afterTextChanged(editable);
            return;
        }
        int i = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i) * i) % vvvv00760076v0076 != 0) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
    }

    @Override // com.behaviosec.rl.oddodoo, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.mEditText == null) {
            return;
        }
        int i4 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i4) * i4) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = 99;
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        super.beforeTextChanged(charSequence, i, i2, i3);
    }

    public boolean canUseCaretPos(EditText editText) {
        int i = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i) * i) % vvvv00760076v0076 != 0) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            vv00760076v0076v0076 = 57;
        }
        return s0073sss00730073(editText.getInputType());
    }

    public void clearChunk() {
        this.editTextTimings.clear();
    }

    @Override // com.behaviosec.rl.oddodoo
    public String getDTag() {
        try {
            throw null;
        } catch (Exception unused) {
            v0076v0076v0076v0076 = v0076vv00760076v0076();
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused2) {
                    v0076v0076v0076v0076 = v0076vv00760076v0076();
                    return TAG;
                }
            }
        }
    }

    public final long getStartTime() {
        int i = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i) * i) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = 40;
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        return this.startTime;
    }

    @Override // com.behaviosec.rl.oddodoo, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.mEditText == null) {
            return;
        }
        int i4 = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i4) * i4) % vvvv00760076v0076 != vv00760076v0076v0076) {
            v0076v0076v0076v0076 = 20;
            vv00760076v0076v0076 = v0076vv00760076v0076();
        }
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void setFieldName(String str) {
        int i = v0076v0076v0076v0076;
        if (((v007600760076v0076v0076 + i) * i) % vvvv00760076v0076 != 0) {
            v0076v0076v0076v0076 = 53;
            vv00760076v0076v0076 = 40;
        }
        this.fieldName = str;
    }

    public void setRegistered() {
        this.registeredTimestamp = SystemClock.uptimeMillis();
        int i = 3;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                v0076v0076v0076v0076 = 48;
                return;
            }
        }
    }
}
