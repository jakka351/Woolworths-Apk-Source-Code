package me.oriient.ui.contentview;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lme/oriient/ui/contentview/StatLogConfig;", "", "tag", "", "count", "", "(Ljava/lang/String;Z)V", "getCount", "()Z", "enabled", "getEnabled$ui_content_view_publishRelease", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StatLogConfig {
    private final boolean count;

    @NotNull
    private final String tag;

    public StatLogConfig() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StatLogConfig copy$default(StatLogConfig statLogConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statLogConfig.tag;
        }
        if ((i & 2) != 0) {
            z = statLogConfig.count;
        }
        return statLogConfig.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCount() {
        return this.count;
    }

    @NotNull
    public final StatLogConfig copy(@NotNull String tag, boolean count) {
        Intrinsics.h(tag, "tag");
        return new StatLogConfig(tag, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatLogConfig)) {
            return false;
        }
        StatLogConfig statLogConfig = (StatLogConfig) other;
        return Intrinsics.c(this.tag, statLogConfig.tag) && this.count == statLogConfig.count;
    }

    public final boolean getCount() {
        return this.count;
    }

    public final boolean getEnabled$ui_content_view_publishRelease() {
        return this.count;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return Boolean.hashCode(this.count) + (this.tag.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StatLogConfig(tag=");
        sb.append(this.tag);
        sb.append(", count=");
        return androidx.camera.core.impl.b.s(sb, this.count, ')');
    }

    public StatLogConfig(@NotNull String tag, boolean z) {
        Intrinsics.h(tag, "tag");
        this.tag = tag;
        this.count = z;
    }

    public /* synthetic */ StatLogConfig(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "StatLog" : str, (i & 2) != 0 ? false : z);
    }
}
