package au.com.woolworths.rewards.base.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/rewards/base/data/LinkButton;", "", "style", "Lau/com/woolworths/rewards/base/data/ButtonType;", AnnotatedPrivateKey.LABEL, "", "actionUrl", "<init>", "(Lau/com/woolworths/rewards/base/data/ButtonType;Ljava/lang/String;Ljava/lang/String;)V", "getStyle", "()Lau/com/woolworths/rewards/base/data/ButtonType;", "getLabel", "()Ljava/lang/String;", "getActionUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkButton {
    public static final int $stable = 0;

    @SerializedName("actionUrl")
    @NotNull
    private final String actionUrl;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("style")
    @NotNull
    private final ButtonType style;

    public LinkButton(@NotNull ButtonType style, @NotNull String label, @NotNull String actionUrl) {
        Intrinsics.h(style, "style");
        Intrinsics.h(label, "label");
        Intrinsics.h(actionUrl, "actionUrl");
        this.style = style;
        this.label = label;
        this.actionUrl = actionUrl;
    }

    public static /* synthetic */ LinkButton copy$default(LinkButton linkButton, ButtonType buttonType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonType = linkButton.style;
        }
        if ((i & 2) != 0) {
            str = linkButton.label;
        }
        if ((i & 4) != 0) {
            str2 = linkButton.actionUrl;
        }
        return linkButton.copy(buttonType, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonType getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @NotNull
    public final LinkButton copy(@NotNull ButtonType style, @NotNull String label, @NotNull String actionUrl) {
        Intrinsics.h(style, "style");
        Intrinsics.h(label, "label");
        Intrinsics.h(actionUrl, "actionUrl");
        return new LinkButton(style, label, actionUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkButton)) {
            return false;
        }
        LinkButton linkButton = (LinkButton) other;
        return this.style == linkButton.style && Intrinsics.c(this.label, linkButton.label) && Intrinsics.c(this.actionUrl, linkButton.actionUrl);
    }

    @NotNull
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final ButtonType getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.actionUrl.hashCode() + b.c(this.style.hashCode() * 31, 31, this.label);
    }

    @NotNull
    public String toString() {
        ButtonType buttonType = this.style;
        String str = this.label;
        String str2 = this.actionUrl;
        StringBuilder sb = new StringBuilder("LinkButton(style=");
        sb.append(buttonType);
        sb.append(", label=");
        sb.append(str);
        sb.append(", actionUrl=");
        return a.o(sb, str2, ")");
    }
}
