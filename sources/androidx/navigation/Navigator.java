package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.FilteringSequence;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "Name", "Extras", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class Navigator<D extends NavDestination> {

    /* renamed from: a, reason: collision with root package name */
    public NavController.NavControllerNavigatorState f3490a;
    public boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention
    public @interface Name {
        String value();
    }

    public abstract NavDestination a();

    public final NavigatorState b() {
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.f3490a;
        if (navControllerNavigatorState != null) {
            return navControllerNavigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        return navDestination;
    }

    public void d(List list, NavOptions navOptions) {
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            b().g((NavBackStackEntry) anonymousClass1.next());
        }
    }

    public void e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        this.f3490a = navControllerNavigatorState;
        this.b = true;
    }

    public void f(NavBackStackEntry navBackStackEntry) {
        NavDestination navDestination = navBackStackEntry.e;
        if (navDestination == null) {
            navDestination = null;
        }
        if (navDestination == null) {
            return;
        }
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        navOptionsBuilder.b = true;
        boolean z = navOptionsBuilder.b;
        NavOptions.Builder builder = navOptionsBuilder.f3488a;
        builder.f3487a = z;
        builder.b = navOptionsBuilder.c;
        int i = navOptionsBuilder.d;
        boolean z2 = navOptionsBuilder.e;
        builder.c = i;
        builder.d = false;
        builder.e = z2;
        c(navDestination, null, builder.a());
        b().c(navBackStackEntry);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(NavBackStackEntry navBackStackEntry, boolean z) {
        List list = (List) b().e.getValue();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (j()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.c(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            b().d(navBackStackEntry2, z);
        }
    }

    public boolean j() {
        return true;
    }
}
