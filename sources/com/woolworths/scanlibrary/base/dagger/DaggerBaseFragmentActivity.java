package com.woolworths.scanlibrary.base.dagger;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentTransition;
import androidx.fragment.app.FragmentTransitionImpl;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "P", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Ldagger/android/HasAndroidInjector;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DaggerBaseFragmentActivity<P extends MvpPresenter> extends DaggerBaseActivity<P> implements HasAndroidInjector {
    public DispatchingAndroidInjector G;
    public boolean H;

    public static void c5(DaggerBaseFragmentActivity daggerBaseFragmentActivity, DaggerBaseFragment daggerBaseFragment, int i, String str, int i2) {
        ArrayList<Pair> arrayList = new ArrayList();
        daggerBaseFragmentActivity.getClass();
        if (daggerBaseFragmentActivity.H) {
            return;
        }
        FragmentManager supportFragmentManager = daggerBaseFragmentActivity.getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
        fragmentTransactionE.j(i, daggerBaseFragment, null);
        if (!arrayList.isEmpty()) {
            for (Pair pair : arrayList) {
                View view = (View) pair.e;
                String str2 = (String) pair.d;
                FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f2761a;
                String strO = ViewCompat.o(view);
                if (strO == null) {
                    throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                }
                if (fragmentTransactionE.n == null) {
                    fragmentTransactionE.n = new ArrayList();
                    fragmentTransactionE.o = new ArrayList();
                } else {
                    if (fragmentTransactionE.o.contains(str2)) {
                        throw new IllegalArgumentException(YU.a.h("A shared element with the target name '", str2, "' has already been added to the transaction."));
                    }
                    if (fragmentTransactionE.n.contains(strO)) {
                        throw new IllegalArgumentException(YU.a.h("A shared element with the source name '", strO, "' has already been added to the transaction."));
                    }
                }
                fragmentTransactionE.n.add(strO);
                fragmentTransactionE.o.add(str2);
            }
        }
        fragmentTransactionE.d();
    }

    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        DispatchingAndroidInjector dispatchingAndroidInjector = this.G;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.p("androidInjector");
        throw null;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.h(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.H = false;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Intrinsics.h(outState, "outState");
        Intrinsics.h(outPersistentState, "outPersistentState");
        super.onSaveInstanceState(outState, outPersistentState);
        this.H = true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
        this.H = false;
    }
}
