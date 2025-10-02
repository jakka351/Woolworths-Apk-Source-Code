package com.woolworths.scanlibrary.ui.message;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/Messages;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Messages {
    public static final Companion h;
    public static final Messages i;
    public static final Messages j;
    public static final Messages k;
    public static final /* synthetic */ Messages[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/Messages$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Messages a(String text) {
            Intrinsics.h(text, "text");
            for (Messages messages : Messages.values()) {
                if (StringsKt.y(messages.name(), text, true)) {
                    return messages;
                }
            }
            return null;
        }
    }

    static {
        Messages messages = new Messages("LOCATION_SERVICE_NOT_ON", 0, R.string.sng_enable_location_service_message_one, R.string.sng_enable_location_service_message_two, R.drawable.ic_location_off, R.string.sng_enable_location_service_title);
        i = messages;
        Messages messages2 = new Messages("LOCATION_PERMISSION_NOT_GRANTED", 1, R.string.sng_enable_location_service_message_one, R.string.sng_enable_location_service_message_two, R.drawable.ic_location_off, R.string.sng_enable_location_service_title);
        j = messages2;
        Messages messages3 = new Messages("BLUETOOTH_SERVICE_NOT_ON", 2, R.string.sng_enable_bluetooth_message_one, R.string.sng_enable_bluetooth_message_two, R.drawable.ic_bluetooth_off, R.string.sng_enable_bluetooth_title);
        k = messages3;
        Messages[] messagesArr = {messages, messages2, messages3, new Messages("CAMERA_PERMISSION_NOT_GRANTED", 3, R.string.sng_camera_message_one, R.string.sng_camera_message_two, R.drawable.ic_camera_off, R.string.sng_enable_camera_service_title)};
        l = messagesArr;
        m = EnumEntriesKt.a(messagesArr);
        h = new Companion();
    }

    public Messages(String str, int i2, int i3, int i4, int i5, int i6) {
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public static Messages valueOf(String str) {
        return (Messages) Enum.valueOf(Messages.class, str);
    }

    public static Messages[] values() {
        return (Messages[]) l.clone();
    }
}
