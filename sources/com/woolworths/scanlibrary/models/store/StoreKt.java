package com.woolworths.scanlibrary.models.store;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¨\u0006\b"}, d2 = {"getgMTZone", "", "Lcom/woolworths/scanlibrary/models/store/Store;", "formatStoreTime", "formatStoreTimeRefresh", "formatStoreTimeWithFormat", "store", "format", "scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreKt {
    @NotNull
    public static final String formatStoreTime(@NotNull Store store) {
        Intrinsics.h(store, "<this>");
        return formatStoreTimeWithFormat(store, Store.TIME_FORMAT);
    }

    @NotNull
    public static final String formatStoreTimeRefresh(@NotNull Store store) {
        Intrinsics.h(store, "<this>");
        return formatStoreTimeWithFormat(store, Store.TIME_FORMAT_REFRESH);
    }

    private static final String formatStoreTimeWithFormat(Store store, String str) {
        if (store.getStoreTradingWeek() == null || store.getStoreTradingWeek().getTradingHours().isEmpty()) {
            return "";
        }
        StoreTradingDateTime storeTradingDateTime = store.getStoreTradingWeek().getTradingHours().get(0);
        return storeTradingDateTime.getOpenTime().equals("Closed") ? String.format("Closed  - Closed", Arrays.copyOf(new Object[0], 0)) : String.format(str, Arrays.copyOf(new Object[]{storeTradingDateTime.getOpenTime(), storeTradingDateTime.getCloseTime()}, 2));
    }

    @Nullable
    public static final String getgMTZone(@NotNull Store store) {
        Intrinsics.h(store, "<this>");
        return store.getGMTZone$scanGoLibrary_release();
    }
}
