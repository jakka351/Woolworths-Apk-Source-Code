package androidx.privacysandbox.ads.adservices.measurement;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "Builder", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeletionRequest {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion;", "", "", "DELETION_MODE_ALL", "I", "DELETION_MODE_EXCLUDE_INTERNAL_DATA", "MATCH_BEHAVIOR_DELETE", "MATCH_BEHAVIOR_PRESERVE", "DeletionMode", "MatchBehavior", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion$DeletionMode;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        @RestrictTo
        public @interface DeletionMode {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Companion$MatchBehavior;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        @RestrictTo
        public @interface MatchBehavior {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeletionRequest) && new HashSet((Collection) null).equals(new HashSet((Collection) null)) && new HashSet((Collection) null).equals(new HashSet((Collection) null));
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return YU.a.j("DeletionRequest { DeletionMode=", "DELETION_MODE_ALL", ", MatchBehavior=", "MATCH_BEHAVIOR_DELETE", ", Start=null, End=null, DomainUris=null, OriginUris=null }");
    }
}
