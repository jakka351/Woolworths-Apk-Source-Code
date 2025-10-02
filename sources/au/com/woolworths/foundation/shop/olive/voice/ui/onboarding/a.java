package au.com.woolworths.foundation.shop.olive.voice.ui.onboarding;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LifecycleOwner e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ a(LifecycleOwner lifecycleOwner, Function0 function0, int i) {
        this.d = i;
        this.e = lifecycleOwner;
        this.f = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LifecycleObserver, au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LifecycleObserver, au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LifecycleObserver, au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final int i = 0;
                final Function0 function0 = this.f;
                final ?? r3 = new LifecycleEventObserver() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        switch (i) {
                            case 0:
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    function0.invoke();
                                    break;
                                }
                                break;
                            case 1:
                                if (event == Lifecycle.Event.ON_START) {
                                    function0.invoke();
                                    break;
                                }
                                break;
                            default:
                                if (event == Lifecycle.Event.ON_START) {
                                    function0.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                };
                final LifecycleOwner lifecycleOwner = this.e;
                lifecycleOwner.getD().a(r3);
                return new DisposableEffectResult() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt$OliveVoiceOnboardingScreen$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner.getD().c(r3);
                    }
                };
            case 1:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final int i2 = 1;
                final Function0 function02 = this.f;
                final ?? r32 = new LifecycleEventObserver() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        switch (i2) {
                            case 0:
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                            case 1:
                                if (event == Lifecycle.Event.ON_START) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                            default:
                                if (event == Lifecycle.Event.ON_START) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                };
                final LifecycleOwner lifecycleOwner2 = this.e;
                lifecycleOwner2.getD().a(r32);
                return new DisposableEffectResult() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionDescContentKt$PermissionDesc$lambda$3$lambda$2$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner2.getD().c(r32);
                    }
                };
            default:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final int i3 = 2;
                final Function0 function03 = this.f;
                final ?? r33 = new LifecycleEventObserver() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.b
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner22, Lifecycle.Event event) {
                        switch (i3) {
                            case 0:
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    function03.invoke();
                                    break;
                                }
                                break;
                            case 1:
                                if (event == Lifecycle.Event.ON_START) {
                                    function03.invoke();
                                    break;
                                }
                                break;
                            default:
                                if (event == Lifecycle.Event.ON_START) {
                                    function03.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                };
                final LifecycleOwner lifecycleOwner3 = this.e;
                lifecycleOwner3.getD().a(r33);
                return new DisposableEffectResult() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionRationaleContentKt$PermissionRationale$lambda$3$lambda$2$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner3.getD().c(r33);
                    }
                };
        }
    }
}
