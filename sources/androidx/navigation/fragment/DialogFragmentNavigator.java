package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Destination", "Companion", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogFragmentNavigator extends Navigator<Destination> {
    public final Context c;
    public final FragmentManager d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final DialogFragmentNavigator$observer$1 f = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3502a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f3502a = iArr;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int iNextIndex;
            int i = WhenMappings.f3502a[event.ordinal()];
            DialogFragmentNavigator dialogFragmentNavigator = this.d;
            if (i == 1) {
                DialogFragment dialogFragment = (DialogFragment) lifecycleOwner;
                Iterable iterable = (Iterable) dialogFragmentNavigator.b().e.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((NavBackStackEntry) it.next()).i, dialogFragment.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment.dismiss();
                return;
            }
            Object obj = null;
            if (i == 2) {
                DialogFragment dialogFragment2 = (DialogFragment) lifecycleOwner;
                for (Object obj2 : (Iterable) dialogFragmentNavigator.b().f.getValue()) {
                    if (Intrinsics.c(((NavBackStackEntry) obj2).i, dialogFragment2.getTag())) {
                        obj = obj2;
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (navBackStackEntry != null) {
                    dialogFragmentNavigator.b().b(navBackStackEntry);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                DialogFragment dialogFragment3 = (DialogFragment) lifecycleOwner;
                for (Object obj3 : (Iterable) dialogFragmentNavigator.b().f.getValue()) {
                    if (Intrinsics.c(((NavBackStackEntry) obj3).i, dialogFragment3.getTag())) {
                        obj = obj3;
                    }
                }
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                if (navBackStackEntry2 != null) {
                    dialogFragmentNavigator.b().b(navBackStackEntry2);
                }
                dialogFragment3.getD().c(this);
                return;
            }
            DialogFragment dialogFragment4 = (DialogFragment) lifecycleOwner;
            if (dialogFragment4.requireDialog().isShowing()) {
                return;
            }
            List list = (List) dialogFragmentNavigator.b().e.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.c(((NavBackStackEntry) listIterator.previous()).i, dialogFragment4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.J(iNextIndex, list);
            if (!Intrinsics.c(CollectionsKt.P(list), navBackStackEntry3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (navBackStackEntry3 != null) {
                dialogFragmentNavigator.l(iNextIndex, navBackStackEntry3, false);
            }
        }
    };
    public final LinkedHashMap g = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Companion;", "", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @NavDestination.ClassType
    @SourceDebugExtension
    public static class Destination extends NavDestination implements FloatingWindow {
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f3504a);
            Intrinsics.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.j = string;
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.c = context;
        this.d = fragmentManager;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            k(navBackStackEntry).show(fragmentManager, navBackStackEntry.i);
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.P((List) b().e.getValue());
            boolean zT = CollectionsKt.t((Iterable) b().f.getValue(), navBackStackEntry2);
            b().h(navBackStackEntry);
            if (navBackStackEntry2 != null && !zT) {
                b().b(navBackStackEntry2);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        Lifecycle d;
        super.e(navControllerNavigatorState);
        Iterator it = ((List) navControllerNavigatorState.e.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.d;
            if (!zHasNext) {
                fragmentManager.b(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.a
                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public final void a(FragmentManager fragmentManager2, Fragment fragment2) {
                        Intrinsics.h(fragmentManager2, "<unused var>");
                        DialogFragmentNavigator dialogFragmentNavigator = this.d;
                        LinkedHashSet linkedHashSet = dialogFragmentNavigator.e;
                        if (TypeIntrinsics.a(linkedHashSet).remove(fragment2.getTag())) {
                            fragment2.getD().a(dialogFragmentNavigator.f);
                        }
                        LinkedHashMap linkedHashMap = dialogFragmentNavigator.g;
                        TypeIntrinsics.b(linkedHashMap).remove(fragment2.getTag());
                    }
                });
                return;
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.G(navBackStackEntry.i);
            if (dialogFragment == null || (d = dialogFragment.getD()) == null) {
                this.e.add(navBackStackEntry.i);
            } else {
                d.a(this.f);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void f(NavBackStackEntry navBackStackEntry) {
        String str = navBackStackEntry.i;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.g.get(str);
        if (dialogFragment == null) {
            Fragment fragmentG = fragmentManager.G(str);
            dialogFragment = fragmentG instanceof DialogFragment ? (DialogFragment) fragmentG : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getD().c(this.f);
            dialogFragment.dismiss();
        }
        k(navBackStackEntry).show(fragmentManager, str);
        NavigatorState navigatorStateB = b();
        List list = (List) navigatorStateB.e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.c(navBackStackEntry2.i, str)) {
                MutableStateFlow mutableStateFlow = navigatorStateB.c;
                mutableStateFlow.setValue(SetsKt.h(SetsKt.h((Set) mutableStateFlow.getValue(), navBackStackEntry2), navBackStackEntry));
                navigatorStateB.c(navBackStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.U()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.getValue();
        int iIndexOf = list.indexOf(navBackStackEntry);
        Iterator it = CollectionsKt.l0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentG = fragmentManager.G(((NavBackStackEntry) it.next()).i);
            if (fragmentG != null) {
                ((DialogFragment) fragmentG).dismiss();
            }
        }
        l(iIndexOf, navBackStackEntry, z);
    }

    public final DialogFragment k(NavBackStackEntry navBackStackEntry) {
        NavDestination navDestination = navBackStackEntry.e;
        Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        Destination destination = (Destination) navDestination;
        String str = destination.j;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment fragmentA = this.d.M().a(context.getClassLoader(), str);
        Intrinsics.g(fragmentA, "instantiate(...)");
        if (DialogFragment.class.isAssignableFrom(fragmentA.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentA;
            dialogFragment.setArguments(navBackStackEntry.k.a());
            dialogFragment.getD().a(this.f);
            this.g.put(navBackStackEntry.i, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = destination.j;
        if (str2 != null) {
            throw new IllegalArgumentException(YU.a.o(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i, NavBackStackEntry navBackStackEntry, boolean z) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.J(i - 1, (List) b().e.getValue());
        boolean zT = CollectionsKt.t((Iterable) b().f.getValue(), navBackStackEntry2);
        b().e(navBackStackEntry, z);
        if (navBackStackEntry2 == null || zT) {
            return;
        }
        b().b(navBackStackEntry2);
    }
}
