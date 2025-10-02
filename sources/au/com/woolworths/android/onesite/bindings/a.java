package au.com.woolworths.android.onesite.bindings;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {
    public final /* synthetic */ Function0 d;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.d.invoke();
        return true;
    }
}
