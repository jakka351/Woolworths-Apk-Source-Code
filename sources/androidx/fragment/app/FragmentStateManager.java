package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class FragmentStateManager {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentLifecycleCallbacksDispatcher f2755a;
    public final FragmentStore b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2756a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f2756a = iArr;
            try {
                Lifecycle.State state = Lifecycle.State.d;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f2756a;
                Lifecycle.State state2 = Lifecycle.State.d;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f2756a;
                Lifecycle.State state3 = Lifecycle.State.d;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f2756a;
                Lifecycle.State state4 = Lifecycle.State.d;
                iArr4[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment2) {
        this.f2755a = fragmentLifecycleCallbacksDispatcher;
        this.b = fragmentStore;
        this.c = fragment2;
    }

    public final void a() {
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment2);
        }
        Bundle bundle = fragment2.mSavedFragmentState;
        fragment2.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f2755a.a(fragment2, false);
    }

    public final void b() {
        View view;
        View view2;
        Fragment fragment2 = this.c;
        Fragment fragmentH = FragmentManager.H(fragment2.mContainer);
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragmentH != null && !fragmentH.equals(parentFragment)) {
            int i = fragment2.mContainerId;
            FragmentStrictMode.Policy policy = FragmentStrictMode.f2774a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment2);
            sb.append(" within the view of parent fragment ");
            sb.append(fragmentH);
            sb.append(" via container with ID ");
            FragmentStrictMode.b(new WrongNestedHierarchyViolation(fragment2, YU.a.m(sb, i, " without using parent's childFragmentManager")));
            FragmentStrictMode.a(fragment2).getClass();
        }
        ArrayList arrayList = this.b.f2757a;
        ViewGroup viewGroup = fragment2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment3 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment4 = (Fragment) arrayList.get(i2);
                    if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment2);
        }
        Fragment fragment3 = fragment2.mTarget;
        FragmentStateManager fragmentStateManager = null;
        FragmentStore fragmentStore = this.b;
        if (fragment3 != null) {
            FragmentStateManager fragmentStateManager2 = (FragmentStateManager) fragmentStore.b.get(fragment3.mWho);
            if (fragmentStateManager2 == null) {
                throw new IllegalStateException("Fragment " + fragment2 + " declared target fragment " + fragment2.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment2.mTargetWho = fragment2.mTarget.mWho;
            fragment2.mTarget = null;
            fragmentStateManager = fragmentStateManager2;
        } else {
            String str = fragment2.mTargetWho;
            if (str != null && (fragmentStateManager = (FragmentStateManager) fragmentStore.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment2);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(YU.a.o(sb, fragment2.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.l();
        }
        FragmentManager fragmentManager = fragment2.mFragmentManager;
        fragment2.mHost = fragmentManager.x;
        fragment2.mParentFragment = fragmentManager.z;
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f2755a;
        fragmentLifecycleCallbacksDispatcher.g(fragment2, false);
        fragment2.performAttach();
        fragmentLifecycleCallbacksDispatcher.b(fragment2, false);
    }

    public final int d() {
        Fragment fragment2 = this.c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.e;
        int iOrdinal = fragment2.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.e, 2);
                View view = fragment2.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment2.mInDynamicContainer && fragment2.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment2.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerK = SpecialEffectsController.k(viewGroup, fragment2.getParentFragmentManager());
            SpecialEffectsController.Operation operationG = specialEffectsControllerK.g(fragment2);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = operationG != null ? operationG.b : null;
            SpecialEffectsController.Operation operationH = specialEffectsControllerK.h(fragment2);
            lifecycleImpact = operationH != null ? operationH.b : null;
            int i = lifecycleImpact == null ? -1 : SpecialEffectsController.WhenMappings.f2770a[lifecycleImpact.ordinal()];
            if (i != -1 && i != 1) {
                lifecycleImpact = lifecycleImpact;
            }
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.e) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f) {
            iMin = Math.max(iMin, 3);
        } else if (fragment2.mRemoving) {
            iMin = fragment2.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment2.mDeferStart && fragment2.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment2.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment2);
        }
        return iMin;
    }

    public final void e() {
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment2);
        }
        Bundle bundle = fragment2.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment2.mIsCreated) {
            fragment2.mState = 1;
            fragment2.restoreChildFragmentState();
        } else {
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f2755a;
            fragmentLifecycleCallbacksDispatcher.h(fragment2, false);
            fragment2.performCreate(bundle2);
            fragmentLifecycleCallbacksDispatcher.c(fragment2, false);
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            return;
        }
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment2);
        }
        Bundle bundle = fragment2.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment2.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(androidx.compose.ui.input.pointer.a.l("Cannot create fragment ", fragment2, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.y.b(i);
                if (viewGroup == null) {
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(fragment2.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = com.salesforce.marketingcloud.messages.iam.j.h;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment2.mContainerId) + " (" + resourceName + ") for fragment " + fragment2);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.Policy policy = FragmentStrictMode.f2774a;
                    FragmentStrictMode.b(new WrongFragmentContainerViolation(fragment2, viewGroup));
                    FragmentStrictMode.a(fragment2).getClass();
                }
            }
        }
        fragment2.mContainer = viewGroup;
        fragment2.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment2.mView != null) {
            if (FragmentManager.Q(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment2);
            }
            fragment2.mView.setSaveFromParentEnabled(false);
            fragment2.mView.setTag(R.id.fragment_container_view_tag, fragment2);
            if (viewGroup != null) {
                b();
            }
            if (fragment2.mHidden) {
                fragment2.mView.setVisibility(8);
            }
            if (fragment2.mView.isAttachedToWindow()) {
                ViewCompat.y(fragment2.mView);
            } else {
                final View view = fragment2.mView;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        View view3 = view;
                        view3.removeOnAttachStateChangeListener(this);
                        ViewCompat.y(view3);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            fragment2.performViewCreated();
            this.f2755a.m(fragment2, fragment2.mView, bundle2, false);
            int visibility = fragment2.mView.getVisibility();
            fragment2.setPostOnViewCreatedAlpha(fragment2.mView.getAlpha());
            if (fragment2.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment2.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment2.setFocusedView(viewFindFocus);
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                    }
                }
                fragment2.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        fragment2.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment2);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment2.mRemoving && !fragment2.isInBackStack();
        FragmentStore fragmentStore = this.b;
        if (z && !fragment2.mBeingSaved) {
            fragmentStore.i(null, fragment2.mWho);
        }
        if (!z) {
            FragmentManagerViewModel fragmentManagerViewModel = fragmentStore.d;
            if (!((fragmentManagerViewModel.e.containsKey(fragment2.mWho) && fragmentManagerViewModel.h) ? fragmentManagerViewModel.i : true)) {
                String str = fragment2.mTargetWho;
                if (str != null && (fragmentB = fragmentStore.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment2.mTarget = fragmentB;
                }
                fragment2.mState = 0;
                return;
            }
        }
        FragmentHostCallback<?> fragmentHostCallback = fragment2.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = fragmentStore.d.i;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.e;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z && !fragment2.mBeingSaved) || zIsChangingConfigurations) {
            fragmentStore.d.q6(fragment2, false);
        }
        fragment2.performDestroy();
        this.f2755a.d(fragment2, false);
        Iterator it = fragmentStore.d().iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            if (fragmentStateManager != null) {
                Fragment fragment3 = fragmentStateManager.c;
                if (fragment2.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = fragment2;
                    fragment3.mTargetWho = null;
                }
            }
        }
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = fragmentStore.b(str2);
        }
        fragmentStore.h(this);
    }

    public final void h() {
        View view;
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment2);
        }
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null && (view = fragment2.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment2.performDestroyView();
        this.f2755a.n(fragment2, false);
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.m(null);
        fragment2.mInLayout = false;
    }

    public final void i() {
        boolean zQ = FragmentManager.Q(3);
        Fragment fragment2 = this.c;
        if (zQ) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment2);
        }
        fragment2.performDetach();
        this.f2755a.e(fragment2, false);
        fragment2.mState = -1;
        fragment2.mHost = null;
        fragment2.mParentFragment = null;
        fragment2.mFragmentManager = null;
        if (!fragment2.mRemoving || fragment2.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
            if (!((fragmentManagerViewModel.e.containsKey(fragment2.mWho) && fragmentManagerViewModel.h) ? fragmentManagerViewModel.i : true)) {
                return;
            }
        }
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment2);
        }
        fragment2.initState();
    }

    public final void j() {
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout && fragment2.mInLayout && !fragment2.mPerformedCreateView) {
            if (FragmentManager.Q(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment2);
            }
            Bundle bundle = fragment2.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment2.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment2.mView.setTag(R.id.fragment_container_view_tag, fragment2);
                if (fragment2.mHidden) {
                    fragment2.mView.setVisibility(8);
                }
                fragment2.performViewCreated();
                this.f2755a.m(fragment2, fragment2.mView, bundle2, false);
                fragment2.mState = 2;
            }
        }
    }

    public final Fragment k() {
        return this.c;
    }

    public final void l() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment2 = this.c;
        if (z) {
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment2);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = fragment2.mState;
                FragmentStore fragmentStore = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && fragment2.mRemoving && !fragment2.isInBackStack() && !fragment2.mBeingSaved) {
                        if (FragmentManager.Q(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment2);
                        }
                        fragmentStore.d.q6(fragment2, true);
                        fragmentStore.h(this);
                        if (FragmentManager.Q(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment2);
                        }
                        fragment2.initState();
                    }
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerK = SpecialEffectsController.k(viewGroup, fragment2.getParentFragmentManager());
                            boolean z3 = fragment2.mHidden;
                            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.d;
                            if (z3) {
                                if (FragmentManager.Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment2);
                                }
                                specialEffectsControllerK.e(SpecialEffectsController.Operation.State.f, lifecycleImpact, this);
                            } else {
                                if (FragmentManager.Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment2);
                                }
                                specialEffectsControllerK.e(SpecialEffectsController.Operation.State.e, lifecycleImpact, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null && fragment2.mAdded && FragmentManager.R(fragment2)) {
                            fragmentManager.H = true;
                        }
                        fragment2.mHiddenChanged = false;
                        fragment2.onHiddenChanged(fragment2.mHidden);
                        fragment2.mChildFragmentManager.q();
                    }
                    this.d = false;
                    return;
                }
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f2755a;
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment2.mBeingSaved) {
                                if (((Bundle) fragmentStore.c.get(fragment2.mWho)) == null) {
                                    fragmentStore.i(p(), fragment2.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment2.mState = 1;
                            break;
                        case 2:
                            fragment2.mInLayout = false;
                            fragment2.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.Q(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment2);
                            }
                            if (fragment2.mBeingSaved) {
                                fragmentStore.i(p(), fragment2.mWho);
                            } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                q();
                            }
                            if (fragment2.mView != null && (viewGroup2 = fragment2.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerK2 = SpecialEffectsController.k(viewGroup2, fragment2.getParentFragmentManager());
                                if (FragmentManager.Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment2);
                                }
                                specialEffectsControllerK2.e(SpecialEffectsController.Operation.State.d, SpecialEffectsController.Operation.LifecycleImpact.f, this);
                            }
                            fragment2.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.Q(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment2);
                            }
                            fragment2.performStop();
                            fragmentLifecycleCallbacksDispatcher.l(fragment2, false);
                            break;
                        case 5:
                            fragment2.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.Q(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment2);
                            }
                            fragment2.performPause();
                            fragmentLifecycleCallbacksDispatcher.f(fragment2, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment2.mView != null && (viewGroup3 = fragment2.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerK3 = SpecialEffectsController.k(viewGroup3, fragment2.getParentFragmentManager());
                                SpecialEffectsController.Operation.State stateB = SpecialEffectsController.Operation.State.Companion.b(fragment2.mView.getVisibility());
                                if (FragmentManager.Q(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment2);
                                }
                                specialEffectsControllerK3.e(stateB, SpecialEffectsController.Operation.LifecycleImpact.e, this);
                            }
                            fragment2.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.Q(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment2);
                            }
                            fragment2.performStart();
                            fragmentLifecycleCallbacksDispatcher.k(fragment2, false);
                            break;
                        case 6:
                            fragment2.mState = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment2 = this.c;
        Bundle bundle = fragment2.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment2.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment2.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment2.mSavedViewState = fragment2.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment2.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment2.mTargetWho = fragmentState.p;
                fragment2.mTargetRequestCode = fragmentState.q;
                Boolean bool = fragment2.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment2.mUserVisibleHint = bool.booleanValue();
                    fragment2.mSavedUserVisibleHint = null;
                } else {
                    fragment2.mUserVisibleHint = fragmentState.r;
                }
            }
            if (fragment2.mUserVisibleHint) {
                return;
            }
            fragment2.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.Q(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r6.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.Q(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r6.f2755a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.FragmentStore r1 = r6.b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentStateManager.n():void");
    }

    public final Fragment.SavedState o() {
        if (this.c.mState > -1) {
            return new Fragment.SavedState(p());
        }
        return null;
    }

    public final Bundle p() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment2 = this.c;
        if (fragment2.mState == -1 && (bundle = fragment2.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment2));
        if (fragment2.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment2.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2755a.j(fragment2, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment2.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleJ0 = fragment2.mChildFragmentManager.j0();
            if (!bundleJ0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleJ0);
            }
            if (fragment2.mView != null) {
                q();
            }
            SparseArray<Parcelable> sparseArray = fragment2.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment2.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment2.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void q() {
        Fragment fragment2 = this.c;
        if (fragment2.mView == null) {
            return;
        }
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment2 + " with view " + fragment2.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment2.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment2.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment2.mViewLifecycleOwner.i.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment2.mSavedViewRegistryState = bundle;
    }

    public final void r(int i) {
        this.e = i;
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.f2755a = fragmentLifecycleCallbacksDispatcher;
        this.b = fragmentStore;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(fragmentFactory, classLoader);
        this.c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment2, Bundle bundle) {
        this.f2755a = fragmentLifecycleCallbacksDispatcher;
        this.b = fragmentStore;
        this.c = fragment2;
        fragment2.mSavedViewState = null;
        fragment2.mSavedViewRegistryState = null;
        fragment2.mBackStackNesting = 0;
        fragment2.mInLayout = false;
        fragment2.mAdded = false;
        Fragment fragment3 = fragment2.mTarget;
        fragment2.mTargetWho = fragment3 != null ? fragment3.mWho : null;
        fragment2.mTarget = null;
        fragment2.mSavedFragmentState = bundle;
        fragment2.mArguments = bundle.getBundle("arguments");
    }
}
