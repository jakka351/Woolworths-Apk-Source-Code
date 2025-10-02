package androidx.media.app;

import android.app.Notification;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class NotificationCompat {

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.a().setStyle(new Notification.DecoratedMediaCustomViewStyle());
        }
    }

    public static class MediaStyle extends NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.a().setStyle(new Notification.MediaStyle());
        }
    }
}
