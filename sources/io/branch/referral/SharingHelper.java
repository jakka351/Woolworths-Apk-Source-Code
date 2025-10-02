package io.branch.referral;

/* loaded from: classes7.dex */
public class SharingHelper {

    public enum SHARE_WITH {
        /* JADX INFO: Fake field, exist only in values array */
        FACEBOOK("com.facebook.katana"),
        /* JADX INFO: Fake field, exist only in values array */
        FACEBOOK_MESSENGER("com.facebook.orca"),
        /* JADX INFO: Fake field, exist only in values array */
        TWITTER("com.twitter.android"),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE(".mms"),
        /* JADX INFO: Fake field, exist only in values array */
        EMAIL("com.google.android.email"),
        /* JADX INFO: Fake field, exist only in values array */
        FLICKR("com.yahoo.mobile.client.android.flickr"),
        /* JADX INFO: Fake field, exist only in values array */
        GOOGLE_DOC("com.google.android.apps.docs"),
        /* JADX INFO: Fake field, exist only in values array */
        WHATS_APP("com.whatsapp"),
        /* JADX INFO: Fake field, exist only in values array */
        PINTEREST("com.pinterest"),
        /* JADX INFO: Fake field, exist only in values array */
        HANGOUT("com.google.android.talk"),
        /* JADX INFO: Fake field, exist only in values array */
        INSTAGRAM("com.instagram.android"),
        /* JADX INFO: Fake field, exist only in values array */
        WECHAT("jom.tencent.mm"),
        /* JADX INFO: Fake field, exist only in values array */
        SNAPCHAT("com.snapchat.android"),
        /* JADX INFO: Fake field, exist only in values array */
        GMAIL("com.google.android.gm");

        public final String d;

        SHARE_WITH(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }
}
