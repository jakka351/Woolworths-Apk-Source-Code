package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistry$register$3;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentLifecycleCallbacksDispatcher;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import com.woolworths.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public Fragment A;
    public ActivityResultRegistry$register$3 D;
    public ActivityResultRegistry$register$3 E;
    public ActivityResultRegistry$register$3 F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public FragmentManagerViewModel P;
    public boolean b;
    public ArrayList e;
    public OnBackPressedDispatcher g;
    public final i r;
    public final i s;
    public final i t;
    public final i u;
    public FragmentHostCallback x;
    public FragmentContainer y;
    public Fragment z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2748a = new ArrayList();
    public final FragmentStore c = new FragmentStore();
    public ArrayList d = new ArrayList();
    public final FragmentLayoutInflaterFactory f = new FragmentLayoutInflaterFactory(this);
    public BackStackRecord h = null;
    public boolean i = false;
    public final OnBackPressedCallback j = new OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        public final void d() {
            boolean zQ = FragmentManager.Q(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zQ) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (FragmentManager.Q(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.h);
            }
            BackStackRecord backStackRecord = fragmentManager.h;
            if (backStackRecord != null) {
                backStackRecord.s = false;
                backStackRecord.o();
                BackStackRecord backStackRecord2 = fragmentManager.h;
                d dVar = new d(fragmentManager, 4);
                if (backStackRecord2.q == null) {
                    backStackRecord2.q = new ArrayList();
                }
                backStackRecord2.q.add(dVar);
                fragmentManager.h.d();
                fragmentManager.i = true;
                fragmentManager.B(true);
                Iterator it = fragmentManager.g().iterator();
                while (it.hasNext()) {
                    ((SpecialEffectsController) it.next()).j();
                }
                fragmentManager.i = false;
                fragmentManager.h = null;
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            boolean zQ = FragmentManager.Q(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zQ) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            OnBackPressedCallback onBackPressedCallback = fragmentManager.j;
            ArrayList arrayList = fragmentManager.o;
            fragmentManager.i = true;
            fragmentManager.B(true);
            fragmentManager.i = false;
            if (fragmentManager.h == null) {
                if (onBackPressedCallback.f56a) {
                    if (FragmentManager.Q(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    fragmentManager.a0();
                    return;
                } else {
                    if (FragmentManager.Q(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.g.d();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.I(fragmentManager.h));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it.next();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        onBackStackChangedListener.b((Fragment) it2.next(), true);
                    }
                }
            }
            Iterator it3 = fragmentManager.h.f2759a.iterator();
            while (it3.hasNext()) {
                Fragment fragment2 = ((FragmentTransaction.Op) it3.next()).b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            Iterator it4 = fragmentManager.h(0, 1, new ArrayList(Collections.singletonList(fragmentManager.h))).iterator();
            while (it4.hasNext()) {
                ((SpecialEffectsController) it4.next()).d();
            }
            Iterator it5 = fragmentManager.h.f2759a.iterator();
            while (it5.hasNext()) {
                Fragment fragment3 = ((FragmentTransaction.Op) it5.next()).b;
                if (fragment3 != null && fragment3.mContainer == null) {
                    fragmentManager.i(fragment3).l();
                }
            }
            fragmentManager.h = null;
            fragmentManager.v0();
            if (FragmentManager.Q(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + onBackPressedCallback.f56a + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void f(BackEventCompat backEventCompat) {
            boolean zQ = FragmentManager.Q(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zQ) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.h != null) {
                Iterator it = fragmentManager.h(0, 1, new ArrayList(Collections.singletonList(fragmentManager.h))).iterator();
                while (it.hasNext()) {
                    ((SpecialEffectsController) it.next()).o(backEventCompat);
                }
                Iterator it2 = fragmentManager.o.iterator();
                while (it2.hasNext()) {
                    ((OnBackStackChangedListener) it2.next()).getClass();
                }
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void g(BackEventCompat backEventCompat) {
            boolean zQ = FragmentManager.Q(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zQ) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.y();
            fragmentManager.z(fragmentManager.new PrepareBackStackTransitionState(), false);
        }
    };
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();
    public final FragmentLifecycleCallbacksDispatcher p = new FragmentLifecycleCallbacksDispatcher(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final MenuProvider v = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public final void a(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public final void b(Menu menu) {
            FragmentManager.this.s(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final void c(Menu menu) {
            FragmentManager.this.v(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean d(MenuItem menuItem) {
            return FragmentManager.this.r(menuItem);
        }
    };
    public int w = -1;
    public final FragmentFactory B = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment a(ClassLoader classLoader, String str) {
            return Fragment.instantiate(FragmentManager.this.x.e, str, null);
        }
    };
    public final AnonymousClass4 C = new AnonymousClass4();
    public ArrayDeque G = new ArrayDeque();
    public final Runnable Q = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.B(true);
        }
    };

    /* renamed from: androidx.fragment.app.FragmentManager$4, reason: invalid class name */
    public class AnonymousClass4 implements SpecialEffectsControllerFactory {
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public final DefaultSpecialEffectsController a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    public interface BackStackEntry {
        int getId();
    }

    /* loaded from: classes2.dex */
    public class ClearBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequestA = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = intentSenderRequestA.getE();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSenderRequestA.getD());
                    builder.b(null);
                    builder.c(intentSenderRequestA.getG(), intentSenderRequestA.getF());
                    intentSenderRequestA = builder.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestA);
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public void a(FragmentManager fragmentManager, Fragment fragment2, FragmentActivity fragmentActivity) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment2) {
        }

        public void c(Fragment fragment2) {
        }

        public void d(Fragment fragment2) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment2, View view) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment2) {
        }
    }

    @SuppressLint
    /* loaded from: classes2.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new AnonymousClass1();
        public String d;
        public int e;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.d = parcel.readString();
                launchedFragmentInfo.e = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }
    }

    /* loaded from: classes2.dex */
    public static class LifecycleAwareResultListener implements FragmentResultListener {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f2750a;
        public final FragmentResultListener b;
        public final LifecycleEventObserver c;

        public LifecycleAwareResultListener(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, LifecycleEventObserver lifecycleEventObserver) {
            this.f2750a = lifecycle;
            this.b = fragmentResultListener;
            this.c = lifecycleEventObserver;
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public final void a(Bundle bundle, String str) {
            this.b.a(bundle, str);
        }

        public final void b() {
            this.f2750a.c(this.c);
        }
    }

    /* loaded from: classes2.dex */
    public interface OnBackStackChangedListener {
        default void a(Fragment fragment2, boolean z) {
        }

        default void b(Fragment fragment2, boolean z) {
        }

        void onBackStackChanged();
    }

    public interface OpGenerator {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: classes2.dex */
    public class PopBackStackState implements OpGenerator {

        /* renamed from: a, reason: collision with root package name */
        public final String f2751a;
        public final int b;
        public final int c;

        public PopBackStackState(String str, int i, int i2) {
            this.f2751a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment2 = FragmentManager.this.A;
            if (fragment2 != null && this.b < 0 && this.f2751a == null && fragment2.getChildFragmentManager().b0(-1, 0)) {
                return false;
            }
            return FragmentManager.this.c0(arrayList, arrayList2, this.f2751a, this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public class PrepareBackStackTransitionState implements OpGenerator {
        public PrepareBackStackTransitionState() {
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            ArrayList arrayList3;
            ArrayList arrayList4;
            boolean zC0;
            FragmentManager fragmentManager = FragmentManager.this;
            ArrayList arrayList5 = fragmentManager.o;
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.f2748a);
            }
            if (fragmentManager.d.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                zC0 = false;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            } else {
                BackStackRecord backStackRecord = (BackStackRecord) YU.a.c(1, fragmentManager.d);
                fragmentManager.h = backStackRecord;
                Iterator it = backStackRecord.f2759a.iterator();
                while (it.hasNext()) {
                    Fragment fragment2 = ((FragmentTransaction.Op) it.next()).b;
                    if (fragment2 != null) {
                        fragment2.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zC0 = fragmentManager.c0(arrayList3, arrayList4, null, -1, 0);
            }
            if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
                boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.I((BackStackRecord) it2.next()));
                }
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        onBackStackChangedListener.a((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
            return zC0;
        }
    }

    /* loaded from: classes2.dex */
    public class RestoreBackStackState implements OpGenerator {

        /* renamed from: a, reason: collision with root package name */
        public final String f2753a;

        public RestoreBackStackState(String str) {
            this.f2753a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            BackStackState backStackState = (BackStackState) fragmentManager.l.remove(this.f2753a);
            boolean z = false;
            if (backStackState == null) {
                return false;
            }
            HashMap map = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BackStackRecord backStackRecord = (BackStackRecord) it.next();
                if (backStackRecord.u) {
                    Iterator it2 = backStackRecord.f2759a.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment2 = ((FragmentTransaction.Op) it2.next()).b;
                        if (fragment2 != null) {
                            map.put(fragment2.mWho, fragment2);
                        }
                    }
                }
            }
            backStackState.getClass();
            ArrayList<String> arrayList3 = backStackState.d;
            HashMap map2 = new HashMap(arrayList3.size());
            for (String str : arrayList3) {
                Fragment fragment3 = (Fragment) map.get(str);
                if (fragment3 != null) {
                    map2.put(fragment3.mWho, fragment3);
                } else {
                    Bundle bundleI = fragmentManager.c.i(null, str);
                    if (bundleI != null) {
                        ClassLoader classLoader = fragmentManager.x.e.getClassLoader();
                        Fragment fragmentA = ((FragmentState) bundleI.getParcelable("state")).a(fragmentManager.M(), classLoader);
                        fragmentA.mSavedFragmentState = bundleI;
                        if (bundleI.getBundle("savedInstanceState") == null) {
                            fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleI.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        fragmentA.setArguments(bundle);
                        map2.put(fragmentA.mWho, fragmentA);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (BackStackRecordState backStackRecordState : backStackState.e) {
                ArrayList arrayList5 = backStackRecordState.e;
                BackStackRecord backStackRecord2 = new BackStackRecord(fragmentManager);
                backStackRecordState.a(backStackRecord2);
                for (int i = 0; i < arrayList5.size(); i++) {
                    String str2 = (String) arrayList5.get(i);
                    if (str2 != null) {
                        Fragment fragment4 = (Fragment) map2.get(str2);
                        if (fragment4 == null) {
                            throw new IllegalStateException(androidx.constraintlayout.core.state.a.l(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.i, " failed due to missing saved state for Fragment (", str2, ")"));
                        }
                        ((FragmentTransaction.Op) backStackRecord2.f2759a.get(i)).b = fragment4;
                    }
                }
                arrayList4.add(backStackRecord2);
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                ((BackStackRecord) it3.next()).a(arrayList, arrayList2);
                z = true;
            }
            return z;
        }
    }

    /* loaded from: classes2.dex */
    public class SaveBackStackState implements OpGenerator {

        /* renamed from: a, reason: collision with root package name */
        public final String f2754a;

        public SaveBackStackState(String str) {
            this.f2754a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
            int i;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f2754a;
            int iE = fragmentManager.E(-1, str, true);
            if (iE < 0) {
                return false;
            }
            int i2 = iE;
            while (true) {
                Throwable th = null;
                if (i2 >= fragmentManager.d.size()) {
                    HashSet hashSet = new HashSet();
                    int i3 = iE;
                    while (i3 < fragmentManager.d.size()) {
                        BackStackRecord backStackRecord = (BackStackRecord) fragmentManager.d.get(i3);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = backStackRecord.f2759a.iterator();
                        while (it.hasNext()) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) it.next();
                            Fragment fragment2 = op.b;
                            if (fragment2 != null) {
                                Throwable th2 = th;
                                if (!op.c || (i = op.f2760a) == 1 || i == 2 || i == 8) {
                                    hashSet.add(fragment2);
                                    hashSet2.add(fragment2);
                                }
                                int i4 = op.f2760a;
                                if (i4 == 1 || i4 == 2) {
                                    hashSet3.add(fragment2);
                                }
                                th = th2;
                            }
                        }
                        Throwable th3 = th;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder sbU = YU.a.u("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            sbU.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                            sbU.append(" in ");
                            sbU.append(backStackRecord);
                            sbU.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            fragmentManager.t0(new IllegalArgumentException(sbU.toString()));
                            throw th3;
                        }
                        i3++;
                        th = th3;
                    }
                    Throwable th4 = th;
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment3 = (Fragment) arrayDeque.removeFirst();
                        if (fragment3.mRetainInstance) {
                            StringBuilder sbU2 = YU.a.u("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbU2.append(hashSet.contains(fragment3) ? "direct reference to retained " : "retained child ");
                            sbU2.append("fragment ");
                            sbU2.append(fragment3);
                            fragmentManager.t0(new IllegalArgumentException(sbU2.toString()));
                            throw th4;
                        }
                        Iterator it2 = fragment3.mChildFragmentManager.c.e().iterator();
                        while (it2.hasNext()) {
                            Fragment fragment4 = (Fragment) it2.next();
                            if (fragment4 != null) {
                                arrayDeque.addLast(fragment4);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((Fragment) it3.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.d.size() - iE);
                    for (int i5 = iE; i5 < fragmentManager.d.size(); i5++) {
                        arrayList4.add(th4);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.d.size() - 1; size >= iE; size--) {
                        BackStackRecord backStackRecord2 = (BackStackRecord) fragmentManager.d.remove(size);
                        BackStackRecord backStackRecord3 = new BackStackRecord(backStackRecord2);
                        backStackRecord3.o();
                        arrayList4.set(size - iE, new BackStackRecordState(backStackRecord3));
                        backStackRecord2.u = true;
                        arrayList.add(backStackRecord2);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.l.put(str, backStackState);
                    return true;
                }
                BackStackRecord backStackRecord4 = (BackStackRecord) fragmentManager.d.get(i2);
                if (!backStackRecord4.p) {
                    fragmentManager.t0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + backStackRecord4 + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.i] */
    public FragmentManager() {
        final int i = 0;
        this.r = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.e;
                        if (fragmentManager.S()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.e;
                        if (fragmentManager2.S() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.e;
                        if (fragmentManager3.S()) {
                            fragmentManager3.p(multiWindowModeChangedInfo.getF2398a(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.e;
                        if (fragmentManager4.S()) {
                            fragmentManager4.u(pictureInPictureModeChangedInfo.getF2409a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.s = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.e;
                        if (fragmentManager.S()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.e;
                        if (fragmentManager2.S() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.e;
                        if (fragmentManager3.S()) {
                            fragmentManager3.p(multiWindowModeChangedInfo.getF2398a(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.e;
                        if (fragmentManager4.S()) {
                            fragmentManager4.u(pictureInPictureModeChangedInfo.getF2409a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.t = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.e;
                        if (fragmentManager.S()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.e;
                        if (fragmentManager2.S() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.e;
                        if (fragmentManager3.S()) {
                            fragmentManager3.p(multiWindowModeChangedInfo.getF2398a(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.e;
                        if (fragmentManager4.S()) {
                            fragmentManager4.u(pictureInPictureModeChangedInfo.getF2409a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.u = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager e;

            {
                this.e = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.e;
                        if (fragmentManager.S()) {
                            fragmentManager.k(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.e;
                        if (fragmentManager2.S() && num.intValue() == 80) {
                            fragmentManager2.o(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.e;
                        if (fragmentManager3.S()) {
                            fragmentManager3.p(multiWindowModeChangedInfo.getF2398a(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.e;
                        if (fragmentManager4.S()) {
                            fragmentManager4.u(pictureInPictureModeChangedInfo.getF2409a(), false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static Fragment H(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment2 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment2 != null) {
                return fragment2;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet I(BackStackRecord backStackRecord) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < backStackRecord.f2759a.size(); i++) {
            Fragment fragment2 = ((FragmentTransaction.Op) backStackRecord.f2759a.get(i)).b;
            if (fragment2 != null && backStackRecord.g) {
                hashSet.add(fragment2);
            }
        }
        return hashSet;
    }

    public static boolean Q(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean R(Fragment fragment2) {
        if (fragment2.mHasMenu && fragment2.mMenuVisible) {
            return true;
        }
        Iterator it = fragment2.mChildFragmentManager.c.e().iterator();
        boolean zR = false;
        while (it.hasNext()) {
            Fragment fragment3 = (Fragment) it.next();
            if (fragment3 != null) {
                zR = R(fragment3);
            }
            if (zR) {
                return true;
            }
        }
        return false;
    }

    public static boolean T(Fragment fragment2) {
        if (fragment2 == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment2.mFragmentManager;
        return fragment2.equals(fragmentManager.A) && T(fragmentManager.z);
    }

    public static void s0(Fragment fragment2) {
        if (Q(2)) {
            Log.v("FragmentManager", "show: " + fragment2);
        }
        if (fragment2.mHidden) {
            fragment2.mHidden = false;
            fragment2.mHiddenChanged = !fragment2.mHiddenChanged;
        }
    }

    public final void A(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.x == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.x.f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && U()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean B(boolean z) {
        boolean zA;
        BackStackRecord backStackRecord;
        A(z);
        if (!this.i && (backStackRecord = this.h) != null) {
            backStackRecord.s = false;
            backStackRecord.o();
            if (Q(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.f2748a);
            }
            this.h.p(false, false);
            this.f2748a.add(0, this.h);
            Iterator it = this.h.f2759a.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = ((FragmentTransaction.Op) it.next()).b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.M;
            ArrayList arrayList2 = this.N;
            synchronized (this.f2748a) {
                if (this.f2748a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f2748a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((OpGenerator) this.f2748a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                g0(this.M, this.N);
                f();
                z2 = true;
            } catch (Throwable th) {
                f();
                throw th;
            }
        }
        v0();
        if (this.L) {
            this.L = false;
            Iterator it2 = this.c.d().iterator();
            while (it2.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it2.next();
                Fragment fragmentK = fragmentStateManager.k();
                if (fragmentK.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragmentK.mDeferStart = false;
                        fragmentStateManager.l();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void C(BackStackRecord backStackRecord, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        A(z);
        BackStackRecord backStackRecord2 = this.h;
        if (backStackRecord2 != null) {
            backStackRecord2.s = false;
            backStackRecord2.o();
            if (Q(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + backStackRecord);
            }
            this.h.p(false, false);
            this.h.a(this.M, this.N);
            Iterator it = this.h.f2759a.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = ((FragmentTransaction.Op) it.next()).b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            this.h = null;
        }
        backStackRecord.a(this.M, this.N);
        this.b = true;
        try {
            g0(this.M, this.N);
            f();
            v0();
            boolean z2 = this.L;
            FragmentStore fragmentStore = this.c;
            if (z2) {
                this.L = false;
                Iterator it2 = fragmentStore.d().iterator();
                while (it2.hasNext()) {
                    FragmentStateManager fragmentStateManager = (FragmentStateManager) it2.next();
                    Fragment fragmentK = fragmentStateManager.k();
                    if (fragmentK.mDeferStart) {
                        if (this.b) {
                            this.L = true;
                        } else {
                            fragmentK.mDeferStart = false;
                            fragmentStateManager.l();
                        }
                    }
                }
            }
            fragmentStore.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021f A[PHI: r15
  0x021f: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:103:0x020c, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.D(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final int E(int i, String str, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = (BackStackRecord) this.d.get(size);
            if ((str != null && str.equals(backStackRecord.i)) || (i >= 0 && i == backStackRecord.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.d.get(size - 1);
            if ((str == null || !str.equals(backStackRecord2.i)) && (i < 0 || i != backStackRecord2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment F(int i) {
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.f2757a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment2 = (Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentK = fragmentStateManager.k();
                if (fragmentK.mFragmentId == i) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public final Fragment G(String str) {
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.f2757a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment2 = (Fragment) arrayList.get(size);
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentK = fragmentStateManager.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public final int J() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final Fragment K(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        t0(new IllegalStateException(YU.a.i("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup L(Fragment fragment2) {
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment2.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View viewB = this.y.b(fragment2.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final FragmentFactory M() {
        Fragment fragment2 = this.z;
        return fragment2 != null ? fragment2.mFragmentManager.M() : this.B;
    }

    public final List N() {
        return this.c.f();
    }

    public final SpecialEffectsControllerFactory O() {
        Fragment fragment2 = this.z;
        return fragment2 != null ? fragment2.mFragmentManager.O() : this.C;
    }

    public final void P(Fragment fragment2) {
        if (Q(2)) {
            Log.v("FragmentManager", "hide: " + fragment2);
        }
        if (fragment2.mHidden) {
            return;
        }
        fragment2.mHidden = true;
        fragment2.mHiddenChanged = true ^ fragment2.mHiddenChanged;
        r0(fragment2);
    }

    public final boolean S() {
        Fragment fragment2 = this.z;
        if (fragment2 == null) {
            return true;
        }
        return fragment2.isAdded() && this.z.getParentFragmentManager().S();
    }

    public final boolean U() {
        return this.I || this.J;
    }

    public final void V(int i, boolean z) {
        FragmentHostCallback fragmentHostCallback;
        if (this.x == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.w) {
            this.w = i;
            FragmentStore fragmentStore = this.c;
            HashMap map = fragmentStore.b;
            Iterator it = fragmentStore.f2757a.iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) map.get(((Fragment) it.next()).mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.l();
                }
            }
            for (FragmentStateManager fragmentStateManager2 : map.values()) {
                if (fragmentStateManager2 != null) {
                    fragmentStateManager2.l();
                    Fragment fragmentK = fragmentStateManager2.k();
                    if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                        if (fragmentK.mBeingSaved && !fragmentStore.c.containsKey(fragmentK.mWho)) {
                            fragmentStore.i(fragmentStateManager2.p(), fragmentK.mWho);
                        }
                        fragmentStore.h(fragmentStateManager2);
                    }
                }
            }
            Iterator it2 = fragmentStore.d().iterator();
            while (it2.hasNext()) {
                FragmentStateManager fragmentStateManager3 = (FragmentStateManager) it2.next();
                Fragment fragmentK2 = fragmentStateManager3.k();
                if (fragmentK2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragmentK2.mDeferStart = false;
                        fragmentStateManager3.l();
                    }
                }
            }
            if (this.H && (fragmentHostCallback = this.x) != null && this.w == 7) {
                fragmentHostCallback.h();
                this.H = false;
            }
        }
    }

    public final void W() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.j = false;
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.noteStateNotSaved();
            }
        }
    }

    public final void X() {
        z(new PopBackStackState(null, -1, 0), false);
    }

    public final void Y(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.d(i, "Bad id: "));
        }
        z(new PopBackStackState(null, i, 1), z);
    }

    public final void Z(String str) {
        z(new PopBackStackState(str, -1, 1), false);
    }

    public final FragmentStateManager a(Fragment fragment2) {
        String str = fragment2.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.c(fragment2, str);
        }
        if (Q(2)) {
            Log.v("FragmentManager", "add: " + fragment2);
        }
        FragmentStateManager fragmentStateManagerI = i(fragment2);
        fragment2.mFragmentManager = this;
        FragmentStore fragmentStore = this.c;
        fragmentStore.g(fragmentStateManagerI);
        if (!fragment2.mDetached) {
            fragmentStore.a(fragment2);
            fragment2.mRemoving = false;
            if (fragment2.mView == null) {
                fragment2.mHiddenChanged = false;
            }
            if (R(fragment2)) {
                this.H = true;
            }
        }
        return fragmentStateManagerI;
    }

    public final boolean a0() {
        return b0(-1, 0);
    }

    public final void b(FragmentOnAttachListener fragmentOnAttachListener) {
        this.q.add(fragmentOnAttachListener);
    }

    public final boolean b0(int i, int i2) {
        B(false);
        A(true);
        Fragment fragment2 = this.A;
        if (fragment2 != null && i < 0 && fragment2.getChildFragmentManager().a0()) {
            return true;
        }
        boolean zC0 = c0(this.M, this.N, null, i, i2);
        if (zC0) {
            this.b = true;
            try {
                g0(this.M, this.N);
            } finally {
                f();
            }
        }
        v0();
        boolean z = this.L;
        FragmentStore fragmentStore = this.c;
        if (z) {
            this.L = false;
            Iterator it = fragmentStore.d().iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
                Fragment fragmentK = fragmentStateManager.k();
                if (fragmentK.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragmentK.mDeferStart = false;
                        fragmentStateManager.l();
                    }
                }
            }
        }
        fragmentStore.b.values().removeAll(Collections.singleton(null));
        return zC0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment2) {
        if (this.x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.x = fragmentHostCallback;
        this.y = fragmentContainer;
        this.z = fragment2;
        if (fragment2 != null) {
            b(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public final void a(FragmentManager fragmentManager, Fragment fragment3) {
                    fragment2.onAttachFragment(fragment3);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            b((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.z != null) {
            v0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getF();
            this.g = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment2 != null) {
                lifecycleOwner = fragment2;
            }
            onBackPressedDispatcher.a(lifecycleOwner, this.j);
        }
        if (fragment2 != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment2.mFragmentManager.P;
            HashMap map = fragmentManagerViewModel.f;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(fragment2.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.h);
                map.put(fragment2.mWho, fragmentManagerViewModel2);
            }
            this.P = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.P = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore(), FragmentManagerViewModel.k).a(JvmClassMappingKt.e(FragmentManagerViewModel.class));
        } else {
            this.P = new FragmentManagerViewModel(false);
        }
        this.P.j = U();
        this.c.d = this.P;
        Object obj = this.x;
        if ((obj instanceof SavedStateRegistryOwner) && fragment2 == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new e(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                i0(bundleA);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strA = YU.a.A("FragmentManager:", fragment2 != null ? YU.a.o(new StringBuilder(), fragment2.mWho, ":") : "");
            this.D = activityResultRegistry.e(YU.a.g(strA, "StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.G.pollLast();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.d;
                    int i = launchedFragmentInfo.e;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onActivityResult(i, activityResult.d, activityResult.e);
                        return;
                    }
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                }
            });
            this.E = activityResultRegistry.e(YU.a.g(strA, "StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.G.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.d;
                    int i = launchedFragmentInfo.e;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onActivityResult(i, activityResult.d, activityResult.e);
                        return;
                    }
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                }
            });
            this.F = activityResultRegistry.e(YU.a.g(strA, "RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.G.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.d;
                    int i2 = launchedFragmentInfo.e;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onRequestPermissionsResult(i2, strArr, iArr);
                        return;
                    }
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            });
        }
        Object obj3 = this.x;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof MenuHost) && fragment2 == null) {
            ((MenuHost) obj7).addMenuProvider(this.v);
        }
    }

    public final boolean c0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iE = E(i, str, (i2 & 1) != 0);
        if (iE < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iE; size--) {
            arrayList.add((BackStackRecord) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void d(Fragment fragment2) {
        if (Q(2)) {
            Log.v("FragmentManager", "attach: " + fragment2);
        }
        if (fragment2.mDetached) {
            fragment2.mDetached = false;
            if (fragment2.mAdded) {
                return;
            }
            this.c.a(fragment2);
            if (Q(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment2);
            }
            if (R(fragment2)) {
                this.H = true;
            }
        }
    }

    public final void d0(Bundle bundle, Fragment fragment2, String str) {
        if (fragment2.mFragmentManager == this) {
            bundle.putString(str, fragment2.mWho);
        } else {
            t0(new IllegalStateException(androidx.compose.ui.input.pointer.a.l("Fragment ", fragment2, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final FragmentTransaction e() {
        return new BackStackRecord(this);
    }

    public final void e0(FragmentLifecycleCallbacks cb, boolean z) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.p;
        fragmentLifecycleCallbacksDispatcher.getClass();
        Intrinsics.h(cb, "cb");
        fragmentLifecycleCallbacksDispatcher.b.add(new FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(cb, z));
    }

    public final void f() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void f0(Fragment fragment2) {
        if (Q(2)) {
            Log.v("FragmentManager", "remove: " + fragment2 + " nesting=" + fragment2.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment2.isInBackStack();
        if (fragment2.mDetached && zIsInBackStack) {
            return;
        }
        FragmentStore fragmentStore = this.c;
        synchronized (fragmentStore.f2757a) {
            fragmentStore.f2757a.remove(fragment2);
        }
        fragment2.mAdded = false;
        if (R(fragment2)) {
            this.H = true;
        }
        fragment2.mRemoving = true;
        r0(fragment2);
    }

    public final HashSet g() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.l(viewGroup, O()));
            }
        }
        return hashSet;
    }

    public final void g0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((BackStackRecord) arrayList.get(i)).p) {
                if (i2 != i) {
                    D(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((BackStackRecord) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                D(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            D(arrayList, arrayList2, i2, size);
        }
    }

    public final HashSet h(int i, int i2, ArrayList arrayList) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((BackStackRecord) arrayList.get(i)).f2759a.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = ((FragmentTransaction.Op) it.next()).b;
                if (fragment2 != null && (viewGroup = fragment2.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.k(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void h0(String str) {
        z(new RestoreBackStackState(str), false);
    }

    public final FragmentStateManager i(Fragment fragment2) {
        String str = fragment2.mWho;
        FragmentStore fragmentStore = this.c;
        FragmentStateManager fragmentStateManager = (FragmentStateManager) fragmentStore.b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.p, fragmentStore, fragment2);
        fragmentStateManager2.m(this.x.e.getClassLoader());
        fragmentStateManager2.r(this.w);
        return fragmentStateManager2;
    }

    public final void i0(Bundle bundle) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher;
        FragmentStateManager fragmentStateManager;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.e.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.e.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        FragmentStore fragmentStore = this.c;
        HashMap map2 = fragmentStore.c;
        HashMap map3 = fragmentStore.b;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fragmentLifecycleCallbacksDispatcher = this.p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = fragmentStore.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment2 = (Fragment) this.P.e.get(((FragmentState) bundleI.getParcelable("state")).e);
                if (fragment2 != null) {
                    if (Q(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment2);
                    }
                    fragmentStateManager = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment2, bundleI);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.p, this.c, this.x.e.getClassLoader(), M(), bundleI);
                }
                Fragment fragmentK = fragmentStateManager.k();
                fragmentK.mSavedFragmentState = bundleI;
                fragmentK.mFragmentManager = this;
                if (Q(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                fragmentStateManager.m(this.x.e.getClassLoader());
                fragmentStore.g(fragmentStateManager);
                fragmentStateManager.r(this.w);
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.P;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.e.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (Q(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.d);
                }
                this.P.t6(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment3);
                fragmentStateManager2.r(1);
                fragmentStateManager2.l();
                fragment3.mRemoving = true;
                fragmentStateManager2.l();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.e;
        fragmentStore.f2757a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = fragmentStore.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(YU.a.h("No instantiated fragment for (", str3, ")"));
                }
                if (Q(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                fragmentStore.a(fragmentB);
            }
        }
        if (fragmentManagerState.f != null) {
            this.d = new ArrayList(fragmentManagerState.f.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecord backStackRecordB = backStackRecordStateArr[i].b(this);
                if (Q(2)) {
                    StringBuilder sbR = YU.a.r(i, "restoreAllState: back stack #", " (index ");
                    sbR.append(backStackRecordB.t);
                    sbR.append("): ");
                    sbR.append(backStackRecordB);
                    Log.v("FragmentManager", sbR.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter());
                    backStackRecordB.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(backStackRecordB);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.g);
        String str4 = fragmentManagerState.h;
        if (str4 != null) {
            Fragment fragmentB2 = fragmentStore.b(str4);
            this.A = fragmentB2;
            t(fragmentB2);
        }
        ArrayList arrayList2 = fragmentManagerState.i;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.l.put((String) arrayList2.get(i2), (BackStackState) fragmentManagerState.j.get(i2));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.k);
    }

    public final void j(Fragment fragment2) {
        if (Q(2)) {
            Log.v("FragmentManager", "detach: " + fragment2);
        }
        if (fragment2.mDetached) {
            return;
        }
        fragment2.mDetached = true;
        if (fragment2.mAdded) {
            if (Q(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment2);
            }
            FragmentStore fragmentStore = this.c;
            synchronized (fragmentStore.f2757a) {
                fragmentStore.f2757a.remove(fragment2);
            }
            fragment2.mAdded = false;
            if (R(fragment2)) {
                this.H = true;
            }
            r0(fragment2);
        }
    }

    public final Bundle j0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).j();
        }
        y();
        B(true);
        this.I = true;
        this.P.j = true;
        FragmentStore fragmentStore = this.c;
        fragmentStore.getClass();
        HashMap map = fragmentStore.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (FragmentStateManager fragmentStateManager : map.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentK = fragmentStateManager.k();
                fragmentStore.i(fragmentStateManager.p(), fragmentK.mWho);
                arrayList2.add(fragmentK.mWho);
                if (Q(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            FragmentStore fragmentStore2 = this.c;
            synchronized (fragmentStore2.f2757a) {
                try {
                    backStackRecordStateArr = null;
                    if (fragmentStore2.f2757a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fragmentStore2.f2757a.size());
                        Iterator it2 = fragmentStore2.f2757a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (Q(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((BackStackRecord) this.d.get(i));
                    if (Q(2)) {
                        StringBuilder sbR = YU.a.r(i, "saveAllState: adding back stack #", ": ");
                        sbR.append(this.d.get(i));
                        Log.v("FragmentManager", sbR.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.d = arrayList2;
            fragmentManagerState.e = arrayList;
            fragmentManagerState.f = backStackRecordStateArr;
            fragmentManagerState.g = this.k.get();
            Fragment fragment3 = this.A;
            if (fragment3 != null) {
                fragmentManagerState.h = fragment3.mWho;
            }
            fragmentManagerState.i.addAll(this.l.keySet());
            fragmentManagerState.j.addAll(this.l.values());
            fragmentManagerState.k = new ArrayList(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.m.keySet()) {
                bundle.putBundle(YU.a.A("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(YU.a.A("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (Q(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void k(boolean z, Configuration configuration) {
        if (z && (this.x instanceof OnConfigurationChangedProvider)) {
            t0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.performConfigurationChanged(configuration);
                if (z) {
                    fragment2.mChildFragmentManager.k(true, configuration);
                }
            }
        }
    }

    public final void k0(String str) {
        z(new SaveBackStackState(str), false);
    }

    public final boolean l(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null && fragment2.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final Fragment.SavedState l0(Fragment fragment2) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.c.b.get(fragment2.mWho);
        if (fragmentStateManager != null && fragmentStateManager.k().equals(fragment2)) {
            return fragmentStateManager.o();
        }
        t0(new IllegalStateException(androidx.compose.ui.input.pointer.a.l("Fragment ", fragment2, " is not currently in the FragmentManager")));
        throw null;
    }

    public final boolean m(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null && fragment2.isMenuVisible() && fragment2.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment2);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment3 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment3)) {
                    fragment3.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void m0() {
        synchronized (this.f2748a) {
            try {
                if (this.f2748a.size() == 1) {
                    this.x.f.removeCallbacks(this.Q);
                    this.x.f.post(this.Q);
                    v0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        B(true);
        y();
        FragmentHostCallback fragmentHostCallback = this.x;
        boolean z = fragmentHostCallback instanceof ViewModelStoreOwner;
        FragmentStore fragmentStore = this.c;
        if (z) {
            zIsChangingConfigurations = fragmentStore.d.i;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.e;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).d.iterator();
                while (it2.hasNext()) {
                    fragmentStore.d.r6((String) it2.next(), false);
                }
            }
        }
        w(-1);
        Object obj = this.x;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof MenuHost) && this.z == null) {
            ((MenuHost) obj5).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.h();
            this.g = null;
        }
        ActivityResultRegistry$register$3 activityResultRegistry$register$3 = this.D;
        if (activityResultRegistry$register$3 != null) {
            activityResultRegistry$register$3.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void n0(Fragment fragment2, boolean z) {
        ViewGroup viewGroupL = L(fragment2);
        if (viewGroupL == null || !(viewGroupL instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupL).setDrawDisappearingViewsLast(!z);
    }

    public final void o(boolean z) {
        if (z && (this.x instanceof OnTrimMemoryProvider)) {
            t0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.performLowMemory();
                if (z) {
                    fragment2.mChildFragmentManager.o(true);
                }
            }
        }
    }

    public final void o0(LifecycleOwner lifecycleOwner, final FragmentResultListener fragmentResultListener) {
        final Lifecycle lifecycle = lifecycleOwner.getD();
        if (lifecycle.getD() == Lifecycle.State.d) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Bundle bundle;
                FragmentManager fragmentManager = FragmentManager.this;
                Map map = fragmentManager.m;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) map.get("requestKey")) != null) {
                    fragmentResultListener.a(bundle, "requestKey");
                    map.remove("requestKey");
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key requestKey");
                    }
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.c(this);
                    fragmentManager.n.remove("requestKey");
                }
            }
        };
        LifecycleAwareResultListener lifecycleAwareResultListener = (LifecycleAwareResultListener) this.n.put("requestKey", new LifecycleAwareResultListener(lifecycle, fragmentResultListener, lifecycleEventObserver));
        if (lifecycleAwareResultListener != null) {
            lifecycleAwareResultListener.b();
        }
        if (Q(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key requestKey lifecycleOwner " + lifecycle + " and listener " + fragmentResultListener);
        }
        lifecycle.a(lifecycleEventObserver);
    }

    public final void p(boolean z, boolean z2) {
        if (z2 && (this.x instanceof OnMultiWindowModeChangedProvider)) {
            t0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment2.mChildFragmentManager.p(z, true);
                }
            }
        }
    }

    public final void p0(Fragment fragment2, Lifecycle.State state) {
        if (fragment2.equals(this.c.b(fragment2.mWho)) && (fragment2.mHost == null || fragment2.mFragmentManager == this)) {
            fragment2.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment2 + " is not an active fragment of FragmentManager " + this);
    }

    public final void q() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                fragment2.onHiddenChanged(fragment2.isHidden());
                fragment2.mChildFragmentManager.q();
            }
        }
    }

    public final void q0(Fragment fragment2) {
        if (fragment2 != null) {
            if (!fragment2.equals(this.c.b(fragment2.mWho)) || (fragment2.mHost != null && fragment2.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment2 + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment3 = this.A;
        this.A = fragment2;
        t(fragment3);
        t(this.A);
    }

    public final boolean r(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null && fragment2.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r0(Fragment fragment2) {
        ViewGroup viewGroupL = L(fragment2);
        if (viewGroupL != null) {
            if (fragment2.getPopExitAnim() + fragment2.getPopEnterAnim() + fragment2.getExitAnim() + fragment2.getEnterAnim() > 0) {
                if (viewGroupL.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupL.setTag(R.id.visible_removing_fragment_view_tag, fragment2);
                }
                ((Fragment) viewGroupL.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment2.getPopDirection());
            }
        }
    }

    public final void s(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void t(Fragment fragment2) {
        if (fragment2 != null) {
            if (fragment2.equals(this.c.b(fragment2.mWho))) {
                fragment2.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter());
        FragmentHostCallback fragmentHostCallback = this.x;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            x("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final String toString() {
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(128, "FragmentManager{");
        sbO.append(Integer.toHexString(System.identityHashCode(this)));
        sbO.append(" in ");
        Fragment fragment2 = this.z;
        if (fragment2 != null) {
            sbO.append(fragment2.getClass().getSimpleName());
            sbO.append("{");
            sbO.append(Integer.toHexString(System.identityHashCode(this.z)));
            sbO.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.x;
            if (fragmentHostCallback != null) {
                sbO.append(fragmentHostCallback.getClass().getSimpleName());
                sbO.append("{");
                sbO.append(Integer.toHexString(System.identityHashCode(this.x)));
                sbO.append("}");
            } else {
                sbO.append("null");
            }
        }
        sbO.append("}}");
        return sbO.toString();
    }

    public final void u(boolean z, boolean z2) {
        if (z2 && (this.x instanceof OnPictureInPictureModeChangedProvider)) {
            t0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null) {
                fragment2.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment2.mChildFragmentManager.u(z, true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0.b.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r6) {
        /*
            r5 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.p
            r0.getClass()
            java.lang.String r1 = "cb"
            kotlin.jvm.internal.Intrinsics.h(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.b
            monitor-enter(r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.b     // Catch: java.lang.Throwable -> L28
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L28
            r3 = 0
        L14:
            if (r3 >= r2) goto L2d
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r4.f2747a     // Catch: java.lang.Throwable -> L28
            if (r4 != r6) goto L2a
            java.util.concurrent.CopyOnWriteArrayList r6 = r0.b     // Catch: java.lang.Throwable -> L28
            r6.remove(r3)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r6 = move-exception
            goto L2f
        L2a:
            int r3 = r3 + 1
            goto L14
        L2d:
            monitor-exit(r1)
            return
        L2f:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.u0(androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks):void");
    }

    public final boolean v(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment2 : this.c.f()) {
            if (fragment2 != null && fragment2.isMenuVisible() && fragment2.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void v0() {
        synchronized (this.f2748a) {
            try {
                if (!this.f2748a.isEmpty()) {
                    this.j.i(true);
                    if (Q(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = J() > 0 && T(this.z);
                if (Q(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.i(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(int i) {
        try {
            this.b = true;
            for (FragmentStateManager fragmentStateManager : this.c.b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.r(i);
                }
            }
            V(i, false);
            Iterator it = g().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).i();
            }
            this.b = false;
            B(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strG = YU.a.g(str, "    ");
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.f2757a;
        String strG2 = YU.a.g(str, "    ");
        HashMap map = fragmentStore.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : map.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragmentK = fragmentStateManager.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(strG2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.q(strG, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f2748a) {
            try {
                int size4 = this.f2748a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (OpGenerator) this.f2748a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void y() {
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).i();
        }
    }

    public final void z(OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (U()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2748a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2748a.add(opGenerator);
                    m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
