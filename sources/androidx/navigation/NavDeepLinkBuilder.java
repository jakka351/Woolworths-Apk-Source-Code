package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavGraphImpl$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "DeepLinkDestination", "PermissiveNavigatorProvider", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3481a;
    public final NavContext b;
    public final Intent c;
    public final NavGraph d;
    public final ArrayList e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeepLinkDestination {

        /* renamed from: a, reason: collision with root package name */
        public final int f3482a;
        public final Bundle b;

        public DeepLinkDestination(int i, Bundle bundle) {
            this.f3482a = i;
            this.b = bundle;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {
        @Override // androidx.navigation.NavigatorProvider
        public final Navigator b(String name) {
            Intrinsics.h(name, "name");
            try {
                return super.b(name);
            } catch (IllegalStateException unused) {
                Intrinsics.f(null, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return null;
            }
        }
    }

    public NavDeepLinkBuilder(@NotNull Context context) {
        Intent launchIntentForPackage;
        Intrinsics.h(context, "context");
        this.f3481a = context;
        this.b = new NavContext(context);
        Activity activity = (Activity) SequencesKt.i(SequencesKt.s(SequencesKt.m(context, new a(3)), new a(4)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
    }

    public final TaskStackBuilder a() {
        NavGraph navGraph = this.d;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        NavDestination navDestination = null;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                int[] iArrF0 = CollectionsKt.F0(arrayList2);
                Intent intent = this.c;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrF0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                TaskStackBuilder taskStackBuilder = new TaskStackBuilder(this.f3481a);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(taskStackBuilder.e.getPackageManager());
                }
                if (component != null) {
                    taskStackBuilder.b(component);
                }
                ArrayList arrayList4 = taskStackBuilder.d;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent3 = (Intent) arrayList4.get(i);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return taskStackBuilder;
            }
            DeepLinkDestination deepLinkDestination = (DeepLinkDestination) it.next();
            int i2 = deepLinkDestination.f3482a;
            Bundle bundle = deepLinkDestination.b;
            NavDestination navDestinationB = b(i2);
            if (navDestinationB == null) {
                int i3 = NavDestination.i;
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.a(this.b, i2) + " cannot be found in the navigation graph " + navGraph);
            }
            int[] iArrG = navDestinationB.g(navDestination);
            int length = iArrG.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(iArrG[i]));
                arrayList3.add(bundle);
                i++;
            }
            navDestination = navDestinationB;
        }
    }

    public final NavDestination b(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this.d;
        Intrinsics.e(navGraph);
        arrayDeque.addLast(navGraph);
        while (!arrayDeque.isEmpty()) {
            NavDestination navDestination = (NavDestination) arrayDeque.removeFirst();
            if (navDestination.e.e == i) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (true) {
                    NavGraphImpl$iterator$1 navGraphImpl$iterator$1 = (NavGraphImpl$iterator$1) it;
                    if (navGraphImpl$iterator$1.hasNext()) {
                        arrayDeque.addLast((NavDestination) navGraphImpl$iterator$1.next());
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            int i = ((DeepLinkDestination) it.next()).f3482a;
            if (b(i) == null) {
                int i2 = NavDestination.i;
                StringBuilder sbU = YU.a.u("Navigation destination ", NavDestination.Companion.a(this.b, i), " cannot be found in the navigation graph ");
                sbU.append(this.d);
                throw new IllegalArgumentException(sbU.toString());
            }
        }
    }

    public NavDeepLinkBuilder(NavController navController) {
        this(navController.f3476a);
        this.d = navController.b.g();
    }
}
