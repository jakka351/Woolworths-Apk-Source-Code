package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLinkBuilder;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.Log;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavControllerImpl;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateReaderKt;
import androidx.os.SavedStateWriter;
import androidx.os.SavedStateWriterKt;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "OnDestinationChangedListener", "NavControllerNavigatorState", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavController {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3476a;
    public final NavControllerImpl b;
    public final NavContext c;
    public final Activity d;
    public boolean e;
    public final NavController$onBackPressedCallback$1 f;
    public final boolean g;
    public final Lazy h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "", "KEY_DEEP_LINK_IDS", "Ljava/lang/String;", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_INTENT", "", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0090\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public class NavControllerNavigatorState extends NavigatorState {
        public final Navigator g;
        public final /* synthetic */ NavController h;

        public NavControllerNavigatorState(NavController navController, Navigator navigator) {
            Intrinsics.h(navigator, "navigator");
            this.h = navController;
            this.g = navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public final NavBackStackEntry a(NavDestination navDestination, Bundle bundle) {
            NavControllerImpl navControllerImpl = this.h.b;
            navControllerImpl.getClass();
            return NavBackStackEntry.Companion.a(navControllerImpl.f3510a.c, navDestination, bundle, navControllerImpl.h(), navControllerImpl.p);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        @Override // androidx.navigation.NavigatorState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.navigation.NavBackStackEntry r8) {
            /*
                r7 = this;
                java.lang.String r0 = "entry"
                kotlin.jvm.internal.Intrinsics.h(r8, r0)
                androidx.navigation.NavController r0 = r7.h
                androidx.navigation.internal.NavControllerImpl r0 = r0.b
                kotlinx.coroutines.flow.MutableStateFlow r1 = r0.i
                java.lang.String r2 = r8.i
                java.util.LinkedHashMap r3 = r0.x
                java.lang.Object r4 = r3.get(r8)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
                super.b(r8)
                r3.remove(r8)
                kotlin.collections.ArrayDeque r3 = r0.f
                boolean r5 = r3.contains(r8)
                if (r5 != 0) goto L80
                r0.r(r8)
                androidx.navigation.internal.NavBackStackEntryImpl r5 = r8.k
                androidx.lifecycle.LifecycleRegistry r5 = r5.k
                androidx.lifecycle.Lifecycle$State r5 = r5.d
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.f
                int r5 = r5.compareTo(r6)
                if (r5 < 0) goto L3d
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.d
                r8.a(r5)
            L3d:
                boolean r8 = r3.isEmpty()
                if (r8 == 0) goto L44
                goto L5d
            L44:
                java.util.Iterator r8 = r3.iterator()
            L48:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L5d
                java.lang.Object r3 = r8.next()
                androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
                java.lang.String r3 = r3.i
                boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r2)
                if (r3 == 0) goto L48
                goto L75
            L5d:
                if (r4 != 0) goto L75
                androidx.navigation.NavControllerViewModel r8 = r0.p
                if (r8 == 0) goto L75
                java.lang.String r3 = "backStackEntryId"
                kotlin.jvm.internal.Intrinsics.h(r2, r3)
                java.util.LinkedHashMap r8 = r8.e
                java.lang.Object r8 = r8.remove(r2)
                androidx.lifecycle.ViewModelStore r8 = (androidx.lifecycle.ViewModelStore) r8
                if (r8 == 0) goto L75
                r8.a()
            L75:
                r0.s()
                java.util.ArrayList r8 = r0.o()
                r1.f(r8)
                return
            L80:
                boolean r8 = r7.d
                if (r8 != 0) goto L97
                r0.s()
                kotlinx.coroutines.flow.MutableStateFlow r8 = r0.g
                java.util.ArrayList r2 = kotlin.collections.CollectionsKt.J0(r3)
                r8.f(r2)
                java.util.ArrayList r8 = r0.o()
                r1.f(r8)
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.NavControllerNavigatorState.b(androidx.navigation.NavBackStackEntry):void");
        }

        @Override // androidx.navigation.NavigatorState
        public final void d(NavBackStackEntry navBackStackEntry, boolean z) {
            NavControllerImpl navControllerImpl = this.h.b;
            navControllerImpl.getClass();
            Navigator navigatorB = navControllerImpl.t.b(navBackStackEntry.e.d);
            navControllerImpl.x.put(navBackStackEntry, Boolean.valueOf(z));
            if (!Intrinsics.c(navigatorB, this.g)) {
                Object obj = navControllerImpl.u.get(navigatorB);
                Intrinsics.e(obj);
                ((NavControllerNavigatorState) obj).d(navBackStackEntry, z);
                return;
            }
            androidx.navigation.internal.d dVar = navControllerImpl.w;
            if (dVar != null) {
                dVar.invoke(navBackStackEntry);
                super.d(navBackStackEntry, z);
                return;
            }
            ArrayDeque arrayDeque = navControllerImpl.f;
            int iIndexOf = arrayDeque.indexOf(navBackStackEntry);
            if (iIndexOf < 0) {
                Log.Companion.a("Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != arrayDeque.f) {
                navControllerImpl.l(((NavBackStackEntry) arrayDeque.get(i)).e.e.e, true, false);
            }
            NavControllerImpl.n(navControllerImpl, navBackStackEntry);
            super.d(navBackStackEntry, z);
            navControllerImpl.b.invoke();
            navControllerImpl.b();
        }

        @Override // androidx.navigation.NavigatorState
        public final void f(NavBackStackEntry entry) {
            Intrinsics.h(entry, "entry");
            super.f(entry);
            NavControllerImpl navControllerImpl = this.h.b;
            navControllerImpl.getClass();
            if (!navControllerImpl.f.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.a(Lifecycle.State.g);
        }

        @Override // androidx.navigation.NavigatorState
        public final void g(NavBackStackEntry backStackEntry) {
            Intrinsics.h(backStackEntry, "backStackEntry");
            NavControllerImpl navControllerImpl = this.h.b;
            navControllerImpl.getClass();
            Navigator navigatorB = navControllerImpl.t.b(backStackEntry.e.d);
            if (!Intrinsics.c(navigatorB, this.g)) {
                Object obj = navControllerImpl.u.get(navigatorB);
                if (obj == null) {
                    throw new IllegalStateException(YU.a.o(new StringBuilder("NavigatorBackStack for "), backStackEntry.e.d, " should already be created").toString());
                }
                ((NavControllerNavigatorState) obj).g(backStackEntry);
                return;
            }
            Function1 function1 = navControllerImpl.v;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                super.g(backStackEntry);
            } else {
                Log.Companion.a("Ignoring add of destination " + backStackEntry.e + " outside of the call to navigate(). ");
            }
        }

        public final void i(NavBackStackEntry backStackEntry) {
            Intrinsics.h(backStackEntry, "backStackEntry");
            super.g(backStackEntry);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDestinationChangedListener {
        void a(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.navigation.NavController$onBackPressedCallback$1] */
    public NavController(@NotNull Context context) {
        Object next;
        Intrinsics.h(context, "context");
        this.f3476a = context;
        this.b = new NavControllerImpl(this, new b(this, 0));
        this.c = new NavContext(context);
        Iterator it = SequencesKt.m(context, new a(1)).getF24664a();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
        this.f = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                this.d.g();
            }
        };
        this.g = true;
        NavigatorProvider navigatorProvider = this.b.t;
        navigatorProvider.a(new NavGraphNavigator(navigatorProvider));
        this.b.t.a(new ActivityNavigator(this.f3476a));
        this.h = LazyKt.b(new b(this, 1));
    }

    public static void e(NavController navController, Object route) {
        navController.getClass();
        Intrinsics.h(route, "route");
        NavControllerImpl navControllerImpl = navController.b;
        navControllerImpl.getClass();
        navControllerImpl.getClass();
        Intrinsics.h(route, "route");
        Class<?> cls = route.getClass();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        NavDestination navDestinationD = NavControllerImpl.d(RouteSerializerKt.b(SerializersKt.b(reflectionFactory.b(cls))), navControllerImpl.g(), null, true);
        if (navDestinationD == null) {
            throw new IllegalArgumentException(("Destination with route " + reflectionFactory.b(route.getClass()).B() + " cannot be found in navigation graph " + navControllerImpl.c).toString());
        }
        Map mapI = navDestinationD.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(mapI.size()));
        for (Map.Entry entry : mapI.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).f3472a);
        }
        String route2 = RouteSerializerKt.c(route, linkedHashMap);
        Intrinsics.h(route2, "route");
        if (navControllerImpl.c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route2 + ". Navigation graph has not been set for NavController " + navControllerImpl + JwtParser.SEPARATOR_CHAR).toString());
        }
        NavGraph navGraphI = navControllerImpl.i();
        NavDestination.DeepLinkMatch deepLinkMatchO = navGraphI.o(route2, true, navGraphI);
        if (deepLinkMatchO == null) {
            StringBuilder sbU = YU.a.u("Navigation destination that matches route ", route2, " cannot be found in the navigation graph ");
            sbU.append(navControllerImpl.c);
            throw new IllegalArgumentException(sbU.toString());
        }
        NavDestination navDestination = deepLinkMatchO.d;
        Bundle bundleD = navDestination.d(deepLinkMatchO.e);
        if (bundleD == null) {
            bundleD = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i = NavDestination.i;
        String str = navDestination.e.f;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : "";
        Intrinsics.h(uriString, "uriString");
        Uri uriB = NavUriUtils.b(uriString);
        Intent intent = new Intent();
        intent.setDataAndType(uriB, null);
        intent.setAction(null);
        SavedStateWriter.c(bundleD, "android-support-nav:controller:deepLinkIntent", intent);
        navControllerImpl.k(navDestination, bundleD, null);
    }

    public final void a(OnDestinationChangedListener onDestinationChangedListener) {
        NavControllerImpl navControllerImpl = this.b;
        navControllerImpl.getClass();
        navControllerImpl.q.add(onDestinationChangedListener);
        ArrayDeque arrayDeque = navControllerImpl.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.last();
        onDestinationChangedListener.a(navControllerImpl.f3510a, navBackStackEntry.e, navBackStackEntry.k.a());
    }

    public final int b() {
        ArrayDeque arrayDeque = this.b.f;
        int i = 0;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(((NavBackStackEntry) it.next()).e instanceof NavGraph) && (i = i + 1) < 0) {
                CollectionsKt.y0();
                throw null;
            }
        }
        return i;
    }

    public final void c(int i, Bundle bundle) {
        int i2;
        NavOptions navOptions;
        Bundle bundleA;
        NavControllerImpl navControllerImpl = this.b;
        NavDestination navDestination = navControllerImpl.f.isEmpty() ? navControllerImpl.c : ((NavBackStackEntry) navControllerImpl.f.last()).e;
        if (navDestination == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + JwtParser.SEPARATOR_CHAR);
        }
        NavAction navActionH = navDestination.h(i);
        if (navActionH != null) {
            navOptions = navActionH.b;
            i2 = navActionH.f3470a;
            Bundle bundle2 = navActionH.c;
            if (bundle2 != null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleA.putAll(bundle2);
            } else {
                bundleA = null;
            }
        } else {
            i2 = i;
            navOptions = null;
            bundleA = null;
        }
        if (bundle != null) {
            if (bundleA == null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleA.putAll(bundle);
        }
        if (i2 == 0 && navOptions != null) {
            boolean z = navOptions.d;
            int i3 = navOptions.c;
            if (i3 != -1) {
                if (i3 == -1 || !navControllerImpl.l(i3, z, false)) {
                    return;
                }
                navControllerImpl.b();
                return;
            }
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        NavDestination navDestinationC = navControllerImpl.c(i2, null);
        if (navDestinationC != null) {
            navControllerImpl.k(navDestinationC, bundleA, navOptions);
            return;
        }
        int i4 = NavDestination.i;
        NavContext navContext = this.c;
        String strA = NavDestination.Companion.a(navContext, i2);
        if (navActionH == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strA + " cannot be found from the current destination " + navDestination);
        }
        StringBuilder sbU = YU.a.u("Navigation destination ", strA, " referenced from action ");
        sbU.append(NavDestination.Companion.a(navContext, i));
        sbU.append(" cannot be found from the current destination ");
        sbU.append(navDestination);
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    public final void d(NavDirections navDirections) {
        c(navDirections.c(), navDirections.b());
    }

    public final boolean f() {
        Bundle bundleD;
        Intent intent;
        if (b() != 1) {
            return g();
        }
        Activity activity = this.d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        int i = 0;
        NavControllerImpl navControllerImpl = this.b;
        if (intArray == null) {
            NavDestination navDestinationF = navControllerImpl.f();
            Intrinsics.e(navDestinationF);
            int i2 = navDestinationF.e.e;
            for (NavGraph navGraph = navDestinationF.f; navGraph != null; navGraph = navGraph.f) {
                NavDestinationImpl navDestinationImpl = navGraph.e;
                if (navGraph.j.c != i2) {
                    Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        Intrinsics.g(intent2, "getIntent(...)");
                        SavedStateWriter.c(bundleA, "android-support-nav:controller:deepLinkIntent", intent2);
                        NavGraph navGraphI = navControllerImpl.i();
                        Intent intent3 = activity.getIntent();
                        Intrinsics.g(intent3, "getIntent(...)");
                        NavDestination.DeepLinkMatch deepLinkMatchN = navGraphI.n(new NavDeepLinkRequest(intent3.getData(), intent3.getAction(), intent3.getType()), navGraphI);
                        if ((deepLinkMatchN != null ? deepLinkMatchN.e : null) != null && (bundleD = deepLinkMatchN.d.d(deepLinkMatchN.e)) != null) {
                            bundleA.putAll(bundleD);
                        }
                    }
                    NavDeepLinkBuilder navDeepLinkBuilder = new NavDeepLinkBuilder(this);
                    int i3 = navDestinationImpl.e;
                    ArrayList arrayList = navDeepLinkBuilder.e;
                    arrayList.clear();
                    arrayList.add(new NavDeepLinkBuilder.DeepLinkDestination(i3, null));
                    if (navDeepLinkBuilder.d != null) {
                        navDeepLinkBuilder.c();
                    }
                    navDeepLinkBuilder.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA);
                    navDeepLinkBuilder.a().h();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i2 = navDestinationImpl.e;
            }
        } else if (this.e) {
            Intrinsics.e(activity);
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            Intrinsics.e(extras2);
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            Intrinsics.e(intArray2);
            ArrayList arrayListP0 = ArraysKt.p0(intArray2);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayListP0.size() >= 2) {
                int iIntValue = ((Number) CollectionsKt.j0(arrayListP0)).intValue();
                if (parcelableArrayList != null) {
                }
                NavDestination navDestinationD = NavControllerImpl.d(iIntValue, navControllerImpl.g(), null, false);
                if (navDestinationD instanceof NavGraph) {
                    int i4 = NavGraph.k;
                    iIntValue = ((NavDestination) SequencesKt.q(SequencesKt.m((NavGraph) navDestinationD, new a(6)))).e.e;
                }
                NavDestination navDestinationF2 = navControllerImpl.f();
                if (navDestinationF2 != null && iIntValue == navDestinationF2.e.e) {
                    NavDeepLinkBuilder navDeepLinkBuilder2 = new NavDeepLinkBuilder(this);
                    Bundle bundleA2 = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    SavedStateWriter.c(bundleA2, "android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleA2.putAll(bundle);
                    }
                    navDeepLinkBuilder2.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA2);
                    Iterator it = arrayListP0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        navDeepLinkBuilder2.e.add(new NavDeepLinkBuilder.DeepLinkDestination(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                        if (navDeepLinkBuilder2.d != null) {
                            navDeepLinkBuilder2.c();
                        }
                        i = i5;
                    }
                    navDeepLinkBuilder2.a().h();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g() {
        NavControllerImpl navControllerImpl = this.b;
        if (navControllerImpl.f.isEmpty()) {
            return false;
        }
        NavDestination navDestinationF = navControllerImpl.f();
        Intrinsics.e(navDestinationF);
        return navControllerImpl.l(navDestinationF.e.e, true, false) && navControllerImpl.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Bundle bundle) {
        Bundle[] bundleArr;
        Throwable th;
        if (bundle != null) {
            bundle.setClassLoader(this.f3476a.getClassLoader());
        }
        NavControllerImpl navControllerImpl = this.b;
        LinkedHashMap linkedHashMap = navControllerImpl.n;
        Throwable th2 = null;
        if (bundle == null) {
            th = null;
        } else {
            navControllerImpl.d = bundle.containsKey("android-support-nav:controller:navigatorState") ? SavedStateReader.i(bundle, "android-support-nav:controller:navigatorState") : null;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                ArrayList arrayListC = BundleCompat.c(bundle, "android-support-nav:controller:backStack", JvmClassMappingKt.b(Reflection.f24268a.b(Bundle.class)));
                if (arrayListC == null) {
                    SavedStateReaderKt.a("android-support-nav:controller:backStack");
                    throw null;
                }
                bundleArr = (Bundle[]) arrayListC.toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            navControllerImpl.e = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] iArrG = SavedStateReader.g(bundle, "android-support-nav:controller:backStackDestIds");
                ArrayList arrayListL = SavedStateReader.l(bundle, "android-support-nav:controller:backStackIds");
                int length = iArrG.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    Throwable th3 = th2;
                    navControllerImpl.m.put(Integer.valueOf(iArrG[i]), !Intrinsics.c(arrayListL.get(i2), "") ? (String) arrayListL.get(i2) : th3);
                    i++;
                    i2 = i3;
                    th2 = th3;
                }
            }
            th = th2;
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                for (String str : SavedStateReader.l(bundle, "android-support-nav:controller:backStackStates")) {
                    String key = "android-support-nav:controller:backStackStates:" + str;
                    Intrinsics.h(key, "key");
                    if (bundle.containsKey(key)) {
                        String key2 = "android-support-nav:controller:backStackStates:" + str;
                        Intrinsics.h(key2, "key");
                        ArrayList arrayListC2 = BundleCompat.c(bundle, key2, JvmClassMappingKt.b(Reflection.f24268a.b(Bundle.class)));
                        if (arrayListC2 == null) {
                            SavedStateReaderKt.a(key2);
                            throw th;
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(arrayListC2.size());
                        Iterator it = arrayListC2.iterator();
                        while (it.hasNext()) {
                            arrayDeque.addLast(new NavBackStackEntryState((Bundle) it.next()));
                        }
                        linkedHashMap.put(str, arrayDeque);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
            this.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
        }
    }

    public final Bundle i() {
        Bundle bundleA;
        NavControllerImpl navControllerImpl = this.b;
        LinkedHashMap linkedHashMap = navControllerImpl.n;
        ArrayDeque arrayDeque = navControllerImpl.f;
        LinkedHashMap linkedHashMap2 = navControllerImpl.m;
        ArrayList arrayList = new ArrayList();
        Bundle bundleA2 = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : MapsKt.q(navControllerImpl.t.f3491a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((Navigator) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                SavedStateWriter.d(bundleA2, str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            SavedStateWriter.g(bundleA2, "android-support-nav:controller:navigatorState:names", arrayList);
            SavedStateWriter.d(bundleA, "android-support-nav:controller:navigatorState", bundleA2);
        }
        if (!arrayDeque.isEmpty()) {
            if (bundleA == null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList2.add(new NavBackStackEntryState((NavBackStackEntry) it.next()).b());
            }
            bundleA.putParcelableArrayList("android-support-nav:controller:backStack", SavedStateWriterKt.a(arrayList2));
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleA == null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i2 = i + 1;
                iArr[i] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i = i2;
            }
            SavedStateWriter.a(bundleA, "android-support-nav:controller:backStackDestIds", iArr);
            SavedStateWriter.g(bundleA, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleA == null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                ArrayDeque arrayDeque2 = (ArrayDeque) entry3.getValue();
                arrayList4.add(str3);
                ArrayList arrayList5 = new ArrayList();
                Iterator<E> it2 = arrayDeque2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((NavBackStackEntryState) it2.next()).b());
                }
                String key = "android-support-nav:controller:backStackStates:" + str3;
                Intrinsics.h(key, "key");
                bundleA.putParcelableArrayList(key, SavedStateWriterKt.a(arrayList5));
            }
            SavedStateWriter.g(bundleA, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.e) {
            if (bundleA == null) {
                bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleA.putBoolean("android-support-nav:controller:deepLinkHandled", this.e);
        }
        return bundleA;
    }
}
