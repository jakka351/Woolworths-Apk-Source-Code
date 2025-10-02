package au.com.woolworths.shop.lists.data.remote.fragment;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "timestamp", "", "referenceId", "", "id", TextBundle.TEXT_ENTRY, "checked", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTimestamp", "()D", "getReferenceId", "()Ljava/lang/String;", "getId", "getText", "getChecked", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextItemFragment implements Fragment.Data {
    private final boolean checked;

    @NotNull
    private final String id;

    @Nullable
    private final String referenceId;

    @NotNull
    private final String text;
    private final double timestamp;

    public TextItemFragment(double d, @Nullable String str, @NotNull String id, @NotNull String text, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        this.timestamp = d;
        this.referenceId = str;
        this.id = id;
        this.text = text;
        this.checked = z;
    }

    public static /* synthetic */ TextItemFragment copy$default(TextItemFragment textItemFragment, double d, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = textItemFragment.timestamp;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = textItemFragment.referenceId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = textItemFragment.id;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = textItemFragment.text;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = textItemFragment.checked;
        }
        return textItemFragment.copy(d2, str4, str5, str6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final TextItemFragment copy(double timestamp, @Nullable String referenceId, @NotNull String id, @NotNull String text, boolean checked) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        return new TextItemFragment(timestamp, referenceId, id, text, checked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextItemFragment)) {
            return false;
        }
        TextItemFragment textItemFragment = (TextItemFragment) other;
        return Double.compare(this.timestamp, textItemFragment.timestamp) == 0 && Intrinsics.c(this.referenceId, textItemFragment.referenceId) && Intrinsics.c(this.id, textItemFragment.id) && Intrinsics.c(this.text, textItemFragment.text) && this.checked == textItemFragment.checked;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.timestamp) * 31;
        String str = this.referenceId;
        return Boolean.hashCode(this.checked) + b.c(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.id), 31, this.text);
    }

    @NotNull
    public String toString() {
        double d = this.timestamp;
        String str = this.referenceId;
        String str2 = this.id;
        String str3 = this.text;
        boolean z = this.checked;
        StringBuilder sb = new StringBuilder("TextItemFragment(timestamp=");
        sb.append(d);
        sb.append(", referenceId=");
        sb.append(str);
        a.B(sb, ", id=", str2, ", text=", str3);
        sb.append(", checked=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
