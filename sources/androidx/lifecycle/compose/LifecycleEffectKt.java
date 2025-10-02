package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "currentOnEvent", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2807a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2807a = iArr;
        }
    }

    public static final void a(LifecycleOwner lifecycleOwner, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1220373486);
        int i2 = i | 16 | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            } else {
                composerImplV.j();
            }
            int i3 = i2 & (-113);
            composerImplV.W();
            boolean zN = composerImplV.n(Unit.f24250a) | composerImplV.n(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new LifecycleResumePauseEffectScope(lifecycleOwner.getD());
                composerImplV.A(objG);
            }
            b(lifecycleOwner, (LifecycleResumePauseEffectScope) objG, function1, composerImplV, i3 & 896);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(lifecycleOwner, function1, i, 0);
        }
    }

    public static final void b(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(912823238);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(lifecycleResumePauseEffectScope) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new b(0, lifecycleOwner, lifecycleResumePauseEffectScope, function1);
                composerImplV.A(objG);
            }
            EffectsKt.b(lifecycleOwner, lifecycleResumePauseEffectScope, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(lifecycleOwner, lifecycleResumePauseEffectScope, function1, i, 0);
        }
    }

    public static final void c(LifecycleOwner lifecycleOwner, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1408314671);
        int i2 = i | 16 | (composerImplV.I(function1) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            } else {
                composerImplV.j();
            }
            int i3 = i2 & (-113);
            composerImplV.W();
            boolean zN = composerImplV.n(Unit.f24250a) | composerImplV.n(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new LifecycleStartStopEffectScope(lifecycleOwner.getD());
                composerImplV.A(objG);
            }
            d(lifecycleOwner, (LifecycleStartStopEffectScope) objG, function1, composerImplV, i3 & 896);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(lifecycleOwner, function1, i, 1);
        }
    }

    public static final void d(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(228371534);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(lifecycleStartStopEffectScope) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new b(1, lifecycleOwner, lifecycleStartStopEffectScope, function1);
                composerImplV.A(objG);
            }
            EffectsKt.b(lifecycleOwner, lifecycleStartStopEffectScope, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(lifecycleOwner, lifecycleStartStopEffectScope, function1, i, 1);
        }
    }
}
