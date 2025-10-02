package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiplePermissionsStateKt {
    public static final MutableMultiplePermissionsState a(List list, Composer composer) {
        composer.F(-57132327);
        composer.F(-2044770427);
        composer.F(992349447);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        Activity activityC = PermissionsUtilKt.c(context);
        composer.F(1157296644);
        boolean zN = composer.n(list);
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        Object obj2 = objG;
        if (zN || objG == obj) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new MutablePermissionState((String) it.next(), context, activityC));
            }
            composer.A(arrayList);
            obj2 = arrayList;
        }
        composer.N();
        List<MutablePermissionState> list3 = (List) obj2;
        for (final MutablePermissionState mutablePermissionState : list3) {
            composer.J(-1458104076, mutablePermissionState.f14364a);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            composer.F(1157296644);
            boolean zN2 = composer.n(mutablePermissionState);
            Object objG2 = composer.G();
            if (zN2 || objG2 == obj) {
                objG2 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ((Boolean) obj3).booleanValue();
                        mutablePermissionState.d();
                        return Unit.f24250a;
                    }
                };
                composer.A(objG2);
            }
            composer.N();
            final ManagedActivityResultLauncher managedActivityResultLauncherA = ActivityResultRegistryKt.a(requestPermission, (Function1) objG2, composer, 8);
            EffectsKt.c(managedActivityResultLauncherA, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj3;
                    Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                    ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherA;
                    final MutablePermissionState mutablePermissionState2 = mutablePermissionState;
                    mutablePermissionState2.e = managedActivityResultLauncher;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            mutablePermissionState2.e = null;
                        }
                    };
                }
            }, composer);
            composer.M();
        }
        composer.N();
        PermissionsUtilKt.b(list3, composer, 8);
        composer.F(1157296644);
        boolean zN3 = composer.n(list);
        Object objG3 = composer.G();
        if (zN3 || objG3 == obj) {
            objG3 = new MutableMultiplePermissionsState(list3);
            composer.A(objG3);
        }
        composer.N();
        final MutableMultiplePermissionsState mutableMultiplePermissionsState = (MutableMultiplePermissionsState) objG3;
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        composer.F(511388516);
        boolean zN4 = composer.n(mutableMultiplePermissionsState);
        final MultiplePermissionsStateKt$rememberMultiplePermissionsState$1 multiplePermissionsStateKt$rememberMultiplePermissionsState$1 = MultiplePermissionsStateKt$rememberMultiplePermissionsState$1.h;
        boolean zN5 = zN4 | composer.n(multiplePermissionsStateKt$rememberMultiplePermissionsState$1);
        Object objG4 = composer.G();
        if (zN5 || objG4 == obj) {
            objG4 = new Function1<Map<String, Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    Object next;
                    Map permissionsResult = (Map) obj3;
                    Intrinsics.h(permissionsResult, "permissionsResult");
                    MutableMultiplePermissionsState mutableMultiplePermissionsState2 = mutableMultiplePermissionsState;
                    mutableMultiplePermissionsState2.getClass();
                    for (String str : permissionsResult.keySet()) {
                        Iterator it2 = mutableMultiplePermissionsState2.f14361a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.c(((MutablePermissionState) next).f14364a, str)) {
                                break;
                            }
                        }
                        MutablePermissionState mutablePermissionState2 = (MutablePermissionState) next;
                        if (mutablePermissionState2 != null && ((Boolean) permissionsResult.get(str)) != null) {
                            mutablePermissionState2.d();
                        }
                    }
                    multiplePermissionsStateKt$rememberMultiplePermissionsState$1.invoke(permissionsResult);
                    return Unit.f24250a;
                }
            };
            composer.A(objG4);
        }
        composer.N();
        final ManagedActivityResultLauncher managedActivityResultLauncherA2 = ActivityResultRegistryKt.a(requestMultiplePermissions, (Function1) objG4, composer, 8);
        EffectsKt.b(mutableMultiplePermissionsState, managedActivityResultLauncherA2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj3;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherA2;
                final MutableMultiplePermissionsState mutableMultiplePermissionsState2 = mutableMultiplePermissionsState;
                mutableMultiplePermissionsState2.f = managedActivityResultLauncher;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        mutableMultiplePermissionsState2.f = null;
                    }
                };
            }
        }, composer);
        composer.N();
        composer.N();
        return mutableMultiplePermissionsState;
    }
}
