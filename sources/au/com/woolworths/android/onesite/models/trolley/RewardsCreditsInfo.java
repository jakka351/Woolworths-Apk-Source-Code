package au.com.woolworths.android.onesite.models.trolley;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/android/onesite/models/trolley/RewardsCreditsInfo;", "", "title", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsCreditsInfo {

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsCreditsInfo(@NotNull String title, @NotNull String text) {
        Intrinsics.h(title, "title");
        Intrinsics.h(text, "text");
        this.title = title;
        this.text = text;
    }

    public static /* synthetic */ RewardsCreditsInfo copy$default(RewardsCreditsInfo rewardsCreditsInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCreditsInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = rewardsCreditsInfo.text;
        }
        return rewardsCreditsInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final RewardsCreditsInfo copy(@NotNull String title, @NotNull String text) {
        Intrinsics.h(title, "title");
        Intrinsics.h(text, "text");
        return new RewardsCreditsInfo(title, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsCreditsInfo)) {
            return false;
        }
        RewardsCreditsInfo rewardsCreditsInfo = (RewardsCreditsInfo) other;
        return Intrinsics.c(this.title, rewardsCreditsInfo.title) && Intrinsics.c(this.text, rewardsCreditsInfo.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("RewardsCreditsInfo(title=", this.title, ", text=", this.text, ")");
    }
}
