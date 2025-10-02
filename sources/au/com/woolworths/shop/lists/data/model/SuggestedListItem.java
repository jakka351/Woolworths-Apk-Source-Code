package au.com.woolworths.shop.lists.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "image", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getImage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestedListItem {
    private final int id;

    @Nullable
    private final String image;

    @NotNull
    private final String name;

    public SuggestedListItem(int i, @NotNull String name, @Nullable String str) {
        Intrinsics.h(name, "name");
        this.id = i;
        this.name = name;
        this.image = str;
    }

    public static /* synthetic */ SuggestedListItem copy$default(SuggestedListItem suggestedListItem, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = suggestedListItem.id;
        }
        if ((i2 & 2) != 0) {
            str = suggestedListItem.name;
        }
        if ((i2 & 4) != 0) {
            str2 = suggestedListItem.image;
        }
        return suggestedListItem.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final SuggestedListItem copy(int id, @NotNull String name, @Nullable String image) {
        Intrinsics.h(name, "name");
        return new SuggestedListItem(id, name, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedListItem)) {
            return false;
        }
        SuggestedListItem suggestedListItem = (SuggestedListItem) other;
        return this.id == suggestedListItem.id && Intrinsics.c(this.name, suggestedListItem.name) && Intrinsics.c(this.image, suggestedListItem.image);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iC = b.c(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.image;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        return a.o(androidx.constraintlayout.core.state.a.p("SuggestedListItem(id=", i, ", name=", str, ", image="), this.image, ")");
    }
}
