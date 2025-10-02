package com.salesforce.marketingcloud.messages.inbox;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.m;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001:\u0001WB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B½\u0001\b\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b/J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0003J\u000e\u00106\u001a\u00020\u001bHÀ\u0003¢\u0006\u0002\b7J\u0010\u00108\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b9J\u0010\u0010:\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b;J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003JÃ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\bCJ\u001b\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019H\u0007¢\u0006\u0002\bDJ\r\u0010!\u001a\u00020 H\u0007¢\u0006\u0002\bEJ\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\bFJ\u0013\u0010G\u001a\u00020 2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u001bHÖ\u0001J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bJJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\bKJ\r\u0010*\u001a\u00020 H\u0007¢\u0006\u0002\bLJ\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\bMJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\bNJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\bOJ\u000f\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\bPJ\u000f\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\bQJ\r\u0010R\u001a\u00020\u0006H\u0000¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020\tJ\t\u0010U\u001a\u00020\tHÖ\u0001J\r\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0002\bVR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR!\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001eR&\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8G@AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8A@AX\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b&\u0010$R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR&\u0010*\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8G@AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0013\u0010\u0016\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u001b8\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006X"}, d2 = {"Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage;", "", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "requestId", "messageHash", "subject", "title", "alert", "sound", "media", "Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage$Media;", "startDateUtc", "Ljava/util/Date;", "endDateUtc", "sendDateUtc", "url", i.a.m, "customKeys", "", "viewCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage$Media;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V", "()Ljava/lang/String;", "()Ljava/util/Map;", "<set-?>", "", "deleted", "()Z", "-deleted", "(Z)V", "dirty", "-dirty", "()Ljava/util/Date;", "()Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage$Media;", "-messageHash", "read", "-read", "-requestId", "-viewCount", "()I", "-deprecated_alert", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component15$sdk_release", "component2", "component2$sdk_release", "component3", "component3$sdk_release", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_custom", "-deprecated_customKeys", "-deprecated_deleted", "-deprecated_endDateUtc", "equals", "other", "hashCode", "-deprecated_id", "-deprecated_media", "-deprecated_read", "-deprecated_sendDateUtc", "-deprecated_sound", "-deprecated_startDateUtc", "-deprecated_subject", "-deprecated_title", "toJson", "toJson$sdk_release", "toJsonString", "toString", "-deprecated_url", "Media", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class InboxMessage {

    @Nullable
    private final String alert;

    @Nullable
    private final String custom;

    @Nullable
    private final Map<String, String> customKeys;
    private boolean deleted;

    @RestrictTo
    private boolean dirty;

    @Nullable
    private final Date endDateUtc;

    @NotNull
    private final String id;

    @Nullable
    private final Media media;

    @Nullable
    private final String messageHash;
    private boolean read;

    @Nullable
    private final String requestId;

    @Nullable
    private final Date sendDateUtc;

    @Nullable
    private final String sound;

    @Nullable
    private final Date startDateUtc;

    @Nullable
    private final String subject;

    @Nullable
    private final String title;

    @NotNull
    private final String url;
    private final int viewCount;

    @MCKeep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage$Media;", "", "url", "", "altText", "(Ljava/lang/String;Ljava/lang/String;)V", "getAltText", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Media {

        @Nullable
        private final String altText;

        @Nullable
        private final String url;

        public Media(@Nullable String str, @Nullable String str2) {
            this.url = str;
            this.altText = str2;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.url;
            }
            if ((i & 2) != 0) {
                str2 = media.altText;
            }
            return media.copy(str, str2);
        }

        @Deprecated
        @Nullable
        /* renamed from: altText, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String component2() {
            return this.altText;
        }

        @NotNull
        public final Media copy(@Nullable String url, @Nullable String altText) {
            return new Media(url, altText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.c(this.url, media.url) && Intrinsics.c(this.altText, media.altText);
        }

        @Nullable
        public final String getAltText() {
            return this.altText;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.altText;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return YU.a.j("Media(url=", this.url, ", altText=", this.altText, ")");
        }

        @Deprecated
        @Nullable
        public final String url() {
            return this.url;
        }
    }

    public InboxMessage(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        String string = bundle.getString(NotificationMessage.NOTIF_KEY_ID);
        if (string == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("alert");
        String string4 = bundle.getString("sound");
        String string5 = bundle.getString(NotificationMessage.NOTIF_KEY_MESSAGE_HASH);
        String string6 = bundle.getString(NotificationMessage.NOTIF_KEY_REQUEST_ID);
        String string7 = bundle.getString(NotificationMessage.NOTIF_KEY_CLOUD_PAGE_URL);
        if (string7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String string8 = bundle.getString(NotificationMessage.NOTIF_KEY_MEDIA_URL);
        Media media = !TextUtils.isEmpty(string8) ? new Media(string8, bundle.getString(NotificationMessage.NOTIF_KEY_MEDIA_ALT)) : null;
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.g(setKeySet, "keySet(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            if (ArraysKt.l(NotificationMessage.INSTANCE.a(), str)) {
                Intrinsics.e(str);
                if (StringsKt.W(str, ".google", false)) {
                }
            }
            arrayList.add(obj);
        }
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, String.valueOf(bundle.getString((String) next)));
        }
        this(string, string6, string5, null, string2, string3, string4, media, null, null, null, string7, null, linkedHashMap, 0, 22280, null);
    }

    @JvmName
    /* renamed from: -deleted, reason: not valid java name */
    public final void m199deleted(boolean z) {
        this.deleted = z;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_alert, reason: not valid java name and from getter */
    public final String getAlert() {
        return this.alert;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_custom, reason: not valid java name and from getter */
    public final String getCustom() {
        return this.custom;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_customKeys, reason: not valid java name */
    public final Map<String, String> m202deprecated_customKeys() {
        return this.customKeys;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_deleted, reason: not valid java name and from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_endDateUtc, reason: not valid java name and from getter */
    public final Date getEndDateUtc() {
        return this.endDateUtc;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_id, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_media, reason: not valid java name and from getter */
    public final Media getMedia() {
        return this.media;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_read, reason: not valid java name and from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_sendDateUtc, reason: not valid java name and from getter */
    public final Date getSendDateUtc() {
        return this.sendDateUtc;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_sound, reason: not valid java name and from getter */
    public final String getSound() {
        return this.sound;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_startDateUtc, reason: not valid java name and from getter */
    public final Date getStartDateUtc() {
        return this.startDateUtc;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_subject, reason: not valid java name and from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_title, reason: not valid java name and from getter */
    public final String getTitle() {
        return this.title;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final String getUrl() {
        return this.url;
    }

    @JvmName
    /* renamed from: -dirty, reason: not valid java name */
    public final void m214dirty(boolean z) {
        this.dirty = z;
    }

    @JvmName
    @Nullable
    /* renamed from: -messageHash, reason: not valid java name and from getter */
    public final String getMessageHash() {
        return this.messageHash;
    }

    @JvmName
    /* renamed from: -read, reason: not valid java name */
    public final void m217read(boolean z) {
        this.read = z;
    }

    @JvmName
    @Nullable
    /* renamed from: -requestId, reason: not valid java name and from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @JvmName
    /* renamed from: -viewCount, reason: not valid java name and from getter */
    public final int getViewCount() {
        return this.viewCount;
    }

    @JvmName
    @Nullable
    public final String alert() {
        return this.alert;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final Date component10() {
        return this.endDateUtc;
    }

    @Nullable
    public final Date component11() {
        return this.sendDateUtc;
    }

    @NotNull
    public final String component12() {
        return this.url;
    }

    @Nullable
    public final String component13() {
        return this.custom;
    }

    @Nullable
    public final Map<String, String> component14() {
        return this.customKeys;
    }

    public final int component15$sdk_release() {
        return this.viewCount;
    }

    @Nullable
    public final String component2$sdk_release() {
        return this.requestId;
    }

    @Nullable
    public final String component3$sdk_release() {
        return this.messageHash;
    }

    @Nullable
    public final String component4() {
        return this.subject;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final String component6() {
        return this.alert;
    }

    @Nullable
    public final String component7() {
        return this.sound;
    }

    @Nullable
    public final Media component8() {
        return this.media;
    }

    @Nullable
    public final Date component9() {
        return this.startDateUtc;
    }

    @NotNull
    public final InboxMessage copy(@NotNull String id, @Nullable String requestId, @Nullable String messageHash, @Nullable String subject, @Nullable String title, @Nullable String alert, @Nullable String sound, @Nullable Media media, @Nullable Date startDateUtc, @Nullable Date endDateUtc, @Nullable Date sendDateUtc, @NotNull String url, @Nullable String custom, @Nullable Map<String, String> customKeys, int viewCount) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        return new InboxMessage(id, requestId, messageHash, subject, title, alert, sound, media, startDateUtc, endDateUtc, sendDateUtc, url, custom, customKeys, viewCount);
    }

    @JvmName
    @Nullable
    public final String custom() {
        return this.custom;
    }

    @JvmName
    @Nullable
    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    @JvmName
    public final boolean deleted() {
        return this.deleted;
    }

    @JvmName
    @Nullable
    public final Date endDateUtc() {
        return this.endDateUtc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InboxMessage)) {
            return false;
        }
        InboxMessage inboxMessage = (InboxMessage) other;
        return Intrinsics.c(this.id, inboxMessage.id) && Intrinsics.c(this.requestId, inboxMessage.requestId) && Intrinsics.c(this.messageHash, inboxMessage.messageHash) && Intrinsics.c(this.subject, inboxMessage.subject) && Intrinsics.c(this.title, inboxMessage.title) && Intrinsics.c(this.alert, inboxMessage.alert) && Intrinsics.c(this.sound, inboxMessage.sound) && Intrinsics.c(this.media, inboxMessage.media) && Intrinsics.c(this.startDateUtc, inboxMessage.startDateUtc) && Intrinsics.c(this.endDateUtc, inboxMessage.endDateUtc) && Intrinsics.c(this.sendDateUtc, inboxMessage.sendDateUtc) && Intrinsics.c(this.url, inboxMessage.url) && Intrinsics.c(this.custom, inboxMessage.custom) && Intrinsics.c(this.customKeys, inboxMessage.customKeys) && this.viewCount == inboxMessage.viewCount;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.requestId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageHash;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subject;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alert;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sound;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Media media = this.media;
        int iHashCode8 = (iHashCode7 + (media == null ? 0 : media.hashCode())) * 31;
        Date date = this.startDateUtc;
        int iHashCode9 = (iHashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int iHashCode10 = (iHashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.sendDateUtc;
        int iC = androidx.camera.core.impl.b.c((iHashCode10 + (date3 == null ? 0 : date3.hashCode())) * 31, 31, this.url);
        String str7 = this.custom;
        int iHashCode11 = (iC + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.customKeys;
        return Integer.hashCode(this.viewCount) + ((iHashCode11 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @JvmName
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName
    @Nullable
    public final Media media() {
        return this.media;
    }

    @JvmName
    public final boolean read() {
        return this.read;
    }

    @JvmName
    @Nullable
    public final Date sendDateUtc() {
        return this.sendDateUtc;
    }

    @JvmName
    @Nullable
    public final String sound() {
        return this.sound;
    }

    @JvmName
    @Nullable
    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    @JvmName
    @Nullable
    public final String subject() {
        return this.subject;
    }

    @JvmName
    @Nullable
    public final String title() {
        return this.title;
    }

    @NotNull
    public final JSONObject toJson$sdk_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        String str = this.messageHash;
        if (str != null) {
            jSONObject.put("hash", str);
        }
        String str2 = this.requestId;
        if (str2 != null) {
            jSONObject.put("requestId", str2);
        }
        String str3 = this.subject;
        if (str3 != null) {
            jSONObject.put("subject", str3);
        }
        String str4 = this.title;
        if (str4 != null) {
            jSONObject.put("title", str4);
        }
        String str5 = this.alert;
        if (str5 != null) {
            jSONObject.put("alert", str5);
        }
        String str6 = this.sound;
        if (str6 != null) {
            jSONObject.put("sound", str6);
        }
        Media media = this.media;
        if (media != null) {
            jSONObject.put("media", b.a(media));
        }
        Date date = this.startDateUtc;
        if (date != null) {
            jSONObject.put("startDateUtc", m.a(date));
        }
        Date date2 = this.endDateUtc;
        if (date2 != null) {
            jSONObject.put("endDateUtc", m.a(date2));
        }
        Date date3 = this.sendDateUtc;
        if (date3 != null) {
            jSONObject.put("sendDateUtc", m.a(date3));
        }
        jSONObject.put("url", this.url);
        String str7 = this.custom;
        if (str7 != null) {
            jSONObject.put(i.a.m, str7);
        }
        Map<String, String> map = this.customKeys;
        if (map != null) {
            jSONObject.put(i.a.n, m.a(map));
        }
        jSONObject.put("viewCount", this.viewCount);
        return jSONObject;
    }

    @NotNull
    public final String toJsonString() throws JSONException {
        String string = toJson$sdk_release().toString(2);
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.requestId;
        String str3 = this.messageHash;
        String str4 = this.subject;
        String str5 = this.title;
        String str6 = this.alert;
        String str7 = this.sound;
        Media media = this.media;
        Date date = this.startDateUtc;
        Date date2 = this.endDateUtc;
        Date date3 = this.sendDateUtc;
        String str8 = this.url;
        String str9 = this.custom;
        Map<String, String> map = this.customKeys;
        int i = this.viewCount;
        StringBuilder sbV = YU.a.v("InboxMessage(id=", str, ", requestId=", str2, ", messageHash=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", subject=", str4, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", alert=", str6, ", sound=");
        sbV.append(str7);
        sbV.append(", media=");
        sbV.append(media);
        sbV.append(", startDateUtc=");
        sbV.append(date);
        sbV.append(", endDateUtc=");
        sbV.append(date2);
        sbV.append(", sendDateUtc=");
        sbV.append(date3);
        sbV.append(", url=");
        sbV.append(str8);
        sbV.append(", custom=");
        sbV.append(str9);
        sbV.append(", customKeys=");
        sbV.append(map);
        sbV.append(", viewCount=");
        return YU.a.m(sbV, i, ")");
    }

    @JvmName
    @NotNull
    public final String url() {
        return this.url;
    }

    @JvmName
    /* renamed from: -dirty, reason: not valid java name and from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public InboxMessage(@NotNull String id, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Media media, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @NotNull String url, @Nullable String str7, @Nullable Map<String, String> map, int i) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        this.id = id;
        this.requestId = str;
        this.messageHash = str2;
        this.subject = str3;
        this.title = str4;
        this.alert = str5;
        this.sound = str6;
        this.media = media;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.sendDateUtc = date3;
        this.url = url;
        this.custom = str7;
        this.customKeys = map;
        this.viewCount = i;
    }

    public /* synthetic */ InboxMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7, Media media, Date date, Date date2, Date date3, String str8, String str9, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : media, (i2 & 256) != 0 ? null : date, (i2 & 512) != 0 ? null : date2, (i2 & 1024) != 0 ? null : date3, str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) != 0 ? null : map, (i2 & 16384) != 0 ? 0 : i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InboxMessage(@NotNull JSONObject json) throws JSONException {
        Intrinsics.h(json, "json");
        String string = json.getString("id");
        String strI = com.google.android.gms.common.api.internal.a.i(json, "hash", "optString(...)");
        String strI2 = com.google.android.gms.common.api.internal.a.i(json, "requestId", "optString(...)");
        String strI3 = com.google.android.gms.common.api.internal.a.i(json, "subject", "optString(...)");
        String strI4 = com.google.android.gms.common.api.internal.a.i(json, "title", "optString(...)");
        String strI5 = com.google.android.gms.common.api.internal.a.i(json, "alert", "optString(...)");
        String strI6 = com.google.android.gms.common.api.internal.a.i(json, "sound", "optString(...)");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("media");
        Media mediaA = jSONObjectOptJSONObject != null ? b.a(jSONObjectOptJSONObject) : null;
        String strI7 = com.google.android.gms.common.api.internal.a.i(json, "startDateUtc", "optString(...)");
        Date date = (strI7 == null || (date = m.a(strI7)) == null) ? new Date() : date;
        String strI8 = com.google.android.gms.common.api.internal.a.i(json, "endDateUtc", "optString(...)");
        Date dateA = strI8 != null ? m.a(strI8) : null;
        String strI9 = com.google.android.gms.common.api.internal.a.i(json, "sendDateUtc", "optString(...)");
        Date dateA2 = strI9 != null ? m.a(strI9) : null;
        String string2 = json.getString("url");
        String strI10 = com.google.android.gms.common.api.internal.a.i(json, i.a.m, "optString(...)");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(i.a.n);
        Map<String, String> mapB = jSONArrayOptJSONArray != null ? m.b(jSONArrayOptJSONArray) : null;
        int iOptInt = json.optInt("viewCount", 0);
        Intrinsics.e(string);
        Intrinsics.e(string2);
        this(string, strI2, strI, strI3, strI4, strI5, strI6, mediaA, date, dateA, dateA2, string2, strI10, mapB, iOptInt);
    }
}
