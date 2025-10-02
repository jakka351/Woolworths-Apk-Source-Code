package au.com.woolworths.android.onesite.appdata;

import au.com.woolworths.android.onesite.gson.KeepHierarchy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeepHierarchy
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\nJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "", "", "toPrettyString", "()Ljava/lang/String;", "Lau/com/woolworths/android/onesite/appdata/EnvironmentName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lau/com/woolworths/android/onesite/appdata/EnvironmentName;", "getName", "()Lau/com/woolworths/android/onesite/appdata/EnvironmentName;", "Companion", "Mock", "Test", "Dev", "Uat", "Production", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Dev;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Mock;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Production;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Test;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Uat;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AppEnvironment {

    @NotNull
    public static final String NAME = "APP_ENVIRONMENT";

    @NotNull
    private final EnvironmentName name;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Dev;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "Lau/com/woolworths/android/onesite/appdata/SquadConfigurable;", "squadEnvironment", "Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "<init>", "(Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;)V", "getSquadEnvironment", "()Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dev extends AppEnvironment implements SquadConfigurable {

        @JvmField
        @NotNull
        public static final Dev DEFAULT = new Dev(SquadEnvironment.d);

        @NotNull
        private final SquadEnvironment squadEnvironment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dev(@NotNull SquadEnvironment squadEnvironment) {
            super(EnvironmentName.f);
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            this.squadEnvironment = squadEnvironment;
        }

        public static /* synthetic */ Dev copy$default(Dev dev2, SquadEnvironment squadEnvironment, int i, Object obj) {
            if ((i & 1) != 0) {
                squadEnvironment = dev2.squadEnvironment;
            }
            return dev2.copy(squadEnvironment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        @NotNull
        public final Dev copy(@NotNull SquadEnvironment squadEnvironment) {
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            return new Dev(squadEnvironment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dev) && this.squadEnvironment == ((Dev) other).squadEnvironment;
        }

        @Override // au.com.woolworths.android.onesite.appdata.SquadConfigurable
        @NotNull
        public SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        public int hashCode() {
            return this.squadEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Dev(squadEnvironment=" + this.squadEnvironment + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Mock;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "Lau/com/woolworths/android/onesite/appdata/SquadConfigurable;", "squadEnvironment", "Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "<init>", "(Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;)V", "getSquadEnvironment", "()Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mock extends AppEnvironment implements SquadConfigurable {

        @JvmField
        @NotNull
        public static final Mock DEFAULT = new Mock(SquadEnvironment.d);

        @NotNull
        private final SquadEnvironment squadEnvironment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mock(@NotNull SquadEnvironment squadEnvironment) {
            super(EnvironmentName.d);
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            this.squadEnvironment = squadEnvironment;
        }

        public static /* synthetic */ Mock copy$default(Mock mock, SquadEnvironment squadEnvironment, int i, Object obj) {
            if ((i & 1) != 0) {
                squadEnvironment = mock.squadEnvironment;
            }
            return mock.copy(squadEnvironment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        @NotNull
        public final Mock copy(@NotNull SquadEnvironment squadEnvironment) {
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            return new Mock(squadEnvironment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Mock) && this.squadEnvironment == ((Mock) other).squadEnvironment;
        }

        @Override // au.com.woolworths.android.onesite.appdata.SquadConfigurable
        @NotNull
        public SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        public int hashCode() {
            return this.squadEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Mock(squadEnvironment=" + this.squadEnvironment + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Production;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Production extends AppEnvironment {

        @NotNull
        public static final Production INSTANCE = new Production();

        private Production() {
            super(EnvironmentName.h);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Production);
        }

        public int hashCode() {
            return 330060741;
        }

        @NotNull
        public String toString() {
            return "Production";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Test;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "Lau/com/woolworths/android/onesite/appdata/SquadConfigurable;", "squadEnvironment", "Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "<init>", "(Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;)V", "getSquadEnvironment", "()Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Test extends AppEnvironment implements SquadConfigurable {

        @JvmField
        @NotNull
        public static final Test DEFAULT = new Test(SquadEnvironment.d);

        @NotNull
        private final SquadEnvironment squadEnvironment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Test(@NotNull SquadEnvironment squadEnvironment) {
            super(EnvironmentName.e);
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            this.squadEnvironment = squadEnvironment;
        }

        public static /* synthetic */ Test copy$default(Test test, SquadEnvironment squadEnvironment, int i, Object obj) {
            if ((i & 1) != 0) {
                squadEnvironment = test.squadEnvironment;
            }
            return test.copy(squadEnvironment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        @NotNull
        public final Test copy(@NotNull SquadEnvironment squadEnvironment) {
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            return new Test(squadEnvironment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Test) && this.squadEnvironment == ((Test) other).squadEnvironment;
        }

        @Override // au.com.woolworths.android.onesite.appdata.SquadConfigurable
        @NotNull
        public SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        public int hashCode() {
            return this.squadEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Test(squadEnvironment=" + this.squadEnvironment + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppEnvironment$Uat;", "Lau/com/woolworths/android/onesite/appdata/AppEnvironment;", "Lau/com/woolworths/android/onesite/appdata/SquadConfigurable;", "squadEnvironment", "Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "<init>", "(Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;)V", "getSquadEnvironment", "()Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Uat extends AppEnvironment implements SquadConfigurable {

        @JvmField
        @NotNull
        public static final Uat DEFAULT = new Uat(SquadEnvironment.d);

        @NotNull
        private final SquadEnvironment squadEnvironment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uat(@NotNull SquadEnvironment squadEnvironment) {
            super(EnvironmentName.g);
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            this.squadEnvironment = squadEnvironment;
        }

        public static /* synthetic */ Uat copy$default(Uat uat, SquadEnvironment squadEnvironment, int i, Object obj) {
            if ((i & 1) != 0) {
                squadEnvironment = uat.squadEnvironment;
            }
            return uat.copy(squadEnvironment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        @NotNull
        public final Uat copy(@NotNull SquadEnvironment squadEnvironment) {
            Intrinsics.h(squadEnvironment, "squadEnvironment");
            return new Uat(squadEnvironment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Uat) && this.squadEnvironment == ((Uat) other).squadEnvironment;
        }

        @Override // au.com.woolworths.android.onesite.appdata.SquadConfigurable
        @NotNull
        public SquadEnvironment getSquadEnvironment() {
            return this.squadEnvironment;
        }

        public int hashCode() {
            return this.squadEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Uat(squadEnvironment=" + this.squadEnvironment + ")";
        }
    }

    public AppEnvironment(EnvironmentName environmentName) {
        this.name = environmentName;
    }

    @NotNull
    public final EnvironmentName getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String toPrettyString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name.name());
        if (this instanceof SquadConfigurable) {
            SquadConfigurable squadConfigurable = (SquadConfigurable) this;
            if (squadConfigurable.getSquadEnvironment() != SquadEnvironment.d) {
                sb.append(" - " + squadConfigurable.getSquadEnvironment());
            }
        }
        return sb.toString();
    }
}
