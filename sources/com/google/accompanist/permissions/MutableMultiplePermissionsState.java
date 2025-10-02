package com.google.accompanist.permissions;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalPermissionsApi
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MutableMultiplePermissionsState implements MultiplePermissionsState {

    /* renamed from: a, reason: collision with root package name */
    public final List f14361a;
    public final List b;
    public final State c = SnapshotStateKt.d(new Function0<List<? extends PermissionState>>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$revokedPermissions$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.h.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.c(((PermissionState) obj).getStatus(), PermissionStatus.Granted.f14367a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    });
    public final State d = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$allPermissionsGranted$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean z;
            MutableMultiplePermissionsState mutableMultiplePermissionsState = this.h;
            List list = mutableMultiplePermissionsState.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PermissionStatus status = ((PermissionState) it.next()).getStatus();
                    Intrinsics.h(status, "<this>");
                    if (!status.equals(PermissionStatus.Granted.f14367a)) {
                        if (((List) mutableMultiplePermissionsState.c.getD()).isEmpty()) {
                            break;
                        }
                        z = false;
                    }
                }
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    public final State e = SnapshotStateKt.d(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$shouldShowRationale$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.h.b;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (PermissionsUtilKt.d(((PermissionState) it.next()).getStatus())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });
    public ActivityResultLauncher f;

    public MutableMultiplePermissionsState(List list) {
        this.f14361a = list;
        this.b = list;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public final void a() {
        ActivityResultLauncher activityResultLauncher = this.f;
        Unit unit = null;
        if (activityResultLauncher != null) {
            List list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PermissionState) it.next()).getF14364a());
            }
            activityResultLauncher.a(arrayList.toArray(new String[0]), null);
            unit = Unit.f24250a;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }
}
