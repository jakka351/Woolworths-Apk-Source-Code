package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.accompanist.permissions.PermissionStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/permissions/MutablePermissionState;", "Lcom/google/accompanist/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalPermissionsApi
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MutablePermissionState implements PermissionState {

    /* renamed from: a, reason: collision with root package name */
    public final String f14364a;
    public final Context b;
    public final Activity c;
    public final MutableState d;
    public ActivityResultLauncher e;

    public MutablePermissionState(String permission, Context context, Activity activity) {
        Intrinsics.h(permission, "permission");
        this.f14364a = permission;
        this.b = context;
        this.c = activity;
        this.d = SnapshotStateKt.f(c());
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final void a() {
        ActivityResultLauncher activityResultLauncher = this.e;
        Unit unit = null;
        if (activityResultLauncher != null) {
            activityResultLauncher.a(this.f14364a, null);
            unit = Unit.f24250a;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // com.google.accompanist.permissions.PermissionState
    /* renamed from: b, reason: from getter */
    public final String getF14364a() {
        return this.f14364a;
    }

    public final PermissionStatus c() {
        Context context = this.b;
        Intrinsics.h(context, "<this>");
        String permission = this.f14364a;
        Intrinsics.h(permission, "permission");
        if (ContextCompat.a(context, permission) == 0) {
            return PermissionStatus.Granted.f14367a;
        }
        Activity activity = this.c;
        Intrinsics.h(activity, "<this>");
        Intrinsics.h(permission, "permission");
        return new PermissionStatus.Denied(ActivityCompat.m(activity, permission));
    }

    public final void d() {
        ((SnapshotMutableStateImpl) this.d).setValue(c());
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final PermissionStatus getStatus() {
        return (PermissionStatus) ((SnapshotMutableStateImpl) this.d).getD();
    }
}
