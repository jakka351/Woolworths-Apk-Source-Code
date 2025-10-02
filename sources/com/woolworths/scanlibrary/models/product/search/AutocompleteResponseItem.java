package com.woolworths.scanlibrary.models.product.search;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/search/AutocompleteResponseItem;", "", lqlqqlq.m006Dm006Dm006Dm, "", "count", "", "<init>", "(Ljava/lang/String;F)V", "getResult", "()Ljava/lang/String;", "getCount", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AutocompleteResponseItem {
    public static final int $stable = 0;

    @SerializedName("count")
    private final float count;

    @SerializedName(lqlqqlq.m006Dm006Dm006Dm)
    @NotNull
    private final String result;

    public AutocompleteResponseItem() {
        this(null, BitmapDescriptorFactory.HUE_RED, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AutocompleteResponseItem copy$default(AutocompleteResponseItem autocompleteResponseItem, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocompleteResponseItem.result;
        }
        if ((i & 2) != 0) {
            f = autocompleteResponseItem.count;
        }
        return autocompleteResponseItem.copy(str, f);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCount() {
        return this.count;
    }

    @NotNull
    public final AutocompleteResponseItem copy(@NotNull String result, float count) {
        Intrinsics.h(result, "result");
        return new AutocompleteResponseItem(result, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteResponseItem)) {
            return false;
        }
        AutocompleteResponseItem autocompleteResponseItem = (AutocompleteResponseItem) other;
        return Intrinsics.c(this.result, autocompleteResponseItem.result) && Float.compare(this.count, autocompleteResponseItem.count) == 0;
    }

    public final float getCount() {
        return this.count;
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return Float.hashCode(this.count) + (this.result.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AutocompleteResponseItem(result=" + this.result + ", count=" + this.count + ")";
    }

    public AutocompleteResponseItem(@NotNull String result, float f) {
        Intrinsics.h(result, "result");
        this.result = result;
        this.count = f;
    }

    public /* synthetic */ AutocompleteResponseItem(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
    }
}
