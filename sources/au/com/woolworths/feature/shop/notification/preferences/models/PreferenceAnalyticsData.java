package au.com.woolworths.feature.shop.notification.preferences.models;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceAnalyticsData;", "", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceAnalyticsData {

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    public PreferenceAnalyticsData(@NotNull String label) {
        Intrinsics.h(label, "label");
        this.label = label;
    }

    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreferenceAnalyticsData) && Intrinsics.c(this.label, ((PreferenceAnalyticsData) obj).label);
    }

    public final int hashCode() {
        return this.label.hashCode();
    }

    public final String toString() {
        return a.h("PreferenceAnalyticsData(label=", this.label, ")");
    }
}
