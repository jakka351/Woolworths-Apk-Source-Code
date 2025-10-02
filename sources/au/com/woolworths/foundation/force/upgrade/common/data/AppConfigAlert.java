package au.com.woolworths.foundation.force.upgrade.common.data;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert;", "", "AppConfigSoftAlert", "AppConfigForcedAlert", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigForcedAlert;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigSoftAlert;", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppConfigAlert {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigForcedAlert;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert;", "Companion", "$serializer", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AppConfigForcedAlert implements AppConfigAlert {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8496a;
        public final String b;
        public final String c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigForcedAlert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigForcedAlert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<AppConfigForcedAlert> serializer() {
                return AppConfigAlert$AppConfigForcedAlert$$serializer.f8494a;
            }
        }

        public /* synthetic */ AppConfigForcedAlert(String str, int i, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.a(i, 15, AppConfigAlert$AppConfigForcedAlert$$serializer.f8494a.getB());
                throw null;
            }
            this.f8496a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfigForcedAlert)) {
                return false;
            }
            AppConfigForcedAlert appConfigForcedAlert = (AppConfigForcedAlert) obj;
            return Intrinsics.c(this.f8496a, appConfigForcedAlert.f8496a) && Intrinsics.c(this.b, appConfigForcedAlert.b) && Intrinsics.c(this.c, appConfigForcedAlert.c) && Intrinsics.c(this.d, appConfigForcedAlert.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f8496a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(YU.a.v("AppConfigForcedAlert(title=", this.f8496a, ", message=", this.b, ", primaryActionLabel="), this.c, ", rewardsCardActionLabel=", this.d, ")");
        }

        public AppConfigForcedAlert(String str, String str2, String str3, String str4) {
            this.f8496a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigSoftAlert;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert;", "Companion", "$serializer", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AppConfigSoftAlert implements AppConfigAlert {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8497a;
        public final String b;
        public final String c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigSoftAlert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigSoftAlert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<AppConfigSoftAlert> serializer() {
                return AppConfigAlert$AppConfigSoftAlert$$serializer.f8495a;
            }
        }

        public /* synthetic */ AppConfigSoftAlert(String str, int i, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.a(i, 15, AppConfigAlert$AppConfigSoftAlert$$serializer.f8495a.getB());
                throw null;
            }
            this.f8497a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfigSoftAlert)) {
                return false;
            }
            AppConfigSoftAlert appConfigSoftAlert = (AppConfigSoftAlert) obj;
            return Intrinsics.c(this.f8497a, appConfigSoftAlert.f8497a) && Intrinsics.c(this.b, appConfigSoftAlert.b) && Intrinsics.c(this.c, appConfigSoftAlert.c) && Intrinsics.c(this.d, appConfigSoftAlert.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f8497a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return a.l(YU.a.v("AppConfigSoftAlert(title=", this.f8497a, ", message=", this.b, ", primaryActionLabel="), this.c, ", secondaryActionLabel=", this.d, ")");
        }

        public AppConfigSoftAlert(String str, String str2, String str3, String str4) {
            this.f8497a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }
}
