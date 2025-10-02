package au.com.woolworths.android.onesite.models.notification;

import java.util.List;

/* loaded from: classes3.dex */
public class NotificationResult {
    private List<Notification> notifications;

    public static class Notification {
        public static final String ALERT = "alert";
        public static final String CAMPAIGN = "campaign";
        public static final String WARNING = "warning";
        private String content;
        private String contentType;
        private int id;
        private boolean isShown;
        private String modal;
        private String title;
        private String url;

        public String getContent() {
            return this.content;
        }

        public String getContentType() {
            return this.contentType;
        }

        public int getId() {
            return this.id;
        }

        public String getModal() {
            return this.modal;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public boolean isShown() {
            return this.isShown;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setContentType(String str) {
            this.contentType = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setModal(String str) {
            this.modal = str;
        }

        public void setShown(boolean z) {
            this.isShown = z;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public List<Notification> getNotifications() {
        return this.notifications;
    }

    public void setNotifications(List<Notification> list) {
        this.notifications = list;
    }
}
