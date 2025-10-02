package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistry$register$3;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ActivityResultRegistryKt {
    public static final ManagedActivityResultLauncher a(ActivityResultContract activityResultContract, Function1 function1, Composer composer, int i) {
        final ActivityResultContract activityResultContract2;
        MutableState mutableStateL = SnapshotStateKt.l(activityResultContract, composer);
        final MutableState mutableStateL2 = SnapshotStateKt.l(function1, composer);
        final String str = (String) RememberSaveableKt.c(new Object[0], null, ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.h, composer, 3072, 6);
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.x(LocalActivityResultRegistryOwner.f66a);
        if (activityResultRegistryOwner == null) {
            composer.o(1006590171);
            Object baseContext = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ActivityResultRegistryOwner) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) baseContext;
        } else {
            composer.o(1006589303);
        }
        composer.l();
        if (activityResultRegistryOwner == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final ActivityResultRegistry activityResultRegistry = activityResultRegistryOwner.getActivityResultRegistry();
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (objG == obj) {
            objG = new ActivityResultLauncherHolder();
            composer.A(objG);
        }
        final ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) objG;
        Object objG2 = composer.G();
        if (objG2 == obj) {
            objG2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, mutableStateL);
            composer.A(objG2);
        }
        ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) objG2;
        boolean zI = composer.I(activityResultLauncherHolder) | composer.I(activityResultRegistry) | composer.n(str) | composer.I(activityResultContract) | composer.n(mutableStateL2);
        Object objG3 = composer.G();
        if (zI || objG3 == obj) {
            activityResultContract2 = activityResultContract;
            objG3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ActivityResultRegistry$register$3 activityResultRegistry$register$3E = activityResultRegistry.e(str, activityResultContract2, new a(mutableStateL2, 0));
                    final ActivityResultLauncherHolder activityResultLauncherHolder2 = activityResultLauncherHolder;
                    activityResultLauncherHolder2.f61a = activityResultRegistry$register$3E;
                    return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            Unit unit;
                            ActivityResultRegistry$register$3 activityResultRegistry$register$3 = activityResultLauncherHolder2.f61a;
                            if (activityResultRegistry$register$3 != null) {
                                activityResultRegistry$register$3.b();
                                unit = Unit.f24250a;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                throw new IllegalStateException("Launcher has not been initialized");
                            }
                        }
                    };
                }
            };
            composer.A(objG3);
        } else {
            activityResultContract2 = activityResultContract;
        }
        EffectsKt.a(activityResultRegistry, str, activityResultContract2, (Function1) objG3, composer);
        return managedActivityResultLauncher;
    }
}
