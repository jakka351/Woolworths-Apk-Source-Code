package dagger.android;

import android.app.DialogFragment;
import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public abstract class DaggerDialogFragment extends DialogFragment implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        return null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onAttach(Context context) {
        AndroidInjection.b(this);
        super.onAttach(context);
    }
}
