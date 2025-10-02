package com.woolworths.scanlibrary.ui.splash.initialcheck;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/initialcheck/InitCheckTask;", "Lcom/woolworths/scanlibrary/ui/splash/initialcheck/CheckTask;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitCheckTask implements CheckTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f21336a;
    public final Function0 b;

    public InitCheckTask(int i, Function0 function0) {
        this.f21336a = i;
        this.b = function0;
    }

    @Override // com.woolworths.scanlibrary.ui.splash.initialcheck.CheckTask
    /* renamed from: a, reason: from getter */
    public final int getF21336a() {
        return this.f21336a;
    }

    @Override // com.woolworths.scanlibrary.ui.splash.initialcheck.CheckTask
    /* renamed from: b, reason: from getter */
    public final Function0 getB() {
        return this.b;
    }
}
