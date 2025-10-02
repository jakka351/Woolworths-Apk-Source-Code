package com.woolworths.scanlibrary.util.permission;

import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.FragmentActivity;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements ActivityResultCallback {
    public final /* synthetic */ int d;
    public final /* synthetic */ SngPermissionWrapper e;

    public /* synthetic */ a(SngPermissionWrapper sngPermissionWrapper, int i) {
        this.d = i;
        this.e = sngPermissionWrapper;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        FragmentActivity activity;
        Map result = (Map) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(result, "result");
                SngPermissionWrapper sngPermissionWrapper = this.e;
                ScannerActivityOld scannerActivityOld = sngPermissionWrapper.c;
                if (scannerActivityOld != null) {
                    sngPermissionWrapper.f21373a.b(scannerActivityOld, result);
                }
                if (!sngPermissionWrapper.a()) {
                    ?? r4 = sngPermissionWrapper.e;
                    if (r4 != 0) {
                        r4.invoke();
                        break;
                    }
                } else {
                    ?? r42 = sngPermissionWrapper.d;
                    if (r42 != 0) {
                        r42.invoke();
                        break;
                    }
                }
                break;
            default:
                Intrinsics.h(result, "result");
                SngPermissionWrapper sngPermissionWrapper2 = this.e;
                DaggerBaseFragment daggerBaseFragment = sngPermissionWrapper2.b;
                if (daggerBaseFragment != null && (activity = daggerBaseFragment.getActivity()) != null) {
                    sngPermissionWrapper2.f21373a.b(activity, result);
                }
                if (!sngPermissionWrapper2.a()) {
                    ?? r43 = sngPermissionWrapper2.e;
                    if (r43 != 0) {
                        r43.invoke();
                        break;
                    }
                } else {
                    ?? r44 = sngPermissionWrapper2.d;
                    if (r44 != 0) {
                        r44.invoke();
                        break;
                    }
                }
                break;
        }
    }
}
