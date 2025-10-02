package au.com.woolworths.rewards.base.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/rewards/base/data/CoreButton;", "", "coreButtonStyle", "Lau/com/woolworths/rewards/base/data/CoreButtonStyle;", "coreButtonLabel", "", "coreButtonEnabled", "", "coreButtonAction", "Lau/com/woolworths/sdui/model/action/ActionData;", "<init>", "(Lau/com/woolworths/rewards/base/data/CoreButtonStyle;Ljava/lang/String;ZLau/com/woolworths/sdui/model/action/ActionData;)V", "getCoreButtonStyle", "()Lau/com/woolworths/rewards/base/data/CoreButtonStyle;", "getCoreButtonLabel", "()Ljava/lang/String;", "getCoreButtonEnabled", "()Z", "getCoreButtonAction", "()Lau/com/woolworths/sdui/model/action/ActionData;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreButton {
    public static final int $stable = 8;

    @NotNull
    private final ActionData coreButtonAction;
    private final boolean coreButtonEnabled;

    @NotNull
    private final String coreButtonLabel;

    @NotNull
    private final CoreButtonStyle coreButtonStyle;

    public CoreButton(@NotNull CoreButtonStyle coreButtonStyle, @NotNull String coreButtonLabel, boolean z, @NotNull ActionData coreButtonAction) {
        Intrinsics.h(coreButtonStyle, "coreButtonStyle");
        Intrinsics.h(coreButtonLabel, "coreButtonLabel");
        Intrinsics.h(coreButtonAction, "coreButtonAction");
        this.coreButtonStyle = coreButtonStyle;
        this.coreButtonLabel = coreButtonLabel;
        this.coreButtonEnabled = z;
        this.coreButtonAction = coreButtonAction;
    }

    public static /* synthetic */ CoreButton copy$default(CoreButton coreButton, CoreButtonStyle coreButtonStyle, String str, boolean z, ActionData actionData, int i, Object obj) {
        if ((i & 1) != 0) {
            coreButtonStyle = coreButton.coreButtonStyle;
        }
        if ((i & 2) != 0) {
            str = coreButton.coreButtonLabel;
        }
        if ((i & 4) != 0) {
            z = coreButton.coreButtonEnabled;
        }
        if ((i & 8) != 0) {
            actionData = coreButton.coreButtonAction;
        }
        return coreButton.copy(coreButtonStyle, str, z, actionData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CoreButtonStyle getCoreButtonStyle() {
        return this.coreButtonStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCoreButtonLabel() {
        return this.coreButtonLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCoreButtonEnabled() {
        return this.coreButtonEnabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ActionData getCoreButtonAction() {
        return this.coreButtonAction;
    }

    @NotNull
    public final CoreButton copy(@NotNull CoreButtonStyle coreButtonStyle, @NotNull String coreButtonLabel, boolean coreButtonEnabled, @NotNull ActionData coreButtonAction) {
        Intrinsics.h(coreButtonStyle, "coreButtonStyle");
        Intrinsics.h(coreButtonLabel, "coreButtonLabel");
        Intrinsics.h(coreButtonAction, "coreButtonAction");
        return new CoreButton(coreButtonStyle, coreButtonLabel, coreButtonEnabled, coreButtonAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreButton)) {
            return false;
        }
        CoreButton coreButton = (CoreButton) other;
        return this.coreButtonStyle == coreButton.coreButtonStyle && Intrinsics.c(this.coreButtonLabel, coreButton.coreButtonLabel) && this.coreButtonEnabled == coreButton.coreButtonEnabled && Intrinsics.c(this.coreButtonAction, coreButton.coreButtonAction);
    }

    @NotNull
    public final ActionData getCoreButtonAction() {
        return this.coreButtonAction;
    }

    public final boolean getCoreButtonEnabled() {
        return this.coreButtonEnabled;
    }

    @NotNull
    public final String getCoreButtonLabel() {
        return this.coreButtonLabel;
    }

    @NotNull
    public final CoreButtonStyle getCoreButtonStyle() {
        return this.coreButtonStyle;
    }

    public int hashCode() {
        return this.coreButtonAction.hashCode() + b.e(b.c(this.coreButtonStyle.hashCode() * 31, 31, this.coreButtonLabel), 31, this.coreButtonEnabled);
    }

    @NotNull
    public String toString() {
        return "CoreButton(coreButtonStyle=" + this.coreButtonStyle + ", coreButtonLabel=" + this.coreButtonLabel + ", coreButtonEnabled=" + this.coreButtonEnabled + ", coreButtonAction=" + this.coreButtonAction + ")";
    }
}
