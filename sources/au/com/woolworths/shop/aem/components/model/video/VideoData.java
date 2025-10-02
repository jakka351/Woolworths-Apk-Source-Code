package au.com.woolworths.shop.aem.components.model.video;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/video/VideoData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "", "url", "title", "thumbnail", "duration", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "c", "a", "b", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoData implements GenericPageFeedItem {

    @SerializedName("duration")
    @NotNull
    private final String duration;

    @SerializedName("id")
    @Nullable
    private final String id;

    @SerializedName("thumbnail")
    @NotNull
    private final String thumbnail;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("url")
    @NotNull
    private final String url;

    public VideoData(@NotNull String url, @NotNull String title, @NotNull String thumbnail, @NotNull String duration, @Nullable String str) {
        Intrinsics.h(url, "url");
        Intrinsics.h(title, "title");
        Intrinsics.h(thumbnail, "thumbnail");
        Intrinsics.h(duration, "duration");
        this.url = url;
        this.title = title;
        this.thumbnail = thumbnail;
        this.duration = duration;
        this.id = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) obj;
        return Intrinsics.c(this.url, videoData.url) && Intrinsics.c(this.title, videoData.title) && Intrinsics.c(this.thumbnail, videoData.thumbnail) && Intrinsics.c(this.duration, videoData.duration) && Intrinsics.c(this.id, videoData.id);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(this.url.hashCode() * 31, 31, this.title), 31, this.thumbnail), 31, this.duration);
        String str = this.id;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.title;
        String str3 = this.thumbnail;
        String str4 = this.duration;
        String str5 = this.id;
        StringBuilder sbV = a.v("VideoData(url=", str, ", title=", str2, ", thumbnail=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", duration=", str4, ", id=");
        return a.o(sbV, str5, ")");
    }
}
