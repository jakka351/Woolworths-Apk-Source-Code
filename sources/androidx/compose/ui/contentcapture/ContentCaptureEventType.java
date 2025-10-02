package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContentCaptureEventType {
    public static final ContentCaptureEventType d;
    public static final ContentCaptureEventType e;
    public static final /* synthetic */ ContentCaptureEventType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ContentCaptureEventType contentCaptureEventType = new ContentCaptureEventType("VIEW_APPEAR", 0);
        d = contentCaptureEventType;
        ContentCaptureEventType contentCaptureEventType2 = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        e = contentCaptureEventType2;
        ContentCaptureEventType[] contentCaptureEventTypeArr = {contentCaptureEventType, contentCaptureEventType2};
        f = contentCaptureEventTypeArr;
        g = EnumEntriesKt.a(contentCaptureEventTypeArr);
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) f.clone();
    }
}
