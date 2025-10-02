package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.e;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lme/oriient/ui/contentview/models/DragEvent;", "", "content", "Lme/oriient/ui/contentview/models/Content;", "position", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "(Lme/oriient/ui/contentview/models/Content;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "getContent", "()Lme/oriient/ui/contentview/models/Content;", "getPosition", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "toString", "", "DragCanceled", "DragEnded", "DragStarted", "Lme/oriient/ui/contentview/models/DragEvent$DragCanceled;", "Lme/oriient/ui/contentview/models/DragEvent$DragEnded;", "Lme/oriient/ui/contentview/models/DragEvent$DragStarted;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class DragEvent {

    @NotNull
    private final Content content;

    @NotNull
    private final PixelCoordinate position;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ui/contentview/models/DragEvent$DragCanceled;", "Lme/oriient/ui/contentview/models/DragEvent;", "Lme/oriient/ui/contentview/models/Content;", "content", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "position", "<init>", "(Lme/oriient/ui/contentview/models/Content;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "Lme/oriient/ui/contentview/e;", "draggedContent", "(Lme/oriient/ui/contentview/e;)V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragCanceled extends DragEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DragCanceled(@NotNull Content content, @NotNull PixelCoordinate position) {
            super(content, position, null);
            Intrinsics.h(content, "content");
            Intrinsics.h(position, "position");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DragCanceled(@NotNull e draggedContent) {
            this(draggedContent.a(), draggedContent.d());
            Intrinsics.h(draggedContent, "draggedContent");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ui/contentview/models/DragEvent$DragEnded;", "Lme/oriient/ui/contentview/models/DragEvent;", "Lme/oriient/ui/contentview/models/Content;", "content", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "position", "<init>", "(Lme/oriient/ui/contentview/models/Content;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "Lme/oriient/ui/contentview/e;", "draggedContent", "(Lme/oriient/ui/contentview/e;)V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragEnded extends DragEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DragEnded(@NotNull Content content, @NotNull PixelCoordinate position) {
            super(content, position, null);
            Intrinsics.h(content, "content");
            Intrinsics.h(position, "position");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DragEnded(@NotNull e draggedContent) {
            this(draggedContent.a(), draggedContent.d());
            Intrinsics.h(draggedContent, "draggedContent");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ui/contentview/models/DragEvent$DragStarted;", "Lme/oriient/ui/contentview/models/DragEvent;", "Lme/oriient/ui/contentview/models/Content;", "content", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "position", "<init>", "(Lme/oriient/ui/contentview/models/Content;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "Lme/oriient/ui/contentview/e;", "draggedContent", "(Lme/oriient/ui/contentview/e;)V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragStarted extends DragEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DragStarted(@NotNull Content content, @NotNull PixelCoordinate position) {
            super(content, position, null);
            Intrinsics.h(content, "content");
            Intrinsics.h(position, "position");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DragStarted(@NotNull e draggedContent) {
            this(draggedContent.a(), draggedContent.d());
            Intrinsics.h(draggedContent, "draggedContent");
        }
    }

    public /* synthetic */ DragEvent(Content content, PixelCoordinate pixelCoordinate, DefaultConstructorMarker defaultConstructorMarker) {
        this(content, pixelCoordinate);
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @NotNull
    public final PixelCoordinate getPosition() {
        return this.position;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '{' + this.content + "},[" + this.position + ']';
    }

    private DragEvent(Content content, PixelCoordinate pixelCoordinate) {
        this.content = content;
        this.position = pixelCoordinate;
    }
}
