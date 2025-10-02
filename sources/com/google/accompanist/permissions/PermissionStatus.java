package com.google.accompanist.permissions;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Stable
@ExperimentalPermissionsApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus;", "", "Denied", "Granted", "Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PermissionStatus {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Denied implements PermissionStatus {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14366a;

        public Denied(boolean z) {
            this.f14366a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Denied) && this.f14366a == ((Denied) obj).f14366a;
        }

        public final int hashCode() {
            boolean z = this.f14366a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return b.s(new StringBuilder("Denied(shouldShowRationale="), this.f14366a, ')');
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "Lcom/google/accompanist/permissions/PermissionStatus;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Granted implements PermissionStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final Granted f14367a = new Granted();
    }
}
