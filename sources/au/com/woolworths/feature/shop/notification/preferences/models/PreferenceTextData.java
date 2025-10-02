package au.com.woolworths.feature.shop.notification.preferences.models;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceTextData;", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceItem;", "", "body", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceTextData implements PreferenceItem {

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("body")
    @NotNull
    private final String body;

    public PreferenceTextData(@NotNull String body, @Nullable String str) {
        Intrinsics.h(body, "body");
        this.body = body;
        this.altText = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceTextData)) {
            return false;
        }
        PreferenceTextData preferenceTextData = (PreferenceTextData) obj;
        return Intrinsics.c(this.body, preferenceTextData.body) && Intrinsics.c(this.altText, preferenceTextData.altText);
    }

    public final int hashCode() {
        int iHashCode = this.body.hashCode() * 31;
        String str = this.altText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("PreferenceTextData(body=", this.body, ", altText=", this.altText, ")");
    }
}
