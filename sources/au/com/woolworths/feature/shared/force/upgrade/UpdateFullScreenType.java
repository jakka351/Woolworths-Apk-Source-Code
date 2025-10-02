package au.com.woolworths.feature.shared.force.upgrade;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType;", "", "AppForceUpdate", "OsForceUpdate", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType$AppForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType$OsForceUpdate;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UpdateFullScreenType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType$AppForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppForceUpdate implements UpdateFullScreenType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6510a;
        public final String b;
        public final String c;
        public final String d;

        public AppForceUpdate(String title, String message, String primaryAction, String str) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6510a = title;
            this.b = message;
            this.c = primaryAction;
            this.d = str;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppForceUpdate)) {
                return false;
            }
            AppForceUpdate appForceUpdate = (AppForceUpdate) obj;
            return Intrinsics.c(this.f6510a, appForceUpdate.f6510a) && Intrinsics.c(this.b, appForceUpdate.b) && Intrinsics.c(this.c, appForceUpdate.c) && Intrinsics.c(this.d, appForceUpdate.d);
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: getMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: getTitle, reason: from getter */
        public final String getF6511a() {
            return this.f6510a;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f6510a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(YU.a.v("AppForceUpdate(title=", this.f6510a, ", message=", this.b, ", primaryAction="), this.c, ", secondaryAction=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType$OsForceUpdate;", "Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType;", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OsForceUpdate implements UpdateFullScreenType {

        /* renamed from: a, reason: collision with root package name */
        public final String f6511a;
        public final String b;
        public final String c;
        public final String d;

        public OsForceUpdate(String title, String message, String primaryAction, String str) {
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(primaryAction, "primaryAction");
            this.f6511a = title;
            this.b = message;
            this.c = primaryAction;
            this.d = str;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OsForceUpdate)) {
                return false;
            }
            OsForceUpdate osForceUpdate = (OsForceUpdate) obj;
            return Intrinsics.c(this.f6511a, osForceUpdate.f6511a) && Intrinsics.c(this.b, osForceUpdate.b) && Intrinsics.c(this.c, osForceUpdate.c) && Intrinsics.c(this.d, osForceUpdate.d);
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: getMessage, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType
        /* renamed from: getTitle, reason: from getter */
        public final String getF6511a() {
            return this.f6511a;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f6511a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(YU.a.v("OsForceUpdate(title=", this.f6511a, ", message=", this.b, ", primaryAction="), this.c, ", secondaryAction=", this.d, ")");
        }
    }

    /* renamed from: a */
    String getC();

    /* renamed from: b */
    String getD();

    /* renamed from: getMessage */
    String getB();

    /* renamed from: getTitle */
    String getF6511a();
}
