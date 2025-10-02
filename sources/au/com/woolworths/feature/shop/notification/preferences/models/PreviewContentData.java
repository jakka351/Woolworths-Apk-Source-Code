package au.com.woolworths.feature.shop.notification.preferences.models;

import android.support.v4.media.session.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewContentData;", "", "", "badge", "footer", "", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewImageItemData;", "entries", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreviewContentData {

    @SerializedName("badge")
    @Nullable
    private final String badge;

    @SerializedName("entries")
    @NotNull
    private final List<PreviewImageItemData> entries;

    @SerializedName("footer")
    @Nullable
    private final String footer;

    public PreviewContentData(@Nullable String str, @Nullable String str2, @NotNull List<PreviewImageItemData> entries) {
        Intrinsics.h(entries, "entries");
        this.badge = str;
        this.footer = str2;
        this.entries = entries;
    }

    /* renamed from: a, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* renamed from: b, reason: from getter */
    public final List getEntries() {
        return this.entries;
    }

    /* renamed from: c, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewContentData)) {
            return false;
        }
        PreviewContentData previewContentData = (PreviewContentData) obj;
        return Intrinsics.c(this.badge, previewContentData.badge) && Intrinsics.c(this.footer, previewContentData.footer) && Intrinsics.c(this.entries, previewContentData.entries);
    }

    public final int hashCode() {
        String str = this.badge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.footer;
        return this.entries.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.badge;
        String str2 = this.footer;
        return a.t(YU.a.v("PreviewContentData(badge=", str, ", footer=", str2, ", entries="), this.entries, ")");
    }
}
