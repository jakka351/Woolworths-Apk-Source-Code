package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidView_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f2211a = null;

    public static final void a(Function1 function1, Modifier modifier, Function1 function12, Composer composer, final int i, final int i2) {
        int i3;
        Function1 function13;
        final Function1 function14;
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1783766393);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function12) ? 256 : 128;
        }
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.h;
            Function1 function15 = i5 != 0 ? androidView_androidKt$NoOpUpdate$1 : function12;
            function13 = function1;
            b(function13, modifier3, null, androidView_androidKt$NoOpUpdate$1, function15, composerImplV, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            modifier2 = modifier3;
            function14 = function15;
        } else {
            function13 = function1;
            composerImplV.j();
            function14 = function12;
            modifier2 = modifier;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function1 function16 = function13;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AndroidView_androidKt.a(function16, modifier2, function14, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function1 r17, final androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.b(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ViewFactoryHolder c(LayoutNode layoutNode) {
        AndroidViewHolder androidViewHolder = layoutNode.t;
        if (androidViewHolder != null) {
            return (ViewFactoryHolder) androidViewHolder;
        }
        InlineClassHelperKt.c("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public static final Function0 d(int i, Composer composer, final Function1 function1) {
        final int p = composer.getP();
        final Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        final ComposerImpl.CompositionContextImpl compositionContextImplM = composer.m();
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.x(SaveableStateRegistryKt.f1700a);
        final View view = (View) composer.x(AndroidCompositionLocals_androidKt.f);
        boolean zI = ((((i & 14) ^ 6) > 4 && composer.n(function1)) || (i & 6) == 4) | composer.I(context) | composer.I(compositionContextImplM) | composer.I(saveableStateRegistry) | composer.r(p) | composer.I(view);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            objG = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KeyEvent.Callback callback = view;
                    Intrinsics.f(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context, function1, compositionContextImplM, saveableStateRegistry, p, (Owner) callback).getLayoutNode();
                }
            };
            composer.A(objG);
        }
        return (Function0) objG;
    }

    public static final void e(Composer composer, Modifier modifier, int i, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.e3.getClass();
        Updater.b(composer, compositionLocalMap, ComposeUiNode.Companion.f);
        Updater.b(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.h);
        Updater.b(composer, density, AndroidView_androidKt$updateViewHolderParams$2.h);
        Updater.b(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.h);
        Updater.b(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.h);
        Updater.b(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.h);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(i))) {
            b.z(i, composer, i, function2);
        }
    }
}
