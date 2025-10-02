package me.oriient.internal.services.systemStateManager;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/systemStateManager/UiElementState;", "", "", "uploadableName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUploadableName", "()Ljava/lang/String;", "Companion", "me/oriient/internal/services/systemStateManager/e", "UNKNOWN", "PRESENTED", "HIDDEN", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UiElementState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UiElementState[] $VALUES;

    @NotNull
    public static final e Companion;

    @NotNull
    private final String uploadableName;
    public static final UiElementState UNKNOWN = new UiElementState("UNKNOWN", 0, j.h);
    public static final UiElementState PRESENTED = new UiElementState("PRESENTED", 1, "presented");
    public static final UiElementState HIDDEN = new UiElementState("HIDDEN", 2, "hidden");

    private static final /* synthetic */ UiElementState[] $values() {
        return new UiElementState[]{UNKNOWN, PRESENTED, HIDDEN};
    }

    static {
        UiElementState[] uiElementStateArr$values = $values();
        $VALUES = uiElementStateArr$values;
        $ENTRIES = EnumEntriesKt.a(uiElementStateArr$values);
        Companion = new e();
    }

    private UiElementState(String str, int i, String str2) {
        this.uploadableName = str2;
    }

    @NotNull
    public static EnumEntries<UiElementState> getEntries() {
        return $ENTRIES;
    }

    public static UiElementState valueOf(String str) {
        return (UiElementState) Enum.valueOf(UiElementState.class, str);
    }

    public static UiElementState[] values() {
        return (UiElementState[]) $VALUES.clone();
    }

    @NotNull
    public final String getUploadableName() {
        return this.uploadableName;
    }
}
