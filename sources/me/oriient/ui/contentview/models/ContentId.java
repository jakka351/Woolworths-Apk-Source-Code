package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lme/oriient/ui/contentview/models/ContentId;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "compareTo", "", "other", "equals", "", "", "hashCode", "toString", "Companion", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContentId implements Comparable<ContentId> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ui/contentview/models/ContentId$Companion;", "", "()V", "random", "Lme/oriient/ui/contentview/models/ContentId;", "getRandom", "()Lme/oriient/ui/contentview/models/ContentId;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContentId getRandom() {
            return new ContentId(androidx.constraintlayout.core.state.a.h("toString(...)"));
        }

        private Companion() {
        }
    }

    public ContentId(@NotNull String value) {
        Intrinsics.h(value, "value");
        this.value = value;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof ContentId ? Intrinsics.c(((ContentId) other).value, this.value) : super.equals(other);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return YU.a.o(new StringBuilder("ContentId(value='"), this.value, "')");
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull ContentId other) {
        Intrinsics.h(other, "other");
        return this.value.compareTo(other.value);
    }
}
