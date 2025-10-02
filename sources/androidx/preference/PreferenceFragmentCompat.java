package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    public PreferenceManager e;
    public RecyclerView f;
    public boolean g;
    public boolean h;
    public final DividerDecoration d = new DividerDecoration();
    public int i = com.woolworths.R.layout.preference_list_fragment;
    public final Handler j = new Handler(Looper.getMainLooper()) { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat preferenceFragmentCompat = PreferenceFragmentCompat.this;
            PreferenceScreen preferenceScreen = preferenceFragmentCompat.e.g;
            if (preferenceScreen != null) {
                preferenceFragmentCompat.f.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
                preferenceScreen.o();
            }
        }
    };
    public final Runnable k = new Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.2
        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    /* renamed from: androidx.preference.PreferenceFragmentCompat$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class DividerDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f3599a;
        public int b;
        public boolean c = true;

        public DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (i(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.f3599a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (i(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f3599a.setBounds(0, height, width, this.b + height);
                    this.f3599a.draw(canvas);
                }
            }
        }

        public final boolean i(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder viewHolderO = recyclerView.O(view);
            if (!(viewHolderO instanceof PreferenceViewHolder) || !((PreferenceViewHolder) viewHolderO).e) {
                return false;
            }
            boolean z = this.c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            RecyclerView.ViewHolder viewHolderO2 = recyclerView.O(recyclerView.getChildAt(iIndexOfChild + 1));
            return (viewHolderO2 instanceof PreferenceViewHolder) && ((PreferenceViewHolder) viewHolderO2).d;
        }
    }

    public interface OnPreferenceDisplayDialogCallback {
        boolean a();
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean P(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
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
        PreferenceScreen preferenceScreen;
        PreferenceManager preferenceManager = this.e;
        if (preferenceManager == null || (preferenceScreen = preferenceManager.g) == null) {
            return null;
        }
        return preferenceScreen.C(str);
    }

    public abstract void E1(String str);

    public final void I1(String str) throws Resources.NotFoundException {
        PreferenceManager preferenceManager = this.e;
        if (preferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        preferenceManager.e = true;
        PreferenceInflater preferenceInflater = new PreferenceInflater(contextRequireContext, preferenceManager);
        XmlResourceParser xml = contextRequireContext.getResources().getXml(com.woolworths.R.xml.pref_user_settings);
        try {
            PreferenceGroup preferenceGroupC = preferenceInflater.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupC;
            preferenceScreen.p(preferenceManager);
            SharedPreferences.Editor editor = preferenceManager.d;
            if (editor != null) {
                editor.apply();
            }
            preferenceManager.e = false;
            Preference preference = preferenceScreen;
            if (str != null) {
                Preference preferenceC = preferenceScreen.C(str);
                boolean z = preferenceC instanceof PreferenceScreen;
                preference = preferenceC;
                if (!z) {
                    throw new IllegalArgumentException(YU.a.h("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
            PreferenceManager preferenceManager2 = this.e;
            PreferenceScreen preferenceScreen3 = preferenceManager2.g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.s();
                }
                preferenceManager2.g = preferenceScreen2;
                this.g = true;
                if (this.h) {
                    Handler handler = this.j;
                    if (handler.hasMessages(1)) {
                        return;
                    }
                    handler.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public final void O0(DialogPreference dialogPreference) {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceDisplayDialogCallback) {
                zA = ((OnPreferenceDisplayDialogCallback) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof OnPreferenceDisplayDialogCallback)) {
            zA = ((OnPreferenceDisplayDialogCallback) getContext()).a();
        }
        if (!zA && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zA = ((OnPreferenceDisplayDialogCallback) getActivity()).a();
        }
        if (!zA && getParentFragmentManager().G("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (dialogPreference instanceof EditTextPreference) {
                String str = dialogPreference.n;
                multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
            } else if (dialogPreference instanceof ListPreference) {
                String str2 = dialogPreference.n;
                multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle2);
            } else {
                if (!(dialogPreference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + dialogPreference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = dialogPreference.n;
                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.setTargetFragment(this, 0);
            multiSelectListPreferenceDialogFragmentCompat.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public final boolean Y(Preference preference) {
        String str = preference.p;
        if (str == null) {
            return false;
        }
        boolean zP = false;
        for (Fragment parentFragment = this; !zP && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartFragmentCallback) {
                zP = ((OnPreferenceStartFragmentCallback) parentFragment).P(this, preference);
            }
        }
        if (!zP && (getContext() instanceof OnPreferenceStartFragmentCallback)) {
            zP = ((OnPreferenceStartFragmentCallback) getContext()).P(this, preference);
        }
        if (!zP && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            zP = ((OnPreferenceStartFragmentCallback) getActivity()).P(this, preference);
        }
        if (zP) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundleC = preference.c();
        Fragment fragmentA = parentFragmentManager.M().a(requireActivity().getClassLoader(), str);
        fragmentA.setArguments(bundleC);
        fragmentA.setTargetFragment(this, 0);
        FragmentTransaction fragmentTransactionE = parentFragmentManager.e();
        fragmentTransactionE.j(((View) requireView().getParent()).getId(), fragmentA, null);
        fragmentTransactionE.c(null);
        fragmentTransactionE.d();
        return true;
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public final void l0(PreferenceScreen preferenceScreen) {
        boolean zA = false;
        for (Fragment parentFragment = this; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartScreenCallback) {
                zA = ((OnPreferenceStartScreenCallback) parentFragment).a();
            }
        }
        if (!zA && (getContext() instanceof OnPreferenceStartScreenCallback)) {
            zA = ((OnPreferenceStartScreenCallback) getContext()).a();
        }
        if (zA || !(getActivity() instanceof OnPreferenceStartScreenCallback)) {
            return;
        }
        ((OnPreferenceStartScreenCallback) getActivity()).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(com.woolworths.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = com.woolworths.R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        PreferenceManager preferenceManager = new PreferenceManager(requireContext());
        this.e = preferenceManager;
        preferenceManager.j = this;
        E1(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, R.styleable.i, com.woolworths.R.attr.preferenceFragmentCompatStyle, 0);
        this.i = typedArrayObtainStyledAttributes.getResourceId(0, this.i);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.i, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(com.woolworths.R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(com.woolworths.R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView));
        }
        this.f = recyclerView;
        DividerDecoration dividerDecoration = this.d;
        recyclerView.i(dividerDecoration);
        if (drawable != null) {
            dividerDecoration.getClass();
            dividerDecoration.b = drawable.getIntrinsicHeight();
        } else {
            dividerDecoration.b = 0;
        }
        dividerDecoration.f3599a = drawable;
        PreferenceFragmentCompat.this.f.T();
        if (dimensionPixelSize != -1) {
            dividerDecoration.b = dimensionPixelSize;
            PreferenceFragmentCompat.this.f.T();
        }
        dividerDecoration.c = z;
        if (this.f.getParent() == null) {
            viewGroup2.addView(this.f);
        }
        this.j.post(this.k);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Runnable runnable = this.k;
        Handler handler = this.j;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        if (this.g) {
            this.f.setAdapter(null);
            PreferenceScreen preferenceScreen = this.e.g;
            if (preferenceScreen != null) {
                preferenceScreen.s();
            }
        }
        this.f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.e.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        PreferenceManager preferenceManager = this.e;
        preferenceManager.h = this;
        preferenceManager.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        PreferenceManager preferenceManager = this.e;
        preferenceManager.h = null;
        preferenceManager.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.e.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.g && (preferenceScreen = this.e.g) != null) {
            this.f.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
            preferenceScreen.o();
        }
        this.h = true;
    }
}
