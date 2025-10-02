package com.woolworths.scanlibrary.util.permission;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractor;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/permission/SngPermissionWrapper;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SngPermissionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final PermissionFlagInteractor f21373a;
    public DaggerBaseFragment b;
    public ScannerActivityOld c;
    public FunctionReferenceImpl d;
    public FunctionReferenceImpl e;
    public final ArrayList f;
    public ActivityResultLauncher g;

    public SngPermissionWrapper(PermissionFlagInteractorImpl permissionFlagInteractor) {
        Intrinsics.h(permissionFlagInteractor, "permissionFlagInteractor");
        this.f21373a = permissionFlagInteractor;
        this.f = new ArrayList();
    }

    public final boolean a() {
        Context context;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            DaggerBaseFragment daggerBaseFragment = this.b;
            if (daggerBaseFragment != null && ((context = daggerBaseFragment.getContext()) == null || context.checkSelfPermission(str) != 0)) {
                return false;
            }
            ScannerActivityOld scannerActivityOld = this.c;
            if (scannerActivityOld != null && scannerActivityOld.checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void b() {
        this.d = null;
        this.e = null;
        this.b = null;
        this.c = null;
        ActivityResultLauncher activityResultLauncher = this.g;
        if (activityResultLauncher != null) {
            activityResultLauncher.b();
        }
        this.g = null;
    }

    public final void c(DaggerBaseFragment daggerBaseFragment) {
        if (this.c != null) {
            throw new IllegalStateException("Cannot register with Fragment while it is already registered to an Activity");
        }
        this.b = daggerBaseFragment;
        this.g = daggerBaseFragment.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new a(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String[] permissions, Function0 function0, Function0 function02) {
        Intrinsics.h(permissions, "permissions");
        ArrayList arrayList = this.f;
        arrayList.clear();
        CollectionsKt.j(arrayList, permissions);
        this.d = (FunctionReferenceImpl) function0;
        this.e = (FunctionReferenceImpl) function02;
        if (a()) {
            function0.invoke();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.f21373a.a((String) it.next())) {
                function02.invoke();
                return;
            }
        }
        ActivityResultLauncher activityResultLauncher = this.g;
        if (activityResultLauncher == null) {
            throw new IllegalStateException("Permission wrapper is not registered");
        }
        activityResultLauncher.a(arrayList.toArray(new String[0]), null);
    }
}
