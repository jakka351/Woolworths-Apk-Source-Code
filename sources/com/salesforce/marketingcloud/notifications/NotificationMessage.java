package com.salesforce.marketingcloud.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0004abcdBá\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00101\u001a\u00020.¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0004J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b \u0010\u0004J\u0011\u0010#\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\"\u0010\u0004J\u0011\u0010%\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b$\u0010\u0004J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b*\u0010\u0004J\u001d\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&H\u0007¢\u0006\u0004\b,\u0010(J\u000f\u00101\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J\t\u00102\u001a\u00020\u0002HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00105\u001a\u00020\u0002HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010:\u001a\u00020\u0018HÆ\u0003J\t\u0010;\u001a\u00020\u001cHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&HÆ\u0003J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\bB\u0010\u0004J\u0010\u0010E\u001a\u00020.HÀ\u0003¢\u0006\u0004\bD\u00100Jë\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00101\u001a\u00020.HÆ\u0001J\t\u0010I\u001a\u00020\u0002HÖ\u0001J\t\u0010J\u001a\u00020.HÖ\u0001J\u0013\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010O\u001a\u00020.HÖ\u0001J\u0019\u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020.HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\b\u0007\u0010\u0004R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010F\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\bF\u0010U\u001a\u0004\bF\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b!\u0010U\u001a\u0004\b!\u0010\u0004R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b#\u0010U\u001a\u0004\b#\u0010\u0004R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b%\u0010U\u001a\u0004\b%\u0010\u0004R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&8\u0007¢\u0006\f\n\u0004\b)\u0010Z\u001a\u0004\b)\u0010(R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b+\u0010U\u001a\u0004\b+\u0010\u0004R%\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b-\u0010Z\u001a\u0004\b-\u0010(R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010U\u001a\u0004\bG\u0010\u0004R\"\u00101\u001a\u00020.8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\b1\u00100\"\u0004\b\\\u0010]¨\u0006e"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "Landroid/os/Parcelable;", "", "-deprecated_id", "()Ljava/lang/String;", "id", "-deprecated_requestId", "requestId", "Lcom/salesforce/marketingcloud/messages/Region;", "-deprecated_region", "()Lcom/salesforce/marketingcloud/messages/Region;", "region", "-deprecated_alert", "alert", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "-deprecated_sound", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "sound", "-deprecated_soundName", "soundName", "-deprecated_title", "title", "-deprecated_subTitle", "subTitle", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "-deprecated_type", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "type", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "-deprecated_trigger", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "trigger", "-deprecated_url", "url", "-deprecated_mediaUrl", i.a.e, "-deprecated_mediaAltText", "mediaAltText", "", "-deprecated_customKeys", "()Ljava/util/Map;", "customKeys", "-deprecated_custom", i.a.m, "-deprecated_payload", "payload", "", "-deprecated_notificationId", "()I", "notificationId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17$sdk_release", "component17", "component18$sdk_release", "component18", NotificationMessage.NOTIF_KEY_SUB_TITLE, "propertyBag", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "Lcom/salesforce/marketingcloud/messages/Region;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "Ljava/util/Map;", "I", "setNotificationId$sdk_release", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/Region;Ljava/lang/String;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V", "Companion", "a", "Sound", "Trigger", "Type", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final /* data */ class NotificationMessage implements Parcelable {

    @NotNull
    public static final String NOTIF_KEY_ALERT = "alert";

    @NotNull
    public static final String NOTIF_KEY_SOUND = "sound";

    @NotNull
    public static final String NOTIF_KEY_TIMESTAMP = "timestamp";

    @NotNull
    public static final String NOTIF_KEY_TITLE = "title";

    @NotNull
    private final String alert;

    @Nullable
    private final String custom;

    @NotNull
    private final Map<String, String> customKeys;

    @NotNull
    private final String id;

    @Nullable
    private final String mediaAltText;

    @Nullable
    private final String mediaUrl;
    private int notificationId;

    @Nullable
    private final Map<String, String> payload;

    @Nullable
    private final String propertyBag;

    @Nullable
    private final Region region;

    @Nullable
    private final String requestId;

    @NotNull
    private final Sound sound;

    @Nullable
    private final String soundName;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    @NotNull
    private final Trigger trigger;

    @NotNull
    private final Type type;

    @Nullable
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<NotificationMessage> CREATOR = new b();

    @NotNull
    public static final String NOTIF_KEY_ID = "_m";

    @NotNull
    public static final String NOTIF_KEY_SID = "_sid";

    @NotNull
    public static final String NOTIF_KEY_MESSAGE_TYPE = "_mt";

    @NotNull
    public static final String NOTIF_KEY_MESSAGE_HASH = "_h";

    @NotNull
    public static final String NOTIF_KEY_REQUEST_ID = "_r";

    @NotNull
    public static final String NOTIF_KEY_PB_ID = "_pb";

    @NotNull
    public static final String NOTIF_KEY_SUB_TITLE = "subtitle";

    @NotNull
    public static final String NOTIF_KEY_MEDIA_URL = "_mediaUrl";

    @NotNull
    public static final String NOTIF_KEY_MEDIA_ALT = "_mediaAlt";

    @NotNull
    public static final String NOTIF_KEY_CLOUD_PAGE_URL = "_x";

    @NotNull
    public static final String NOTIF_KEY_OPEN_DIRECT_URL = "_od";

    @NotNull
    private static final String[] KNOWN_KEYS = {NOTIF_KEY_ID, NOTIF_KEY_SID, "timestamp", NOTIF_KEY_MESSAGE_TYPE, NOTIF_KEY_MESSAGE_HASH, NOTIF_KEY_REQUEST_ID, NOTIF_KEY_PB_ID, "title", NOTIF_KEY_SUB_TITLE, "alert", "sound", NOTIF_KEY_MEDIA_URL, NOTIF_KEY_MEDIA_ALT, NOTIF_KEY_CLOUD_PAGE_URL, NOTIF_KEY_OPEN_DIRECT_URL};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "", "(Ljava/lang/String;I)V", "CUSTOM", "DEFAULT", "NONE", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Sound {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Sound[] $VALUES;
        public static final Sound CUSTOM = new Sound("CUSTOM", 0);
        public static final Sound DEFAULT = new Sound("DEFAULT", 1);
        public static final Sound NONE = new Sound("NONE", 2);

        private static final /* synthetic */ Sound[] $values() {
            return new Sound[]{CUSTOM, DEFAULT, NONE};
        }

        static {
            Sound[] soundArr$values = $values();
            $VALUES = soundArr$values;
            $ENTRIES = EnumEntriesKt.a(soundArr$values);
        }

        private Sound(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Sound> getEntries() {
            return $ENTRIES;
        }

        public static Sound valueOf(String str) {
            return (Sound) Enum.valueOf(Sound.class, str);
        }

        public static Sound[] values() {
            return (Sound[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "", "(Ljava/lang/String;I)V", "PUSH", "GEOFENCE", "BEACON", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Trigger {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger PUSH = new Trigger("PUSH", 0);
        public static final Trigger GEOFENCE = new Trigger("GEOFENCE", 1);
        public static final Trigger BEACON = new Trigger("BEACON", 2);

        private static final /* synthetic */ Trigger[] $values() {
            return new Trigger[]{PUSH, GEOFENCE, BEACON};
        }

        static {
            Trigger[] triggerArr$values = $values();
            $VALUES = triggerArr$values;
            $ENTRIES = EnumEntriesKt.a(triggerArr$values);
        }

        private Trigger(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Trigger> getEntries() {
            return $ENTRIES;
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "", "(Ljava/lang/String;I)V", "OPEN_DIRECT", "CLOUD_PAGE", "OTHER", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type OPEN_DIRECT = new Type("OPEN_DIRECT", 0);
        public static final Type CLOUD_PAGE = new Type("CLOUD_PAGE", 1);
        public static final Type OTHER = new Type("OTHER", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{OPEN_DIRECT, CLOUD_PAGE, OTHER};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.a(typeArr$values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.salesforce.marketingcloud.notifications.NotificationMessage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @JvmName
        @NotNull
        public final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
            Intrinsics.h(message, "message");
            Intrinsics.h(region, "region");
            Pair pair = message.url() != null ? new Pair(Type.CLOUD_PAGE, message.url()) : message.openDirect() != null ? new Pair(Type.OPEN_DIRECT, message.openDirect()) : new Pair(Type.OTHER, null);
            Type type = (Type) pair.d;
            String str = (String) pair.e;
            Pair<Sound, String> pairA = a(message.sound());
            Sound sound = (Sound) pairA.d;
            String str2 = (String) pairA.e;
            Trigger trigger = message.messageType() == 5 ? Trigger.BEACON : Trigger.GEOFENCE;
            String strAltText = null;
            String strId = message.id();
            String strTitle = message.title();
            String strAlert = message.alert();
            Map map = message.customKeys() != null ? new HashMap(message.customKeys()) : EmptyMap.d;
            String strCustom = message.custom();
            Message.Media media = message.media();
            String strUrl = media != null ? media.url() : null;
            Message.Media media2 = message.media();
            if (media2 != null) {
                strAltText = media2.altText();
            }
            return new NotificationMessage(strId, null, region, strAlert, sound, str2, strTitle, null, type, trigger, str, strUrl, strAltText, map, strCustom, null, null, 0, 229506, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName
        @NotNull
        public final NotificationMessage a(@NotNull Map<String, String> data) {
            Pair pair;
            Intrinsics.h(data, "data");
            if (data.containsKey(NotificationMessage.NOTIF_KEY_CLOUD_PAGE_URL)) {
                pair = new Pair(Type.CLOUD_PAGE, data.get(NotificationMessage.NOTIF_KEY_CLOUD_PAGE_URL));
            } else if (data.containsKey(NotificationMessage.NOTIF_KEY_OPEN_DIRECT_URL)) {
                pair = new Pair(Type.OPEN_DIRECT, data.get(NotificationMessage.NOTIF_KEY_OPEN_DIRECT_URL));
            } else {
                pair = new Pair(Type.OTHER, null);
            }
            Type type = (Type) pair.d;
            String str = (String) pair.e;
            Pair<Sound, String> pairA = a(data.get("sound"));
            Sound sound = (Sound) pairA.d;
            String str2 = (String) pairA.e;
            String str3 = data.get(NotificationMessage.NOTIF_KEY_ID);
            if (str3 == null) {
                throw new IllegalStateException("message id missing");
            }
            String str4 = str3;
            String str5 = data.get(NotificationMessage.NOTIF_KEY_REQUEST_ID);
            String str6 = data.get("title");
            String str7 = data.get(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            String str8 = data.get("alert");
            if (str8 == null) {
                throw new IllegalStateException("alert missing");
            }
            String str9 = str8;
            String str10 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_URL);
            String str11 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_ALT);
            HashMap map = new HashMap(data);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                HashMap map2 = map;
                if (!ArraysKt.l(NotificationMessage.INSTANCE.a(), key) || StringsKt.W(key, ".google", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                map = map2;
            }
            return new NotificationMessage(str4, str5, null, str9, sound, str2, str6, str7, type, Trigger.PUSH, str, str10, str11, linkedHashMap, null, map, data.get(NotificationMessage.NOTIF_KEY_PB_ID), 0, 147460, null);
        }

        @JvmName
        @NotNull
        public final Pair<Sound, String> a(@Nullable String str) {
            if (str != null && !str.equalsIgnoreCase(DevicePublicKeyStringDef.NONE)) {
                if (str.equalsIgnoreCase("default")) {
                    return new Pair<>(Sound.DEFAULT, null);
                }
                return new Pair<>(Sound.CUSTOM, str);
            }
            return new Pair<>(Sound.NONE, null);
        }

        @NotNull
        public final String[] a() {
            return NotificationMessage.KNOWN_KEYS;
        }
    }

    public static final class b implements Parcelable.Creator<NotificationMessage> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationMessage createFromParcel(@NotNull Parcel parcel) {
            String str;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Region regionCreateFromParcel = parcel.readInt() == 0 ? null : Region.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Sound soundValueOf = Sound.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Type typeValueOf = Type.valueOf(parcel.readString());
            Trigger triggerValueOf = Trigger.valueOf(parcel.readString());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i);
            int i2 = 0;
            while (i2 != i) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
                i2++;
                i = i;
            }
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string10;
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = null;
            } else {
                int i3 = parcel.readInt();
                str = string10;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i3);
                linkedHashMap = linkedHashMap3;
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashMap4.put(parcel.readString(), parcel.readString());
                    i4++;
                    i3 = i3;
                }
                linkedHashMap2 = linkedHashMap4;
            }
            return new NotificationMessage(string, string2, regionCreateFromParcel, string3, soundValueOf, string4, string5, string6, typeValueOf, triggerValueOf, string7, string8, string9, linkedHashMap, str, linkedHashMap2, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationMessage[] newArray(int i) {
            return new NotificationMessage[i];
        }
    }

    public NotificationMessage(@NotNull String id, @Nullable String str, @Nullable Region region, @NotNull String alert, @NotNull Sound sound, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Type type, @NotNull Trigger trigger, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull Map<String, String> customKeys, @Nullable String str8, @Nullable Map<String, String> map, @Nullable String str9, int i) {
        Intrinsics.h(id, "id");
        Intrinsics.h(alert, "alert");
        Intrinsics.h(sound, "sound");
        Intrinsics.h(type, "type");
        Intrinsics.h(trigger, "trigger");
        Intrinsics.h(customKeys, "customKeys");
        this.id = id;
        this.requestId = str;
        this.region = region;
        this.alert = alert;
        this.sound = sound;
        this.soundName = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = type;
        this.trigger = trigger;
        this.url = str5;
        this.mediaUrl = str6;
        this.mediaAltText = str7;
        this.customKeys = customKeys;
        this.custom = str8;
        this.payload = map;
        this.propertyBag = str9;
        this.notificationId = i;
    }

    public static /* synthetic */ NotificationMessage copy$default(NotificationMessage notificationMessage, String str, String str2, Region region, String str3, Sound sound, String str4, String str5, String str6, Type type, Trigger trigger, String str7, String str8, String str9, Map map, String str10, Map map2, String str11, int i, int i2, Object obj) {
        int i3;
        String str12;
        String str13 = (i2 & 1) != 0 ? notificationMessage.id : str;
        String str14 = (i2 & 2) != 0 ? notificationMessage.requestId : str2;
        Region region2 = (i2 & 4) != 0 ? notificationMessage.region : region;
        String str15 = (i2 & 8) != 0 ? notificationMessage.alert : str3;
        Sound sound2 = (i2 & 16) != 0 ? notificationMessage.sound : sound;
        String str16 = (i2 & 32) != 0 ? notificationMessage.soundName : str4;
        String str17 = (i2 & 64) != 0 ? notificationMessage.title : str5;
        String str18 = (i2 & 128) != 0 ? notificationMessage.subtitle : str6;
        Type type2 = (i2 & 256) != 0 ? notificationMessage.type : type;
        Trigger trigger2 = (i2 & 512) != 0 ? notificationMessage.trigger : trigger;
        String str19 = (i2 & 1024) != 0 ? notificationMessage.url : str7;
        String str20 = (i2 & 2048) != 0 ? notificationMessage.mediaUrl : str8;
        String str21 = (i2 & 4096) != 0 ? notificationMessage.mediaAltText : str9;
        Map map3 = (i2 & 8192) != 0 ? notificationMessage.customKeys : map;
        String str22 = str13;
        String str23 = (i2 & 16384) != 0 ? notificationMessage.custom : str10;
        Map map4 = (i2 & 32768) != 0 ? notificationMessage.payload : map2;
        String str24 = (i2 & 65536) != 0 ? notificationMessage.propertyBag : str11;
        if ((i2 & 131072) != 0) {
            str12 = str24;
            i3 = notificationMessage.notificationId;
        } else {
            i3 = i;
            str12 = str24;
        }
        return notificationMessage.copy(str22, str14, region2, str15, sound2, str16, str17, str18, type2, trigger2, str19, str20, str21, map3, str23, map4, str12, i3);
    }

    @Deprecated
    @JvmName
    @NotNull
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
    @NotNull
    /* renamed from: -deprecated_customKeys, reason: not valid java name */
    public final Map<String, String> m225deprecated_customKeys() {
        return this.customKeys;
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
    /* renamed from: -deprecated_mediaAltText, reason: not valid java name and from getter */
    public final String getMediaAltText() {
        return this.mediaAltText;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_mediaUrl, reason: not valid java name and from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_notificationId, reason: not valid java name and from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_payload, reason: not valid java name */
    public final Map<String, String> m230deprecated_payload() {
        return this.payload;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_region, reason: not valid java name and from getter */
    public final Region getRegion() {
        return this.region;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_requestId, reason: not valid java name and from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_sound, reason: not valid java name and from getter */
    public final Sound getSound() {
        return this.sound;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_soundName, reason: not valid java name and from getter */
    public final String getSoundName() {
        return this.soundName;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_subTitle, reason: not valid java name and from getter */
    public final String getSubtitle() {
        return this.subtitle;
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
    /* renamed from: -deprecated_trigger, reason: not valid java name and from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final Type getType() {
        return this.type;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final String getUrl() {
        return this.url;
    }

    @JvmName
    @NotNull
    public final String alert() {
        return this.alert;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final Trigger component10() {
        return this.trigger;
    }

    @Nullable
    public final String component11() {
        return this.url;
    }

    @Nullable
    public final String component12() {
        return this.mediaUrl;
    }

    @Nullable
    public final String component13() {
        return this.mediaAltText;
    }

    @NotNull
    public final Map<String, String> component14() {
        return this.customKeys;
    }

    @Nullable
    public final String component15() {
        return this.custom;
    }

    @Nullable
    public final Map<String, String> component16() {
        return this.payload;
    }

    @Nullable
    /* renamed from: component17$sdk_release, reason: from getter */
    public final String getPropertyBag() {
        return this.propertyBag;
    }

    public final int component18$sdk_release() {
        return this.notificationId;
    }

    @Nullable
    public final String component2() {
        return this.requestId;
    }

    @Nullable
    public final Region component3() {
        return this.region;
    }

    @NotNull
    public final String component4() {
        return this.alert;
    }

    @NotNull
    public final Sound component5() {
        return this.sound;
    }

    @Nullable
    public final String component6() {
        return this.soundName;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final String component8() {
        return this.subtitle;
    }

    @NotNull
    public final Type component9() {
        return this.type;
    }

    @NotNull
    public final NotificationMessage copy(@NotNull String id, @Nullable String requestId, @Nullable Region region, @NotNull String alert, @NotNull Sound sound, @Nullable String soundName, @Nullable String title, @Nullable String subtitle, @NotNull Type type, @NotNull Trigger trigger, @Nullable String url, @Nullable String mediaUrl, @Nullable String mediaAltText, @NotNull Map<String, String> customKeys, @Nullable String custom, @Nullable Map<String, String> payload, @Nullable String propertyBag, int notificationId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(alert, "alert");
        Intrinsics.h(sound, "sound");
        Intrinsics.h(type, "type");
        Intrinsics.h(trigger, "trigger");
        Intrinsics.h(customKeys, "customKeys");
        return new NotificationMessage(id, requestId, region, alert, sound, soundName, title, subtitle, type, trigger, url, mediaUrl, mediaAltText, customKeys, custom, payload, propertyBag, notificationId);
    }

    @JvmName
    @Nullable
    public final String custom() {
        return this.custom;
    }

    @JvmName
    @NotNull
    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMessage)) {
            return false;
        }
        NotificationMessage notificationMessage = (NotificationMessage) other;
        return Intrinsics.c(this.id, notificationMessage.id) && Intrinsics.c(this.requestId, notificationMessage.requestId) && Intrinsics.c(this.region, notificationMessage.region) && Intrinsics.c(this.alert, notificationMessage.alert) && this.sound == notificationMessage.sound && Intrinsics.c(this.soundName, notificationMessage.soundName) && Intrinsics.c(this.title, notificationMessage.title) && Intrinsics.c(this.subtitle, notificationMessage.subtitle) && this.type == notificationMessage.type && this.trigger == notificationMessage.trigger && Intrinsics.c(this.url, notificationMessage.url) && Intrinsics.c(this.mediaUrl, notificationMessage.mediaUrl) && Intrinsics.c(this.mediaAltText, notificationMessage.mediaAltText) && Intrinsics.c(this.customKeys, notificationMessage.customKeys) && Intrinsics.c(this.custom, notificationMessage.custom) && Intrinsics.c(this.payload, notificationMessage.payload) && Intrinsics.c(this.propertyBag, notificationMessage.propertyBag) && this.notificationId == notificationMessage.notificationId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.requestId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Region region = this.region;
        int iHashCode3 = (this.sound.hashCode() + androidx.camera.core.impl.b.c((iHashCode2 + (region == null ? 0 : region.hashCode())) * 31, 31, this.alert)) * 31;
        String str2 = this.soundName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode6 = (this.trigger.hashCode() + ((this.type.hashCode() + ((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.url;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mediaUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mediaAltText;
        int iD = d.d(this.customKeys, (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        String str8 = this.custom;
        int iHashCode9 = (iD + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.payload;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.propertyBag;
        return Integer.hashCode(this.notificationId) + ((iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    @JvmName
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName
    @Nullable
    public final String mediaAltText() {
        return this.mediaAltText;
    }

    @JvmName
    @Nullable
    public final String mediaUrl() {
        return this.mediaUrl;
    }

    @JvmName
    public final int notificationId() {
        return this.notificationId;
    }

    @JvmName
    @Nullable
    public final Map<String, String> payload() {
        return this.payload;
    }

    @JvmName
    @Nullable
    public final String propertyBag() {
        return this.propertyBag;
    }

    @JvmName
    @Nullable
    public final Region region() {
        return this.region;
    }

    @JvmName
    @Nullable
    public final String requestId() {
        return this.requestId;
    }

    @RestrictTo
    public final void setNotificationId$sdk_release(int i) {
        this.notificationId = i;
    }

    @JvmName
    @NotNull
    public final Sound sound() {
        return this.sound;
    }

    @JvmName
    @Nullable
    public final String soundName() {
        return this.soundName;
    }

    @JvmName
    @Nullable
    public final String subtitle() {
        return this.subtitle;
    }

    @JvmName
    @Nullable
    public final String title() {
        return this.title;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.requestId;
        Region region = this.region;
        String str3 = this.alert;
        Sound sound = this.sound;
        String str4 = this.soundName;
        String str5 = this.title;
        String str6 = this.subtitle;
        Type type = this.type;
        Trigger trigger = this.trigger;
        String str7 = this.url;
        String str8 = this.mediaUrl;
        String str9 = this.mediaAltText;
        Map<String, String> map = this.customKeys;
        String str10 = this.custom;
        Map<String, String> map2 = this.payload;
        String str11 = this.propertyBag;
        int i = this.notificationId;
        StringBuilder sbV = YU.a.v("NotificationMessage(id=", str, ", requestId=", str2, ", region=");
        sbV.append(region);
        sbV.append(", alert=");
        sbV.append(str3);
        sbV.append(", sound=");
        sbV.append(sound);
        sbV.append(", soundName=");
        sbV.append(str4);
        sbV.append(", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", subtitle=", str6, ", type=");
        sbV.append(type);
        sbV.append(", trigger=");
        sbV.append(trigger);
        sbV.append(", url=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", mediaUrl=", str8, ", mediaAltText=");
        sbV.append(str9);
        sbV.append(", customKeys=");
        sbV.append(map);
        sbV.append(", custom=");
        sbV.append(str10);
        sbV.append(", payload=");
        sbV.append(map2);
        sbV.append(", propertyBag=");
        sbV.append(str11);
        sbV.append(", notificationId=");
        sbV.append(i);
        sbV.append(")");
        return sbV.toString();
    }

    @JvmName
    @NotNull
    public final Trigger trigger() {
        return this.trigger;
    }

    @JvmName
    @NotNull
    public final Type type() {
        return this.type;
    }

    @JvmName
    @Nullable
    public final String url() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.requestId);
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.alert);
        parcel.writeString(this.sound.name());
        parcel.writeString(this.soundName);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.type.name());
        parcel.writeString(this.trigger.name());
        parcel.writeString(this.url);
        parcel.writeString(this.mediaUrl);
        parcel.writeString(this.mediaAltText);
        Map<String, String> map = this.customKeys;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.custom);
        Map<String, String> map2 = this.payload;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeString(this.propertyBag);
        parcel.writeInt(this.notificationId);
    }

    public /* synthetic */ NotificationMessage(String str, String str2, Region region, String str3, Sound sound, String str4, String str5, String str6, Type type, Trigger trigger, String str7, String str8, String str9, Map map, String str10, Map map2, String str11, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : region, str3, sound, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, type, trigger, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) != 0 ? EmptyMap.d : map, (i2 & 16384) != 0 ? null : str10, (32768 & i2) != 0 ? null : map2, (65536 & i2) != 0 ? null : str11, (i2 & 131072) != 0 ? -1 : i);
    }
}
