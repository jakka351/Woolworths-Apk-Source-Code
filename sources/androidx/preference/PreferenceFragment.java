package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* loaded from: classes2.dex */
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    public PreferenceManager d;
    public ContextThemeWrapper e;
    public int f;

    /* renamed from: androidx.preference.PreferenceFragment$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                throw null;
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.preference.PreferenceFragment$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class DividerDecoration extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            RecyclerView.ViewHolder viewHolderO = recyclerView.O(view);
            if ((viewHolderO instanceof PreferenceViewHolder) && ((PreferenceViewHolder) viewHolderO).e) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            throw null;
        }
    }

    public interface OnPreferenceDisplayDialogCallback {
        boolean a();
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean a();
    }

    public interface OnPreferenceStartScreenCallback {
        boolean a();
    }

    public static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i, int i2, Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            throw null;
        }
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public final Preference C(String str) {
        PreferenceScreen preferenceScreen = this.d.g;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.C(str);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public final void O0(DialogPreference dialogPreference) {
        DialogFragment multiSelectListPreferenceDialogFragment;
        if (!(getActivity() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getActivity()).a() : false) && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (dialogPreference instanceof EditTextPreference) {
                String str = dialogPreference.n;
                multiSelectListPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragment.setArguments(bundle);
            } else if (dialogPreference instanceof ListPreference) {
                String str2 = dialogPreference.n;
                multiSelectListPreferenceDialogFragment = new ListPreferenceDialogFragment();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                multiSelectListPreferenceDialogFragment.setArguments(bundle2);
            } else {
                if (!(dialogPreference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                String str3 = dialogPreference.n;
                multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                multiSelectListPreferenceDialogFragment.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragment.setTargetFragment(this, 0);
            multiSelectListPreferenceDialogFragment.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public final boolean Y(Preference preference) {
        if (preference.p == null || !(getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            return false;
        }
        return ((OnPreferenceStartFragmentCallback) getActivity()).a();
    }

    public abstract void a(String str);

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public final void l0(PreferenceScreen preferenceScreen) {
        if (getActivity() instanceof OnPreferenceStartScreenCallback) {
            ((OnPreferenceStartScreenCallback) getActivity()).a();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(com.woolworths.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = com.woolworths.R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.e = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.d = preferenceManager;
        preferenceManager.j = this;
        a(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        ContextThemeWrapper contextThemeWrapper = this.e;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, R.styleable.h, TypedArrayUtils.a(contextThemeWrapper, com.woolworths.R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(0, this.f);
        typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.e);
        View viewFindViewById = layoutInflaterCloneInContext.inflate(this.f, viewGroup, false).findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.e.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(com.woolworths.R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(com.woolworths.R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView));
        }
        recyclerView.i(null);
        throw null;
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        throw null;
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.d.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        PreferenceManager preferenceManager = this.d;
        preferenceManager.h = this;
        preferenceManager.i = this;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        PreferenceManager preferenceManager = this.d;
        preferenceManager.h = null;
        preferenceManager.i = null;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen = this.d.g) == null) {
            return;
        }
        preferenceScreen.a(bundle2);
    }
}
