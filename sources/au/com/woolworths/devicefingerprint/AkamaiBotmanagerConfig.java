package au.com.woolworths.devicefingerprint;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lau/com/woolworths/devicefingerprint/AkamaiBotmanagerConfig;", "", "", "", "protectedPaths", "protectedGraphQlOperations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AkamaiBotmanagerConfig {

    @SerializedName("protected_graphql_operations")
    @NotNull
    private final List<String> protectedGraphQlOperations;

    @SerializedName("protected_paths")
    @NotNull
    private final List<String> protectedPaths;

    public AkamaiBotmanagerConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final List getProtectedGraphQlOperations() {
        return this.protectedGraphQlOperations;
    }

    /* renamed from: b, reason: from getter */
    public final List getProtectedPaths() {
        return this.protectedPaths;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AkamaiBotmanagerConfig)) {
            return false;
        }
        AkamaiBotmanagerConfig akamaiBotmanagerConfig = (AkamaiBotmanagerConfig) obj;
        return Intrinsics.c(this.protectedPaths, akamaiBotmanagerConfig.protectedPaths) && Intrinsics.c(this.protectedGraphQlOperations, akamaiBotmanagerConfig.protectedGraphQlOperations);
    }

    public final int hashCode() {
        return this.protectedGraphQlOperations.hashCode() + (this.protectedPaths.hashCode() * 31);
    }

    public final String toString() {
        return "AkamaiBotmanagerConfig(protectedPaths=" + this.protectedPaths + ", protectedGraphQlOperations=" + this.protectedGraphQlOperations + ")";
    }

    public AkamaiBotmanagerConfig(@NotNull List<String> protectedPaths, @NotNull List<String> protectedGraphQlOperations) {
        Intrinsics.h(protectedPaths, "protectedPaths");
        Intrinsics.h(protectedGraphQlOperations, "protectedGraphQlOperations");
        this.protectedPaths = protectedPaths;
        this.protectedGraphQlOperations = protectedGraphQlOperations;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AkamaiBotmanagerConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.d;
        this(i2 != 0 ? emptyList : list, (i & 2) != 0 ? emptyList : list2);
    }
}
