package com.woolworths.scanlibrary.models.product;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Images;", "", "thumbnail", "", ErrorBundle.DETAIL_ENTRY, "", "jsonMember360", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getThumbnail", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", "getJsonMember360", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Images {
    public static final int $stable = 8;

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @Nullable
    private final List<String> details;

    @SerializedName("jsonMember360")
    @Nullable
    private final List<String> jsonMember360;

    @SerializedName("thumbnail")
    @NotNull
    private final String thumbnail;

    public Images(@NotNull String thumbnail, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.h(thumbnail, "thumbnail");
        this.thumbnail = thumbnail;
        this.details = list;
        this.jsonMember360 = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Images copy$default(Images images, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = images.thumbnail;
        }
        if ((i & 2) != 0) {
            list = images.details;
        }
        if ((i & 4) != 0) {
            list2 = images.jsonMember360;
        }
        return images.copy(str, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final List<String> component2() {
        return this.details;
    }

    @Nullable
    public final List<String> component3() {
        return this.jsonMember360;
    }

    @NotNull
    public final Images copy(@NotNull String thumbnail, @Nullable List<String> details, @Nullable List<String> jsonMember360) {
        Intrinsics.h(thumbnail, "thumbnail");
        return new Images(thumbnail, details, jsonMember360);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Images)) {
            return false;
        }
        Images images = (Images) other;
        return Intrinsics.c(this.thumbnail, images.thumbnail) && Intrinsics.c(this.details, images.details) && Intrinsics.c(this.jsonMember360, images.jsonMember360);
    }

    @Nullable
    public final List<String> getDetails() {
        return this.details;
    }

    @Nullable
    public final List<String> getJsonMember360() {
        return this.jsonMember360;
    }

    @NotNull
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int iHashCode = this.thumbnail.hashCode() * 31;
        List<String> list = this.details;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.jsonMember360;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.thumbnail;
        List<String> list = this.details;
        return a.t(au.com.woolworths.android.onesite.a.s("Images(thumbnail=", str, ", details=", ", jsonMember360=", list), this.jsonMember360, ")");
    }

    public /* synthetic */ Images(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
