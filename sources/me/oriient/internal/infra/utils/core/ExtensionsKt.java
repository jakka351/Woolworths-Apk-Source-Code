package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0001\u001a!\u0010\u0004\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0001\u001a/\u0010\t\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\n*\u0004\u0018\u0001H\u00022\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\fH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"copyOf", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "default", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "mutableCopyOf", "", "", "unwrap", "", "otherwise", "Lkotlin/Function0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExtensionsKt {
    @Deprecated
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
    public static final <T> T m393default(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    @Deprecated
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
    public static final <T> T unwrap(@Nullable T t, @NotNull Function0<? extends Exception> otherwise) throws Throwable {
        Intrinsics.h(otherwise, "otherwise");
        if (t != null) {
            return t;
        }
        throw ((Throwable) otherwise.invoke());
    }

    @Deprecated
    @Keep
    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }

    @Deprecated
    @Keep
    @NotNull
    public static final <T> List<T> mutableCopyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }
}
