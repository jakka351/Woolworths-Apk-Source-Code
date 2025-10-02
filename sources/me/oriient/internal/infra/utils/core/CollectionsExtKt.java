package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"mapOrEmptyList", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "transform", "Lkotlin/Function1;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CollectionsExtKt {
    @Keep
    @NotNull
    public static final <T, R> List<R> mapOrEmptyList(@Nullable Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.h(transform, "transform");
        if (iterable == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }
}
