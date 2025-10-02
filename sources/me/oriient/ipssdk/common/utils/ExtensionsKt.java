package me.oriient.ipssdk.common.utils;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0010!\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0001\u001a!\u0010\u0004\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0002\u0010\u0005\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0001¨\u0006\t"}, d2 = {"copyOf", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "default", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "mutableCopyOf", "", "", "me.oriient.sdk-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    @Keep
    @NotNull
    public static final <T> Collection<T> copyOf(@NotNull Collection<? extends T> collection) {
        Intrinsics.h(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        return arrayList;
    }

    @Keep
    /* renamed from: default, reason: not valid java name */
    public static final <T> T m437default(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    @Keep
    @NotNull
    public static final <T> Collection<T> mutableCopyOf(@NotNull Collection<? extends T> collection) {
        Intrinsics.h(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        return arrayList;
    }

    @Keep
    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }

    @Keep
    @NotNull
    public static final <T> List<T> mutableCopyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }
}
