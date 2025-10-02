package YU;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.Observable;

/* loaded from: classes2.dex */
class Fh extends Observable implements TextWatcher {
    public final int d;
    public final Context e;
    public final boolean f;
    public boolean g = false;
    public boolean h = false;

    public Fh(Context context, int i, boolean z) {
        this.e = context;
        this.d = i;
        this.f = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        ClipData primaryClip;
        try {
            this.g = false;
            this.h = false;
            String string = "";
            if (i3 > 0 && i >= 0) {
                try {
                    if (i < charSequence.length()) {
                        string = charSequence.subSequence(i, Math.min(i + i3, charSequence.length())).toString();
                    }
                } catch (Exception unused) {
                }
            }
            int i5 = 1;
            if (i3 > 1) {
                ClipboardManager clipboardManager = (ClipboardManager) this.e.getSystemService(CircleProgressBar.a("ziv\u007fOFMYF"));
                CharSequence text = (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).getText();
                if (text == null || !string.equals(text.toString())) {
                    this.h = true;
                } else {
                    this.g = true;
                }
                i4 = -1;
            } else {
                i4 = (i3 == 1 && " ".equals(string)) ? 3 : i2 >= 1 ? 4 : (i3 == 1 && string.length() > 0 && Character.isUpperCase(string.charAt(0))) ? 5 : 0;
            }
            if (!this.g) {
                i5 = i4;
            }
            if (this.h) {
                i5 = 2;
            }
            int i6 = this.f ? 0 : i5;
            setChanged();
            notifyObservers(new AU(this.d, i6, "2", SystemClock.uptimeMillis()));
            charSequence.length();
        } catch (Exception unused2) {
        }
    }
}
