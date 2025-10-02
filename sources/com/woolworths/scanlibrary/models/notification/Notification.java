package com.woolworths.scanlibrary.models.notification;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/woolworths/scanlibrary/models/notification/Notification;", "", "id", "", "title", "contentType", "url", "content", "modal", "", "notificationType", "lastUpdated", "", "frequency", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI)V", "getId", "()Ljava/lang/String;", "getTitle", "getContentType", "getUrl", "getContent", "getModal", "()Z", "getNotificationType", "getLastUpdated", "()J", "getFrequency", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Notification {
    public static final int $stable = 0;

    @SerializedName("content")
    @NotNull
    private final String content;

    @SerializedName("contentType")
    @NotNull
    private final String contentType;

    @SerializedName("frequency")
    private final int frequency;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("lastUpdated")
    private final long lastUpdated;

    @SerializedName("modal")
    private final boolean modal;

    @SerializedName("notificationType")
    @NotNull
    private final String notificationType;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("url")
    @Nullable
    private final String url;

    public Notification(@NotNull String id, @NotNull String title, @NotNull String contentType, @Nullable String str, @NotNull String content, boolean z, @NotNull String notificationType, long j, int i) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(contentType, "contentType");
        Intrinsics.h(content, "content");
        Intrinsics.h(notificationType, "notificationType");
        this.id = id;
        this.title = title;
        this.contentType = contentType;
        this.url = str;
        this.content = content;
        this.modal = z;
        this.notificationType = notificationType;
        this.lastUpdated = j;
        this.frequency = i;
    }

    public static /* synthetic */ Notification copy$default(Notification notification, String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notification.id;
        }
        if ((i2 & 2) != 0) {
            str2 = notification.title;
        }
        if ((i2 & 4) != 0) {
            str3 = notification.contentType;
        }
        if ((i2 & 8) != 0) {
            str4 = notification.url;
        }
        if ((i2 & 16) != 0) {
            str5 = notification.content;
        }
        if ((i2 & 32) != 0) {
            z = notification.modal;
        }
        if ((i2 & 64) != 0) {
            str6 = notification.notificationType;
        }
        if ((i2 & 128) != 0) {
            j = notification.lastUpdated;
        }
        if ((i2 & 256) != 0) {
            i = notification.frequency;
        }
        int i3 = i;
        long j2 = j;
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return notification.copy(str, str2, str9, str4, str8, z2, str7, j2, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getModal() {
        return this.modal;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getNotificationType() {
        return this.notificationType;
    }

    /* renamed from: component8, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* renamed from: component9, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final Notification copy(@NotNull String id, @NotNull String title, @NotNull String contentType, @Nullable String url, @NotNull String content, boolean modal, @NotNull String notificationType, long lastUpdated, int frequency) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(contentType, "contentType");
        Intrinsics.h(content, "content");
        Intrinsics.h(notificationType, "notificationType");
        return new Notification(id, title, contentType, url, content, modal, notificationType, lastUpdated, frequency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) other;
        return Intrinsics.c(this.id, notification.id) && Intrinsics.c(this.title, notification.title) && Intrinsics.c(this.contentType, notification.contentType) && Intrinsics.c(this.url, notification.url) && Intrinsics.c(this.content, notification.content) && this.modal == notification.modal && Intrinsics.c(this.notificationType, notification.notificationType) && this.lastUpdated == notification.lastUpdated && this.frequency == notification.frequency;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final boolean getModal() {
        return this.modal;
    }

    @NotNull
    public final String getNotificationType() {
        return this.notificationType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.id.hashCode() * 31, 31, this.title), 31, this.contentType);
        String str = this.url;
        return Integer.hashCode(this.frequency) + b.b(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.content), 31, this.modal), 31, this.notificationType), 31, this.lastUpdated);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.contentType;
        String str4 = this.url;
        String str5 = this.content;
        boolean z = this.modal;
        String str6 = this.notificationType;
        long j = this.lastUpdated;
        int i = this.frequency;
        StringBuilder sbV = a.v("Notification(id=", str, ", title=", str2, ", contentType=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", url=", str4, ", content=");
        d.A(str5, ", modal=", ", notificationType=", sbV, z);
        sbV.append(str6);
        sbV.append(", lastUpdated=");
        sbV.append(j);
        return androidx.constraintlayout.core.state.a.k(sbV, ", frequency=", i, ")");
    }

    public /* synthetic */ Notification(String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? false : z, str6, j, (i2 & 256) != 0 ? 0 : i);
    }
}
