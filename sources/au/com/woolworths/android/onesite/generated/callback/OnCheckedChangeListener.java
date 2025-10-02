package au.com.woolworths.android.onesite.generated.callback;

import android.widget.CompoundButton;

/* loaded from: classes3.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    public interface Listener {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null) {
            compoundButton.setChecked(true);
        }
    }
}
