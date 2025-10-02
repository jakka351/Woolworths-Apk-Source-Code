package au.com.woolworths.feature.shop.notification.preferences.models;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreviewImageItemData;", "", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreviewImageItemData {

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    public PreviewImageItemData(@NotNull String imageUrl, @Nullable String str) {
        Intrinsics.h(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.altText = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewImageItemData)) {
            return false;
        }
        PreviewImageItemData previewImageItemData = (PreviewImageItemData) obj;
        return Intrinsics.c(this.imageUrl, previewImageItemData.imageUrl) && Intrinsics.c(this.altText, previewImageItemData.altText);
    }

    public final int hashCode() {
        int iHashCode = this.imageUrl.hashCode() * 31;
        String str = this.altText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("PreviewImageItemData(imageUrl=", this.imageUrl, ", altText=", this.altText, ")");
    }
}
