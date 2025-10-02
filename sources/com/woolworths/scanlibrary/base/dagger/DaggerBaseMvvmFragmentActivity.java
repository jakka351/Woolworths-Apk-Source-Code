package com.woolworths.scanlibrary.base.dagger;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.compose.runtime.internal.StabilityInferred;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmFragmentActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "Ldagger/android/HasAndroidInjector;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DaggerBaseMvvmFragmentActivity extends DaggerBaseMvvmActivity implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        Intrinsics.p("androidInjector");
        throw null;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.h(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Intrinsics.h(outState, "outState");
        Intrinsics.h(outPersistentState, "outPersistentState");
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
