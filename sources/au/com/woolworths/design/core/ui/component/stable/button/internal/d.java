package au.com.woolworths.design.core.ui.component.stable.button.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.feature.shop.login.LoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, (String) obj3);
                SemanticsPropertiesKt.r(clearAndSetSemantics, 0);
                SemanticsPropertiesKt.h(clearAndSetSemantics, null, new au.com.woolworths.design.core.ui.component.experimental.dialog.a(3, (Function0) obj2));
                return unit;
            case 1:
                String str = (String) obj3;
                String str2 = (String) obj2;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                if (str != null) {
                    SemanticsPropertiesKt.k(semantics, str);
                } else if (str2 == null || StringsKt.D(str2)) {
                    SemanticsPropertiesKt.g(semantics);
                } else {
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                    semantics.b(SemanticsProperties.h, unit);
                }
                return unit;
            default:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj3;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final androidx.os.internal.a aVar = new androidx.os.internal.a((LoginViewModel) obj2, 1);
                lifecycleOwner.getD().a(aVar);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner.getD().c(aVar);
                    }
                };
        }
    }
}
