package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.view.MotionEvent;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstoreMapCallbacks e;

    public /* synthetic */ c(InstoreMapCallbacks instoreMapCallbacks, int i) {
        this.d = i;
        this.e = instoreMapCallbacks;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        final InstoreMapCallbacks instoreMapCallbacks = this.e;
        switch (i) {
            case 0:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                Intrinsics.h((MotionEvent) obj, "it");
                instoreMapCallbacks.m();
                return Boolean.FALSE;
            case 1:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                instoreMapCallbacks.a(OriientAppEvent.g);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MapContent$lambda$11$lambda$10$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        instoreMapCallbacks.a(OriientAppEvent.h);
                    }
                };
            default:
                Floor it = (Floor) obj;
                Intrinsics.h(it, "it");
                instoreMapCallbacks.j(it);
                return Unit.f24250a;
        }
    }
}
