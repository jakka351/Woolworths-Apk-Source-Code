package com.scandit.datacapture.core.internal.sdk.extensions;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"distinctObservable", "Lkotlin/properties/ReadWriteProperty;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "onChange", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/properties/ReadWriteProperty;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DelegatesKt {
    @NotNull
    public static final <T> ReadWriteProperty<Object, T> distinctObservable(final T t, @NotNull final Function1<? super T, Unit> onChange) {
        Intrinsics.h(onChange, "onChange");
        return new ObservableProperty<T>(t) { // from class: com.scandit.datacapture.core.internal.sdk.extensions.DelegatesKt$distinctObservable$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, T oldValue, T newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                onChange.invoke(newValue);
            }
        };
    }
}
