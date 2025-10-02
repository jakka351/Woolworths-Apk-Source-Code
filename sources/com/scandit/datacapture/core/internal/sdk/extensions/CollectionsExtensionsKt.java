package com.scandit.datacapture.core.internal.sdk.extensions;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0016\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0006"}, d2 = {"orEmpty", "Ljava/util/ArrayList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/ArrayList;", "toArrayList", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectionsExtensionsKt {
    @NotNull
    public static final <T> ArrayList<T> orEmpty(@Nullable ArrayList<T> arrayList) {
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    @NotNull
    public static final <T> ArrayList<T> toArrayList(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof ArrayList) {
            return (ArrayList) iterable;
        }
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
