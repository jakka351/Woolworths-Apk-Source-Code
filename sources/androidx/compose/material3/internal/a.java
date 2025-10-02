package androidx.compose.material3.internal;

import android.util.Log;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import au.com.woolworths.analytics.supers.more.accountdeletion.AccountDeletionAnalytics;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel;
import com.google.accompanist.permissions.MultiplePermissionsState;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke(event);
                break;
            case 1:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.e;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.d();
                    break;
                }
                break;
            case 2:
                FragmentNavigator fragmentNavigator = (FragmentNavigator) this.e;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment fragment2 = (Fragment) lifecycleOwner;
                    Object obj = null;
                    for (Object obj2 : (Iterable) fragmentNavigator.b().f.getValue()) {
                        if (Intrinsics.c(((NavBackStackEntry) obj2).i, fragment2.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        if (FragmentNavigator.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " lifecycle reaching DESTROYED");
                        }
                        fragmentNavigator.b().b(navBackStackEntry);
                        break;
                    }
                }
                break;
            case 3:
                NavControllerImpl navControllerImpl = (NavControllerImpl) this.e;
                navControllerImpl.r = event.a();
                if (navControllerImpl.c != null) {
                    Iterator it = CollectionsKt.J0(navControllerImpl.f).iterator();
                    while (it.hasNext()) {
                        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
                        navBackStackEntry2.getClass();
                        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry2.k;
                        navBackStackEntryImpl.getClass();
                        navBackStackEntryImpl.f3507a.g = event.a();
                        navBackStackEntryImpl.d = event.a();
                        navBackStackEntryImpl.c();
                    }
                    break;
                }
                break;
            case 4:
                DeleteAccountViewModel deleteAccountViewModel = (DeleteAccountViewModel) this.e;
                if (event == Lifecycle.Event.ON_RESUME) {
                    deleteAccountViewModel.e.f(AccountDeletionAnalytics.CloseAccount.d);
                    break;
                }
                break;
            default:
                MultiplePermissionsState multiplePermissionsState = (MultiplePermissionsState) this.e;
                if (event == Lifecycle.Event.ON_START) {
                    multiplePermissionsState.a();
                    break;
                }
                break;
        }
    }
}
