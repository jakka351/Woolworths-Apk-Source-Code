package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ui/contentview/models/TouchEvent;", "", "()V", "TouchEnded", "TouchStarted", "Lme/oriient/ui/contentview/models/TouchEvent$TouchEnded;", "Lme/oriient/ui/contentview/models/TouchEvent$TouchStarted;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class TouchEvent {

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ui/contentview/models/TouchEvent$TouchEnded;", "Lme/oriient/ui/contentview/models/TouchEvent;", "()V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TouchEnded extends TouchEvent {

        @NotNull
        public static final TouchEnded INSTANCE = new TouchEnded();

        private TouchEnded() {
            super(null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ui/contentview/models/TouchEvent$TouchStarted;", "Lme/oriient/ui/contentview/models/TouchEvent;", "()V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TouchStarted extends TouchEvent {

        @NotNull
        public static final TouchStarted INSTANCE = new TouchStarted();

        private TouchStarted() {
            super(null);
        }
    }

    public /* synthetic */ TouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TouchEvent() {
    }
}
