package dagger.android.support;

import android.content.Context;
import androidx.appcompat.app.AppCompatDialogFragment;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

/* loaded from: classes7.dex */
public abstract class DaggerAppCompatDialogFragment extends AppCompatDialogFragment implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        AndroidSupportInjection.a(this);
        super.onAttach(context);
    }
}
