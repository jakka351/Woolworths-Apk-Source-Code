package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ContentCaptureEvent {

    /* renamed from: a, reason: collision with root package name */
    public final int f1735a;
    public final long b;
    public final ContentCaptureEventType c;
    public final ViewStructureCompat d;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.f1735a = i;
        this.b = j;
        this.c = contentCaptureEventType;
        this.d = viewStructureCompat;
    }

    /* renamed from: a, reason: from getter */
    public final int getF1735a() {
        return this.f1735a;
    }

    /* renamed from: b, reason: from getter */
    public final ViewStructureCompat getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final ContentCaptureEventType getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.f1735a == contentCaptureEvent.f1735a && this.b == contentCaptureEvent.b && this.c == contentCaptureEvent.c && Intrinsics.c(this.d, contentCaptureEvent.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + androidx.camera.core.impl.b.b(Integer.hashCode(this.f1735a) * 31, 31, this.b)) * 31;
        ViewStructureCompat viewStructureCompat = this.d;
        return iHashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f1735a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
