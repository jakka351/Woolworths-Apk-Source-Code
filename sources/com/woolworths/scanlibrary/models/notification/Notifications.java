package com.woolworths.scanlibrary.models.notification;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/woolworths/scanlibrary/models/notification/Notifications;", "", "notifications", "", "Lcom/woolworths/scanlibrary/models/notification/Notification;", "<init>", "(Ljava/util/List;)V", "getNotifications", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Notifications {
    public static final int $stable = 8;

    @SerializedName("notifications")
    @NotNull
    private final List<Notification> notifications;

    public Notifications(@NotNull List<Notification> notifications) {
        Intrinsics.h(notifications, "notifications");
        this.notifications = notifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Notifications copy$default(Notifications notifications, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notifications.notifications;
        }
        return notifications.copy(list);
    }

    @NotNull
    public final List<Notification> component1() {
        return this.notifications;
    }

    @NotNull
    public final Notifications copy(@NotNull List<Notification> notifications) {
        Intrinsics.h(notifications, "notifications");
        return new Notifications(notifications);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Notifications) && Intrinsics.c(this.notifications, ((Notifications) other).notifications);
    }

    @NotNull
    public final List<Notification> getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        return this.notifications.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("Notifications(notifications=", ")", this.notifications);
    }
}
