package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@Navigator.Name("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Destination", "Extras", "Companion", "ClearEntryStateViewModel", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class FragmentNavigator extends Navigator<Destination> {
    public final Context c;
    public final FragmentManager d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final androidx.compose.material3.internal.a h = new androidx.compose.material3.internal.a(this, 2);
    public final e i = new e(this, 0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference e;

        @Override // androidx.lifecycle.ViewModel
        public final void o6() {
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                Intrinsics.p("completeTransition");
                throw null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "", "TAG", "Ljava/lang/String;", "KEY_SAVED_IDS", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @NavDestination.ClassType
    @SourceDebugExtension
    public static class Destination extends NavDestination {
        public String j;

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Destination) && super.equals(obj) && Intrinsics.c(this.j, ((Destination) obj).j);
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.j;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public final void k(Context context, AttributeSet attributeSet) {
            super.k(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.b);
            Intrinsics.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.j = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.j;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "Builder", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i) {
        this.c = context;
        this.d = fragmentManager;
        this.e = i;
    }

    public static void k(FragmentNavigator fragmentNavigator, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = fragmentNavigator.g;
        if (z2) {
            CollectionsKt.g0(arrayList, new d(str, 0));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            boolean zIsEmpty = ((List) b().e.getValue()).isEmpty();
            if (navOptions == null || zIsEmpty || !navOptions.b || !this.f.remove(navBackStackEntry.i)) {
                FragmentTransaction fragmentTransactionM = m(navBackStackEntry, navOptions);
                String str = navBackStackEntry.i;
                if (!zIsEmpty) {
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.P((List) b().e.getValue());
                    if (navBackStackEntry2 != null) {
                        k(this, navBackStackEntry2.i, 6);
                    }
                    k(this, str, 6);
                    fragmentTransactionM.c(str);
                }
                fragmentTransactionM.d();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + navBackStackEntry);
                }
                b().h(navBackStackEntry);
            } else {
                fragmentManager.h0(navBackStackEntry.i);
                b().h(navBackStackEntry);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void e(final NavController.NavControllerNavigatorState navControllerNavigatorState) {
        super.e(navControllerNavigatorState);
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        FragmentOnAttachListener fragmentOnAttachListener = new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.b
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void a(FragmentManager fragmentManager, Fragment fragment2) {
                Object objPrevious;
                Intrinsics.h(fragmentManager, "<unused var>");
                NavController.NavControllerNavigatorState navControllerNavigatorState2 = navControllerNavigatorState;
                List list = (List) navControllerNavigatorState2.e.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.c(((NavBackStackEntry) objPrevious).i, fragment2.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean zN = FragmentNavigator.n();
                FragmentNavigator fragmentNavigator = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment2 + " associated with entry " + navBackStackEntry + " to FragmentManager " + fragmentNavigator.d);
                }
                if (navBackStackEntry != null) {
                    fragment2.getViewLifecycleOwnerLiveData().f(fragment2, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new androidx.lifecycle.compose.b(2, fragmentNavigator, fragment2, navBackStackEntry)));
                    fragment2.getD().a(fragmentNavigator.h);
                    fragmentNavigator.l(fragment2, navBackStackEntry, navControllerNavigatorState2);
                }
            }
        };
        FragmentManager fragmentManager = this.d;
        fragmentManager.b(fragmentOnAttachListener);
        fragmentManager.o.add(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator$onAttach$2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void a(Fragment fragment2, boolean z) {
                Object objPrevious;
                Intrinsics.h(fragment2, "fragment");
                if (z) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState2 = navControllerNavigatorState;
                    List list = (List) navControllerNavigatorState2.e.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        } else {
                            objPrevious = listIterator.previous();
                            if (Intrinsics.c(((NavBackStackEntry) objPrevious).i, fragment2.getTag())) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                    if (FragmentNavigator.n()) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment2 + " associated with entry " + navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        navControllerNavigatorState2.f(navBackStackEntry);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void b(Fragment fragment2, boolean z) {
                Object obj;
                Object objPrevious;
                FragmentNavigator fragmentNavigator = this;
                ArrayList arrayList = fragmentNavigator.g;
                Intrinsics.h(fragment2, "fragment");
                NavController.NavControllerNavigatorState navControllerNavigatorState2 = navControllerNavigatorState;
                ArrayList arrayListC0 = CollectionsKt.c0((Iterable) navControllerNavigatorState2.f.getValue(), (Collection) navControllerNavigatorState2.e.getValue());
                ListIterator listIterator = arrayListC0.listIterator(arrayListC0.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.c(((NavBackStackEntry) objPrevious).i, fragment2.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean z2 = z && arrayList.isEmpty() && fragment2.isRemoving();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.c(((Pair) next).d, fragment2.getTag())) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    arrayList.remove(pair);
                }
                if (!z2 && FragmentNavigator.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment2 + " associated with entry " + navBackStackEntry);
                }
                boolean z3 = pair != null && ((Boolean) pair.e).booleanValue();
                if (!z && !z3 && navBackStackEntry == null) {
                    throw new IllegalArgumentException(androidx.compose.ui.input.pointer.a.l("The fragment ", fragment2, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                }
                if (navBackStackEntry != null) {
                    fragmentNavigator.l(fragment2, navBackStackEntry, navControllerNavigatorState2);
                    if (z2) {
                        if (FragmentNavigator.n()) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment2 + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        navControllerNavigatorState2.e(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public final void f(NavBackStackEntry navBackStackEntry) {
        String str = navBackStackEntry.i;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransactionM = m(navBackStackEntry, null);
        List list = (List) b().e.getValue();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.J(CollectionsKt.I(list) - 1, list);
            if (navBackStackEntry2 != null) {
                k(this, navBackStackEntry2.i, 6);
            }
            k(this, str, 4);
            fragmentManager.Z(str);
            k(this, str, 2);
            fragmentTransactionM.c(str);
        }
        fragmentTransactionM.d();
        b().c(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            CollectionsKt.h(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.navigation.Navigator
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return BundleKt.a(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.getValue();
        int iIndexOf = list.indexOf(navBackStackEntry);
        List listSubList = list.subList(iIndexOf, list.size());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.D(list);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.J(iIndexOf - 1, list);
        if (navBackStackEntry3 != null) {
            k(this, navBackStackEntry3.i, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj;
            if (SequencesKt.c(SequencesKt.r(CollectionsKt.n(this.g), new androidx.navigation.a(15)), navBackStackEntry4.i) || !Intrinsics.c(navBackStackEntry4.i, navBackStackEntry2.i)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((NavBackStackEntry) it.next()).i, 4);
        }
        if (z) {
            for (NavBackStackEntry navBackStackEntry5 : CollectionsKt.l0(list2)) {
                if (Intrinsics.c(navBackStackEntry5, navBackStackEntry2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry5);
                } else {
                    fragmentManager.k0(navBackStackEntry5.i);
                    this.f.add(navBackStackEntry5.i);
                }
            }
        } else {
            fragmentManager.Z(navBackStackEntry.i);
        }
        if (n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry + " with savedState " + z);
        }
        b().e(navBackStackEntry, z);
    }

    public final void l(final Fragment fragment2, final NavBackStackEntry navBackStackEntry, final NavController.NavControllerNavigatorState navControllerNavigatorState) {
        Intrinsics.h(fragment2, "fragment");
        ViewModelStore viewModelStore = fragment2.getViewModelStore();
        Intrinsics.g(viewModelStore, "<get-viewModelStore>(...)");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.a(Reflection.f24268a.b(ClearEntryStateViewModel.class), new androidx.navigation.a(14));
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.b(), CreationExtras.Empty.b).a(JvmClassMappingKt.e(ClearEntryStateViewModel.class))).e = new WeakReference(new Function0(navBackStackEntry, navControllerNavigatorState, this, fragment2) { // from class: androidx.navigation.fragment.c
            public final /* synthetic */ NavController.NavControllerNavigatorState d;
            public final /* synthetic */ Fragment e;

            {
                this.d = navControllerNavigatorState;
                this.e = fragment2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NavController.NavControllerNavigatorState navControllerNavigatorState2 = this.d;
                for (NavBackStackEntry navBackStackEntry2 : (Iterable) navControllerNavigatorState2.f.getValue()) {
                    if (FragmentNavigator.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry2 + " due to fragment " + this.e + " viewmodel being cleared");
                    }
                    navControllerNavigatorState2.b(navBackStackEntry2);
                }
                return Unit.f24250a;
            }
        });
    }

    public final FragmentTransaction m(NavBackStackEntry navBackStackEntry, NavOptions navOptions) {
        NavDestination navDestination = navBackStackEntry.e;
        Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleA = navBackStackEntry.k.a();
        String str = ((Destination) navDestination).j;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.d;
        Fragment fragmentA = fragmentManager.M().a(context.getClassLoader(), str);
        Intrinsics.g(fragmentA, "instantiate(...)");
        fragmentA.setArguments(bundleA);
        FragmentTransaction fragmentTransactionE = fragmentManager.e();
        int i = navOptions != null ? navOptions.f : -1;
        int i2 = navOptions != null ? navOptions.g : -1;
        int i3 = navOptions != null ? navOptions.h : -1;
        int i4 = navOptions != null ? navOptions.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            fragmentTransactionE.k(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        fragmentTransactionE.j(this.e, fragmentA, navBackStackEntry.i);
        fragmentTransactionE.m(fragmentA);
        fragmentTransactionE.p = true;
        return fragmentTransactionE;
    }
}
