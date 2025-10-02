package com.google.accompanist.permissions;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PermissionStateKt {
    public static final MutablePermissionState a(String str, final Function1 function1, Composer composer, int i) {
        composer.F(923020361);
        if ((i & 2) != 0) {
            function1 = PermissionStateKt$rememberPermissionState$1.h;
        }
        composer.F(1424240517);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        composer.F(1157296644);
        boolean zN = composer.n(str);
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (zN || objG == obj) {
            objG = new MutablePermissionState(str, context, PermissionsUtilKt.c(context));
            composer.A(objG);
        }
        composer.N();
        final MutablePermissionState mutablePermissionState = (MutablePermissionState) objG;
        PermissionsUtilKt.a(mutablePermissionState, null, composer, 0);
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        composer.F(511388516);
        boolean zN2 = composer.n(mutablePermissionState) | composer.n(function1);
        Object objG2 = composer.G();
        if (zN2 || objG2 == obj) {
            objG2 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Boolean bool = (Boolean) obj2;
                    bool.booleanValue();
                    mutablePermissionState.d();
                    function1.invoke(bool);
                    return Unit.f24250a;
                }
            };
            composer.A(objG2);
        }
        composer.N();
        final ManagedActivityResultLauncher managedActivityResultLauncherA = ActivityResultRegistryKt.a(requestPermission, (Function1) objG2, composer, 8);
        EffectsKt.b(mutablePermissionState, managedActivityResultLauncherA, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherA;
                final MutablePermissionState mutablePermissionState2 = mutablePermissionState;
                mutablePermissionState2.e = managedActivityResultLauncher;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        mutablePermissionState2.e = null;
                    }
                };
            }
        }, composer);
        composer.N();
        composer.N();
        return mutablePermissionState;
    }
}
