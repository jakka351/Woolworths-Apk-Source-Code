package au.com.woolworths.feature.shared.force.upgrade;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType;", "", "AppFlexibleUpdate", "AppForceUpdate", "OsFlexibleUpdate", "OsForceUpdate", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$AppFlexibleUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$AppForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$OsFlexibleUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$OsForceUpdate;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UpdateDialogType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$AppFlexibleUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppFlexibleUpdate implements UpdateDialogType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6506a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public AppFlexibleUpdate(String title, String message, String primaryAction, String str, String str2) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6506a = title;
            this.b = message;
            this.c = primaryAction;
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppFlexibleUpdate)) {
                return false;
            }
            AppFlexibleUpdate appFlexibleUpdate = (AppFlexibleUpdate) obj;
            return Intrinsics.c(this.f6506a, appFlexibleUpdate.f6506a) && Intrinsics.c(this.b, appFlexibleUpdate.b) && Intrinsics.c(this.c, appFlexibleUpdate.c) && Intrinsics.c(this.d, appFlexibleUpdate.d) && Intrinsics.c(this.e, appFlexibleUpdate.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f6506a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("AppFlexibleUpdate(title=", this.f6506a, ", message=", this.b, ", primaryAction=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryAction=", this.d, ", responseAppVersion=");
            return a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$AppForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppForceUpdate implements UpdateDialogType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6507a;
        public final String b;
        public final String c;

        public AppForceUpdate(String title, String message, String primaryAction) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6507a = title;
            this.b = message;
            this.c = primaryAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppForceUpdate)) {
                return false;
            }
            AppForceUpdate appForceUpdate = (AppForceUpdate) obj;
            return Intrinsics.c(this.f6507a, appForceUpdate.f6507a) && Intrinsics.c(this.b, appForceUpdate.b) && Intrinsics.c(this.c, appForceUpdate.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6507a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("AppForceUpdate(title=", this.f6507a, ", message=", this.b, ", primaryAction="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$OsFlexibleUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OsFlexibleUpdate implements UpdateDialogType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6508a;
        public final String b;
        public final String c;
        public final String d;

        public OsFlexibleUpdate(String title, String message, String primaryAction, String str) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6508a = title;
            this.b = message;
            this.c = primaryAction;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OsFlexibleUpdate)) {
                return false;
            }
            OsFlexibleUpdate osFlexibleUpdate = (OsFlexibleUpdate) obj;
            return Intrinsics.c(this.f6508a, osFlexibleUpdate.f6508a) && Intrinsics.c(this.b, osFlexibleUpdate.b) && Intrinsics.c(this.c, osFlexibleUpdate.c) && Intrinsics.c(this.d, osFlexibleUpdate.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f6508a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OsFlexibleUpdate(title=", this.f6508a, ", message=", this.b, ", primaryAction="), this.c, ", secondaryAction=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType$OsForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateDialogType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OsForceUpdate implements UpdateDialogType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6509a;
        public final String b;
        public final String c;

        public OsForceUpdate(String title, String message, String primaryAction) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6509a = title;
            this.b = message;
            this.c = primaryAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OsForceUpdate)) {
                return false;
            }
            OsForceUpdate osForceUpdate = (OsForceUpdate) obj;
            return Intrinsics.c(this.f6509a, osForceUpdate.f6509a) && Intrinsics.c(this.b, osForceUpdate.b) && Intrinsics.c(this.c, osForceUpdate.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6509a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OsForceUpdate(title=", this.f6509a, ", message=", this.b, ", primaryAction="), this.c, ")");
        }
    }
}
