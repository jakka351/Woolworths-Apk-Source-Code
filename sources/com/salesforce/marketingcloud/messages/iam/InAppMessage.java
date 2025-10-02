package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\tstuvwxyz{B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0081\u0002\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020)¢\u0006\u0002\u0010*J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b9J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\b:J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b;J\r\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\b<J\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b=J\u0015\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0007¢\u0006\u0002\b>J\u000f\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\b?J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\t\u0010F\u001a\u00020\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010!HÆ\u0003J\u000e\u0010K\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\bLJ\t\u0010M\u001a\u00020#HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020)HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\u0010HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008b\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)HÆ\u0001J\r\u0010\u0018\u001a\u00020\u0016H\u0007¢\u0006\u0002\bYJ\t\u0010Z\u001a\u00020\tHÖ\u0001J\r\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\b[J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\b\\J\u000f\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b]J\u0013\u0010^\u001a\u00020)2\b\u0010_\u001a\u0004\u0018\u00010`HÖ\u0003J\t\u0010a\u001a\u00020\tHÖ\u0001J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bbJ\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\bcJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0002\bdJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\beJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bfJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\bgJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\bhJ\r\u0010i\u001a\u00020\u0003H\u0007¢\u0006\u0002\bjJ\t\u0010k\u001a\u00020\u0006HÖ\u0001J\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\blJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\bmJ\u0019\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010,R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010-R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010,R\u0013\u0010\u0015\u001a\u00020\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010.R\u0013\u0010\"\u001a\u00020#8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010/R\u001b\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u00100R\u0015\u0010 \u001a\u0004\u0018\u00010!8\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u00101R\u0013\u0010\u0018\u001a\u00020\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010.R\u0013\u0010\u0012\u001a\u00020\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00102R\u0013\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00103R\u0013\u0010(\u001a\u00020)8\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u00104R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u00105R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010,R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00106R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00107R\u0013\u0010'\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u00103R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u00105R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u00103R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u00105R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010-R\u0013\u0010\u000f\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00108R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010,¨\u0006|"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage;", "Landroid/os/Parcelable;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "activityInstanceId", "priority", "", "startDateUtc", "Ljava/util/Date;", "endDateUtc", "modifiedDateUtc", "displayLimit", "type", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "windowColor", "displayDuration", "", "backgroundColor", "borderWidth", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "borderColor", "cornerRadius", "layoutOrder", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", "media", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "title", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "body", "closeButton", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "buttonConfiguration", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "buttons", "", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button;", "messageDelaySec", "displayLimitOverride", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;Ljava/lang/String;JLjava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;Ljava/util/List;IZ)V", "-activityInstanceId", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "()Ljava/util/List;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "()J", "()I", "()Z", "()Ljava/util/Date;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "-deprecated_backgroundColor", "-deprecated_body", "-deprecated_borderColor", "-deprecated_borderWidth", "-deprecated_buttonConfiguration", "-deprecated_buttons", "-deprecated_closeButton", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component2$sdk_release", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_cornerRadius", "describeContents", "-deprecated_displayDuration", "-deprecated_displayLimit", "-deprecated_endDateUtc", "equals", "other", "", "hashCode", "-deprecated_id", "-deprecated_layoutOrder", "-deprecated_media", "-deprecated_modifiedDateUtc", "-deprecated_priority", "-deprecated_startDateUtc", "-deprecated_title", "toJson", "-toJson", "toString", "-deprecated_type", "-deprecated_windowColor", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Alignment", "Button", "ButtonConfig", "CloseButton", "LayoutOrder", "Media", "Size", "TextField", "Type", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class InAppMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InAppMessage> CREATOR = new a();

    @NotNull
    private final String activityInstanceId;

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final TextField body;

    @Nullable
    private final String borderColor;

    @NotNull
    private final Size borderWidth;

    @NotNull
    private final ButtonConfig buttonConfiguration;

    @Nullable
    private final List<Button> buttons;

    @Nullable
    private final CloseButton closeButton;

    @NotNull
    private final Size cornerRadius;
    private final long displayDuration;
    private final int displayLimit;
    private final boolean displayLimitOverride;

    @Nullable
    private final Date endDateUtc;

    @NotNull
    private final String id;

    @NotNull
    private final LayoutOrder layoutOrder;

    @Nullable
    private final Media media;
    private final int messageDelaySec;

    @Nullable
    private final Date modifiedDateUtc;
    private final int priority;

    @Nullable
    private final Date startDateUtc;

    @Nullable
    private final TextField title;

    @NotNull
    private final Type type;

    @Nullable
    private final String windowColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "", "(Ljava/lang/String;I)V", "beginning", "center", "end", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment beginning = new Alignment("beginning", 0);
        public static final Alignment center = new Alignment("center", 1);
        public static final Alignment end = new Alignment("end", 2);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{beginning, center, end};
        }

        static {
            Alignment[] alignmentArr$values = $values();
            $VALUES = alignmentArr$values;
            $ENTRIES = EnumEntriesKt.a(alignmentArr$values);
        }

        private Alignment(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Alignment> getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<By\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0017J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\r\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0002\b'J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b-J\r\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\b.J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b0J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b1J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b2J\r\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0012R\u0013\u0010\u000f\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0014R\u0013\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0013\u0010\u000b\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012¨\u0006="}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button;", "Landroid/os/Parcelable;", "id", "", "index", "", TextBundle.TEXT_ENTRY, "actionType", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", UrlHandler.ACTION, "fontColor", "fontSize", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "backgroundColor", "borderColor", "borderWidth", "cornerRadius", "(Ljava/lang/String;ILjava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;)V", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()I", "-deprecated_action", "-deprecated_actionType", "-deprecated_backgroundColor", "-deprecated_borderColor", "-deprecated_borderWidth", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_cornerRadius", "describeContents", "equals", "", "other", "", "-deprecated_fontColor", "-deprecated_fontSize", "hashCode", "-deprecated_id", "-deprecated_index", "-deprecated_text", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ActionType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @Nullable
        private final String action;

        @NotNull
        private final ActionType actionType;

        @Nullable
        private final String backgroundColor;

        @Nullable
        private final String borderColor;

        @NotNull
        private final Size borderWidth;

        @NotNull
        private final Size cornerRadius;

        @Nullable
        private final String fontColor;

        @NotNull
        private final Size fontSize;

        @NotNull
        private final String id;
        private final int index;

        @NotNull
        private final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @MCKeep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", "", "(Ljava/lang/String;I)V", "close", "url", "pushSettings", "locationSettings", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;
            public static final ActionType close = new ActionType("close", 0);
            public static final ActionType url = new ActionType("url", 1);
            public static final ActionType pushSettings = new ActionType("pushSettings", 2);
            public static final ActionType locationSettings = new ActionType("locationSettings", 3);

            private static final /* synthetic */ ActionType[] $values() {
                return new ActionType[]{close, url, pushSettings, locationSettings};
            }

            static {
                ActionType[] actionTypeArr$values = $values();
                $VALUES = actionTypeArr$values;
                $ENTRIES = EnumEntriesKt.a(actionTypeArr$values);
            }

            private ActionType(String str, int i) {
            }

            @NotNull
            public static EnumEntries<ActionType> getEntries() {
                return $ENTRIES;
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) $VALUES.clone();
            }
        }

        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readInt(), parcel.readString(), ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), Size.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(@NotNull String id, int i, @NotNull String text, @NotNull ActionType actionType, @Nullable String str, @Nullable String str2, @NotNull Size fontSize, @Nullable String str3, @Nullable String str4, @NotNull Size borderWidth, @NotNull Size cornerRadius) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            Intrinsics.h(actionType, "actionType");
            Intrinsics.h(fontSize, "fontSize");
            Intrinsics.h(borderWidth, "borderWidth");
            Intrinsics.h(cornerRadius, "cornerRadius");
            this.id = id;
            this.index = i;
            this.text = text;
            this.actionType = actionType;
            this.action = str;
            this.fontColor = str2;
            this.fontSize = fontSize;
            this.backgroundColor = str3;
            this.borderColor = str4;
            this.borderWidth = borderWidth;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, int i, String str2, ActionType actionType, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = button.id;
            }
            if ((i2 & 2) != 0) {
                i = button.index;
            }
            if ((i2 & 4) != 0) {
                str2 = button.text;
            }
            if ((i2 & 8) != 0) {
                actionType = button.actionType;
            }
            if ((i2 & 16) != 0) {
                str3 = button.action;
            }
            if ((i2 & 32) != 0) {
                str4 = button.fontColor;
            }
            if ((i2 & 64) != 0) {
                size = button.fontSize;
            }
            if ((i2 & 128) != 0) {
                str5 = button.backgroundColor;
            }
            if ((i2 & 256) != 0) {
                str6 = button.borderColor;
            }
            if ((i2 & 512) != 0) {
                size2 = button.borderWidth;
            }
            if ((i2 & 1024) != 0) {
                size3 = button.cornerRadius;
            }
            Size size4 = size2;
            Size size5 = size3;
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            Size size6 = size;
            String str10 = str3;
            String str11 = str2;
            return button.copy(str, i, str11, actionType, str10, str9, size6, str7, str8, size4, size5);
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_action, reason: not valid java name and from getter */
        public final String getAction() {
            return this.action;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_actionType, reason: not valid java name and from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_backgroundColor, reason: not valid java name and from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
        public final Size getBorderWidth() {
            return this.borderWidth;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
        public final Size getCornerRadius() {
            return this.cornerRadius;
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_fontColor, reason: not valid java name and from getter */
        public final String getFontColor() {
            return this.fontColor;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_fontSize, reason: not valid java name and from getter */
        public final Size getFontSize() {
            return this.fontSize;
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
        /* renamed from: -deprecated_index, reason: not valid java name and from getter */
        public final int getIndex() {
            return this.index;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_text, reason: not valid java name and from getter */
        public final String getText() {
            return this.text;
        }

        @JvmName
        @NotNull
        /* renamed from: -toJson, reason: not valid java name */
        public final JSONObject m184toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("index", this.index);
            jSONObject.put(TextBundle.TEXT_ENTRY, this.text);
            jSONObject.put("actionType", this.actionType.name());
            String str = this.action;
            if (str != null) {
                jSONObject.put("actionAndroid", str);
            }
            String str2 = this.fontColor;
            if (str2 != null) {
                jSONObject.put("fontColor", str2);
            }
            jSONObject.put("fontSize", this.fontSize.name());
            String str3 = this.backgroundColor;
            if (str3 != null) {
                jSONObject.put("backgroundColor", str3);
            }
            String str4 = this.borderColor;
            if (str4 != null) {
                jSONObject.put("borderColor", str4);
            }
            jSONObject.put("borderWidth", this.borderWidth.name());
            jSONObject.put("cornerRadius", this.cornerRadius.name());
            return jSONObject;
        }

        @JvmName
        @Nullable
        public final String action() {
            return this.action;
        }

        @JvmName
        @NotNull
        public final ActionType actionType() {
            return this.actionType;
        }

        @JvmName
        @Nullable
        public final String backgroundColor() {
            return this.backgroundColor;
        }

        @JvmName
        @Nullable
        public final String borderColor() {
            return this.borderColor;
        }

        @JvmName
        @NotNull
        public final Size borderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Size component10() {
            return this.borderWidth;
        }

        @NotNull
        public final Size component11() {
            return this.cornerRadius;
        }

        public final int component2() {
            return this.index;
        }

        @NotNull
        public final String component3() {
            return this.text;
        }

        @NotNull
        public final ActionType component4() {
            return this.actionType;
        }

        @Nullable
        public final String component5() {
            return this.action;
        }

        @Nullable
        public final String component6() {
            return this.fontColor;
        }

        @NotNull
        public final Size component7() {
            return this.fontSize;
        }

        @Nullable
        public final String component8() {
            return this.backgroundColor;
        }

        @Nullable
        public final String component9() {
            return this.borderColor;
        }

        @NotNull
        public final Button copy(@NotNull String id, int index, @NotNull String text, @NotNull ActionType actionType, @Nullable String action, @Nullable String fontColor, @NotNull Size fontSize, @Nullable String backgroundColor, @Nullable String borderColor, @NotNull Size borderWidth, @NotNull Size cornerRadius) {
            Intrinsics.h(id, "id");
            Intrinsics.h(text, "text");
            Intrinsics.h(actionType, "actionType");
            Intrinsics.h(fontSize, "fontSize");
            Intrinsics.h(borderWidth, "borderWidth");
            Intrinsics.h(cornerRadius, "cornerRadius");
            return new Button(id, index, text, actionType, action, fontColor, fontSize, backgroundColor, borderColor, borderWidth, cornerRadius);
        }

        @JvmName
        @NotNull
        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.c(this.id, button.id) && this.index == button.index && Intrinsics.c(this.text, button.text) && this.actionType == button.actionType && Intrinsics.c(this.action, button.action) && Intrinsics.c(this.fontColor, button.fontColor) && this.fontSize == button.fontSize && Intrinsics.c(this.backgroundColor, button.backgroundColor) && Intrinsics.c(this.borderColor, button.borderColor) && this.borderWidth == button.borderWidth && this.cornerRadius == button.cornerRadius;
        }

        @JvmName
        @Nullable
        public final String fontColor() {
            return this.fontColor;
        }

        @JvmName
        @NotNull
        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int iHashCode = (this.actionType.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.a(this.index, this.id.hashCode() * 31, 31), 31, this.text)) * 31;
            String str = this.action;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fontColor;
            int iHashCode3 = (this.fontSize.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.backgroundColor;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.borderColor;
            return this.cornerRadius.hashCode() + ((this.borderWidth.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
        }

        @JvmName
        @NotNull
        public final String id() {
            return this.id;
        }

        @JvmName
        public final int index() {
            return this.index;
        }

        @JvmName
        @NotNull
        public final String text() {
            return this.text;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i = this.index;
            String str2 = this.text;
            ActionType actionType = this.actionType;
            String str3 = this.action;
            String str4 = this.fontColor;
            Size size = this.fontSize;
            String str5 = this.backgroundColor;
            String str6 = this.borderColor;
            Size size2 = this.borderWidth;
            Size size3 = this.cornerRadius;
            StringBuilder sbU = androidx.camera.core.impl.b.u("Button(id=", i, str, ", index=", ", text=");
            sbU.append(str2);
            sbU.append(", actionType=");
            sbU.append(actionType);
            sbU.append(", action=");
            androidx.constraintlayout.core.state.a.B(sbU, str3, ", fontColor=", str4, ", fontSize=");
            sbU.append(size);
            sbU.append(", backgroundColor=");
            sbU.append(str5);
            sbU.append(", borderColor=");
            sbU.append(str6);
            sbU.append(", borderWidth=");
            sbU.append(size2);
            sbU.append(", cornerRadius=");
            sbU.append(size3);
            sbU.append(")");
            return sbU.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.h(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeInt(this.index);
            parcel.writeString(this.text);
            parcel.writeString(this.actionType.name());
            parcel.writeString(this.action);
            parcel.writeString(this.fontColor);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.backgroundColor);
            parcel.writeString(this.borderColor);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.cornerRadius.name());
        }

        public /* synthetic */ Button(String str, int i, String str2, ActionType actionType, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i, str2, (i2 & 8) != 0 ? ActionType.close : actionType, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? Size.s : size, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? Size.s : size2, (i2 & 1024) != 0 ? Size.s : size3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "", "(Ljava/lang/String;I)V", "stacked", "twoUp", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonConfig {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonConfig[] $VALUES;
        public static final ButtonConfig stacked = new ButtonConfig("stacked", 0);
        public static final ButtonConfig twoUp = new ButtonConfig("twoUp", 1);

        private static final /* synthetic */ ButtonConfig[] $values() {
            return new ButtonConfig[]{stacked, twoUp};
        }

        static {
            ButtonConfig[] buttonConfigArr$values = $values();
            $VALUES = buttonConfigArr$values;
            $ENTRIES = EnumEntriesKt.a(buttonConfigArr$values);
        }

        private ButtonConfig(String str, int i) {
        }

        @NotNull
        public static EnumEntries<ButtonConfig> getEntries() {
            return $ENTRIES;
        }

        public static ButtonConfig valueOf(String str) {
            return (ButtonConfig) Enum.valueOf(ButtonConfig.class, str);
        }

        public static ButtonConfig[] values() {
            return (ButtonConfig[]) $VALUES.clone();
        }
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0013\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\t\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "-deprecated_alignment", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "alignment", "component1", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "<init>", "(Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class CloseButton implements Parcelable {

        @NotNull
        private final Alignment alignment;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<CloseButton> CREATOR = new b();

        /* renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final CloseButton a() {
                return new CloseButton(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<CloseButton> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CloseButton createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new CloseButton(Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CloseButton[] newArray(int i) {
                return new CloseButton[i];
            }
        }

        public CloseButton() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = closeButton.alignment;
            }
            return closeButton.copy(alignment);
        }

        @JvmStatic
        @NotNull
        public static final CloseButton defaultCloseButton() {
            return INSTANCE.a();
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_alignment, reason: not valid java name and from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @JvmName
        @NotNull
        /* renamed from: -toJson, reason: not valid java name */
        public final JSONObject m186toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alignment", this.alignment.name());
            return jSONObject;
        }

        @JvmName
        @NotNull
        public final Alignment alignment() {
            return this.alignment;
        }

        @NotNull
        public final Alignment component1() {
            return this.alignment;
        }

        @NotNull
        public final CloseButton copy(@NotNull Alignment alignment) {
            Intrinsics.h(alignment, "alignment");
            return new CloseButton(alignment);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseButton) && this.alignment == ((CloseButton) other).alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloseButton(alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.h(parcel, "out");
            parcel.writeString(this.alignment.name());
        }

        public CloseButton(@NotNull Alignment alignment) {
            Intrinsics.h(alignment, "alignment");
            this.alignment = alignment;
        }

        public /* synthetic */ CloseButton(Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Alignment.end : alignment);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", "", "(Ljava/lang/String;I)V", "ImageTitleBody", "TitleImageBody", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutOrder {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutOrder[] $VALUES;
        public static final LayoutOrder ImageTitleBody = new LayoutOrder("ImageTitleBody", 0);
        public static final LayoutOrder TitleImageBody = new LayoutOrder("TitleImageBody", 1);

        private static final /* synthetic */ LayoutOrder[] $values() {
            return new LayoutOrder[]{ImageTitleBody, TitleImageBody};
        }

        static {
            LayoutOrder[] layoutOrderArr$values = $values();
            $VALUES = layoutOrderArr$values;
            $ENTRIES = EnumEntriesKt.a(layoutOrderArr$values);
        }

        private LayoutOrder(String str, int i) {
        }

        @NotNull
        public static EnumEntries<LayoutOrder> getEntries() {
            return $ENTRIES;
        }

        public static LayoutOrder valueOf(String str) {
            return (LayoutOrder) Enum.valueOf(LayoutOrder.class, str);
        }

        public static LayoutOrder[] values() {
            return (LayoutOrder[]) $VALUES.clone();
        }
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u000fJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0010J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\r\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0013\u0010\n\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\f¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "Landroid/os/Parcelable;", "url", "", "size", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "altText", "borderWidth", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "borderColor", "cornerRadius", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;)V", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "-deprecated_altText", "-deprecated_borderColor", "-deprecated_borderWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "-deprecated_cornerRadius", "describeContents", "", "equals", "", "other", "", "hashCode", "-deprecated_size", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "-deprecated_url", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ImageSize", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Media implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Media> CREATOR = new a();

        @Nullable
        private final String altText;

        @Nullable
        private final String borderColor;

        @NotNull
        private final Size borderWidth;

        @NotNull
        private final Size cornerRadius;

        @NotNull
        private final ImageSize size;

        @NotNull
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @MCKeep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "", "(Ljava/lang/String;I)V", "full", "e2e", "inset", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ImageSize {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ImageSize[] $VALUES;
            public static final ImageSize full = new ImageSize("full", 0);
            public static final ImageSize e2e = new ImageSize("e2e", 1);
            public static final ImageSize inset = new ImageSize("inset", 2);

            private static final /* synthetic */ ImageSize[] $values() {
                return new ImageSize[]{full, e2e, inset};
            }

            static {
                ImageSize[] imageSizeArr$values = $values();
                $VALUES = imageSizeArr$values;
                $ENTRIES = EnumEntriesKt.a(imageSizeArr$values);
            }

            private ImageSize(String str, int i) {
            }

            @NotNull
            public static EnumEntries<ImageSize> getEntries() {
                return $ENTRIES;
            }

            public static ImageSize valueOf(String str) {
                return (ImageSize) Enum.valueOf(ImageSize.class, str);
            }

            public static ImageSize[] values() {
                return (ImageSize[]) $VALUES.clone();
            }
        }

        public static final class a implements Parcelable.Creator<Media> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Media(parcel.readString(), ImageSize.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media[] newArray(int i) {
                return new Media[i];
            }
        }

        public Media(@NotNull String url, @NotNull ImageSize size, @Nullable String str, @NotNull Size borderWidth, @Nullable String str2, @NotNull Size cornerRadius) {
            Intrinsics.h(url, "url");
            Intrinsics.h(size, "size");
            Intrinsics.h(borderWidth, "borderWidth");
            Intrinsics.h(cornerRadius, "cornerRadius");
            this.url = url;
            this.size = size;
            this.altText = str;
            this.borderWidth = borderWidth;
            this.borderColor = str2;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, ImageSize imageSize, String str2, Size size, String str3, Size size2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.url;
            }
            if ((i & 2) != 0) {
                imageSize = media.size;
            }
            if ((i & 4) != 0) {
                str2 = media.altText;
            }
            if ((i & 8) != 0) {
                size = media.borderWidth;
            }
            if ((i & 16) != 0) {
                str3 = media.borderColor;
            }
            if ((i & 32) != 0) {
                size2 = media.cornerRadius;
            }
            String str4 = str3;
            Size size3 = size2;
            return media.copy(str, imageSize, str2, size, str4, size3);
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_altText, reason: not valid java name and from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
        public final Size getBorderWidth() {
            return this.borderWidth;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
        public final Size getCornerRadius() {
            return this.cornerRadius;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_size, reason: not valid java name and from getter */
        public final ImageSize getSize() {
            return this.size;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_url, reason: not valid java name and from getter */
        public final String getUrl() {
            return this.url;
        }

        @JvmName
        @NotNull
        /* renamed from: -toJson, reason: not valid java name */
        public final JSONObject m193toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.url);
            jSONObject.put("size", this.size.name());
            String str = this.altText;
            if (str != null) {
                jSONObject.put("altText", str);
            }
            jSONObject.put("borderWidth", this.borderWidth.name());
            String str2 = this.borderColor;
            if (str2 != null) {
                jSONObject.put("borderColor", str2);
            }
            jSONObject.put("cornerRadius", this.cornerRadius);
            return jSONObject;
        }

        @JvmName
        @Nullable
        public final String altText() {
            return this.altText;
        }

        @JvmName
        @Nullable
        public final String borderColor() {
            return this.borderColor;
        }

        @JvmName
        @NotNull
        public final Size borderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final ImageSize component2() {
            return this.size;
        }

        @Nullable
        public final String component3() {
            return this.altText;
        }

        @NotNull
        public final Size component4() {
            return this.borderWidth;
        }

        @Nullable
        public final String component5() {
            return this.borderColor;
        }

        @NotNull
        public final Size component6() {
            return this.cornerRadius;
        }

        @NotNull
        public final Media copy(@NotNull String url, @NotNull ImageSize size, @Nullable String altText, @NotNull Size borderWidth, @Nullable String borderColor, @NotNull Size cornerRadius) {
            Intrinsics.h(url, "url");
            Intrinsics.h(size, "size");
            Intrinsics.h(borderWidth, "borderWidth");
            Intrinsics.h(cornerRadius, "cornerRadius");
            return new Media(url, size, altText, borderWidth, borderColor, cornerRadius);
        }

        @JvmName
        @NotNull
        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.c(this.url, media.url) && this.size == media.size && Intrinsics.c(this.altText, media.altText) && this.borderWidth == media.borderWidth && Intrinsics.c(this.borderColor, media.borderColor) && this.cornerRadius == media.cornerRadius;
        }

        public int hashCode() {
            int iHashCode = (this.size.hashCode() + (this.url.hashCode() * 31)) * 31;
            String str = this.altText;
            int iHashCode2 = (this.borderWidth.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.borderColor;
            return this.cornerRadius.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @JvmName
        @NotNull
        public final ImageSize size() {
            return this.size;
        }

        @NotNull
        public String toString() {
            return "Media(url=" + this.url + ", size=" + this.size + ", altText=" + this.altText + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + ", cornerRadius=" + this.cornerRadius + ")";
        }

        @JvmName
        @NotNull
        public final String url() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.h(parcel, "out");
            parcel.writeString(this.url);
            parcel.writeString(this.size.name());
            parcel.writeString(this.altText);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.borderColor);
            parcel.writeString(this.cornerRadius.name());
        }

        public /* synthetic */ Media(String str, ImageSize imageSize, String str2, Size size, String str3, Size size2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ImageSize.e2e : imageSize, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Size.s : size, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? Size.s : size2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "", "(Ljava/lang/String;I)V", "s", "m", "l", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size s = new Size("s", 0);
        public static final Size m = new Size("m", 1);
        public static final Size l = new Size("l", 2);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{s, m, l};
        }

        static {
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntriesKt.a(sizeArr$values);
        }

        private Size(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0014HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006&"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "Landroid/os/Parcelable;", TextBundle.TEXT_ENTRY, "", "fontSize", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "fontColor", "alignment", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;)V", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "-deprecated_alignment", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "-deprecated_fontColor", "-deprecated_fontSize", "hashCode", "-deprecated_text", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextField implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        @NotNull
        private final Alignment alignment;

        @Nullable
        private final String fontColor;

        @NotNull
        private final Size fontSize;

        @NotNull
        private final String text;

        public static final class a implements Parcelable.Creator<TextField> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextField createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new TextField(parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextField[] newArray(int i) {
                return new TextField[i];
            }
        }

        public TextField(@NotNull String text, @NotNull Size fontSize, @Nullable String str, @NotNull Alignment alignment) {
            Intrinsics.h(text, "text");
            Intrinsics.h(fontSize, "fontSize");
            Intrinsics.h(alignment, "alignment");
            this.text = text;
            this.fontSize = fontSize;
            this.fontColor = str;
            this.alignment = alignment;
        }

        public static /* synthetic */ TextField copy$default(TextField textField, String str, Size size, String str2, Alignment alignment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textField.text;
            }
            if ((i & 2) != 0) {
                size = textField.fontSize;
            }
            if ((i & 4) != 0) {
                str2 = textField.fontColor;
            }
            if ((i & 8) != 0) {
                alignment = textField.alignment;
            }
            return textField.copy(str, size, str2, alignment);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_alignment, reason: not valid java name and from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_fontColor, reason: not valid java name and from getter */
        public final String getFontColor() {
            return this.fontColor;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_fontSize, reason: not valid java name and from getter */
        public final Size getFontSize() {
            return this.fontSize;
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_text, reason: not valid java name and from getter */
        public final String getText() {
            return this.text;
        }

        @JvmName
        @NotNull
        /* renamed from: -toJson, reason: not valid java name */
        public final JSONObject m198toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TextBundle.TEXT_ENTRY, this.text);
            jSONObject.put("fontSize", this.fontSize.name());
            String str = this.fontColor;
            if (str != null) {
                jSONObject.put("fontColor", str);
            }
            jSONObject.put("alignment", this.alignment.name());
            return jSONObject;
        }

        @JvmName
        @NotNull
        public final Alignment alignment() {
            return this.alignment;
        }

        @NotNull
        public final String component1() {
            return this.text;
        }

        @NotNull
        public final Size component2() {
            return this.fontSize;
        }

        @Nullable
        public final String component3() {
            return this.fontColor;
        }

        @NotNull
        public final Alignment component4() {
            return this.alignment;
        }

        @NotNull
        public final TextField copy(@NotNull String text, @NotNull Size fontSize, @Nullable String fontColor, @NotNull Alignment alignment) {
            Intrinsics.h(text, "text");
            Intrinsics.h(fontSize, "fontSize");
            Intrinsics.h(alignment, "alignment");
            return new TextField(text, fontSize, fontColor, alignment);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) other;
            return Intrinsics.c(this.text, textField.text) && this.fontSize == textField.fontSize && Intrinsics.c(this.fontColor, textField.fontColor) && this.alignment == textField.alignment;
        }

        @JvmName
        @Nullable
        public final String fontColor() {
            return this.fontColor;
        }

        @JvmName
        @NotNull
        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int iHashCode = (this.fontSize.hashCode() + (this.text.hashCode() * 31)) * 31;
            String str = this.fontColor;
            return this.alignment.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @JvmName
        @NotNull
        public final String text() {
            return this.text;
        }

        @NotNull
        public String toString() {
            return "TextField(text=" + this.text + ", fontSize=" + this.fontSize + ", fontColor=" + this.fontColor + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.h(parcel, "out");
            parcel.writeString(this.text);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.fontColor);
            parcel.writeString(this.alignment.name());
        }

        public /* synthetic */ TextField(String str, Size size, String str2, Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? Size.s : size, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Alignment.center : alignment);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "", "(Ljava/lang/String;I)V", "bannerTop", "bannerBottom", "modal", "full", "fullImageFill", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type bannerTop = new Type("bannerTop", 0);
        public static final Type bannerBottom = new Type("bannerBottom", 1);
        public static final Type modal = new Type("modal", 2);
        public static final Type full = new Type("full", 3);
        public static final Type fullImageFill = new Type("fullImageFill", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{bannerTop, bannerBottom, modal, full, fullImageFill};
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

    public InAppMessage(@NotNull String id, @NotNull String activityInstanceId, int i, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, int i2, @NotNull Type type, @Nullable String str, long j, @Nullable String str2, @NotNull Size borderWidth, @Nullable String str3, @NotNull Size cornerRadius, @NotNull LayoutOrder layoutOrder, @Nullable Media media, @Nullable TextField textField, @Nullable TextField textField2, @Nullable CloseButton closeButton, @NotNull ButtonConfig buttonConfiguration, @Nullable List<Button> list, int i3, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(activityInstanceId, "activityInstanceId");
        Intrinsics.h(type, "type");
        Intrinsics.h(borderWidth, "borderWidth");
        Intrinsics.h(cornerRadius, "cornerRadius");
        Intrinsics.h(layoutOrder, "layoutOrder");
        Intrinsics.h(buttonConfiguration, "buttonConfiguration");
        this.id = id;
        this.activityInstanceId = activityInstanceId;
        this.priority = i;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.modifiedDateUtc = date3;
        this.displayLimit = i2;
        this.type = type;
        this.windowColor = str;
        this.displayDuration = j;
        this.backgroundColor = str2;
        this.borderWidth = borderWidth;
        this.borderColor = str3;
        this.cornerRadius = cornerRadius;
        this.layoutOrder = layoutOrder;
        this.media = media;
        this.title = textField;
        this.body = textField2;
        this.closeButton = closeButton;
        this.buttonConfiguration = buttonConfiguration;
        this.buttons = list;
        this.messageDelaySec = i3;
        this.displayLimitOverride = z;
    }

    public static /* synthetic */ InAppMessage copy$default(InAppMessage inAppMessage, String str, String str2, int i, Date date, Date date2, Date date3, int i2, Type type, String str3, long j, String str4, Size size, String str5, Size size2, LayoutOrder layoutOrder, Media media, TextField textField, TextField textField2, CloseButton closeButton, ButtonConfig buttonConfig, List list, int i3, boolean z, int i4, Object obj) {
        boolean z2;
        int i5;
        String str6 = (i4 & 1) != 0 ? inAppMessage.id : str;
        String str7 = (i4 & 2) != 0 ? inAppMessage.activityInstanceId : str2;
        int i6 = (i4 & 4) != 0 ? inAppMessage.priority : i;
        Date date4 = (i4 & 8) != 0 ? inAppMessage.startDateUtc : date;
        Date date5 = (i4 & 16) != 0 ? inAppMessage.endDateUtc : date2;
        Date date6 = (i4 & 32) != 0 ? inAppMessage.modifiedDateUtc : date3;
        int i7 = (i4 & 64) != 0 ? inAppMessage.displayLimit : i2;
        Type type2 = (i4 & 128) != 0 ? inAppMessage.type : type;
        String str8 = (i4 & 256) != 0 ? inAppMessage.windowColor : str3;
        long j2 = (i4 & 512) != 0 ? inAppMessage.displayDuration : j;
        String str9 = (i4 & 1024) != 0 ? inAppMessage.backgroundColor : str4;
        Size size3 = (i4 & 2048) != 0 ? inAppMessage.borderWidth : size;
        String str10 = (i4 & 4096) != 0 ? inAppMessage.borderColor : str5;
        String str11 = str6;
        Size size4 = (i4 & 8192) != 0 ? inAppMessage.cornerRadius : size2;
        LayoutOrder layoutOrder2 = (i4 & 16384) != 0 ? inAppMessage.layoutOrder : layoutOrder;
        Media media2 = (i4 & 32768) != 0 ? inAppMessage.media : media;
        TextField textField3 = (i4 & 65536) != 0 ? inAppMessage.title : textField;
        TextField textField4 = (i4 & 131072) != 0 ? inAppMessage.body : textField2;
        CloseButton closeButton2 = (i4 & 262144) != 0 ? inAppMessage.closeButton : closeButton;
        ButtonConfig buttonConfig2 = (i4 & 524288) != 0 ? inAppMessage.buttonConfiguration : buttonConfig;
        List list2 = (i4 & 1048576) != 0 ? inAppMessage.buttons : list;
        int i8 = (i4 & 2097152) != 0 ? inAppMessage.messageDelaySec : i3;
        if ((i4 & 4194304) != 0) {
            i5 = i8;
            z2 = inAppMessage.displayLimitOverride;
        } else {
            z2 = z;
            i5 = i8;
        }
        return inAppMessage.copy(str11, str7, i6, date4, date5, date6, i7, type2, str8, j2, str9, size3, str10, size4, layoutOrder2, media2, textField3, textField4, closeButton2, buttonConfig2, list2, i5, z2);
    }

    @JvmName
    @NotNull
    /* renamed from: -activityInstanceId, reason: not valid java name and from getter */
    public final String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_backgroundColor, reason: not valid java name and from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final TextField getBody() {
        return this.body;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
    public final Size getBorderWidth() {
        return this.borderWidth;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_buttonConfiguration, reason: not valid java name and from getter */
    public final ButtonConfig getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_buttons, reason: not valid java name */
    public final List<Button> m157deprecated_buttons() {
        return this.buttons;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_closeButton, reason: not valid java name and from getter */
    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
    public final Size getCornerRadius() {
        return this.cornerRadius;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_displayDuration, reason: not valid java name and from getter */
    public final long getDisplayDuration() {
        return this.displayDuration;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_displayLimit, reason: not valid java name and from getter */
    public final int getDisplayLimit() {
        return this.displayLimit;
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
    @NotNull
    /* renamed from: -deprecated_layoutOrder, reason: not valid java name and from getter */
    public final LayoutOrder getLayoutOrder() {
        return this.layoutOrder;
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
    @Nullable
    /* renamed from: -deprecated_modifiedDateUtc, reason: not valid java name and from getter */
    public final Date getModifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_priority, reason: not valid java name and from getter */
    public final int getPriority() {
        return this.priority;
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
    /* renamed from: -deprecated_title, reason: not valid java name and from getter */
    public final TextField getTitle() {
        return this.title;
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
    /* renamed from: -deprecated_windowColor, reason: not valid java name and from getter */
    public final String getWindowColor() {
        return this.windowColor;
    }

    @RestrictTo
    @JvmName
    @NotNull
    /* renamed from: -toJson, reason: not valid java name */
    public final JSONObject m172toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("activityInstanceId", this.activityInstanceId);
        jSONObject.put("priority", this.priority);
        Date date = this.startDateUtc;
        if (date != null) {
            jSONObject.put("startDateUtc", com.salesforce.marketingcloud.internal.m.a(date));
        }
        Date date2 = this.endDateUtc;
        if (date2 != null) {
            jSONObject.put("endDateUtc", com.salesforce.marketingcloud.internal.m.a(date2));
        }
        Date date3 = this.modifiedDateUtc;
        if (date3 != null) {
            jSONObject.put("modifiedDateUtc", com.salesforce.marketingcloud.internal.m.a(date3));
        }
        jSONObject.put("displayLimit", this.displayLimit);
        jSONObject.put("type", this.type.name());
        String str = this.windowColor;
        if (str != null) {
            jSONObject.put("windowColor", str);
        }
        jSONObject.put("displayDuration", this.displayDuration);
        String str2 = this.backgroundColor;
        if (str2 != null) {
            jSONObject.put("backgroundColor", str2);
        }
        jSONObject.put("borderWidth", this.borderWidth.name());
        String str3 = this.borderColor;
        if (str3 != null) {
            jSONObject.put("borderColor", str3);
        }
        jSONObject.put("cornerRadius", this.cornerRadius.name());
        jSONObject.put("layoutOrder", this.layoutOrder.name());
        Media media = this.media;
        if (media != null) {
            jSONObject.put("media", media.m193toJson());
        }
        TextField textField = this.title;
        if (textField != null) {
            jSONObject.put("title", textField.m198toJson());
        }
        TextField textField2 = this.body;
        if (textField2 != null) {
            jSONObject.put("body", textField2.m198toJson());
        }
        CloseButton closeButton = this.closeButton;
        if (closeButton != null) {
            jSONObject.put("closeButton", closeButton.m186toJson());
        }
        jSONObject.put("buttonConfiguration", this.buttonConfiguration.name());
        if (this.buttons != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.buttons.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Button) it.next()).m184toJson());
            }
            jSONObject.put("buttons", jSONArray);
        }
        jSONObject.put("messageDelaySec", this.messageDelaySec);
        jSONObject.put("displayLimitOverride", this.displayLimitOverride);
        return jSONObject;
    }

    @JvmName
    @Nullable
    public final String backgroundColor() {
        return this.backgroundColor;
    }

    @JvmName
    @Nullable
    public final TextField body() {
        return this.body;
    }

    @JvmName
    @Nullable
    public final String borderColor() {
        return this.borderColor;
    }

    @JvmName
    @NotNull
    public final Size borderWidth() {
        return this.borderWidth;
    }

    @JvmName
    @NotNull
    public final ButtonConfig buttonConfiguration() {
        return this.buttonConfiguration;
    }

    @JvmName
    @Nullable
    public final List<Button> buttons() {
        return this.buttons;
    }

    @JvmName
    @Nullable
    public final CloseButton closeButton() {
        return this.closeButton;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.displayDuration;
    }

    @Nullable
    public final String component11() {
        return this.backgroundColor;
    }

    @NotNull
    public final Size component12() {
        return this.borderWidth;
    }

    @Nullable
    public final String component13() {
        return this.borderColor;
    }

    @NotNull
    public final Size component14() {
        return this.cornerRadius;
    }

    @NotNull
    public final LayoutOrder component15() {
        return this.layoutOrder;
    }

    @Nullable
    public final Media component16() {
        return this.media;
    }

    @Nullable
    public final TextField component17() {
        return this.title;
    }

    @Nullable
    public final TextField component18() {
        return this.body;
    }

    @Nullable
    public final CloseButton component19() {
        return this.closeButton;
    }

    @NotNull
    public final String component2$sdk_release() {
        return this.activityInstanceId;
    }

    @NotNull
    public final ButtonConfig component20() {
        return this.buttonConfiguration;
    }

    @Nullable
    public final List<Button> component21() {
        return this.buttons;
    }

    /* renamed from: component22, reason: from getter */
    public final int getMessageDelaySec() {
        return this.messageDelaySec;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getDisplayLimitOverride() {
        return this.displayLimitOverride;
    }

    public final int component3() {
        return this.priority;
    }

    @Nullable
    public final Date component4() {
        return this.startDateUtc;
    }

    @Nullable
    public final Date component5() {
        return this.endDateUtc;
    }

    @Nullable
    public final Date component6() {
        return this.modifiedDateUtc;
    }

    public final int component7() {
        return this.displayLimit;
    }

    @NotNull
    public final Type component8() {
        return this.type;
    }

    @Nullable
    public final String component9() {
        return this.windowColor;
    }

    @NotNull
    public final InAppMessage copy(@NotNull String id, @NotNull String activityInstanceId, int priority, @Nullable Date startDateUtc, @Nullable Date endDateUtc, @Nullable Date modifiedDateUtc, int displayLimit, @NotNull Type type, @Nullable String windowColor, long displayDuration, @Nullable String backgroundColor, @NotNull Size borderWidth, @Nullable String borderColor, @NotNull Size cornerRadius, @NotNull LayoutOrder layoutOrder, @Nullable Media media, @Nullable TextField title, @Nullable TextField body, @Nullable CloseButton closeButton, @NotNull ButtonConfig buttonConfiguration, @Nullable List<Button> buttons, int messageDelaySec, boolean displayLimitOverride) {
        Intrinsics.h(id, "id");
        Intrinsics.h(activityInstanceId, "activityInstanceId");
        Intrinsics.h(type, "type");
        Intrinsics.h(borderWidth, "borderWidth");
        Intrinsics.h(cornerRadius, "cornerRadius");
        Intrinsics.h(layoutOrder, "layoutOrder");
        Intrinsics.h(buttonConfiguration, "buttonConfiguration");
        return new InAppMessage(id, activityInstanceId, priority, startDateUtc, endDateUtc, modifiedDateUtc, displayLimit, type, windowColor, displayDuration, backgroundColor, borderWidth, borderColor, cornerRadius, layoutOrder, media, title, body, closeButton, buttonConfiguration, buttons, messageDelaySec, displayLimitOverride);
    }

    @JvmName
    @NotNull
    public final Size cornerRadius() {
        return this.cornerRadius;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName
    public final long displayDuration() {
        return this.displayDuration;
    }

    @JvmName
    public final int displayLimit() {
        return this.displayLimit;
    }

    @JvmName
    public final boolean displayLimitOverride() {
        return this.displayLimitOverride;
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
        if (!(other instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) other;
        return Intrinsics.c(this.id, inAppMessage.id) && Intrinsics.c(this.activityInstanceId, inAppMessage.activityInstanceId) && this.priority == inAppMessage.priority && Intrinsics.c(this.startDateUtc, inAppMessage.startDateUtc) && Intrinsics.c(this.endDateUtc, inAppMessage.endDateUtc) && Intrinsics.c(this.modifiedDateUtc, inAppMessage.modifiedDateUtc) && this.displayLimit == inAppMessage.displayLimit && this.type == inAppMessage.type && Intrinsics.c(this.windowColor, inAppMessage.windowColor) && this.displayDuration == inAppMessage.displayDuration && Intrinsics.c(this.backgroundColor, inAppMessage.backgroundColor) && this.borderWidth == inAppMessage.borderWidth && Intrinsics.c(this.borderColor, inAppMessage.borderColor) && this.cornerRadius == inAppMessage.cornerRadius && this.layoutOrder == inAppMessage.layoutOrder && Intrinsics.c(this.media, inAppMessage.media) && Intrinsics.c(this.title, inAppMessage.title) && Intrinsics.c(this.body, inAppMessage.body) && Intrinsics.c(this.closeButton, inAppMessage.closeButton) && this.buttonConfiguration == inAppMessage.buttonConfiguration && Intrinsics.c(this.buttons, inAppMessage.buttons) && this.messageDelaySec == inAppMessage.messageDelaySec && this.displayLimitOverride == inAppMessage.displayLimitOverride;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iA = androidx.camera.core.impl.b.a(this.priority, androidx.camera.core.impl.b.c(this.id.hashCode() * 31, 31, this.activityInstanceId), 31);
        Date date = this.startDateUtc;
        int iHashCode = (iA + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.modifiedDateUtc;
        int iHashCode3 = (this.type.hashCode() + androidx.camera.core.impl.b.a(this.displayLimit, (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31, 31)) * 31;
        String str = this.windowColor;
        int iB = androidx.camera.core.impl.b.b((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayDuration);
        String str2 = this.backgroundColor;
        int iHashCode4 = (this.borderWidth.hashCode() + ((iB + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.borderColor;
        int iHashCode5 = (this.layoutOrder.hashCode() + ((this.cornerRadius.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        Media media = this.media;
        int iHashCode6 = (iHashCode5 + (media == null ? 0 : media.hashCode())) * 31;
        TextField textField = this.title;
        int iHashCode7 = (iHashCode6 + (textField == null ? 0 : textField.hashCode())) * 31;
        TextField textField2 = this.body;
        int iHashCode8 = (iHashCode7 + (textField2 == null ? 0 : textField2.hashCode())) * 31;
        CloseButton closeButton = this.closeButton;
        int iHashCode9 = (this.buttonConfiguration.hashCode() + ((iHashCode8 + (closeButton == null ? 0 : closeButton.hashCode())) * 31)) * 31;
        List<Button> list = this.buttons;
        int iA2 = androidx.camera.core.impl.b.a(this.messageDelaySec, (iHashCode9 + (list != null ? list.hashCode() : 0)) * 31, 31);
        boolean z = this.displayLimitOverride;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iA2 + i;
    }

    @JvmName
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName
    @NotNull
    public final LayoutOrder layoutOrder() {
        return this.layoutOrder;
    }

    @JvmName
    @Nullable
    public final Media media() {
        return this.media;
    }

    @JvmName
    public final int messageDelaySec() {
        return this.messageDelaySec;
    }

    @JvmName
    @Nullable
    public final Date modifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    @JvmName
    public final int priority() {
        return this.priority;
    }

    @JvmName
    @Nullable
    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    @JvmName
    @Nullable
    public final TextField title() {
        return this.title;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.activityInstanceId;
        int i = this.priority;
        Date date = this.startDateUtc;
        Date date2 = this.endDateUtc;
        Date date3 = this.modifiedDateUtc;
        int i2 = this.displayLimit;
        Type type = this.type;
        String str3 = this.windowColor;
        long j = this.displayDuration;
        String str4 = this.backgroundColor;
        Size size = this.borderWidth;
        String str5 = this.borderColor;
        Size size2 = this.cornerRadius;
        LayoutOrder layoutOrder = this.layoutOrder;
        Media media = this.media;
        TextField textField = this.title;
        TextField textField2 = this.body;
        CloseButton closeButton = this.closeButton;
        ButtonConfig buttonConfig = this.buttonConfiguration;
        List<Button> list = this.buttons;
        int i3 = this.messageDelaySec;
        boolean z = this.displayLimitOverride;
        StringBuilder sbV = YU.a.v("InAppMessage(id=", str, ", activityInstanceId=", str2, ", priority=");
        sbV.append(i);
        sbV.append(", startDateUtc=");
        sbV.append(date);
        sbV.append(", endDateUtc=");
        sbV.append(date2);
        sbV.append(", modifiedDateUtc=");
        sbV.append(date3);
        sbV.append(", displayLimit=");
        sbV.append(i2);
        sbV.append(", type=");
        sbV.append(type);
        sbV.append(", windowColor=");
        sbV.append(str3);
        sbV.append(", displayDuration=");
        sbV.append(j);
        sbV.append(", backgroundColor=");
        sbV.append(str4);
        sbV.append(", borderWidth=");
        sbV.append(size);
        sbV.append(", borderColor=");
        sbV.append(str5);
        sbV.append(", cornerRadius=");
        sbV.append(size2);
        sbV.append(", layoutOrder=");
        sbV.append(layoutOrder);
        sbV.append(", media=");
        sbV.append(media);
        sbV.append(", title=");
        sbV.append(textField);
        sbV.append(", body=");
        sbV.append(textField2);
        sbV.append(", closeButton=");
        sbV.append(closeButton);
        sbV.append(", buttonConfiguration=");
        sbV.append(buttonConfig);
        sbV.append(", buttons=");
        sbV.append(list);
        sbV.append(", messageDelaySec=");
        sbV.append(i3);
        sbV.append(", displayLimitOverride=");
        sbV.append(z);
        sbV.append(")");
        return sbV.toString();
    }

    @JvmName
    @NotNull
    public final Type type() {
        return this.type;
    }

    @JvmName
    @Nullable
    public final String windowColor() {
        return this.windowColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.activityInstanceId);
        parcel.writeInt(this.priority);
        parcel.writeSerializable(this.startDateUtc);
        parcel.writeSerializable(this.endDateUtc);
        parcel.writeSerializable(this.modifiedDateUtc);
        parcel.writeInt(this.displayLimit);
        parcel.writeString(this.type.name());
        parcel.writeString(this.windowColor);
        parcel.writeLong(this.displayDuration);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.borderWidth.name());
        parcel.writeString(this.borderColor);
        parcel.writeString(this.cornerRadius.name());
        parcel.writeString(this.layoutOrder.name());
        Media media = this.media;
        if (media == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media.writeToParcel(parcel, flags);
        }
        TextField textField = this.title;
        if (textField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField.writeToParcel(parcel, flags);
        }
        TextField textField2 = this.body;
        if (textField2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField2.writeToParcel(parcel, flags);
        }
        CloseButton closeButton = this.closeButton;
        if (closeButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closeButton.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.buttonConfiguration.name());
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Button> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.messageDelaySec);
        parcel.writeInt(this.displayLimitOverride ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InAppMessage(java.lang.String r28, java.lang.String r29, int r30, java.util.Date r31, java.util.Date r32, java.util.Date r33, int r34, com.salesforce.marketingcloud.messages.iam.InAppMessage.Type r35, java.lang.String r36, long r37, java.lang.String r39, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r40, java.lang.String r41, com.salesforce.marketingcloud.messages.iam.InAppMessage.Size r42, com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder r43, com.salesforce.marketingcloud.messages.iam.InAppMessage.Media r44, com.salesforce.marketingcloud.messages.iam.InAppMessage.TextField r45, com.salesforce.marketingcloud.messages.iam.InAppMessage.TextField r46, com.salesforce.marketingcloud.messages.iam.InAppMessage.CloseButton r47, com.salesforce.marketingcloud.messages.iam.InAppMessage.ButtonConfig r48, java.util.List r49, int r50, boolean r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.InAppMessage.<init>(java.lang.String, java.lang.String, int, java.util.Date, java.util.Date, java.util.Date, int, com.salesforce.marketingcloud.messages.iam.InAppMessage$Type, java.lang.String, long, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, java.lang.String, com.salesforce.marketingcloud.messages.iam.InAppMessage$Size, com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder, com.salesforce.marketingcloud.messages.iam.InAppMessage$Media, com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField, com.salesforce.marketingcloud.messages.iam.InAppMessage$TextField, com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton, com.salesforce.marketingcloud.messages.iam.InAppMessage$ButtonConfig, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessage(@NotNull JSONObject json) throws JSONException {
        Intrinsics.h(json, "json");
        String string = json.getString("id");
        Intrinsics.g(string, "getString(...)");
        String string2 = json.getString("activityInstanceId");
        Intrinsics.g(string2, "getString(...)");
        int iOptInt = json.optInt("priority", 999);
        String strI = com.google.android.gms.common.api.internal.a.i(json, "startDateUtc", "optString(...)");
        Date dateA = strI != null ? com.salesforce.marketingcloud.internal.m.a(strI) : null;
        String strI2 = com.google.android.gms.common.api.internal.a.i(json, "endDateUtc", "optString(...)");
        Date dateA2 = strI2 != null ? com.salesforce.marketingcloud.internal.m.a(strI2) : null;
        String strI3 = com.google.android.gms.common.api.internal.a.i(json, "modifiedDateUtc", "optString(...)");
        Date dateA3 = strI3 != null ? com.salesforce.marketingcloud.internal.m.a(strI3) : null;
        int iOptInt2 = json.optInt("displayLimit", 1);
        String string3 = json.getString("type");
        Intrinsics.g(string3, "getString(...)");
        Type typeValueOf = Type.valueOf(string3);
        String strI4 = com.google.android.gms.common.api.internal.a.i(json, "windowColor", "optString(...)");
        long jOptLong = json.optLong("displayDuration", -1L);
        String strI5 = com.google.android.gms.common.api.internal.a.i(json, "backgroundColor", "optString(...)");
        Size sizeValueOf = Size.s;
        String strI6 = com.google.android.gms.common.api.internal.a.i(json, "borderWidth", "optString(...)");
        Size sizeValueOf2 = strI6 != null ? Size.valueOf(strI6) : sizeValueOf;
        String strI7 = com.google.android.gms.common.api.internal.a.i(json, "borderColor", "optString(...)");
        String strI8 = com.google.android.gms.common.api.internal.a.i(json, "cornerRadius", "optString(...)");
        sizeValueOf = strI8 != null ? Size.valueOf(strI8) : sizeValueOf;
        LayoutOrder layoutOrderValueOf = LayoutOrder.ImageTitleBody;
        String strI9 = com.google.android.gms.common.api.internal.a.i(json, "layoutOrder", "optString(...)");
        layoutOrderValueOf = strI9 != null ? LayoutOrder.valueOf(strI9) : layoutOrderValueOf;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("media");
        Media mediaB = jSONObjectOptJSONObject != null ? h.b(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("title");
        TextField textFieldC = jSONObjectOptJSONObject2 != null ? h.c(jSONObjectOptJSONObject2) : null;
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
        TextField textFieldC2 = jSONObjectOptJSONObject3 != null ? h.c(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("closeButton");
        CloseButton closeButtonA = jSONObjectOptJSONObject4 != null ? h.a(jSONObjectOptJSONObject4) : null;
        ButtonConfig buttonConfigValueOf = ButtonConfig.twoUp;
        CloseButton closeButton = closeButtonA;
        String strI10 = com.google.android.gms.common.api.internal.a.i(json, "buttonConfiguration", "optString(...)");
        buttonConfigValueOf = strI10 != null ? ButtonConfig.valueOf(strI10) : buttonConfigValueOf;
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("buttons");
        this(string, string2, iOptInt, dateA, dateA2, dateA3, iOptInt2, typeValueOf, strI4, jOptLong, strI5, sizeValueOf2, strI7, sizeValueOf, layoutOrderValueOf, mediaB, textFieldC, textFieldC2, closeButton, buttonConfigValueOf, jSONArrayOptJSONArray != null ? h.a(jSONArrayOptJSONArray) : null, json.optInt("messageDelaySec", 0), json.optBoolean("displayLimitOverride", false));
    }

    public static final class a implements Parcelable.Creator<InAppMessage> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppMessage createFromParcel(@NotNull Parcel parcel) {
            String str;
            ArrayList arrayList;
            String str2;
            boolean z;
            boolean z2;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Date date3 = (Date) parcel.readSerializable();
            int i2 = parcel.readInt();
            Type typeValueOf = Type.valueOf(parcel.readString());
            String string3 = parcel.readString();
            long j = parcel.readLong();
            String string4 = parcel.readString();
            Size sizeValueOf = Size.valueOf(parcel.readString());
            String string5 = parcel.readString();
            Size sizeValueOf2 = Size.valueOf(parcel.readString());
            LayoutOrder layoutOrderValueOf = LayoutOrder.valueOf(parcel.readString());
            Media mediaCreateFromParcel = parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel);
            TextField textFieldCreateFromParcel = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel);
            TextField textFieldCreateFromParcel2 = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel);
            CloseButton closeButtonCreateFromParcel = parcel.readInt() == 0 ? null : CloseButton.CREATOR.createFromParcel(parcel);
            ButtonConfig buttonConfigValueOf = ButtonConfig.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                str = string;
                arrayList = null;
                str2 = string2;
                z2 = false;
                z = true;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                str = string;
                int iE = 0;
                while (iE != i3) {
                    iE = androidx.compose.ui.input.pointer.a.e(Button.CREATOR, parcel, arrayList2, iE, 1);
                    i3 = i3;
                    string2 = string2;
                }
                arrayList = arrayList2;
                str2 = string2;
                z = true;
                z2 = false;
            }
            return new InAppMessage(str, str2, i, date, date2, date3, i2, typeValueOf, string3, j, string4, sizeValueOf, string5, sizeValueOf2, layoutOrderValueOf, mediaCreateFromParcel, textFieldCreateFromParcel, textFieldCreateFromParcel2, closeButtonCreateFromParcel, buttonConfigValueOf, arrayList, parcel.readInt(), parcel.readInt() != 0 ? z : z2);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppMessage[] newArray(int i) {
            return new InAppMessage[i];
        }
    }
}
