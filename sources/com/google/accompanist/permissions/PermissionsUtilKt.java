package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PermissionsUtilKt {
    public static final void a(final MutablePermissionState permissionState, final Lifecycle.Event event, Composer composer, final int i) {
        Intrinsics.h(permissionState, "permissionState");
        ComposerImpl composerImplV = composer.v(-1770945943);
        if ((((composerImplV.n(permissionState) ? 4 : 2) | i | 48) & 91) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            event = Lifecycle.Event.ON_RESUME;
            composerImplV.F(1157296644);
            boolean zN = composerImplV.n(permissionState);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$permissionCheckerObserver$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        if (event2 == event) {
                            MutablePermissionState mutablePermissionState = permissionState;
                            if (Intrinsics.c(mutablePermissionState.getStatus(), PermissionStatus.Granted.f14367a)) {
                                return;
                            }
                            mutablePermissionState.d();
                        }
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objG;
            final Lifecycle d = ((LifecycleOwner) composerImplV.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getD();
            EffectsKt.b(d, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                    Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                    final Lifecycle lifecycle = d;
                    final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                    lifecycle.a(lifecycleEventObserver2);
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            lifecycle.c(lifecycleEventObserver2);
                        }
                    };
                }
            }, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(event, i) { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2
            public final /* synthetic */ Lifecycle.Event i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                int iA = RecomposeScopeImplKt.a(1);
                PermissionsUtilKt.a(this.h, this.i, (Composer) obj, iA);
                return Unit.f24250a;
            }
        };
    }

    public static final void b(final List list, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1533427666);
        final Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        composerImplV.F(1157296644);
        boolean zN = composerImplV.n(list);
        Object objG = composerImplV.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$permissionsCheckerObserver$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    if (event2 == event) {
                        for (MutablePermissionState mutablePermissionState : list) {
                            if (!Intrinsics.c(mutablePermissionState.getStatus(), PermissionStatus.Granted.f14367a)) {
                                mutablePermissionState.d();
                            }
                        }
                    }
                }
            };
            composerImplV.A(objG);
        }
        composerImplV.V(false);
        final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objG;
        final Lifecycle d = ((LifecycleOwner) composerImplV.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getD();
        EffectsKt.b(d, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final Lifecycle lifecycle = d;
                final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                lifecycle.a(lifecycleEventObserver2);
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycle.c(lifecycleEventObserver2);
                    }
                };
            }
        }, composerImplV);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(list, event, i) { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2
            public final /* synthetic */ List h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                int iA = RecomposeScopeImplKt.a(9);
                PermissionsUtilKt.b(this.h, (Composer) obj, iA);
                return Unit.f24250a;
            }
        };
    }

    public static final Activity c(Context context) {
        Intrinsics.h(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.g(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean d(PermissionStatus permissionStatus) {
        Intrinsics.h(permissionStatus, "<this>");
        if (permissionStatus.equals(PermissionStatus.Granted.f14367a)) {
            return false;
        }
        if (permissionStatus instanceof PermissionStatus.Denied) {
            return ((PermissionStatus.Denied) permissionStatus).f14366a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
