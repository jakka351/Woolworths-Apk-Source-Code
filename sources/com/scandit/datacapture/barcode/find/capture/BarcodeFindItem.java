package com.scandit.datacapture.barcode.find.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "component1", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "component2", "searchOptions", "content", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "getSearchOptions", "()Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "b", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "getContent", "()Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "<init>", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class BarcodeFindItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodeFindItemSearchOptions searchOptions;

    /* renamed from: b, reason: from kotlin metadata */
    private final BarcodeFindItemContent content;

    public BarcodeFindItem(@NotNull BarcodeFindItemSearchOptions searchOptions, @Nullable BarcodeFindItemContent barcodeFindItemContent) {
        Intrinsics.h(searchOptions, "searchOptions");
        this.searchOptions = searchOptions;
        this.content = barcodeFindItemContent;
    }

    public static /* synthetic */ BarcodeFindItem copy$default(BarcodeFindItem barcodeFindItem, BarcodeFindItemSearchOptions barcodeFindItemSearchOptions, BarcodeFindItemContent barcodeFindItemContent, int i, Object obj) {
        if ((i & 1) != 0) {
            barcodeFindItemSearchOptions = barcodeFindItem.searchOptions;
        }
        if ((i & 2) != 0) {
            barcodeFindItemContent = barcodeFindItem.content;
        }
        return barcodeFindItem.copy(barcodeFindItemSearchOptions, barcodeFindItemContent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BarcodeFindItemSearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BarcodeFindItemContent getContent() {
        return this.content;
    }

    @NotNull
    public final BarcodeFindItem copy(@NotNull BarcodeFindItemSearchOptions searchOptions, @Nullable BarcodeFindItemContent content) {
        Intrinsics.h(searchOptions, "searchOptions");
        return new BarcodeFindItem(searchOptions, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeFindItem)) {
            return false;
        }
        BarcodeFindItem barcodeFindItem = (BarcodeFindItem) other;
        return Intrinsics.c(this.searchOptions, barcodeFindItem.searchOptions) && Intrinsics.c(this.content, barcodeFindItem.content);
    }

    @Nullable
    public final BarcodeFindItemContent getContent() {
        return this.content;
    }

    @NotNull
    public final BarcodeFindItemSearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    public int hashCode() {
        int iHashCode = this.searchOptions.hashCode() * 31;
        BarcodeFindItemContent barcodeFindItemContent = this.content;
        return iHashCode + (barcodeFindItemContent == null ? 0 : barcodeFindItemContent.hashCode());
    }

    @NotNull
    public String toString() {
        return "BarcodeFindItem(searchOptions=" + this.searchOptions + ", content=" + this.content + ')';
    }
}
