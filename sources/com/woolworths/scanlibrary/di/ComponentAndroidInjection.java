package com.woolworths.scanlibrary.di;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import dagger.android.DispatchingAndroidInjector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/di/ComponentAndroidInjection;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComponentAndroidInjection {
    public static boolean a(ComponentManager componentManager, AppCompatActivity appCompatActivity) {
        Intrinsics.h(componentManager, "componentManager");
        if (!componentManager.a()) {
            return false;
        }
        DispatchingAndroidInjector dispatchingAndroidInjector = componentManager.d;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector.b(appCompatActivity);
        }
        Intrinsics.p("androidInjector");
        throw null;
    }
}
