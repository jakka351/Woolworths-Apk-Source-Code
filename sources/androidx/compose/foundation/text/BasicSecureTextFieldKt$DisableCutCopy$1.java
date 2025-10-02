package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasicSecureTextFieldKt$DisableCutCopy$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ ComposableLambdaImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$DisableCutCopy$1(ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(7);
        ComposerImpl composerImplV = ((Composer) obj).v(-1085555050);
        boolean z = composerImplV.z(iA & 1, (iA & 3) != 2);
        ComposableLambdaImpl composableLambdaImpl = this.h;
        if (z) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.q;
            final TextToolbar textToolbar = (TextToolbar) composerImplV.x(staticProvidableCompositionLocal);
            boolean zN = composerImplV.n(textToolbar);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ TextToolbar f1105a;

                    {
                        this.f1105a = this.b;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final void a(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
                        this.b.a(rect, null, function02, null, function04, function05);
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final void b() {
                        this.f1105a.b();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final void c(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
                        this.f1105a.c(rect, function0, function02, function03, function04);
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    /* renamed from: getStatus */
                    public final TextToolbarStatus getD() {
                        return this.f1105a.getD();
                    }
                };
                composerImplV.A(objG);
            }
            CompositionLocalKt.a(staticProvidableCompositionLocal.b((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objG), composableLambdaImpl, composerImplV, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new BasicSecureTextFieldKt$DisableCutCopy$1(composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
