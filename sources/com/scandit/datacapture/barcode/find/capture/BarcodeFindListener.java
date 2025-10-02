package com.scandit.datacapture.barcode.find.capture;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindListener;", "", "onSearchPaused", "", "foundItems", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "onSearchStarted", "onSearchStopped", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeFindListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSearchPaused(@NotNull BarcodeFindListener barcodeFindListener, @NotNull Set<BarcodeFindItem> foundItems) {
            Intrinsics.h(foundItems, "foundItems");
        }

        public static void onSearchStarted(@NotNull BarcodeFindListener barcodeFindListener) {
        }

        public static void onSearchStopped(@NotNull BarcodeFindListener barcodeFindListener, @NotNull Set<BarcodeFindItem> foundItems) {
            Intrinsics.h(foundItems, "foundItems");
        }
    }

    void onSearchPaused(@NotNull Set<BarcodeFindItem> foundItems);

    void onSearchStarted();

    void onSearchStopped(@NotNull Set<BarcodeFindItem> foundItems);
}
